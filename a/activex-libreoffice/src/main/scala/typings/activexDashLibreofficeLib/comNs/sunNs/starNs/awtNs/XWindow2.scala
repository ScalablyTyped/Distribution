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
    val __obj = js.Dynamic.literal(OutputSize = OutputSize, PosSize = PosSize, acquire = acquire, addEventListener = addEventListener, addFocusListener = addFocusListener, addKeyListener = addKeyListener, addMouseListener = addMouseListener, addMouseMotionListener = addMouseMotionListener, addPaintListener = addPaintListener, addWindowListener = addWindowListener, dispose = dispose, getOutputSize = getOutputSize, getPosSize = getPosSize, hasFocus = hasFocus, isActive = isActive, isEnabled = isEnabled, isVisible = isVisible, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removeFocusListener = removeFocusListener, removeKeyListener = removeKeyListener, removeMouseListener = removeMouseListener, removeMouseMotionListener = removeMouseMotionListener, removePaintListener = removePaintListener, removeWindowListener = removeWindowListener, setEnable = setEnable, setFocus = setFocus, setOutputSize = setOutputSize, setPosSize = setPosSize, setVisible = setVisible)
  
    __obj.asInstanceOf[XWindow2]
  }
}

