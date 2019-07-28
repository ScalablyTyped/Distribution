package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
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
    Context: XInterface,
    Controls: SafeArray[XControl],
    Model: XControlModel,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    Title: String,
    View: XView,
    acquire: () => Unit,
    addControl: (String, XControl) => Unit,
    addEventListener: XEventListener => Unit,
    addFocusListener: XFocusListener => Unit,
    addKeyListener: XKeyListener => Unit,
    addMouseListener: XMouseListener => Unit,
    addMouseMotionListener: XMouseMotionListener => Unit,
    addPaintListener: XPaintListener => Unit,
    addTopWindowListener: XTopWindowListener => Unit,
    addWindowListener: XWindowListener => Unit,
    createPeer: (XToolkit, XWindowPeer) => Unit,
    dispose: () => Unit,
    endDialog: Double => Unit,
    endExecute: () => Unit,
    execute: () => Double,
    getContext: () => XInterface,
    getControl: String => XControl,
    getControls: () => SafeArray[XControl],
    getModel: () => XControlModel,
    getPeer: () => XWindowPeer,
    getPosSize: () => Rectangle,
    getTitle: () => String,
    getView: () => XView,
    isDesignMode: () => Boolean,
    isTransparent: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeControl: XControl => Unit,
    removeEventListener: XEventListener => Unit,
    removeFocusListener: XFocusListener => Unit,
    removeKeyListener: XKeyListener => Unit,
    removeMouseListener: XMouseListener => Unit,
    removeMouseMotionListener: XMouseMotionListener => Unit,
    removePaintListener: XPaintListener => Unit,
    removeTopWindowListener: XTopWindowListener => Unit,
    removeWindowListener: XWindowListener => Unit,
    setContext: XInterface => Unit,
    setDesignMode: Boolean => Unit,
    setEnable: Boolean => Unit,
    setFocus: () => Unit,
    setHelpId: String => Unit,
    setMenuBar: XMenuBar => Unit,
    setModel: XControlModel => Boolean,
    setPosSize: (Double, Double, Double, Double, Double) => Unit,
    setStatusText: String => Unit,
    setTitle: String => Unit,
    setVisible: Boolean => Unit,
    toBack: () => Unit,
    toFront: () => Unit
  ): XUnoControlDialog = {
    val __obj = js.Dynamic.literal(Context = Context, Controls = Controls, Model = Model, Peer = Peer, PosSize = PosSize, Title = Title, View = View, acquire = js.Any.fromFunction0(acquire), addControl = js.Any.fromFunction2(addControl), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addTopWindowListener = js.Any.fromFunction1(addTopWindowListener), addWindowListener = js.Any.fromFunction1(addWindowListener), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), endDialog = js.Any.fromFunction1(endDialog), endExecute = js.Any.fromFunction0(endExecute), execute = js.Any.fromFunction0(execute), getContext = js.Any.fromFunction0(getContext), getControl = js.Any.fromFunction1(getControl), getControls = js.Any.fromFunction0(getControls), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getTitle = js.Any.fromFunction0(getTitle), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeControl = js.Any.fromFunction1(removeControl), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeTopWindowListener = js.Any.fromFunction1(removeTopWindowListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setHelpId = js.Any.fromFunction1(setHelpId), setMenuBar = js.Any.fromFunction1(setMenuBar), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setStatusText = js.Any.fromFunction1(setStatusText), setTitle = js.Any.fromFunction1(setTitle), setVisible = js.Any.fromFunction1(setVisible), toBack = js.Any.fromFunction0(toBack), toFront = js.Any.fromFunction0(toFront))
  
    __obj.asInstanceOf[XUnoControlDialog]
  }
}

