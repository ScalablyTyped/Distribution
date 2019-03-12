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
    Controls: stdLib.SafeArray[XControl],
    Model: XControlModel,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    Title: java.lang.String,
    View: XView,
    acquire: () => scala.Unit,
    addControl: (java.lang.String, XControl) => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addFocusListener: XFocusListener => scala.Unit,
    addKeyListener: XKeyListener => scala.Unit,
    addMouseListener: XMouseListener => scala.Unit,
    addMouseMotionListener: XMouseMotionListener => scala.Unit,
    addPaintListener: XPaintListener => scala.Unit,
    addTopWindowListener: XTopWindowListener => scala.Unit,
    addWindowListener: XWindowListener => scala.Unit,
    createPeer: (XToolkit, XWindowPeer) => scala.Unit,
    dispose: () => scala.Unit,
    endDialog: scala.Double => scala.Unit,
    endExecute: () => scala.Unit,
    execute: () => scala.Double,
    getContext: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getControl: java.lang.String => XControl,
    getControls: () => stdLib.SafeArray[XControl],
    getModel: () => XControlModel,
    getPeer: () => XWindowPeer,
    getPosSize: () => Rectangle,
    getTitle: () => java.lang.String,
    getView: () => XView,
    isDesignMode: () => scala.Boolean,
    isTransparent: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeControl: XControl => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeFocusListener: XFocusListener => scala.Unit,
    removeKeyListener: XKeyListener => scala.Unit,
    removeMouseListener: XMouseListener => scala.Unit,
    removeMouseMotionListener: XMouseMotionListener => scala.Unit,
    removePaintListener: XPaintListener => scala.Unit,
    removeTopWindowListener: XTopWindowListener => scala.Unit,
    removeWindowListener: XWindowListener => scala.Unit,
    setContext: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    setDesignMode: scala.Boolean => scala.Unit,
    setEnable: scala.Boolean => scala.Unit,
    setFocus: () => scala.Unit,
    setHelpId: java.lang.String => scala.Unit,
    setMenuBar: XMenuBar => scala.Unit,
    setModel: XControlModel => scala.Boolean,
    setPosSize: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    setStatusText: java.lang.String => scala.Unit,
    setTitle: java.lang.String => scala.Unit,
    setVisible: scala.Boolean => scala.Unit,
    toBack: () => scala.Unit,
    toFront: () => scala.Unit
  ): XUnoControlDialog = {
    val __obj = js.Dynamic.literal(Context = Context, Controls = Controls, Model = Model, Peer = Peer, PosSize = PosSize, Title = Title, View = View, acquire = js.Any.fromFunction0(acquire), addControl = js.Any.fromFunction2(addControl), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addTopWindowListener = js.Any.fromFunction1(addTopWindowListener), addWindowListener = js.Any.fromFunction1(addWindowListener), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), endDialog = js.Any.fromFunction1(endDialog), endExecute = js.Any.fromFunction0(endExecute), execute = js.Any.fromFunction0(execute), getContext = js.Any.fromFunction0(getContext), getControl = js.Any.fromFunction1(getControl), getControls = js.Any.fromFunction0(getControls), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getTitle = js.Any.fromFunction0(getTitle), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeControl = js.Any.fromFunction1(removeControl), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeTopWindowListener = js.Any.fromFunction1(removeTopWindowListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setHelpId = js.Any.fromFunction1(setHelpId), setMenuBar = js.Any.fromFunction1(setMenuBar), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setStatusText = js.Any.fromFunction1(setStatusText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), toBack = js.Any.fromFunction0(toBack), toFront = js.Any.fromFunction0(toFront))
  
    __obj.asInstanceOf[XUnoControlDialog]
  }
}

