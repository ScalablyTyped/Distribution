package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Unified interface for {@link LayoutManager} service.
  * @since LibreOffice 4.2
  */
trait XLayoutManager2
  extends XFrameActionListener
     with XLayoutManager
     with activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIConfigurationListener
     with XMenuBarMergingAcceptor
     with XLayoutManagerEventBroadcaster

object XLayoutManager2 {
  @scala.inline
  def apply(
    CurrentDockingArea: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    DockingAreaAcceptor: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XDockingAreaAcceptor,
    Elements: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIElement],
    acquire: js.Function0[scala.Unit],
    addLayoutManagerEventListener: js.Function1[XLayoutManagerListener, scala.Unit],
    attachFrame: js.Function1[XFrame, scala.Unit],
    createElement: js.Function1[java.lang.String, scala.Unit],
    destroyElement: js.Function1[java.lang.String, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    doLayout: js.Function0[scala.Unit],
    dockAllWindows: js.Function1[scala.Double, scala.Boolean],
    dockWindow: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.DockingArea, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, 
      scala.Boolean
    ],
    elementInserted: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ConfigurationEvent, scala.Unit],
    elementRemoved: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ConfigurationEvent, scala.Unit],
    elementReplaced: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ConfigurationEvent, scala.Unit],
    floatWindow: js.Function1[java.lang.String, scala.Boolean],
    frameAction: js.Function1[FrameActionEvent, scala.Unit],
    getCurrentDockingArea: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    getDockingAreaAcceptor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XDockingAreaAcceptor],
    getElement: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIElement],
    getElementPos: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getElementSize: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    getElements: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIElement]
    ],
    hideElement: js.Function1[java.lang.String, scala.Boolean],
    isElementDocked: js.Function1[java.lang.String, scala.Boolean],
    isElementFloating: js.Function1[java.lang.String, scala.Boolean],
    isElementLocked: js.Function1[java.lang.String, scala.Boolean],
    isElementVisible: js.Function1[java.lang.String, scala.Boolean],
    isVisible: js.Function0[scala.Boolean],
    lock: js.Function0[scala.Unit],
    lockWindow: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeLayoutManagerEventListener: js.Function1[XLayoutManagerListener, scala.Unit],
    removeMergedMenuBar: js.Function0[scala.Unit],
    requestElement: js.Function1[java.lang.String, scala.Boolean],
    reset: js.Function0[scala.Unit],
    setDockingAreaAcceptor: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XDockingAreaAcceptor, scala.Unit],
    setElementPos: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, 
      scala.Unit
    ],
    setElementPosSize: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, 
      scala.Unit
    ],
    setElementSize: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, 
      scala.Unit
    ],
    setMergedMenuBar: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess, 
      scala.Boolean
    ],
    setVisible: js.Function1[scala.Boolean, scala.Unit],
    showElement: js.Function1[java.lang.String, scala.Boolean],
    unlock: js.Function0[scala.Unit],
    unlockWindow: js.Function1[java.lang.String, scala.Boolean]
  ): XLayoutManager2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CurrentDockingArea")(CurrentDockingArea)
    __obj.updateDynamic("DockingAreaAcceptor")(DockingAreaAcceptor)
    __obj.updateDynamic("Elements")(Elements)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addLayoutManagerEventListener")(addLayoutManagerEventListener)
    __obj.updateDynamic("attachFrame")(attachFrame)
    __obj.updateDynamic("createElement")(createElement)
    __obj.updateDynamic("destroyElement")(destroyElement)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("doLayout")(doLayout)
    __obj.updateDynamic("dockAllWindows")(dockAllWindows)
    __obj.updateDynamic("dockWindow")(dockWindow)
    __obj.updateDynamic("elementInserted")(elementInserted)
    __obj.updateDynamic("elementRemoved")(elementRemoved)
    __obj.updateDynamic("elementReplaced")(elementReplaced)
    __obj.updateDynamic("floatWindow")(floatWindow)
    __obj.updateDynamic("frameAction")(frameAction)
    __obj.updateDynamic("getCurrentDockingArea")(getCurrentDockingArea)
    __obj.updateDynamic("getDockingAreaAcceptor")(getDockingAreaAcceptor)
    __obj.updateDynamic("getElement")(getElement)
    __obj.updateDynamic("getElementPos")(getElementPos)
    __obj.updateDynamic("getElementSize")(getElementSize)
    __obj.updateDynamic("getElements")(getElements)
    __obj.updateDynamic("hideElement")(hideElement)
    __obj.updateDynamic("isElementDocked")(isElementDocked)
    __obj.updateDynamic("isElementFloating")(isElementFloating)
    __obj.updateDynamic("isElementLocked")(isElementLocked)
    __obj.updateDynamic("isElementVisible")(isElementVisible)
    __obj.updateDynamic("isVisible")(isVisible)
    __obj.updateDynamic("lock")(lock)
    __obj.updateDynamic("lockWindow")(lockWindow)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeLayoutManagerEventListener")(removeLayoutManagerEventListener)
    __obj.updateDynamic("removeMergedMenuBar")(removeMergedMenuBar)
    __obj.updateDynamic("requestElement")(requestElement)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("setDockingAreaAcceptor")(setDockingAreaAcceptor)
    __obj.updateDynamic("setElementPos")(setElementPos)
    __obj.updateDynamic("setElementPosSize")(setElementPosSize)
    __obj.updateDynamic("setElementSize")(setElementSize)
    __obj.updateDynamic("setMergedMenuBar")(setMergedMenuBar)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.updateDynamic("showElement")(showElement)
    __obj.updateDynamic("unlock")(unlock)
    __obj.updateDynamic("unlockWindow")(unlockWindow)
    __obj.asInstanceOf[XLayoutManager2]
  }
}

