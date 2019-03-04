package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

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
    AccessibleContext: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    BlockIncrement: scala.Double,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Graphics: XGraphics,
    LineIncrement: scala.Double,
    Maximum: scala.Double,
    Model: XControlModel,
    Orientation: scala.Double,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    Size: Size,
    Value: scala.Double,
    View: XView,
    VisibleSize: scala.Double,
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
    getBlockIncrement: js.Function0[scala.Double],
    getContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getGraphics: js.Function0[XGraphics],
    getLineIncrement: js.Function0[scala.Double],
    getMaximum: js.Function0[scala.Double],
    getModel: js.Function0[XControlModel],
    getOrientation: js.Function0[scala.Double],
    getPeer: js.Function0[XWindowPeer],
    getPosSize: js.Function0[Rectangle],
    getSize: js.Function0[Size],
    getValue: js.Function0[scala.Double],
    getView: js.Function0[XView],
    getVisibleSize: js.Function0[scala.Double],
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
    setBlockIncrement: js.Function1[scala.Double, scala.Unit],
    setContext: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setDesignMode: js.Function1[scala.Boolean, scala.Unit],
    setEnable: js.Function1[scala.Boolean, scala.Unit],
    setFocus: js.Function0[scala.Unit],
    setGraphics: js.Function1[XGraphics, scala.Boolean],
    setLineIncrement: js.Function1[scala.Double, scala.Unit],
    setMaximum: js.Function1[scala.Double, scala.Unit],
    setModel: js.Function1[XControlModel, scala.Boolean],
    setOrientation: js.Function1[scala.Double, scala.Unit],
    setPosSize: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    setValue: js.Function1[scala.Double, scala.Unit],
    setValues: js.Function3[scala.Double, scala.Double, scala.Double, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit],
    setVisibleSize: js.Function1[scala.Double, scala.Unit],
    setZoom: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): UnoControlScrollBar = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext, BlockIncrement = BlockIncrement, Context = Context, Graphics = Graphics, LineIncrement = LineIncrement, Maximum = Maximum, Model = Model, Orientation = Orientation, Peer = Peer, PosSize = PosSize, Size = Size, Value = Value, View = View, VisibleSize = VisibleSize, acquire = acquire, addAdjustmentListener = addAdjustmentListener, addEventListener = addEventListener, addFocusListener = addFocusListener, addKeyListener = addKeyListener, addMouseListener = addMouseListener, addMouseMotionListener = addMouseMotionListener, addPaintListener = addPaintListener, addWindowListener = addWindowListener, createPeer = createPeer, dispose = dispose, draw = draw, getAccessibleContext = getAccessibleContext, getBlockIncrement = getBlockIncrement, getContext = getContext, getGraphics = getGraphics, getLineIncrement = getLineIncrement, getMaximum = getMaximum, getModel = getModel, getOrientation = getOrientation, getPeer = getPeer, getPosSize = getPosSize, getSize = getSize, getValue = getValue, getView = getView, getVisibleSize = getVisibleSize, isDesignMode = isDesignMode, isTransparent = isTransparent, queryInterface = queryInterface, release = release, removeAdjustmentListener = removeAdjustmentListener, removeEventListener = removeEventListener, removeFocusListener = removeFocusListener, removeKeyListener = removeKeyListener, removeMouseListener = removeMouseListener, removeMouseMotionListener = removeMouseMotionListener, removePaintListener = removePaintListener, removeWindowListener = removeWindowListener, setBlockIncrement = setBlockIncrement, setContext = setContext, setDesignMode = setDesignMode, setEnable = setEnable, setFocus = setFocus, setGraphics = setGraphics, setLineIncrement = setLineIncrement, setMaximum = setMaximum, setModel = setModel, setOrientation = setOrientation, setPosSize = setPosSize, setValue = setValue, setValues = setValues, setVisible = setVisible, setVisibleSize = setVisibleSize, setZoom = setZoom)
  
    __obj.asInstanceOf[UnoControlScrollBar]
  }
}

