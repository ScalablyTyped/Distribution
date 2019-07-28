package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.tabNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Rectangle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.UnoControlContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XControl
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XControlModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XFocusListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XGraphics
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XKeyListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XMouseListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XMouseMotionListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XPaintListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XTabController
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XToolkit
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XView
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindowListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindowPeer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XContainerListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a TabPage control.
  * @since OOo 3.4
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait UnoControlTabPage extends UnoControlContainer

object UnoControlTabPage {
  @scala.inline
  def apply(
    AccessibleContext: XAccessibleContext,
    Context: XInterface,
    Controls: SafeArray[XControl],
    Graphics: XGraphics,
    Model: XControlModel,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    Size: Size,
    TabControllers: SafeArray[XTabController],
    View: XView,
    acquire: () => Unit,
    addContainerListener: XContainerListener => Unit,
    addControl: (String, XControl) => Unit,
    addEventListener: XEventListener => Unit,
    addFocusListener: XFocusListener => Unit,
    addKeyListener: XKeyListener => Unit,
    addMouseListener: XMouseListener => Unit,
    addMouseMotionListener: XMouseMotionListener => Unit,
    addPaintListener: XPaintListener => Unit,
    addTabController: XTabController => Unit,
    addWindowListener: XWindowListener => Unit,
    createPeer: (XToolkit, XWindowPeer) => Unit,
    dispose: () => Unit,
    draw: (Double, Double) => Unit,
    getAccessibleContext: () => XAccessibleContext,
    getContext: () => XInterface,
    getControl: String => XControl,
    getControls: () => SafeArray[XControl],
    getGraphics: () => XGraphics,
    getModel: () => XControlModel,
    getPeer: () => XWindowPeer,
    getPosSize: () => Rectangle,
    getSize: () => Size,
    getTabControllers: () => SafeArray[XTabController],
    getView: () => XView,
    isDesignMode: () => Boolean,
    isTransparent: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeContainerListener: XContainerListener => Unit,
    removeControl: XControl => Unit,
    removeEventListener: XEventListener => Unit,
    removeFocusListener: XFocusListener => Unit,
    removeKeyListener: XKeyListener => Unit,
    removeMouseListener: XMouseListener => Unit,
    removeMouseMotionListener: XMouseMotionListener => Unit,
    removePaintListener: XPaintListener => Unit,
    removeTabController: XTabController => Unit,
    removeWindowListener: XWindowListener => Unit,
    setContext: XInterface => Unit,
    setDesignMode: Boolean => Unit,
    setEnable: Boolean => Unit,
    setFocus: () => Unit,
    setGraphics: XGraphics => Boolean,
    setModel: XControlModel => Boolean,
    setPosSize: (Double, Double, Double, Double, Double) => Unit,
    setStatusText: String => Unit,
    setTabControllers: SeqEquiv[XTabController] => Unit,
    setVisible: Boolean => Unit,
    setZoom: (Double, Double) => Unit
  ): UnoControlTabPage = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext, Context = Context, Controls = Controls, Graphics = Graphics, Model = Model, Peer = Peer, PosSize = PosSize, Size = Size, TabControllers = TabControllers, View = View, acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), addControl = js.Any.fromFunction2(addControl), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addTabController = js.Any.fromFunction1(addTabController), addWindowListener = js.Any.fromFunction1(addWindowListener), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getContext = js.Any.fromFunction0(getContext), getControl = js.Any.fromFunction1(getControl), getControls = js.Any.fromFunction0(getControls), getGraphics = js.Any.fromFunction0(getGraphics), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getSize = js.Any.fromFunction0(getSize), getTabControllers = js.Any.fromFunction0(getTabControllers), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeContainerListener = js.Any.fromFunction1(removeContainerListener), removeControl = js.Any.fromFunction1(removeControl), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeTabController = js.Any.fromFunction1(removeTabController), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setStatusText = js.Any.fromFunction1(setStatusText), setTabControllers = js.Any.fromFunction1(setTabControllers), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom))
  
    __obj.asInstanceOf[UnoControlTabPage]
  }
}

