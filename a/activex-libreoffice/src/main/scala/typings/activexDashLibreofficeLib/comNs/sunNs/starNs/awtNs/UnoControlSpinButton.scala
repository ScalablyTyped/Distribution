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
    acquire: () => scala.Unit,
    addAdjustmentListener: XAdjustmentListener => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addFocusListener: XFocusListener => scala.Unit,
    addKeyListener: XKeyListener => scala.Unit,
    addMouseListener: XMouseListener => scala.Unit,
    addMouseMotionListener: XMouseMotionListener => scala.Unit,
    addPaintListener: XPaintListener => scala.Unit,
    addWindowListener: XWindowListener => scala.Unit,
    createPeer: (XToolkit, XWindowPeer) => scala.Unit,
    dispose: () => scala.Unit,
    draw: (scala.Double, scala.Double) => scala.Unit,
    getAccessibleContext: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    getContext: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getGraphics: () => XGraphics,
    getMaximum: () => scala.Double,
    getMinimum: () => scala.Double,
    getModel: () => XControlModel,
    getOrientation: () => scala.Double,
    getPeer: () => XWindowPeer,
    getPosSize: () => Rectangle,
    getSize: () => Size,
    getSpinIncrement: () => scala.Double,
    getValue: () => scala.Double,
    getView: () => XView,
    isDesignMode: () => scala.Boolean,
    isTransparent: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeAdjustmentListener: XAdjustmentListener => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeFocusListener: XFocusListener => scala.Unit,
    removeKeyListener: XKeyListener => scala.Unit,
    removeMouseListener: XMouseListener => scala.Unit,
    removeMouseMotionListener: XMouseMotionListener => scala.Unit,
    removePaintListener: XPaintListener => scala.Unit,
    removeWindowListener: XWindowListener => scala.Unit,
    setContext: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    setDesignMode: scala.Boolean => scala.Unit,
    setEnable: scala.Boolean => scala.Unit,
    setFocus: () => scala.Unit,
    setGraphics: XGraphics => scala.Boolean,
    setMaximum: scala.Double => scala.Unit,
    setMinimum: scala.Double => scala.Unit,
    setModel: XControlModel => scala.Boolean,
    setOrientation: scala.Double => scala.Unit,
    setPosSize: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    setSpinIncrement: scala.Double => scala.Unit,
    setValue: scala.Double => scala.Unit,
    setValues: (scala.Double, scala.Double, scala.Double) => scala.Unit,
    setVisible: scala.Boolean => scala.Unit,
    setZoom: (scala.Double, scala.Double) => scala.Unit
  ): UnoControlSpinButton = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext, Context = Context, Graphics = Graphics, Maximum = Maximum, Minimum = Minimum, Model = Model, Orientation = Orientation, Peer = Peer, PosSize = PosSize, Size = Size, SpinIncrement = SpinIncrement, Value = Value, View = View, acquire = js.Any.fromFunction0(acquire), addAdjustmentListener = js.Any.fromFunction1(addAdjustmentListener), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getContext = js.Any.fromFunction0(getContext), getGraphics = js.Any.fromFunction0(getGraphics), getMaximum = js.Any.fromFunction0(getMaximum), getMinimum = js.Any.fromFunction0(getMinimum), getModel = js.Any.fromFunction0(getModel), getOrientation = js.Any.fromFunction0(getOrientation), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getSize = js.Any.fromFunction0(getSize), getSpinIncrement = js.Any.fromFunction0(getSpinIncrement), getValue = js.Any.fromFunction0(getValue), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAdjustmentListener = js.Any.fromFunction1(removeAdjustmentListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setMaximum = js.Any.fromFunction1(setMaximum), setMinimum = js.Any.fromFunction1(setMinimum), setModel = js.Any.fromFunction1(setModel), setOrientation = js.Any.fromFunction1(setOrientation), setPosSize = js.Any.fromFunction5(setPosSize), setSpinIncrement = js.Any.fromFunction1(setSpinIncrement), setValue = js.Any.fromFunction1(setValue), setValues = js.Any.fromFunction3(setValues), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom))
  
    __obj.asInstanceOf[UnoControlSpinButton]
  }
}

