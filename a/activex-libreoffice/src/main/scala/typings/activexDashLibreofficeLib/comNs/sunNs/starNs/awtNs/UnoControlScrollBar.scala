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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessibleContext")(AccessibleContext)
    __obj.updateDynamic("BlockIncrement")(BlockIncrement)
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("Graphics")(Graphics)
    __obj.updateDynamic("LineIncrement")(LineIncrement)
    __obj.updateDynamic("Maximum")(Maximum)
    __obj.updateDynamic("Model")(Model)
    __obj.updateDynamic("Orientation")(Orientation)
    __obj.updateDynamic("Peer")(Peer)
    __obj.updateDynamic("PosSize")(PosSize)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("Value")(Value)
    __obj.updateDynamic("View")(View)
    __obj.updateDynamic("VisibleSize")(VisibleSize)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addAdjustmentListener")(addAdjustmentListener)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addFocusListener")(addFocusListener)
    __obj.updateDynamic("addKeyListener")(addKeyListener)
    __obj.updateDynamic("addMouseListener")(addMouseListener)
    __obj.updateDynamic("addMouseMotionListener")(addMouseMotionListener)
    __obj.updateDynamic("addPaintListener")(addPaintListener)
    __obj.updateDynamic("addWindowListener")(addWindowListener)
    __obj.updateDynamic("createPeer")(createPeer)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("draw")(draw)
    __obj.updateDynamic("getAccessibleContext")(getAccessibleContext)
    __obj.updateDynamic("getBlockIncrement")(getBlockIncrement)
    __obj.updateDynamic("getContext")(getContext)
    __obj.updateDynamic("getGraphics")(getGraphics)
    __obj.updateDynamic("getLineIncrement")(getLineIncrement)
    __obj.updateDynamic("getMaximum")(getMaximum)
    __obj.updateDynamic("getModel")(getModel)
    __obj.updateDynamic("getOrientation")(getOrientation)
    __obj.updateDynamic("getPeer")(getPeer)
    __obj.updateDynamic("getPosSize")(getPosSize)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("getView")(getView)
    __obj.updateDynamic("getVisibleSize")(getVisibleSize)
    __obj.updateDynamic("isDesignMode")(isDesignMode)
    __obj.updateDynamic("isTransparent")(isTransparent)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeAdjustmentListener")(removeAdjustmentListener)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeFocusListener")(removeFocusListener)
    __obj.updateDynamic("removeKeyListener")(removeKeyListener)
    __obj.updateDynamic("removeMouseListener")(removeMouseListener)
    __obj.updateDynamic("removeMouseMotionListener")(removeMouseMotionListener)
    __obj.updateDynamic("removePaintListener")(removePaintListener)
    __obj.updateDynamic("removeWindowListener")(removeWindowListener)
    __obj.updateDynamic("setBlockIncrement")(setBlockIncrement)
    __obj.updateDynamic("setContext")(setContext)
    __obj.updateDynamic("setDesignMode")(setDesignMode)
    __obj.updateDynamic("setEnable")(setEnable)
    __obj.updateDynamic("setFocus")(setFocus)
    __obj.updateDynamic("setGraphics")(setGraphics)
    __obj.updateDynamic("setLineIncrement")(setLineIncrement)
    __obj.updateDynamic("setMaximum")(setMaximum)
    __obj.updateDynamic("setModel")(setModel)
    __obj.updateDynamic("setOrientation")(setOrientation)
    __obj.updateDynamic("setPosSize")(setPosSize)
    __obj.updateDynamic("setValue")(setValue)
    __obj.updateDynamic("setValues")(setValues)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.updateDynamic("setVisibleSize")(setVisibleSize)
    __obj.updateDynamic("setZoom")(setZoom)
    __obj.asInstanceOf[UnoControlScrollBar]
  }
}

