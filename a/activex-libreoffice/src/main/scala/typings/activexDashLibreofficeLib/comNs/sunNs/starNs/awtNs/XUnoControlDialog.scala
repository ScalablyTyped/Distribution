package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for the {@link UnoControlDialog} service. This service actually implements a whole whack of interfaces. This is the just the subset that
  * our code needs.
  * @since LibreOffice 4.2
  */
trait XUnoControlDialog
  extends XControl
     with XControlContainer
     with XWindow
     with XTopWindow
     with XDialog2

object XUnoControlDialog {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Controls: activexDashInteropLib.SafeArray[XControl],
    Model: XControlModel,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    Title: java.lang.String,
    View: XView,
    acquire: js.Function0[scala.Unit],
    addControl: js.Function2[java.lang.String, XControl, scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addFocusListener: js.Function1[XFocusListener, scala.Unit],
    addKeyListener: js.Function1[XKeyListener, scala.Unit],
    addMouseListener: js.Function1[XMouseListener, scala.Unit],
    addMouseMotionListener: js.Function1[XMouseMotionListener, scala.Unit],
    addPaintListener: js.Function1[XPaintListener, scala.Unit],
    addTopWindowListener: js.Function1[XTopWindowListener, scala.Unit],
    addWindowListener: js.Function1[XWindowListener, scala.Unit],
    createPeer: js.Function2[XToolkit, XWindowPeer, scala.Unit],
    dispose: js.Function0[scala.Unit],
    endDialog: js.Function1[scala.Double, scala.Unit],
    endExecute: js.Function0[scala.Unit],
    execute: js.Function0[scala.Double],
    getContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getControl: js.Function1[java.lang.String, XControl],
    getControls: js.Function0[activexDashInteropLib.SafeArray[XControl]],
    getModel: js.Function0[XControlModel],
    getPeer: js.Function0[XWindowPeer],
    getPosSize: js.Function0[Rectangle],
    getTitle: js.Function0[java.lang.String],
    getView: js.Function0[XView],
    isDesignMode: js.Function0[scala.Boolean],
    isTransparent: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeControl: js.Function1[XControl, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeFocusListener: js.Function1[XFocusListener, scala.Unit],
    removeKeyListener: js.Function1[XKeyListener, scala.Unit],
    removeMouseListener: js.Function1[XMouseListener, scala.Unit],
    removeMouseMotionListener: js.Function1[XMouseMotionListener, scala.Unit],
    removePaintListener: js.Function1[XPaintListener, scala.Unit],
    removeTopWindowListener: js.Function1[XTopWindowListener, scala.Unit],
    removeWindowListener: js.Function1[XWindowListener, scala.Unit],
    setContext: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setDesignMode: js.Function1[scala.Boolean, scala.Unit],
    setEnable: js.Function1[scala.Boolean, scala.Unit],
    setFocus: js.Function0[scala.Unit],
    setHelpId: js.Function1[java.lang.String, scala.Unit],
    setMenuBar: js.Function1[XMenuBar, scala.Unit],
    setModel: js.Function1[XControlModel, scala.Boolean],
    setPosSize: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    setStatusText: js.Function1[java.lang.String, scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit],
    toBack: js.Function0[scala.Unit],
    toFront: js.Function0[scala.Unit]
  ): XUnoControlDialog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("Controls")(Controls)
    __obj.updateDynamic("Model")(Model)
    __obj.updateDynamic("Peer")(Peer)
    __obj.updateDynamic("PosSize")(PosSize)
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("View")(View)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addControl")(addControl)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addFocusListener")(addFocusListener)
    __obj.updateDynamic("addKeyListener")(addKeyListener)
    __obj.updateDynamic("addMouseListener")(addMouseListener)
    __obj.updateDynamic("addMouseMotionListener")(addMouseMotionListener)
    __obj.updateDynamic("addPaintListener")(addPaintListener)
    __obj.updateDynamic("addTopWindowListener")(addTopWindowListener)
    __obj.updateDynamic("addWindowListener")(addWindowListener)
    __obj.updateDynamic("createPeer")(createPeer)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("endDialog")(endDialog)
    __obj.updateDynamic("endExecute")(endExecute)
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getContext")(getContext)
    __obj.updateDynamic("getControl")(getControl)
    __obj.updateDynamic("getControls")(getControls)
    __obj.updateDynamic("getModel")(getModel)
    __obj.updateDynamic("getPeer")(getPeer)
    __obj.updateDynamic("getPosSize")(getPosSize)
    __obj.updateDynamic("getTitle")(getTitle)
    __obj.updateDynamic("getView")(getView)
    __obj.updateDynamic("isDesignMode")(isDesignMode)
    __obj.updateDynamic("isTransparent")(isTransparent)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeControl")(removeControl)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeFocusListener")(removeFocusListener)
    __obj.updateDynamic("removeKeyListener")(removeKeyListener)
    __obj.updateDynamic("removeMouseListener")(removeMouseListener)
    __obj.updateDynamic("removeMouseMotionListener")(removeMouseMotionListener)
    __obj.updateDynamic("removePaintListener")(removePaintListener)
    __obj.updateDynamic("removeTopWindowListener")(removeTopWindowListener)
    __obj.updateDynamic("removeWindowListener")(removeWindowListener)
    __obj.updateDynamic("setContext")(setContext)
    __obj.updateDynamic("setDesignMode")(setDesignMode)
    __obj.updateDynamic("setEnable")(setEnable)
    __obj.updateDynamic("setFocus")(setFocus)
    __obj.updateDynamic("setHelpId")(setHelpId)
    __obj.updateDynamic("setMenuBar")(setMenuBar)
    __obj.updateDynamic("setModel")(setModel)
    __obj.updateDynamic("setPosSize")(setPosSize)
    __obj.updateDynamic("setStatusText")(setStatusText)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.updateDynamic("toBack")(toBack)
    __obj.updateDynamic("toFront")(toFront)
    __obj.asInstanceOf[XUnoControlDialog]
  }
}

