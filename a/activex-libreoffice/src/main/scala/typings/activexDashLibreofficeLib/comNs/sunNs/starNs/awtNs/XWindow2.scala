package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies some extended operations for a window component.
  *
  * A window is a rectangular region on an output device with its own position, size, and internal coordinate system. A window is used for displaying
  * data. In addition, the window receives events from the user.
  */
trait XWindow2 extends XWindow {
  /** returns the inner bounds of the window, also known as the client size. */
  var OutputSize: Size
  /** returns the inner bounds of the window, also known as the client size. */
  def getOutputSize(): Size
  /** returns the focus state of the window */
  def hasFocus(): scala.Boolean
  /** returns the activation state of the window */
  def isActive(): scala.Boolean
  /** returns the enabled state of the window */
  def isEnabled(): scala.Boolean
  /** returns the visibility state of the window */
  def isVisible(): scala.Boolean
  /**
    * sets the inner bounds of the window, also known as the client size
    * @param Size the inner width and height of the window.
    */
  def setOutputSize(Size: Size): scala.Unit
}

object XWindow2 {
  @scala.inline
  def apply(
    OutputSize: Size,
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
    getOutputSize: js.Function0[Size],
    getPosSize: js.Function0[Rectangle],
    hasFocus: js.Function0[scala.Boolean],
    isActive: js.Function0[scala.Boolean],
    isEnabled: js.Function0[scala.Boolean],
    isVisible: js.Function0[scala.Boolean],
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
    setOutputSize: js.Function1[Size, scala.Unit],
    setPosSize: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit]
  ): XWindow2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("OutputSize")(OutputSize)
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
    __obj.updateDynamic("getOutputSize")(getOutputSize)
    __obj.updateDynamic("getPosSize")(getPosSize)
    __obj.updateDynamic("hasFocus")(hasFocus)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("isVisible")(isVisible)
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
    __obj.updateDynamic("setOutputSize")(setOutputSize)
    __obj.updateDynamic("setPosSize")(setPosSize)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.asInstanceOf[XWindow2]
  }
}

