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

