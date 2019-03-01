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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessibleContext")(AccessibleContext)
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("Graphics")(Graphics)
    __obj.updateDynamic("Maximum")(Maximum)
    __obj.updateDynamic("Minimum")(Minimum)
    __obj.updateDynamic("Model")(Model)
    __obj.updateDynamic("Orientation")(Orientation)
    __obj.updateDynamic("Peer")(Peer)
    __obj.updateDynamic("PosSize")(PosSize)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("SpinIncrement")(SpinIncrement)
    __obj.updateDynamic("Value")(Value)
    __obj.updateDynamic("View")(View)
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
    __obj.updateDynamic("getContext")(getContext)
    __obj.updateDynamic("getGraphics")(getGraphics)
    __obj.updateDynamic("getMaximum")(getMaximum)
    __obj.updateDynamic("getMinimum")(getMinimum)
    __obj.updateDynamic("getModel")(getModel)
    __obj.updateDynamic("getOrientation")(getOrientation)
    __obj.updateDynamic("getPeer")(getPeer)
    __obj.updateDynamic("getPosSize")(getPosSize)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("getSpinIncrement")(getSpinIncrement)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("getView")(getView)
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
    __obj.updateDynamic("setContext")(setContext)
    __obj.updateDynamic("setDesignMode")(setDesignMode)
    __obj.updateDynamic("setEnable")(setEnable)
    __obj.updateDynamic("setFocus")(setFocus)
    __obj.updateDynamic("setGraphics")(setGraphics)
    __obj.updateDynamic("setMaximum")(setMaximum)
    __obj.updateDynamic("setMinimum")(setMinimum)
    __obj.updateDynamic("setModel")(setModel)
    __obj.updateDynamic("setOrientation")(setOrientation)
    __obj.updateDynamic("setPosSize")(setPosSize)
    __obj.updateDynamic("setSpinIncrement")(setSpinIncrement)
    __obj.updateDynamic("setValue")(setValue)
    __obj.updateDynamic("setValues")(setValues)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.updateDynamic("setZoom")(setZoom)
    __obj.asInstanceOf[UnoControlSpinButton]
  }
}

