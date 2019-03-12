package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the basic operations for a window component.
  *
  * A window is a rectangular region on an output device with its own position, size, and internal coordinate system. A window is used for displaying
  * data. In addition, the window receives events from the user.
  */
trait XWindow
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /** returns the outer bounds of the window. */
  val PosSize: Rectangle
  /** adds a focus listener to the object. */
  def addFocusListener(xListener: XFocusListener): scala.Unit
  /** adds a key listener to the object. */
  def addKeyListener(xListener: XKeyListener): scala.Unit
  /** adds a mouse listener to the object. */
  def addMouseListener(xListener: XMouseListener): scala.Unit
  /** adds a mouse motion listener to the object. */
  def addMouseMotionListener(xListener: XMouseMotionListener): scala.Unit
  /** adds a paint listener to the object. */
  def addPaintListener(xListener: XPaintListener): scala.Unit
  /**
    * adds a window listener to the object.
    * @param xListener the listener to add. If this listener also supports the {@link XWindowListener2} interface, it will receive the additional events decla
    */
  def addWindowListener(xListener: XWindowListener): scala.Unit
  /** returns the outer bounds of the window. */
  def getPosSize(): Rectangle
  /** removes the specified focus listener from the listener list. */
  def removeFocusListener(xListener: XFocusListener): scala.Unit
  /** removes the specified key listener from the listener list. */
  def removeKeyListener(xListener: XKeyListener): scala.Unit
  /** removes the specified mouse listener from the listener list. */
  def removeMouseListener(xListener: XMouseListener): scala.Unit
  /** removes the specified mouse motion listener from the listener list. */
  def removeMouseMotionListener(xListener: XMouseMotionListener): scala.Unit
  /** removes the specified paint listener from the listener list. */
  def removePaintListener(xListener: XPaintListener): scala.Unit
  /** removes the specified window listener from the listener list. */
  def removeWindowListener(xListener: XWindowListener): scala.Unit
  /** enables or disables the window depending on the parameter. */
  def setEnable(Enable: scala.Boolean): scala.Unit
  /** sets the focus to the window. */
  def setFocus(): scala.Unit
  /**
    * sets the outer bounds of the window.
    * @param X the x-coordinate of the window.
    * @param Y the y-coordinate of the window.
    * @param Width the width of the window.
    * @param Height the height of the window.
    * @param Flags Flags are of type {@link PosSize} and specify, which parameters are taken into account when setting the outer bounds of the window.
    */
  def setPosSize(X: scala.Double, Y: scala.Double, Width: scala.Double, Height: scala.Double, Flags: scala.Double): scala.Unit
  /** shows or hides the window depending on the parameter. */
  def setVisible(Visible: scala.Boolean): scala.Unit
}

object XWindow {
  @scala.inline
  def apply(
    PosSize: Rectangle,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addFocusListener: XFocusListener => scala.Unit,
    addKeyListener: XKeyListener => scala.Unit,
    addMouseListener: XMouseListener => scala.Unit,
    addMouseMotionListener: XMouseMotionListener => scala.Unit,
    addPaintListener: XPaintListener => scala.Unit,
    addWindowListener: XWindowListener => scala.Unit,
    dispose: () => scala.Unit,
    getPosSize: () => Rectangle,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeFocusListener: XFocusListener => scala.Unit,
    removeKeyListener: XKeyListener => scala.Unit,
    removeMouseListener: XMouseListener => scala.Unit,
    removeMouseMotionListener: XMouseMotionListener => scala.Unit,
    removePaintListener: XPaintListener => scala.Unit,
    removeWindowListener: XWindowListener => scala.Unit,
    setEnable: scala.Boolean => scala.Unit,
    setFocus: () => scala.Unit,
    setPosSize: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    setVisible: scala.Boolean => scala.Unit
  ): XWindow = {
    val __obj = js.Dynamic.literal(PosSize = PosSize, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), dispose = js.Any.fromFunction0(dispose), getPosSize = js.Any.fromFunction0(getPosSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setPosSize = js.Any.fromFunction5(setPosSize), setVisible = js.Any.fromFunction1(setVisible))
  
    __obj.asInstanceOf[XWindow]
  }
}

