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
    Elements: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIElement],
    acquire: () => scala.Unit,
    addLayoutManagerEventListener: XLayoutManagerListener => scala.Unit,
    attachFrame: XFrame => scala.Unit,
    createElement: java.lang.String => scala.Unit,
    destroyElement: java.lang.String => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    doLayout: () => scala.Unit,
    dockAllWindows: scala.Double => scala.Boolean,
    dockWindow: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.DockingArea, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point) => scala.Boolean,
    elementInserted: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ConfigurationEvent => scala.Unit,
    elementRemoved: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ConfigurationEvent => scala.Unit,
    elementReplaced: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.ConfigurationEvent => scala.Unit,
    floatWindow: java.lang.String => scala.Boolean,
    frameAction: FrameActionEvent => scala.Unit,
    getCurrentDockingArea: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    getDockingAreaAcceptor: () => activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XDockingAreaAcceptor,
    getElement: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIElement,
    getElementPos: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    getElementSize: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    getElements: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XUIElement],
    hideElement: java.lang.String => scala.Boolean,
    isElementDocked: java.lang.String => scala.Boolean,
    isElementFloating: java.lang.String => scala.Boolean,
    isElementLocked: java.lang.String => scala.Boolean,
    isElementVisible: java.lang.String => scala.Boolean,
    isVisible: () => scala.Boolean,
    lock: () => scala.Unit,
    lockWindow: java.lang.String => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeLayoutManagerEventListener: XLayoutManagerListener => scala.Unit,
    removeMergedMenuBar: () => scala.Unit,
    requestElement: java.lang.String => scala.Boolean,
    reset: () => scala.Unit,
    setDockingAreaAcceptor: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XDockingAreaAcceptor => scala.Unit,
    setElementPos: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point) => scala.Unit,
    setElementPosSize: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size) => scala.Unit,
    setElementSize: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size) => scala.Unit,
    setMergedMenuBar: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess => scala.Boolean,
    setVisible: scala.Boolean => scala.Unit,
    showElement: java.lang.String => scala.Boolean,
    unlock: () => scala.Unit,
    unlockWindow: java.lang.String => scala.Boolean
  ): XLayoutManager2 = {
    val __obj = js.Dynamic.literal(CurrentDockingArea = CurrentDockingArea, DockingAreaAcceptor = DockingAreaAcceptor, Elements = Elements, acquire = js.Any.fromFunction0(acquire), addLayoutManagerEventListener = js.Any.fromFunction1(addLayoutManagerEventListener), attachFrame = js.Any.fromFunction1(attachFrame), createElement = js.Any.fromFunction1(createElement), destroyElement = js.Any.fromFunction1(destroyElement), disposing = js.Any.fromFunction1(disposing), doLayout = js.Any.fromFunction0(doLayout), dockAllWindows = js.Any.fromFunction1(dockAllWindows), dockWindow = js.Any.fromFunction3(dockWindow), elementInserted = js.Any.fromFunction1(elementInserted), elementRemoved = js.Any.fromFunction1(elementRemoved), elementReplaced = js.Any.fromFunction1(elementReplaced), floatWindow = js.Any.fromFunction1(floatWindow), frameAction = js.Any.fromFunction1(frameAction), getCurrentDockingArea = js.Any.fromFunction0(getCurrentDockingArea), getDockingAreaAcceptor = js.Any.fromFunction0(getDockingAreaAcceptor), getElement = js.Any.fromFunction1(getElement), getElementPos = js.Any.fromFunction1(getElementPos), getElementSize = js.Any.fromFunction1(getElementSize), getElements = js.Any.fromFunction0(getElements), hideElement = js.Any.fromFunction1(hideElement), isElementDocked = js.Any.fromFunction1(isElementDocked), isElementFloating = js.Any.fromFunction1(isElementFloating), isElementLocked = js.Any.fromFunction1(isElementLocked), isElementVisible = js.Any.fromFunction1(isElementVisible), isVisible = js.Any.fromFunction0(isVisible), lock = js.Any.fromFunction0(lock), lockWindow = js.Any.fromFunction1(lockWindow), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeLayoutManagerEventListener = js.Any.fromFunction1(removeLayoutManagerEventListener), removeMergedMenuBar = js.Any.fromFunction0(removeMergedMenuBar), requestElement = js.Any.fromFunction1(requestElement), reset = js.Any.fromFunction0(reset), setDockingAreaAcceptor = js.Any.fromFunction1(setDockingAreaAcceptor), setElementPos = js.Any.fromFunction2(setElementPos), setElementPosSize = js.Any.fromFunction3(setElementPosSize), setElementSize = js.Any.fromFunction2(setElementSize), setMergedMenuBar = js.Any.fromFunction1(setMergedMenuBar), setVisible = js.Any.fromFunction1(setVisible), showElement = js.Any.fromFunction1(showElement), unlock = js.Any.fromFunction0(unlock), unlockWindow = js.Any.fromFunction1(unlockWindow))
  
    __obj.asInstanceOf[XLayoutManager2]
  }
}

