package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an abstract control which contains other controls. */
trait UnoControlContainer
  extends UnoControl
     with XUnoControlContainer
     with XControlContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainer

object UnoControlContainer {
  @scala.inline
  def apply(
    AccessibleContext: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Controls: activexDashInteropLib.SafeArray[XControl],
    Graphics: XGraphics,
    Model: XControlModel,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    Size: Size,
    TabControllers: activexDashInteropLib.SafeArray[XTabController],
    View: XView,
    acquire: js.Function0[scala.Unit],
    addContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    addControl: js.Function2[java.lang.String, XControl, scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addFocusListener: js.Function1[XFocusListener, scala.Unit],
    addKeyListener: js.Function1[XKeyListener, scala.Unit],
    addMouseListener: js.Function1[XMouseListener, scala.Unit],
    addMouseMotionListener: js.Function1[XMouseMotionListener, scala.Unit],
    addPaintListener: js.Function1[XPaintListener, scala.Unit],
    addTabController: js.Function1[XTabController, scala.Unit],
    addWindowListener: js.Function1[XWindowListener, scala.Unit],
    createPeer: js.Function2[XToolkit, XWindowPeer, scala.Unit],
    dispose: js.Function0[scala.Unit],
    draw: js.Function2[scala.Double, scala.Double, scala.Unit],
    getAccessibleContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext],
    getContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getControl: js.Function1[java.lang.String, XControl],
    getControls: js.Function0[activexDashInteropLib.SafeArray[XControl]],
    getGraphics: js.Function0[XGraphics],
    getModel: js.Function0[XControlModel],
    getPeer: js.Function0[XWindowPeer],
    getPosSize: js.Function0[Rectangle],
    getSize: js.Function0[Size],
    getTabControllers: js.Function0[activexDashInteropLib.SafeArray[XTabController]],
    getView: js.Function0[XView],
    isDesignMode: js.Function0[scala.Boolean],
    isTransparent: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    removeControl: js.Function1[XControl, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeFocusListener: js.Function1[XFocusListener, scala.Unit],
    removeKeyListener: js.Function1[XKeyListener, scala.Unit],
    removeMouseListener: js.Function1[XMouseListener, scala.Unit],
    removeMouseMotionListener: js.Function1[XMouseMotionListener, scala.Unit],
    removePaintListener: js.Function1[XPaintListener, scala.Unit],
    removeTabController: js.Function1[XTabController, scala.Unit],
    removeWindowListener: js.Function1[XWindowListener, scala.Unit],
    setContext: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setDesignMode: js.Function1[scala.Boolean, scala.Unit],
    setEnable: js.Function1[scala.Boolean, scala.Unit],
    setFocus: js.Function0[scala.Unit],
    setGraphics: js.Function1[XGraphics, scala.Boolean],
    setModel: js.Function1[XControlModel, scala.Boolean],
    setPosSize: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    setStatusText: js.Function1[java.lang.String, scala.Unit],
    setTabControllers: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XTabController], scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit],
    setZoom: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): UnoControlContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessibleContext")(AccessibleContext)
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("Controls")(Controls)
    __obj.updateDynamic("Graphics")(Graphics)
    __obj.updateDynamic("Model")(Model)
    __obj.updateDynamic("Peer")(Peer)
    __obj.updateDynamic("PosSize")(PosSize)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("TabControllers")(TabControllers)
    __obj.updateDynamic("View")(View)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addContainerListener")(addContainerListener)
    __obj.updateDynamic("addControl")(addControl)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addFocusListener")(addFocusListener)
    __obj.updateDynamic("addKeyListener")(addKeyListener)
    __obj.updateDynamic("addMouseListener")(addMouseListener)
    __obj.updateDynamic("addMouseMotionListener")(addMouseMotionListener)
    __obj.updateDynamic("addPaintListener")(addPaintListener)
    __obj.updateDynamic("addTabController")(addTabController)
    __obj.updateDynamic("addWindowListener")(addWindowListener)
    __obj.updateDynamic("createPeer")(createPeer)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("draw")(draw)
    __obj.updateDynamic("getAccessibleContext")(getAccessibleContext)
    __obj.updateDynamic("getContext")(getContext)
    __obj.updateDynamic("getControl")(getControl)
    __obj.updateDynamic("getControls")(getControls)
    __obj.updateDynamic("getGraphics")(getGraphics)
    __obj.updateDynamic("getModel")(getModel)
    __obj.updateDynamic("getPeer")(getPeer)
    __obj.updateDynamic("getPosSize")(getPosSize)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("getTabControllers")(getTabControllers)
    __obj.updateDynamic("getView")(getView)
    __obj.updateDynamic("isDesignMode")(isDesignMode)
    __obj.updateDynamic("isTransparent")(isTransparent)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeContainerListener")(removeContainerListener)
    __obj.updateDynamic("removeControl")(removeControl)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeFocusListener")(removeFocusListener)
    __obj.updateDynamic("removeKeyListener")(removeKeyListener)
    __obj.updateDynamic("removeMouseListener")(removeMouseListener)
    __obj.updateDynamic("removeMouseMotionListener")(removeMouseMotionListener)
    __obj.updateDynamic("removePaintListener")(removePaintListener)
    __obj.updateDynamic("removeTabController")(removeTabController)
    __obj.updateDynamic("removeWindowListener")(removeWindowListener)
    __obj.updateDynamic("setContext")(setContext)
    __obj.updateDynamic("setDesignMode")(setDesignMode)
    __obj.updateDynamic("setEnable")(setEnable)
    __obj.updateDynamic("setFocus")(setFocus)
    __obj.updateDynamic("setGraphics")(setGraphics)
    __obj.updateDynamic("setModel")(setModel)
    __obj.updateDynamic("setPosSize")(setPosSize)
    __obj.updateDynamic("setStatusText")(setStatusText)
    __obj.updateDynamic("setTabControllers")(setTabControllers)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.updateDynamic("setZoom")(setZoom)
    __obj.asInstanceOf[UnoControlContainer]
  }
}

