import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Fenetre1 extends JFrame implements MouseListener{
	
	JMenuBar barreMenus;
	JMenu couleur,Dimention;
	JMenuItem rouge, vert,blue;
		
	public Fenetre1() {
		Container c=getContentPane();
		setTitle("Menu");
		setBounds(300,300,300,300);
		couleur =new JMenu("couleur");
		Dimention =new JMenu("Dimention");
		barreMenus=new JMenuBar();
		barreMenus.add(couleur);
		barreMenus.add(Dimention);
		rouge=new JMenuItem("rouge");
		vert=new JMenuItem("vert");
		blue=new JMenuItem("blue");
		
		couleur.add(rouge);
		couleur.add(vert);
		couleur.add(blue);
		
		this.add(barreMenus,BorderLayout.NORTH);
		this.addMouseListener(this);
		
	}
	
	public void actionPerformed(ActionEvent ev) {

	

	if(ev.getSource()==rouge) System.out.println("Action option rouge");
	if(ev.getSource()==vert) System.out.println("Action option vert");}
	@Override
	public void mouseClicked(MouseEvent e) {
		

		if(e.getSource()==rouge) System.out.println("Action option rouge");
		if(e.getSource()==vert) System.out.println("Action option vert");}
		// TODO Auto-generated method stub
		
	

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {

		Fenetre1 mr = new Fenetre1();
		mr.setVisible(true);

		}
	

}
