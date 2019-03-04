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
    Controls: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl],
    Graphics: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics,
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel,
    Peer: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer,
    PosSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    TabControllers: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabController],
    View: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XView,
    acquire: js.Function0[scala.Unit],
    addContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    addControl: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl, 
      scala.Unit
    ],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addFocusListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener, scala.Unit],
    addKeyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener, scala.Unit],
    addMouseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener, scala.Unit],
    addMouseMotionListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener, 
      scala.Unit
    ],
    addPaintListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener, scala.Unit],
    addTabController: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabController, scala.Unit],
    addWindowListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener, scala.Unit],
    createPeer: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XToolkit, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer, 
      scala.Unit
    ],
    dispose: js.Function0[scala.Unit],
    draw: js.Function2[scala.Double, scala.Double, scala.Unit],
    getAccessibleContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext],
    getContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getControl: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl],
    getControls: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl]
    ],
    getGraphics: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics],
    getModel: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel],
    getPeer: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer],
    getPosSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    getTabControllers: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabController]
    ],
    getView: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XView],
    isDesignMode: js.Function0[scala.Boolean],
    isTransparent: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    removeControl: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeFocusListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener, scala.Unit],
    removeKeyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener, scala.Unit],
    removeMouseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener, scala.Unit],
    removeMouseMotionListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener, 
      scala.Unit
    ],
    removePaintListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener, scala.Unit],
    removeTabController: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabController, scala.Unit],
    removeWindowListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener, scala.Unit],
    setContext: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setDesignMode: js.Function1[scala.Boolean, scala.Unit],
    setEnable: js.Function1[scala.Boolean, scala.Unit],
    setFocus: js.Function0[scala.Unit],
    setGraphics: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics, scala.Boolean],
    setModel: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel, scala.Boolean],
    setPosSize: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    setStatusText: js.Function1[java.lang.String, scala.Unit],
    setTabControllers: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabController], 
      scala.Unit
    ],
    setVisible: js.Function1[scala.Boolean, scala.Unit],
    setZoom: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): UnoControlTabPage = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext, Context = Context, Controls = Controls, Graphics = Graphics, Model = Model, Peer = Peer, PosSize = PosSize, Size = Size, TabControllers = TabControllers, View = View, acquire = acquire, addContainerListener = addContainerListener, addControl = addControl, addEventListener = addEventListener, addFocusListener = addFocusListener, addKeyListener = addKeyListener, addMouseListener = addMouseListener, addMouseMotionListener = addMouseMotionListener, addPaintListener = addPaintListener, addTabController = addTabController, addWindowListener = addWindowListener, createPeer = createPeer, dispose = dispose, draw = draw, getAccessibleContext = getAccessibleContext, getContext = getContext, getControl = getControl, getControls = getControls, getGraphics = getGraphics, getModel = getModel, getPeer = getPeer, getPosSize = getPosSize, getSize = getSize, getTabControllers = getTabControllers, getView = getView, isDesignMode = isDesignMode, isTransparent = isTransparent, queryInterface = queryInterface, release = release, removeContainerListener = removeContainerListener, removeControl = removeControl, removeEventListener = removeEventListener, removeFocusListener = removeFocusListener, removeKeyListener = removeKeyListener, removeMouseListener = removeMouseListener, removeMouseMotionListener = removeMouseMotionListener, removePaintListener = removePaintListener, removeTabController = removeTabController, removeWindowListener = removeWindowListener, setContext = setContext, setDesignMode = setDesignMode, setEnable = setEnable, setFocus = setFocus, setGraphics = setGraphics, setModel = setModel, setPosSize = setPosSize, setStatusText = setStatusText, setTabControllers = setTabControllers, setVisible = setVisible, setZoom = setZoom)
  
    __obj.asInstanceOf[UnoControlTabPage]
  }
}

