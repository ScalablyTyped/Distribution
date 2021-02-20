package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.ui.DockingArea
import typings.activexLibreoffice.com_.sun.star.ui.XDockingAreaAcceptor
import typings.activexLibreoffice.com_.sun.star.ui.XUIElement
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * central interface to query for, create, destroy and manipulate user interface elements which are bound to a layout manager.
  *
  * Every user interface element which is controlled by a layout manager has a unique identifier called resource URL.
  *
  * A resource URL must meet the following syntax: "private:resource/$type/$name". It is only allowed to use ASCII characters for type and name.
  *
  * Currently the following user interface element types are defined: **menubar** A configurable user interface element representing a menu
  * bar.**popupmenu** A configurable user interface element representing a pop-up menu.**toolbar** A configurable user interface element a tool
  * bar.**statusbar** A configurable user interface element representing a status bar.**floater** A basic user interface element representing a floating
  * window.
  * @see com.sun.star.ui.UIElementTypes
  * @see com.sun.star.frame.XFrame
  * @since OOo 2.0
  */
@js.native
trait XLayoutManager extends XInterface {
  
  /**
    * provides the current docking area size of the layout manager.
    * @returns The {@link com.sun.star.awt.Rectangle} contains pixel values. The members of {@link com.sun.star.awt.Rectangle} are filled as following: X = dock
    */
  val CurrentDockingArea: Rectangle = js.native
  
  /**
    * retrieves the current docking area acceptor that controls the border space of the frame's container window.
    * @returns current docking area acceptor which controls the border space of frame's container window.  A docking area acceptor retrieved by this method is o
    */
  var DockingAreaAcceptor: XDockingAreaAcceptor = js.native
  
  /**
    * retrieves all user interface elements which are currently instantiated.
    * @returns a sequence of user interface elements providing {@link com.sun.star.ui.XUIElement} interface.  The layout manager instance is owner of the return
    */
  val Elements: SafeArray[XUIElement] = js.native
  
  /**
    * attaches a {@link com.sun.star.frame.XFrame} to a layout manager.
    * @param Frame specifies the frame that should be attached to the layout manager  A layout manager needs a {@link com.sun.star.frame.XFrame} to be able to
    */
  def attachFrame(Frame: XFrame): Unit = js.native
  
  /**
    * creates a new user interface element.
    * @param ResourceURL specifies which user interface element should be created. A resource URL must meet the following syntax: "private:resource/$type/$nam
    */
  def createElement(ResourceURL: String): Unit = js.native
  
  /**
    * destroys a user interface element.
    * @param ResourceURL specifies which user interface element should be destroyed. A resource URL must meet the following syntax: "private:resource/$type/$n
    */
  def destroyElement(ResourceURL: String): Unit = js.native
  
  /** forces a complete new layouting of all user interface elements. */
  def doLayout(): Unit = js.native
  
  /**
    * docks all windows which are member of the provided user interface element type.
    * @param nElementType specifies which user interface element type should be docked.
    * @returns returns `TRUE` if all user interface elements of the requested type could be docked, otherwise `FALSE` will be returned.
    * @see com.sun.star.ui.UIElementType
    */
  def dockAllWindows(nElementType: Double): Boolean = js.native
  
  /**
    * docks a window based user interface element to a specified docking area.
    * @param ResourceURL specifies which user interface element should be docked. A resource URL must meet the following syntax: "private:resource/$type/$name
    * @param DockingArea specifies on which docking area the window based user interface element should docked.
    * @param Pos specifies the position inside the docking area.
    * @returns returns `TRUE` if the user interface element has been docked, otherwise `FALSE` will be returned.
    * @see com.sun.star.ui.DockingArea
    */
  def dockWindow(ResourceURL: String, DockingArea: DockingArea, Pos: Point): Boolean = js.native
  
  /**
    * forces a window based user interface element to float.
    * @param ResourceURL specifies which user interface element should be float. A resource URL must meet the following syntax: "private:resource/$type/$name"
    * @returns returns `TRUE` if the user interface element has been docked, otherwise `FALSE` will be returned.
    */
  def floatWindow(ResourceURL: String): Boolean = js.native
  
  /**
    * provides the current docking area size of the layout manager.
    * @returns The {@link com.sun.star.awt.Rectangle} contains pixel values. The members of {@link com.sun.star.awt.Rectangle} are filled as following: X = dock
    */
  def getCurrentDockingArea(): Rectangle = js.native
  
  /**
    * retrieves the current docking area acceptor that controls the border space of the frame's container window.
    * @returns current docking area acceptor which controls the border space of frame's container window.  A docking area acceptor retrieved by this method is o
    */
  def getDockingAreaAcceptor(): XDockingAreaAcceptor = js.native
  
  /**
    * retrieves a user interface element which has been created before.
    * @param ResourceURL specifies which user interface element should be retrieved. A resource URL must meet the following syntax: "private:resource/$type/$n
    */
  def getElement(ResourceURL: String): XUIElement = js.native
  
  /**
    * retrieves the current pixel position of a window based user interface element.
    * @param ResourceURL specifies for which user interface element the current position should be retrieved. A resource URL must meet the following syntax: "
    * @returns the size in pixel of the user interface element. A non-window based user interface element provides a zero size.
    */
  def getElementPos(ResourceURL: String): Point = js.native
  
  /**
    * retrieves the current size of a window based user interface element.
    * @param ResourceURL specifies for which user interface element the current size should be retrieved. A resource URL must meet the following syntax: "priv
    * @returns the size in pixel of the user interface element. A non-window based user interface element provides a zero size.
    */
  def getElementSize(ResourceURL: String): Size = js.native
  
  /**
    * retrieves all user interface elements which are currently instantiated.
    * @returns a sequence of user interface elements providing {@link com.sun.star.ui.XUIElement} interface.  The layout manager instance is owner of the return
    */
  def getElements(): SafeArray[XUIElement] = js.native
  
  /**
    * hides a user interface element.
    * @param ResourceURL specifies which user interface element should be hidden. A resource URL must meet the following syntax: "private:resource/$type/$name
    * @returns returns `TRUE` if the user interface element has been hidden, otherwise `FALSE` will be returned.
    */
  def hideElement(ResourceURL: String): Boolean = js.native
  
  /**
    * retrieves the current docking state of a window based user interface element.
    * @param ResourceURL specifies for which user interface element the docking state should be retrieved. A resource URL must meet the following syntax: "pri
    * @returns `TRUE` if the user interface element is docked, otherwise `FALSE` .
    */
  def isElementDocked(ResourceURL: String): Boolean = js.native
  
  /**
    * retrieves the current floating state of a window based user interface element.
    * @param ResourceURL specifies for which user interface element the floating state should be retrieved. A resource URL must meet the following syntax: "pr
    * @returns `TRUE` if the user interface element is floating, otherwise `FALSE` .
    */
  def isElementFloating(ResourceURL: String): Boolean = js.native
  
  /**
    * retrieves the current lock state of a window based user interface element.
    * @param ResourceURL specifies for which user interface element the lock state should be retrieved. A resource URL must meet the following syntax: "privat
    * @returns `TRUE` if the user interface element is locked, otherwise `FALSE` .
    */
  def isElementLocked(ResourceURL: String): Boolean = js.native
  
  /**
    * retrieves the current visibility state of a window based user interface element.
    * @param ResourceURL specifies for which user interface element the visibility state should be retrieved. A resource URL must meet the following syntax: "
    * @returns `TRUE` if the user interface element is visible, otherwise `FALSE` .
    */
  def isElementVisible(ResourceURL: String): Boolean = js.native
  
  /**
    * retrieves the visibility state of a layout manager.
    *
    * A layout manager can be set to invisible state to force it to hide all of its user interface elements. If another component wants to use the window
    * for its own user interface elements it can use this function. This function is normally used to implement inplace editing.
    */
  def isVisible(): Boolean = js.native
  
  /**
    * prohibit all layout updates until unlock is called again.
    *
    * This call can be used to speed up the creation process of several user interface elements. Otherwise the layout manager would calculate the layout for
    * every creation.
    */
  def lock(): Unit = js.native
  
  /**
    * locks a window based user interface element if it's in a docked state.
    * @param ResourceURL specifies which user interface element should be locked. A resource URL must meet the following syntax: "private:resource/$type/$name
    * @returns returns `TRUE` if the user interface element has been locked, otherwise `FALSE` will be returned.
    */
  def lockWindow(ResourceURL: String): Boolean = js.native
  
  /**
    * request to make a user interface element visible if it is not in hidden state.
    * @param ResourceURL specifies which user interface element should be made visible. A resource URL must meet the following syntax: "private:resource/$type
    * @returns returns `TRUE` if the user interface element could be made visible, otherwise `FALSE` will be returned.  If a user interface element should force
    */
  def requestElement(ResourceURL: String): Boolean = js.native
  
  /**
    * resets the layout manager and remove all of its internal user interface elements.
    *
    * This call should be handled with care as all user interface elements will be destroyed and the layout manager is reseted to a state after a {@link
    * attachFrame()} has been made. That means an attached frame which has been set by {@link attachFrame()} is not released. The layout manager itself
    * calls reset after a component has been attached or reattached to a frame.
    */
  def reset(): Unit = js.native
  
  /**
    * sets a docking area acceptor that controls the border space of the frame's container window.
    * @param xDockingAreaAcceptor a docking area acceptor which controls the border space of frame's container window.  A docking area acceptor decides if the
    */
  def setDockingAreaAcceptor(xDockingAreaAcceptor: XDockingAreaAcceptor): Unit = js.native
  
  /**
    * sets a new position for a window based user interface element.
    * @param ResourceURL specifies which user interface element should be moved. A resource URL must meet the following syntax: "private:resource/$type/$name"
    * @param Pos specifies the new position in pixel.  It is up to the layout manager to decide if the user interface element can be moved. The new position c
    */
  def setElementPos(ResourceURL: String, Pos: Point): Unit = js.native
  
  /**
    * sets a new position and size for a window based user interface element.
    * @param ResourceURL specifies which user interface element should be moved and resized. A resource URL must meet the following syntax: "private:resource/
    * @param Pos specifies the new position in pixel.
    * @param Size specifies the new position in pixel.  It is up to the layout manager to decide if the user interface element can be moved and resized. The n
    */
  def setElementPosSize(ResourceURL: String, Pos: Point, Size: Size): Unit = js.native
  
  /**
    * sets a new size for a window based user interface element.
    * @param ResourceURL specifies which user interface element should be resized. A resource URL must meet the following syntax: "private:resource/$type/$nam
    * @param Size specifies the new size in pixel.  It is up to the layout manager to decide if the user interface element can be resized. The new size can be
    */
  def setElementSize(ResourceURL: String, Size: Size): Unit = js.native
  
  /**
    * sets the layout manager to invisible state and hides all user interface elements.
    *
    * A layout manager can be set to invisible state to force it to hide all of its user interface elements. If another component wants to use the window
    * for its own user interface elements it can use this function. This function is normally used to implement inplace editing.
    * @param Visible provide `FALSE` to make layout manager invisible otherwise this must be set to `TRUE` .
    */
  def setVisible(Visible: Boolean): Unit = js.native
  
  /**
    * shows a user interface element.
    * @param ResourceURL specifies which user interface element should be shown. A resource URL must meet the following syntax: "private:resource/$type/$name"
    * @returns returns `TRUE` if the user interface element has been shown, otherwise `FALSE` will be returned.
    */
  def showElement(ResourceURL: String): Boolean = js.native
  
  /**
    * permit layout updates again.
    *
    * This function should be called to permit layout updates. The layout manager starts to calculate the new layout after this call.
    */
  def unlock(): Unit = js.native
  
  /**
    * unlocks a window based user interface element if it's in a docked state.
    * @param ResourceURL specifies which user interface element should be unlocked. A resource URL must meet the following syntax: "private:resource/$type/$na
    * @returns returns `TRUE` if the user interface element has been unlocked, otherwise `FALSE` will be returned.
    */
  def unlockWindow(ResourceURL: String): Boolean = js.native
}
object XLayoutManager {
  
  @scala.inline
  def apply(
    CurrentDockingArea: Rectangle,
    DockingAreaAcceptor: XDockingAreaAcceptor,
    Elements: SafeArray[XUIElement],
    acquire: () => Unit,
    attachFrame: XFrame => Unit,
    createElement: String => Unit,
    destroyElement: String => Unit,
    doLayout: () => Unit,
    dockAllWindows: Double => Boolean,
    dockWindow: (String, DockingArea, Point) => Boolean,
    floatWindow: String => Boolean,
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
    queryInterface: `type` => js.Any,
    release: () => Unit,
    requestElement: String => Boolean,
    reset: () => Unit,
    setDockingAreaAcceptor: XDockingAreaAcceptor => Unit,
    setElementPos: (String, Point) => Unit,
    setElementPosSize: (String, Point, Size) => Unit,
    setElementSize: (String, Size) => Unit,
    setVisible: Boolean => Unit,
    showElement: String => Boolean,
    unlock: () => Unit,
    unlockWindow: String => Boolean
  ): XLayoutManager = {
    val __obj = js.Dynamic.literal(CurrentDockingArea = CurrentDockingArea.asInstanceOf[js.Any], DockingAreaAcceptor = DockingAreaAcceptor.asInstanceOf[js.Any], Elements = Elements.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), attachFrame = js.Any.fromFunction1(attachFrame), createElement = js.Any.fromFunction1(createElement), destroyElement = js.Any.fromFunction1(destroyElement), doLayout = js.Any.fromFunction0(doLayout), dockAllWindows = js.Any.fromFunction1(dockAllWindows), dockWindow = js.Any.fromFunction3(dockWindow), floatWindow = js.Any.fromFunction1(floatWindow), getCurrentDockingArea = js.Any.fromFunction0(getCurrentDockingArea), getDockingAreaAcceptor = js.Any.fromFunction0(getDockingAreaAcceptor), getElement = js.Any.fromFunction1(getElement), getElementPos = js.Any.fromFunction1(getElementPos), getElementSize = js.Any.fromFunction1(getElementSize), getElements = js.Any.fromFunction0(getElements), hideElement = js.Any.fromFunction1(hideElement), isElementDocked = js.Any.fromFunction1(isElementDocked), isElementFloating = js.Any.fromFunction1(isElementFloating), isElementLocked = js.Any.fromFunction1(isElementLocked), isElementVisible = js.Any.fromFunction1(isElementVisible), isVisible = js.Any.fromFunction0(isVisible), lock = js.Any.fromFunction0(lock), lockWindow = js.Any.fromFunction1(lockWindow), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), requestElement = js.Any.fromFunction1(requestElement), reset = js.Any.fromFunction0(reset), setDockingAreaAcceptor = js.Any.fromFunction1(setDockingAreaAcceptor), setElementPos = js.Any.fromFunction2(setElementPos), setElementPosSize = js.Any.fromFunction3(setElementPosSize), setElementSize = js.Any.fromFunction2(setElementSize), setVisible = js.Any.fromFunction1(setVisible), showElement = js.Any.fromFunction1(showElement), unlock = js.Any.fromFunction0(unlock), unlockWindow = js.Any.fromFunction1(unlockWindow))
    __obj.asInstanceOf[XLayoutManager]
  }
  
  @scala.inline
  implicit class XLayoutManagerMutableBuilder[Self <: XLayoutManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachFrame(value: XFrame => Unit): Self = StObject.set(x, "attachFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateElement(value: String => Unit): Self = StObject.set(x, "createElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentDockingArea(value: Rectangle): Self = StObject.set(x, "CurrentDockingArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyElement(value: String => Unit): Self = StObject.set(x, "destroyElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoLayout(value: () => Unit): Self = StObject.set(x, "doLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDockAllWindows(value: Double => Boolean): Self = StObject.set(x, "dockAllWindows", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDockWindow(value: (String, DockingArea, Point) => Boolean): Self = StObject.set(x, "dockWindow", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDockingAreaAcceptor(value: XDockingAreaAcceptor): Self = StObject.set(x, "DockingAreaAcceptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElements(value: SafeArray[XUIElement]): Self = StObject.set(x, "Elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatWindow(value: String => Boolean): Self = StObject.set(x, "floatWindow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurrentDockingArea(value: () => Rectangle): Self = StObject.set(x, "getCurrentDockingArea", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDockingAreaAcceptor(value: () => XDockingAreaAcceptor): Self = StObject.set(x, "getDockingAreaAcceptor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElement(value: String => XUIElement): Self = StObject.set(x, "getElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementPos(value: String => Point): Self = StObject.set(x, "getElementPos", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementSize(value: String => Size): Self = StObject.set(x, "getElementSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElements(value: () => SafeArray[XUIElement]): Self = StObject.set(x, "getElements", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideElement(value: String => Boolean): Self = StObject.set(x, "hideElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsElementDocked(value: String => Boolean): Self = StObject.set(x, "isElementDocked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsElementFloating(value: String => Boolean): Self = StObject.set(x, "isElementFloating", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsElementLocked(value: String => Boolean): Self = StObject.set(x, "isElementLocked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsElementVisible(value: String => Boolean): Self = StObject.set(x, "isElementVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLock(value: () => Unit): Self = StObject.set(x, "lock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLockWindow(value: String => Boolean): Self = StObject.set(x, "lockWindow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestElement(value: String => Boolean): Self = StObject.set(x, "requestElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDockingAreaAcceptor(value: XDockingAreaAcceptor => Unit): Self = StObject.set(x, "setDockingAreaAcceptor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetElementPos(value: (String, Point) => Unit): Self = StObject.set(x, "setElementPos", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetElementPosSize(value: (String, Point, Size) => Unit): Self = StObject.set(x, "setElementPosSize", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetElementSize(value: (String, Size) => Unit): Self = StObject.set(x, "setElementSize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowElement(value: String => Boolean): Self = StObject.set(x, "showElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnlock(value: () => Unit): Self = StObject.set(x, "unlock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnlockWindow(value: String => Boolean): Self = StObject.set(x, "unlockWindow", js.Any.fromFunction1(value))
  }
}
