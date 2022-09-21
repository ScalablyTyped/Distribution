package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link XExtendedToolkit} is an extension of the {@link com.sun.star.awt.XToolkit} interface. It basically provides access to three event
  * broadcasters which are used for instance in the context of accessibility. It is, however, not restricted to accessibility.
  *
  * The first event broadcaster lets you keep track of the open top-level windows (frames). To get the set of currently open top-level window use the
  * {@link XExtendedToolkit.getTopWindowCount()} and {@link XExtendedToolkit.getTopWindow()} methods.
  *
  * The second event broadcaster informs its listeners of key events. Its listeners can, unlike with most other broadcasters/listeners, consume events, so
  * that other listeners will not be called for consumed events.
  *
  * The last event broadcaster sends events on focus changes of all elements that can have the input focus.
  * @deprecated DeprecatedThis interface was only implemented in an intermediate developer release anyway.
  * @since OOo 1.1.2
  */
trait XExtendedToolkit
  extends StObject
     with XInterface {
  
  /**
    * Return the currently active top-level window, i.e. which has currently the input focus.
    * @returns The returned reference may be empty when no top-level window is active.
    */
  val ActiveTopWindow: XTopWindow
  
  /**
    * This function returns the number of currently existing top-level windows.
    * @returns Returns the number of top-level windows. This includes all top-level windows, regardless of whether they are iconized, visible, or active.
    */
  val TopWindowCount: Double
  
  /**
    * Add a new listener that is called on {@link com.sun.star.awt.FocusEvent} . Use this focus broadcaster to keep track of the object that currently has
    * the input focus.
    * @param xListener If this is a valid reference it is inserted into the list of listeners. It is the task of the caller to not register the same listener
    */
  def addFocusListener(xListener: XFocusListener): Unit
  
  /**
    * Add a new listener that is called on {@link com.sun.star.awt.KeyEvent} . Every listener is given the opportunity to consume the event, i.e. prevent
    * the not yet called listeners from being called.
    * @param xHandler If this is a valid reference it is inserted into the list of handlers. It is the task of the caller to not register the same handler twi
    */
  def addKeyHandler(xHandler: XKeyHandler): Unit
  
  /**
    * Add a new listener that is called for events that involve {@link com.sun.star.awt.XTopWindow} . After having obtained the current list of existing
    * top-level windows you can keep this list up-to-date by listening to opened or closed top-level windows. Wait for activations or deactivations of
    * top-level windows to keep track of the currently active frame.
    * @param xListener If this is a valid reference it is inserted into the list of listeners. It is the task of the caller to not register the same listener
    */
  def addTopWindowListener(xListener: XTopWindowListener): Unit
  
  /**
    * Broadcasts the a focusGained on all registered focus listeners
    * @param source The object that has gained the input focus. It should implement {@link com.sun.star.accessibility.XAccessible} .
    */
  def fireFocusGained(source: XInterface): Unit
  
  /**
    * Broadcasts the a focusGained on all registered focus listeners
    * @param source The object that has lost the input focus. It should implement {@link com.sun.star.accessibility.XAccessible} .
    */
  def fireFocusLost(source: XInterface): Unit
  
  /**
    * Return the currently active top-level window, i.e. which has currently the input focus.
    * @returns The returned reference may be empty when no top-level window is active.
    */
  def getActiveTopWindow(): XTopWindow
  
  /**
    * Return a reference to the specified top-level window. Note that the number of top-level windows may change between a call to {@link
    * getTopWindowCount()} and successive calls to this function.
    * @param nIndex The index should be in the interval from 0 up to but not including the number of top-level windows as returned by {@link getTopWindowCount()} .
    * @returns The returned value is a valid reference to a top-level window.
    * @throws IndexOutOfBoundsException when the specified index is outside the valid range.
    */
  def getTopWindow(nIndex: Double): XTopWindow
  
  /**
    * This function returns the number of currently existing top-level windows.
    * @returns Returns the number of top-level windows. This includes all top-level windows, regardless of whether they are iconized, visible, or active.
    */
  def getTopWindowCount(): Double
  
  /**
    * Remove the specified listener from the list of listeners.
    * @param xListener If the reference is empty then nothing will be changed. If the listener has been registered twice (or more) then all references will be
    */
  def removeFocusListener(xListener: XFocusListener): Unit
  
  /**
    * Remove the specified listener from the list of listeners.
    * @param xHandler If the reference is empty then nothing will be changed. If the handler has been registered twice (or more) then all references will be r
    */
  def removeKeyHandler(xHandler: XKeyHandler): Unit
  
  /**
    * Remove the specified listener from the list of listeners.
    * @param xListener If the reference is empty then nothing will be changed. If the listener has been registered twice (or more) then all references will be
    */
  def removeTopWindowListener(xListener: XTopWindowListener): Unit
}
object XExtendedToolkit {
  
  inline def apply(
    ActiveTopWindow: XTopWindow,
    TopWindowCount: Double,
    acquire: () => Unit,
    addFocusListener: XFocusListener => Unit,
    addKeyHandler: XKeyHandler => Unit,
    addTopWindowListener: XTopWindowListener => Unit,
    fireFocusGained: XInterface => Unit,
    fireFocusLost: XInterface => Unit,
    getActiveTopWindow: () => XTopWindow,
    getTopWindow: Double => XTopWindow,
    getTopWindowCount: () => Double,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeFocusListener: XFocusListener => Unit,
    removeKeyHandler: XKeyHandler => Unit,
    removeTopWindowListener: XTopWindowListener => Unit
  ): XExtendedToolkit = {
    val __obj = js.Dynamic.literal(ActiveTopWindow = ActiveTopWindow.asInstanceOf[js.Any], TopWindowCount = TopWindowCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addTopWindowListener = js.Any.fromFunction1(addTopWindowListener), fireFocusGained = js.Any.fromFunction1(fireFocusGained), fireFocusLost = js.Any.fromFunction1(fireFocusLost), getActiveTopWindow = js.Any.fromFunction0(getActiveTopWindow), getTopWindow = js.Any.fromFunction1(getTopWindow), getTopWindowCount = js.Any.fromFunction0(getTopWindowCount), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeTopWindowListener = js.Any.fromFunction1(removeTopWindowListener))
    __obj.asInstanceOf[XExtendedToolkit]
  }
  
  extension [Self <: XExtendedToolkit](x: Self) {
    
    inline def setActiveTopWindow(value: XTopWindow): Self = StObject.set(x, "ActiveTopWindow", value.asInstanceOf[js.Any])
    
    inline def setAddFocusListener(value: XFocusListener => Unit): Self = StObject.set(x, "addFocusListener", js.Any.fromFunction1(value))
    
    inline def setAddKeyHandler(value: XKeyHandler => Unit): Self = StObject.set(x, "addKeyHandler", js.Any.fromFunction1(value))
    
    inline def setAddTopWindowListener(value: XTopWindowListener => Unit): Self = StObject.set(x, "addTopWindowListener", js.Any.fromFunction1(value))
    
    inline def setFireFocusGained(value: XInterface => Unit): Self = StObject.set(x, "fireFocusGained", js.Any.fromFunction1(value))
    
    inline def setFireFocusLost(value: XInterface => Unit): Self = StObject.set(x, "fireFocusLost", js.Any.fromFunction1(value))
    
    inline def setGetActiveTopWindow(value: () => XTopWindow): Self = StObject.set(x, "getActiveTopWindow", js.Any.fromFunction0(value))
    
    inline def setGetTopWindow(value: Double => XTopWindow): Self = StObject.set(x, "getTopWindow", js.Any.fromFunction1(value))
    
    inline def setGetTopWindowCount(value: () => Double): Self = StObject.set(x, "getTopWindowCount", js.Any.fromFunction0(value))
    
    inline def setRemoveFocusListener(value: XFocusListener => Unit): Self = StObject.set(x, "removeFocusListener", js.Any.fromFunction1(value))
    
    inline def setRemoveKeyHandler(value: XKeyHandler => Unit): Self = StObject.set(x, "removeKeyHandler", js.Any.fromFunction1(value))
    
    inline def setRemoveTopWindowListener(value: XTopWindowListener => Unit): Self = StObject.set(x, "removeTopWindowListener", js.Any.fromFunction1(value))
    
    inline def setTopWindowCount(value: Double): Self = StObject.set(x, "TopWindowCount", value.asInstanceOf[js.Any])
  }
}
