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
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addFocusListener: js.Function1[XFocusListener, scala.Unit],
    addKeyListener: js.Function1[XKeyListener, scala.Unit],
    addMouseListener: js.Function1[XMouseListener, scala.Unit],
    addMouseMotionListener: js.Function1[XMouseMotionListener, scala.Unit],
    addPaintListener: js.Function1[XPaintListener, scala.Unit],
    addWindowListener: js.Function1[XWindowListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getPosSize: js.Function0[Rectangle],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeFocusListener: js.Function1[XFocusListener, scala.Unit],
    removeKeyListener: js.Function1[XKeyListener, scala.Unit],
    removeMouseListener: js.Function1[XMouseListener, scala.Unit],
    removeMouseMotionListener: js.Function1[XMouseMotionListener, scala.Unit],
    removePaintListener: js.Function1[XPaintListener, scala.Unit],
    removeWindowListener: js.Function1[XWindowListener, scala.Unit],
    setEnable: js.Function1[scala.Boolean, scala.Unit],
    setFocus: js.Function0[scala.Unit],
    setPosSize: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit]
  ): XWindow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PosSize")(PosSize)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addFocusListener")(addFocusListener)
    __obj.updateDynamic("addKeyListener")(addKeyListener)
    __obj.updateDynamic("addMouseListener")(addMouseListener)
    __obj.updateDynamic("addMouseMotionListener")(addMouseMotionListener)
    __obj.updateDynamic("addPaintListener")(addPaintListener)
    __obj.updateDynamic("addWindowListener")(addWindowListener)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getPosSize")(getPosSize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeFocusListener")(removeFocusListener)
    __obj.updateDynamic("removeKeyListener")(removeKeyListener)
    __obj.updateDynamic("removeMouseListener")(removeMouseListener)
    __obj.updateDynamic("removeMouseMotionListener")(removeMouseMotionListener)
    __obj.updateDynamic("removePaintListener")(removePaintListener)
    __obj.updateDynamic("removeWindowListener")(removeWindowListener)
    __obj.updateDynamic("setEnable")(setEnable)
    __obj.updateDynamic("setFocus")(setFocus)
    __obj.updateDynamic("setPosSize")(setPosSize)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.asInstanceOf[XWindow]
  }
}

