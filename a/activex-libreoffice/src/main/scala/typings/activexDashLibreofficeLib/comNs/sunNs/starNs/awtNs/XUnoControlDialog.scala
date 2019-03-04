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
    val __obj = js.Dynamic.literal(Context = Context, Controls = Controls, Model = Model, Peer = Peer, PosSize = PosSize, Title = Title, View = View, acquire = acquire, addControl = addControl, addEventListener = addEventListener, addFocusListener = addFocusListener, addKeyListener = addKeyListener, addMouseListener = addMouseListener, addMouseMotionListener = addMouseMotionListener, addPaintListener = addPaintListener, addTopWindowListener = addTopWindowListener, addWindowListener = addWindowListener, createPeer = createPeer, dispose = dispose, endDialog = endDialog, endExecute = endExecute, execute = execute, getContext = getContext, getControl = getControl, getControls = getControls, getModel = getModel, getPeer = getPeer, getPosSize = getPosSize, getTitle = getTitle, getView = getView, isDesignMode = isDesignMode, isTransparent = isTransparent, queryInterface = queryInterface, release = release, removeControl = removeControl, removeEventListener = removeEventListener, removeFocusListener = removeFocusListener, removeKeyListener = removeKeyListener, removeMouseListener = removeMouseListener, removeMouseMotionListener = removeMouseMotionListener, removePaintListener = removePaintListener, removeTopWindowListener = removeTopWindowListener, removeWindowListener = removeWindowListener, setContext = setContext, setDesignMode = setDesignMode, setEnable = setEnable, setFocus = setFocus, setHelpId = setHelpId, setMenuBar = setMenuBar, setModel = setModel, setPosSize = setPosSize, setStatusText = setStatusText, setTitle = setTitle, setVisible = setVisible, toBack = toBack, toFront = toFront)
  
    __obj.asInstanceOf[XUnoControlDialog]
  }
}

