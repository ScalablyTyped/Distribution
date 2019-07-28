package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a scroll bar control. */
trait UnoControlScrollBar
  extends UnoControl
     with XScrollBar

object UnoControlScrollBar {
  @scala.inline
  def apply(
    AccessibleContext: XAccessibleContext,
    BlockIncrement: Double,
    Context: XInterface,
    Graphics: XGraphics,
    LineIncrement: Double,
    Maximum: Double,
    Model: XControlModel,
    Orientation: Double,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    Size: Size,
    Value: Double,
    View: XView,
    VisibleSize: Double,
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
    getBlockIncrement: () => Double,
    getContext: () => XInterface,
    getGraphics: () => XGraphics,
    getLineIncrement: () => Double,
    getMaximum: () => Double,
    getModel: () => XControlModel,
    getOrientation: () => Double,
    getPeer: () => XWindowPeer,
    getPosSize: () => Rectangle,
    getSize: () => Size,
    getValue: () => Double,
    getView: () => XView,
    getVisibleSize: () => Double,
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
    setBlockIncrement: Double => Unit,
    setContext: XInterface => Unit,
    setDesignMode: Boolean => Unit,
    setEnable: Boolean => Unit,
    setFocus: () => Unit,
    setGraphics: XGraphics => Boolean,
    setLineIncrement: Double => Unit,
    setMaximum: Double => Unit,
    setModel: XControlModel => Boolean,
    setOrientation: Double => Unit,
    setPosSize: (Double, Double, Double, Double, Double) => Unit,
    setValue: Double => Unit,
    setValues: (Double, Double, Double) => Unit,
    setVisible: Boolean => Unit,
    setVisibleSize: Double => Unit,
    setZoom: (Double, Double) => Unit
  ): UnoControlScrollBar = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext, BlockIncrement = BlockIncrement, Context = Context, Graphics = Graphics, LineIncrement = LineIncrement, Maximum = Maximum, Model = Model, Orientation = Orientation, Peer = Peer, PosSize = PosSize, Size = Size, Value = Value, View = View, VisibleSize = VisibleSize, acquire = js.Any.fromFunction0(acquire), addAdjustmentListener = js.Any.fromFunction1(addAdjustmentListener), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getBlockIncrement = js.Any.fromFunction0(getBlockIncrement), getContext = js.Any.fromFunction0(getContext), getGraphics = js.Any.fromFunction0(getGraphics), getLineIncrement = js.Any.fromFunction0(getLineIncrement), getMaximum = js.Any.fromFunction0(getMaximum), getModel = js.Any.fromFunction0(getModel), getOrientation = js.Any.fromFunction0(getOrientation), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getSize = js.Any.fromFunction0(getSize), getValue = js.Any.fromFunction0(getValue), getView = js.Any.fromFunction0(getView), getVisibleSize = js.Any.fromFunction0(getVisibleSize), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAdjustmentListener = js.Any.fromFunction1(removeAdjustmentListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setBlockIncrement = js.Any.fromFunction1(setBlockIncrement), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setLineIncrement = js.Any.fromFunction1(setLineIncrement), setMaximum = js.Any.fromFunction1(setMaximum), setModel = js.Any.fromFunction1(setModel), setOrientation = js.Any.fromFunction1(setOrientation), setPosSize = js.Any.fromFunction5(setPosSize), setValue = js.Any.fromFunction1(setValue), setValues = js.Any.fromFunction3(setValues), setVisible = js.Any.fromFunction1(setVisible), setVisibleSize = js.Any.fromFunction1(setVisibleSize), setZoom = js.Any.fromFunction2(setZoom))
  
    __obj.asInstanceOf[UnoControlScrollBar]
  }
}

