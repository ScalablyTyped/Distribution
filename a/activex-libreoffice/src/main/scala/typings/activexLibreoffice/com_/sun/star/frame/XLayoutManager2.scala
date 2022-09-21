package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.ui.ConfigurationEvent
import typings.activexLibreoffice.com_.sun.star.ui.DockingArea
import typings.activexLibreoffice.com_.sun.star.ui.XDockingAreaAcceptor
import typings.activexLibreoffice.com_.sun.star.ui.XUIConfigurationListener
import typings.activexLibreoffice.com_.sun.star.ui.XUIElement
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Unified interface for {@link LayoutManager} service.
  * @since LibreOffice 4.2
  */
trait XLayoutManager2
  extends StObject
     with XLayoutManager
     with XFrameActionListener
     with XUIConfigurationListener
     with XMenuBarMergingAcceptor
     with XLayoutManagerEventBroadcaster
object XLayoutManager2 {
  
  inline def apply(
    CurrentDockingArea: Rectangle,
    DockingAreaAcceptor: XDockingAreaAcceptor,
    Elements: SafeArray[XUIElement],
    acquire: () => Unit,
    addLayoutManagerEventListener: XLayoutManagerListener => Unit,
    attachFrame: XFrame => Unit,
    createElement: String => Unit,
    destroyElement: String => Unit,
    disposing: EventObject => Unit,
    doLayout: () => Unit,
    dockAllWindows: Double => Boolean,
    dockWindow: (String, DockingArea, Point) => Boolean,
    elementInserted: ConfigurationEvent => Unit,
    elementRemoved: ConfigurationEvent => Unit,
    elementReplaced: ConfigurationEvent => Unit,
    floatWindow: String => Boolean,
    frameAction: FrameActionEvent => Unit,
    getCurrentDockingArea: () => Rectangle,
    getDockingAreaAcceptor: () => XDockingAreaAcceptor,
    getElement: String => XUIElement,
    getElementPos: String => Point,
    getElementSize: String => Size,
    getElements: () => SafeArray[XUIElement],
    hideElement: String => Boolean,
    isElementDocked: String => Boolean,
    isElementFloating: String => Boolean,
    isElementLocked: String => Boolean,
    isElementVisible: String => Boolean,
    isVisible: () => Boolean,
    lock: () => Unit,
    lockWindow: String => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeLayoutManagerEventListener: XLayoutManagerListener => Unit,
    removeMergedMenuBar: () => Unit,
    requestElement: String => Boolean,
    reset: () => Unit,
    setDockingAreaAcceptor: XDockingAreaAcceptor => Unit,
    setElementPos: (String, Point) => Unit,
    setElementPosSize: (String, Point, Size) => Unit,
    setElementSize: (String, Size) => Unit,
    setMergedMenuBar: XIndexAccess => Boolean,
    setVisible: Boolean => Unit,
    showElement: String => Boolean,
    unlock: () => Unit,
    unlockWindow: String => Boolean
  ): XLayoutManager2 = {
    val __obj = js.Dynamic.literal(CurrentDockingArea = CurrentDockingArea.asInstanceOf[js.Any], DockingAreaAcceptor = DockingAreaAcceptor.asInstanceOf[js.Any], Elements = Elements.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addLayoutManagerEventListener = js.Any.fromFunction1(addLayoutManagerEventListener), attachFrame = js.Any.fromFunction1(attachFrame), createElement = js.Any.fromFunction1(createElement), destroyElement = js.Any.fromFunction1(destroyElement), disposing = js.Any.fromFunction1(disposing), doLayout = js.Any.fromFunction0(doLayout), dockAllWindows = js.Any.fromFunction1(dockAllWindows), dockWindow = js.Any.fromFunction3(dockWindow), elementInserted = js.Any.fromFunction1(elementInserted), elementRemoved = js.Any.fromFunction1(elementRemoved), elementReplaced = js.Any.fromFunction1(elementReplaced), floatWindow = js.Any.fromFunction1(floatWindow), frameAction = js.Any.fromFunction1(frameAction), getCurrentDockingArea = js.Any.fromFunction0(getCurrentDockingArea), getDockingAreaAcceptor = js.Any.fromFunction0(getDockingAreaAcceptor), getElement = js.Any.fromFunction1(getElement), getElementPos = js.Any.fromFunction1(getElementPos), getElementSize = js.Any.fromFunction1(getElementSize), getElements = js.Any.fromFunction0(getElements), hideElement = js.Any.fromFunction1(hideElement), isElementDocked = js.Any.fromFunction1(isElementDocked), isElementFloating = js.Any.fromFunction1(isElementFloating), isElementLocked = js.Any.fromFunction1(isElementLocked), isElementVisible = js.Any.fromFunction1(isElementVisible), isVisible = js.Any.fromFunction0(isVisible), lock = js.Any.fromFunction0(lock), lockWindow = js.Any.fromFunction1(lockWindow), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeLayoutManagerEventListener = js.Any.fromFunction1(removeLayoutManagerEventListener), removeMergedMenuBar = js.Any.fromFunction0(removeMergedMenuBar), requestElement = js.Any.fromFunction1(requestElement), reset = js.Any.fromFunction0(reset), setDockingAreaAcceptor = js.Any.fromFunction1(setDockingAreaAcceptor), setElementPos = js.Any.fromFunction2(setElementPos), setElementPosSize = js.Any.fromFunction3(setElementPosSize), setElementSize = js.Any.fromFunction2(setElementSize), setMergedMenuBar = js.Any.fromFunction1(setMergedMenuBar), setVisible = js.Any.fromFunction1(setVisible), showElement = js.Any.fromFunction1(showElement), unlock = js.Any.fromFunction0(unlock), unlockWindow = js.Any.fromFunction1(unlockWindow))
    __obj.asInstanceOf[XLayoutManager2]
  }
}
