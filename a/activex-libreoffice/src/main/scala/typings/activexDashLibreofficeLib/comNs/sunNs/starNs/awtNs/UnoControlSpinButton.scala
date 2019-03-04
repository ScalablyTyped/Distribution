package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a spin button control.
  *
  * The model of an {@link UnoControlSpinButton} control must support the {@link UnoControlSpinButtonModel} service.
  */
trait UnoControlSpinButton
  extends UnoControl
     with XSpinValue

object UnoControlSpinButton {
  @scala.inline
  def apply(
    AccessibleContext: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Graphics: XGraphics,
    Maximum: scala.Double,
    Minimum: scala.Double,
    Model: XControlModel,
    Orientation: scala.Double,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    Size: Size,
    SpinIncrement: scala.Double,
    Value: scala.Double,
    View: XView,
    acquire: js.Function0[scala.Unit],
    addAdjustmentListener: js.Function1[XAdjustmentListener, scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addFocusListener: js.Function1[XFocusListener, scala.Unit],
    addKeyListener: js.Function1[XKeyListener, scala.Unit],
    addMouseListener: js.Function1[XMouseListener, scala.Unit],
    addMouseMotionListener: js.Function1[XMouseMotionListener, scala.Unit],
    addPaintListener: js.Function1[XPaintListener, scala.Unit],
    addWindowListener: js.Function1[XWindowListener, scala.Unit],
    createPeer: js.Function2[XToolkit, XWindowPeer, scala.Unit],
    dispose: js.Function0[scala.Unit],
    draw: js.Function2[scala.Double, scala.Double, scala.Unit],
    getAccessibleContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext],
    getContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getGraphics: js.Function0[XGraphics],
    getMaximum: js.Function0[scala.Double],
    getMinimum: js.Function0[scala.Double],
    getModel: js.Function0[XControlModel],
    getOrientation: js.Function0[scala.Double],
    getPeer: js.Function0[XWindowPeer],
    getPosSize: js.Function0[Rectangle],
    getSize: js.Function0[Size],
    getSpinIncrement: js.Function0[scala.Double],
    getValue: js.Function0[scala.Double],
    getView: js.Function0[XView],
    isDesignMode: js.Function0[scala.Boolean],
    isTransparent: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeAdjustmentListener: js.Function1[XAdjustmentListener, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeFocusListener: js.Function1[XFocusListener, scala.Unit],
    removeKeyListener: js.Function1[XKeyListener, scala.Unit],
    removeMouseListener: js.Function1[XMouseListener, scala.Unit],
    removeMouseMotionListener: js.Function1[XMouseMotionListener, scala.Unit],
    removePaintListener: js.Function1[XPaintListener, scala.Unit],
    removeWindowListener: js.Function1[XWindowListener, scala.Unit],
    setContext: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setDesignMode: js.Function1[scala.Boolean, scala.Unit],
    setEnable: js.Function1[scala.Boolean, scala.Unit],
    setFocus: js.Function0[scala.Unit],
    setGraphics: js.Function1[XGraphics, scala.Boolean],
    setMaximum: js.Function1[scala.Double, scala.Unit],
    setMinimum: js.Function1[scala.Double, scala.Unit],
    setModel: js.Function1[XControlModel, scala.Boolean],
    setOrientation: js.Function1[scala.Double, scala.Unit],
    setPosSize: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    setSpinIncrement: js.Function1[scala.Double, scala.Unit],
    setValue: js.Function1[scala.Double, scala.Unit],
    setValues: js.Function3[scala.Double, scala.Double, scala.Double, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit],
    setZoom: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): UnoControlSpinButton = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext, Context = Context, Graphics = Graphics, Maximum = Maximum, Minimum = Minimum, Model = Model, Orientation = Orientation, Peer = Peer, PosSize = PosSize, Size = Size, SpinIncrement = SpinIncrement, Value = Value, View = View, acquire = acquire, addAdjustmentListener = addAdjustmentListener, addEventListener = addEventListener, addFocusListener = addFocusListener, addKeyListener = addKeyListener, addMouseListener = addMouseListener, addMouseMotionListener = addMouseMotionListener, addPaintListener = addPaintListener, addWindowListener = addWindowListener, createPeer = createPeer, dispose = dispose, draw = draw, getAccessibleContext = getAccessibleContext, getContext = getContext, getGraphics = getGraphics, getMaximum = getMaximum, getMinimum = getMinimum, getModel = getModel, getOrientation = getOrientation, getPeer = getPeer, getPosSize = getPosSize, getSize = getSize, getSpinIncrement = getSpinIncrement, getValue = getValue, getView = getView, isDesignMode = isDesignMode, isTransparent = isTransparent, queryInterface = queryInterface, release = release, removeAdjustmentListener = removeAdjustmentListener, removeEventListener = removeEventListener, removeFocusListener = removeFocusListener, removeKeyListener = removeKeyListener, removeMouseListener = removeMouseListener, removeMouseMotionListener = removeMouseMotionListener, removePaintListener = removePaintListener, removeWindowListener = removeWindowListener, setContext = setContext, setDesignMode = setDesignMode, setEnable = setEnable, setFocus = setFocus, setGraphics = setGraphics, setMaximum = setMaximum, setMinimum = setMinimum, setModel = setModel, setOrientation = setOrientation, setPosSize = setPosSize, setSpinIncrement = setSpinIncrement, setValue = setValue, setValues = setValues, setVisible = setVisible, setZoom = setZoom)
  
    __obj.asInstanceOf[UnoControlSpinButton]
  }
}

