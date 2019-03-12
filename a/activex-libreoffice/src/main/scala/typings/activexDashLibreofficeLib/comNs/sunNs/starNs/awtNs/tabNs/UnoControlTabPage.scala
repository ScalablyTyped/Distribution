package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.tabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a TabPage control.
  * @since OOo 3.4
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait UnoControlTabPage
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlContainer

object UnoControlTabPage {
  @scala.inline
  def apply(
    AccessibleContext: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Controls: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl],
    Graphics: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics,
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel,
    Peer: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer,
    PosSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    TabControllers: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabController],
    View: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XView,
    acquire: () => scala.Unit,
    addContainerListener: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener => scala.Unit,
    addControl: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl) => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addFocusListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener => scala.Unit,
    addKeyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener => scala.Unit,
    addMouseListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener => scala.Unit,
    addMouseMotionListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener => scala.Unit,
    addPaintListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener => scala.Unit,
    addTabController: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabController => scala.Unit,
    addWindowListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener => scala.Unit,
    createPeer: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XToolkit, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer) => scala.Unit,
    dispose: () => scala.Unit,
    draw: (scala.Double, scala.Double) => scala.Unit,
    getAccessibleContext: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    getContext: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getControl: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl,
    getControls: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl],
    getGraphics: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics,
    getModel: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel,
    getPeer: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer,
    getPosSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    getSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    getTabControllers: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabController],
    getView: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XView,
    isDesignMode: () => scala.Boolean,
    isTransparent: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeContainerListener: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener => scala.Unit,
    removeControl: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeFocusListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener => scala.Unit,
    removeKeyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener => scala.Unit,
    removeMouseListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener => scala.Unit,
    removeMouseMotionListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener => scala.Unit,
    removePaintListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener => scala.Unit,
    removeTabController: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabController => scala.Unit,
    removeWindowListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener => scala.Unit,
    setContext: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    setDesignMode: scala.Boolean => scala.Unit,
    setEnable: scala.Boolean => scala.Unit,
    setFocus: () => scala.Unit,
    setGraphics: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics => scala.Boolean,
    setModel: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel => scala.Boolean,
    setPosSize: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    setStatusText: java.lang.String => scala.Unit,
    setTabControllers: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabController] => scala.Unit,
    setVisible: scala.Boolean => scala.Unit,
    setZoom: (scala.Double, scala.Double) => scala.Unit
  ): UnoControlTabPage = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext, Context = Context, Controls = Controls, Graphics = Graphics, Model = Model, Peer = Peer, PosSize = PosSize, Size = Size, TabControllers = TabControllers, View = View, acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), addControl = js.Any.fromFunction2(addControl), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addTabController = js.Any.fromFunction1(addTabController), addWindowListener = js.Any.fromFunction1(addWindowListener), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getContext = js.Any.fromFunction0(getContext), getControl = js.Any.fromFunction1(getControl), getControls = js.Any.fromFunction0(getControls), getGraphics = js.Any.fromFunction0(getGraphics), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getSize = js.Any.fromFunction0(getSize), getTabControllers = js.Any.fromFunction0(getTabControllers), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeContainerListener = js.Any.fromFunction1(removeContainerListener), removeControl = js.Any.fromFunction1(removeControl), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeTabController = js.Any.fromFunction1(removeTabController), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setStatusText = js.Any.fromFunction1(setStatusText), setTabControllers = js.Any.fromFunction1(setTabControllers), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom))
  
    __obj.asInstanceOf[UnoControlTabPage]
  }
}

