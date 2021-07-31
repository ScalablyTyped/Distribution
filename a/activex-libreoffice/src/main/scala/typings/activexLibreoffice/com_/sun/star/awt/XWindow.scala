package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the basic operations for a window component.
  *
  * A window is a rectangular region on an output device with its own position, size, and internal coordinate system. A window is used for displaying
  * data. In addition, the window receives events from the user.
  */
trait XWindow
  extends StObject
     with XComponent {
  
  /** returns the outer bounds of the window. */
  val PosSize: Rectangle
  
  /** adds a focus listener to the object. */
  def addFocusListener(xListener: XFocusListener): Unit
  
  /** adds a key listener to the object. */
  def addKeyListener(xListener: XKeyListener): Unit
  
  /** adds a mouse listener to the object. */
  def addMouseListener(xListener: XMouseListener): Unit
  
  /** adds a mouse motion listener to the object. */
  def addMouseMotionListener(xListener: XMouseMotionListener): Unit
  
  /** adds a paint listener to the object. */
  def addPaintListener(xListener: XPaintListener): Unit
  
  /**
    * adds a window listener to the object.
    * @param xListener the listener to add. If this listener also supports the {@link XWindowListener2} interface, it will receive the additional events decla
    */
  def addWindowListener(xListener: XWindowListener): Unit
  
  /** returns the outer bounds of the window. */
  def getPosSize(): Rectangle
  
  /** removes the specified focus listener from the listener list. */
  def removeFocusListener(xListener: XFocusListener): Unit
  
  /** removes the specified key listener from the listener list. */
  def removeKeyListener(xListener: XKeyListener): Unit
  
  /** removes the specified mouse listener from the listener list. */
  def removeMouseListener(xListener: XMouseListener): Unit
  
  /** removes the specified mouse motion listener from the listener list. */
  def removeMouseMotionListener(xListener: XMouseMotionListener): Unit
  
  /** removes the specified paint listener from the listener list. */
  def removePaintListener(xListener: XPaintListener): Unit
  
  /** removes the specified window listener from the listener list. */
  def removeWindowListener(xListener: XWindowListener): Unit
  
  /** enables or disables the window depending on the parameter. */
  def setEnable(Enable: Boolean): Unit
  
  /** sets the focus to the window. */
  def setFocus(): Unit
  
  /**
    * sets the outer bounds of the window.
    * @param X the x-coordinate of the window.
    * @param Y the y-coordinate of the window.
    * @param Width the width of the window.
    * @param Height the height of the window.
    * @param Flags Flags are of type {@link PosSize} and specify, which parameters are taken into account when setting the outer bounds of the window.
    */
  def setPosSize(X: Double, Y: Double, Width: Double, Height: Double, Flags: Double): Unit
  
  /** shows or hides the window depending on the parameter. */
  def setVisible(Visible: Boolean): Unit
}
object XWindow {
  
  @scala.inline
  def apply(
    PosSize: Rectangle,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addFocusListener: XFocusListener => Unit,
    addKeyListener: XKeyListener => Unit,
    addMouseListener: XMouseListener => Unit,
    addMouseMotionListener: XMouseMotionListener => Unit,
    addPaintListener: XPaintListener => Unit,
    addWindowListener: XWindowListener => Unit,
    dispose: () => Unit,
    getPosSize: () => Rectangle,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeFocusListener: XFocusListener => Unit,
    removeKeyListener: XKeyListener => Unit,
    removeMouseListener: XMouseListener => Unit,
    removeMouseMotionListener: XMouseMotionListener => Unit,
    removePaintListener: XPaintListener => Unit,
    removeWindowListener: XWindowListener => Unit,
    setEnable: Boolean => Unit,
    setFocus: () => Unit,
    setPosSize: (Double, Double, Double, Double, Double) => Unit,
    setVisible: Boolean => Unit
  ): XWindow = {
    val __obj = js.Dynamic.literal(PosSize = PosSize.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), dispose = js.Any.fromFunction0(dispose), getPosSize = js.Any.fromFunction0(getPosSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setPosSize = js.Any.fromFunction5(setPosSize), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[XWindow]
  }
  
  @scala.inline
  implicit class XWindowMutableBuilder[Self <: XWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddFocusListener(value: XFocusListener => Unit): Self = StObject.set(x, "addFocusListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddKeyListener(value: XKeyListener => Unit): Self = StObject.set(x, "addKeyListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddMouseListener(value: XMouseListener => Unit): Self = StObject.set(x, "addMouseListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddMouseMotionListener(value: XMouseMotionListener => Unit): Self = StObject.set(x, "addMouseMotionListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddPaintListener(value: XPaintListener => Unit): Self = StObject.set(x, "addPaintListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddWindowListener(value: XWindowListener => Unit): Self = StObject.set(x, "addWindowListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPosSize(value: () => Rectangle): Self = StObject.set(x, "getPosSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPosSize(value: Rectangle): Self = StObject.set(x, "PosSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveFocusListener(value: XFocusListener => Unit): Self = StObject.set(x, "removeFocusListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveKeyListener(value: XKeyListener => Unit): Self = StObject.set(x, "removeKeyListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveMouseListener(value: XMouseListener => Unit): Self = StObject.set(x, "removeMouseListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveMouseMotionListener(value: XMouseMotionListener => Unit): Self = StObject.set(x, "removeMouseMotionListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemovePaintListener(value: XPaintListener => Unit): Self = StObject.set(x, "removePaintListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveWindowListener(value: XWindowListener => Unit): Self = StObject.set(x, "removeWindowListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnable(value: Boolean => Unit): Self = StObject.set(x, "setEnable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFocus(value: () => Unit): Self = StObject.set(x, "setFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPosSize(value: (Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setPosSize", js.Any.fromFunction5(value))
    
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
  }
}
