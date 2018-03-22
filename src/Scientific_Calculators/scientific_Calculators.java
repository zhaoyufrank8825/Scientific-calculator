package Scientific_Calculators;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class scientific_Calculators {

	private JFrame frmStandardCaculator;
	private JTextField txtdisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scientific_Calculators window = new scientific_Calculators();
					window.frmStandardCaculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public scientific_Calculators() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStandardCaculator = new JFrame();
		frmStandardCaculator.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmStandardCaculator.setTitle("Caculator");
		frmStandardCaculator.setBounds(200, 100, 310, 390);
		frmStandardCaculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.LIGHT_GRAY);
		menuBar.setBackground(new Color(255, 240, 245));
		frmStandardCaculator.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frmStandardCaculator.setTitle("Standard Caculator");
				frmStandardCaculator.setBounds(200, 100, 310, 400);
				txtdisplay.setBounds(10, 10, 280, 30);
				
			}
		});
		mnFile.add(mntmStandard);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmStandardCaculator.setTitle("Scientific Caculator");
				frmStandardCaculator.setBounds(200, 100, 620, 400);
				txtdisplay.setBounds(10, 10, 564, 30);
				
				
				
			}
		});
		mnFile.add(mntmScientific);
		
		JMenuItem mntmUnitConversion = new JMenuItem("Unit Conversion");
		mntmUnitConversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmStandardCaculator.setTitle("Unit Conversion");
				frmStandardCaculator.setBounds(200, 100, 600, 400);
				txtdisplay.setBounds(10, 10, 564, 30);
				
			}
		});
		mnFile.add(mntmUnitConversion);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		frmStandardCaculator.getContentPane().setLayout(null);
		
		txtdisplay = new JTextField();
		txtdisplay.setBounds(10, 10, 270, 30);
		frmStandardCaculator.getContentPane().add(txtdisplay);
		txtdisplay.setColumns(10);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				if(txtdisplay.getText().length() > 0){
					StringBuilder strB = new StringBuilder(txtdisplay.getText());
					strB.deleteCharAt(txtdisplay.getText().length() - 1);
					backspace = strB.toString();
					txtdisplay.setText(backspace);
				}
			}
		});
		btnNewButton.setBounds(10, 50, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CE");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(65, 50, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtdisplay.setText(null);
				firstnum = 0;
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(120, 50, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u00B1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops = ops * (-1);
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(175, 50, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u221A");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops = Math.sqrt(ops);
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_4.setBounds(230, 50, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("7");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtdisplay.getText() + btnNewButton_5.getText();
				txtdisplay.setText(iNum);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5.setBounds(10, 105, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("8");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtdisplay.getText() + btnNewButton_6.getText();
				txtdisplay.setText(iNum);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_6.setBounds(65, 105, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("9");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtdisplay.getText() + btnNewButton_7.getText();
				txtdisplay.setText(iNum);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_7.setBounds(119, 105, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("/");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operations = "/";
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_8.setBounds(175, 105, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("%");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operations = "%";
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_9.setBounds(230, 105, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("4");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtdisplay.getText() + btnNewButton_10.getText();
				txtdisplay.setText(iNum);
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_10.setBounds(10, 160, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("5");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtdisplay.getText() + btnNewButton_11.getText();
				txtdisplay.setText(iNum);
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_11.setBounds(65, 160, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("6");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtdisplay.getText() + btnNewButton_12.getText();
				txtdisplay.setText(iNum);
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_12.setBounds(120, 160, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("*");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operations = "*";
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_13.setBounds(175, 160, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("\u215F");
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_14.setBounds(230, 160, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("1");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtdisplay.getText() + btnNewButton_15.getText();
				txtdisplay.setText(iNum);
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_15.setBounds(10, 215, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("2");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtdisplay.getText() + btnNewButton_16.getText();
				txtdisplay.setText(iNum);
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_16.setBounds(65, 215, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("3");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtdisplay.getText() + btnNewButton_17.getText();
				txtdisplay.setText(iNum);
			}
		});
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_17.setBounds(120, 215, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("-");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operations = "-";
				
			}
		});
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_18.setBounds(175, 215, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("0");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtdisplay.getText() + btnNewButton_19.getText();
				txtdisplay.setText(iNum);
			}
		});
		btnNewButton_19.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_19.setBounds(9, 270, 105, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton(".");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iNum = txtdisplay.getText() + btnNewButton_20.getText();
				txtdisplay.setText(iNum);
			}
		});
		btnNewButton_20.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_20.setBounds(120, 270, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("+");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operations = "+";
				
			}
		});
		btnNewButton_21.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_21.setBounds(175, 270, 50, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("=");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondnum = Double.parseDouble(txtdisplay.getText());
				if( operations == "+"){
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtdisplay.setText(answer);
				} 
				else if( operations == "-"){
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtdisplay.setText(answer);
				}
				else if( operations == "*"){
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					txtdisplay.setText(answer);
				}
				else if( operations == "/"){
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					txtdisplay.setText(answer);
				}
				else if( operations == "%"){
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					txtdisplay.setText(answer);
				}
				
			}
		});
		btnNewButton_22.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_22.setBounds(230, 215, 50, 105);
		frmStandardCaculator.getContentPane().add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("Log");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops = Math.log(ops);
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_23.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_23.setBounds(300, 50, 70, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("Sin");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops = Math.sin(ops);
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_24.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_24.setBounds(375, 50, 70, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("Sinh");
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops = Math.sinh(ops);
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_25.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_25.setBounds(450, 50, 70, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("\u03C0");
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = (3.14159265358979323846) ;
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_26.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_26.setBounds(300, 105, 70, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("Cos");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops = Math.cos(ops);
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_27.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_27.setBounds(375, 105, 70, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("Cosh");
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops = Math.cosh(ops);
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		btnNewButton_28.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_28.setBounds(450, 105, 70, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_28);
		
		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operations = "Mod";
				
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMod.setBounds(525, 50, 70, 50);
		frmStandardCaculator.getContentPane().add(btnMod);
		
		JButton btnInx = new JButton("Inx");
		btnInx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops = Math.log10( ops);
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		btnInx.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnInx.setBounds(525, 105, 70, 50);
		frmStandardCaculator.getContentPane().add(btnInx);
		
		JButton btnNewButton_29 = new JButton("x^y");
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops = Math.pow(ops, ops);
				txtdisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_29.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_29.setBounds(300, 160, 70, 50);
		frmStandardCaculator.getContentPane().add(btnNewButton_29);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops = Math.tan(ops);
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTan.setBounds(375, 160, 70, 50);
		frmStandardCaculator.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops = Math.tanh(ops);
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTanh.setBounds(450, 160, 70, 50);
		frmStandardCaculator.getContentPane().add(btnTanh);
		
		JButton btnC = new JButton("Exp");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtdisplay.getText());
				txtdisplay.setText("");
				operations = "Exp";
				
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnC.setBounds(525, 160, 70, 50);
		frmStandardCaculator.getContentPane().add(btnC);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops = Math.pow(ops, 2);
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnX.setBounds(300, 215, 70, 50);
		frmStandardCaculator.getContentPane().add(btnX);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops = Math.cbrt(ops);
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		btnCbr.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCbr.setBounds(375, 215, 70, 50);
		frmStandardCaculator.getContentPane().add(btnCbr);
		
		JButton btnRund = new JButton("Rund");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops = Math.round(ops);
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		btnRund.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRund.setBounds(450, 215, 70, 50);
		frmStandardCaculator.getContentPane().add(btnRund);
		
		JButton button = new JButton("2*\u03C0");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops;
				ops = (3.14159265358979323846) * 2;
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 16));
		button.setBounds(525, 215, 70, 50);
		frmStandardCaculator.getContentPane().add(button);
		
		JButton btnX_1 = new JButton("x^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtdisplay.getText()));
				ops = Math.pow(ops, 3);
				txtdisplay.setText(String.valueOf(ops));
				
			}
		});
		btnX_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnX_1.setBounds(300, 270, 70, 50);
		frmStandardCaculator.getContentPane().add(btnX_1);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(txtdisplay.getText());
				txtdisplay.setText(Integer.toString(a, 2));
				
			}
		});
		btnBin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBin.setBounds(375, 270, 70, 50);
		frmStandardCaculator.getContentPane().add(btnBin);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(txtdisplay.getText());
				txtdisplay.setText(Integer.toString(a, 16));
				
			}
		});
		btnHex.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnHex.setBounds(450, 270, 70, 50);
		frmStandardCaculator.getContentPane().add(btnHex);
		
		JButton btnOctal = new JButton("Octal");
		btnOctal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(txtdisplay.getText());
				txtdisplay.setText(Integer.toString(a, 8));
				
			}
		});
		btnOctal.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOctal.setBounds(525, 270, 70, 50);
		frmStandardCaculator.getContentPane().add(btnOctal);
	}
}
