package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
    AccessibleContext: XAccessibleContext,
    Context: XInterface,
    Graphics: XGraphics,
    Maximum: Double,
    Minimum: Double,
    Model: XControlModel,
    Orientation: Double,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    Size: Size,
    SpinIncrement: Double,
    Value: Double,
    View: XView,
    acquire: () => Unit,
    addAdjustmentListener: XAdjustmentListener => Unit,
    addEventListener: XEventListener => Unit,
    addFocusListener: XFocusListener => Unit,
    addKeyListener: XKeyListener => Unit,
    addMouseListener: XMouseListener => Unit,
    addMouseMotionListener: XMouseMotionListener => Unit,
    addPaintListener: XPaintListener => Unit,
    addWindowListener: XWindowListener => Unit,
    createPeer: (XToolkit, XWindowPeer) => Unit,
    dispose: () => Unit,
    draw: (Double, Double) => Unit,
    getAccessibleContext: () => XAccessibleContext,
    getContext: () => XInterface,
    getGraphics: () => XGraphics,
    getMaximum: () => Double,
    getMinimum: () => Double,
    getModel: () => XControlModel,
    getOrientation: () => Double,
    getPeer: () => XWindowPeer,
    getPosSize: () => Rectangle,
    getSize: () => Size,
    getSpinIncrement: () => Double,
    getValue: () => Double,
    getView: () => XView,
    isDesignMode: () => Boolean,
    isTransparent: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeAdjustmentListener: XAdjustmentListener => Unit,
    removeEventListener: XEventListener => Unit,
    removeFocusListener: XFocusListener => Unit,
    removeKeyListener: XKeyListener => Unit,
    removeMouseListener: XMouseListener => Unit,
    removeMouseMotionListener: XMouseMotionListener => Unit,
    removePaintListener: XPaintListener => Unit,
    removeWindowListener: XWindowListener => Unit,
    setContext: XInterface => Unit,
    setDesignMode: Boolean => Unit,
    setEnable: Boolean => Unit,
    setFocus: () => Unit,
    setGraphics: XGraphics => Boolean,
    setMaximum: Double => Unit,
    setMinimum: Double => Unit,
    setModel: XControlModel => Boolean,
    setOrientation: Double => Unit,
    setPosSize: (Double, Double, Double, Double, Double) => Unit,
    setSpinIncrement: Double => Unit,
    setValue: Double => Unit,
    setValues: (Double, Double, Double) => Unit,
    setVisible: Boolean => Unit,
    setZoom: (Double, Double) => Unit
  ): UnoControlSpinButton = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext, Context = Context, Graphics = Graphics, Maximum = Maximum, Minimum = Minimum, Model = Model, Orientation = Orientation, Peer = Peer, PosSize = PosSize, Size = Size, SpinIncrement = SpinIncrement, Value = Value, View = View, acquire = js.Any.fromFunction0(acquire), addAdjustmentListener = js.Any.fromFunction1(addAdjustmentListener), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getContext = js.Any.fromFunction0(getContext), getGraphics = js.Any.fromFunction0(getGraphics), getMaximum = js.Any.fromFunction0(getMaximum), getMinimum = js.Any.fromFunction0(getMinimum), getModel = js.Any.fromFunction0(getModel), getOrientation = js.Any.fromFunction0(getOrientation), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getSize = js.Any.fromFunction0(getSize), getSpinIncrement = js.Any.fromFunction0(getSpinIncrement), getValue = js.Any.fromFunction0(getValue), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAdjustmentListener = js.Any.fromFunction1(removeAdjustmentListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setMaximum = js.Any.fromFunction1(setMaximum), setMinimum = js.Any.fromFunction1(setMinimum), setModel = js.Any.fromFunction1(setModel), setOrientation = js.Any.fromFunction1(setOrientation), setPosSize = js.Any.fromFunction5(setPosSize), setSpinIncrement = js.Any.fromFunction1(setSpinIncrement), setValue = js.Any.fromFunction1(setValue), setValues = js.Any.fromFunction3(setValues), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom))
  
    __obj.asInstanceOf[UnoControlSpinButton]
  }
}

