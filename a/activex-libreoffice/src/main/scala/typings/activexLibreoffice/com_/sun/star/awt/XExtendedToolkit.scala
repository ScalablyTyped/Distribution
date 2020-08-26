package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@js.native
trait XExtendedToolkit extends XInterface {
  /**
    * Return the currently active top-level window, i.e. which has currently the input focus.
    * @returns The returned reference may be empty when no top-level window is active.
    */
  val ActiveTopWindow: XTopWindow = js.native
  /**
    * This function returns the number of currently existing top-level windows.
    * @returns Returns the number of top-level windows. This includes all top-level windows, regardless of whether they are iconized, visible, or active.
    */
  val TopWindowCount: Double = js.native
  /**
    * Add a new listener that is called on {@link com.sun.star.awt.FocusEvent} . Use this focus broadcaster to keep track of the object that currently has
    * the input focus.
    * @param xListener If this is a valid reference it is inserted into the list of listeners. It is the task of the caller to not register the same listener
    */
  def addFocusListener(xListener: XFocusListener): Unit = js.native
  /**
    * Add a new listener that is called on {@link com.sun.star.awt.KeyEvent} . Every listener is given the opportunity to consume the event, i.e. prevent
    * the not yet called listeners from being called.
    * @param xHandler If this is a valid reference it is inserted into the list of handlers. It is the task of the caller to not register the same handler twi
    */
  def addKeyHandler(xHandler: XKeyHandler): Unit = js.native
  /**
    * Add a new listener that is called for events that involve {@link com.sun.star.awt.XTopWindow} . After having obtained the current list of existing
    * top-level windows you can keep this list up-to-date by listening to opened or closed top-level windows. Wait for activations or deactivations of
    * top-level windows to keep track of the currently active frame.
    * @param xListener If this is a valid reference it is inserted into the list of listeners. It is the task of the caller to not register the same listener
    */
  def addTopWindowListener(xListener: XTopWindowListener): Unit = js.native
  /**
    * Broadcasts the a focusGained on all registered focus listeners
    * @param source The object that has gained the input focus. It should implement {@link com.sun.star.accessibility.XAccessible} .
    */
  def fireFocusGained(source: XInterface): Unit = js.native
  /**
    * Broadcasts the a focusGained on all registered focus listeners
    * @param source The object that has lost the input focus. It should implement {@link com.sun.star.accessibility.XAccessible} .
    */
  def fireFocusLost(source: XInterface): Unit = js.native
  /**
    * Return the currently active top-level window, i.e. which has currently the input focus.
    * @returns The returned reference may be empty when no top-level window is active.
    */
  def getActiveTopWindow(): XTopWindow = js.native
  /**
    * Return a reference to the specified top-level window. Note that the number of top-level windows may change between a call to {@link
    * getTopWindowCount()} and successive calls to this function.
    * @param nIndex The index should be in the interval from 0 up to but not including the number of top-level windows as returned by {@link getTopWindowCount()} .
    * @returns The returned value is a valid reference to a top-level window.
    * @throws IndexOutOfBoundsException when the specified index is outside the valid range.
    */
  def getTopWindow(nIndex: Double): XTopWindow = js.native
  /**
    * This function returns the number of currently existing top-level windows.
    * @returns Returns the number of top-level windows. This includes all top-level windows, regardless of whether they are iconized, visible, or active.
    */
  def getTopWindowCount(): Double = js.native
  /**
    * Remove the specified listener from the list of listeners.
    * @param xListener If the reference is empty then nothing will be changed. If the listener has been registered twice (or more) then all references will be
    */
  def removeFocusListener(xListener: XFocusListener): Unit = js.native
  /**
    * Remove the specified listener from the list of listeners.
    * @param xHandler If the reference is empty then nothing will be changed. If the handler has been registered twice (or more) then all references will be r
    */
  def removeKeyHandler(xHandler: XKeyHandler): Unit = js.native
  /**
    * Remove the specified listener from the list of listeners.
    * @param xListener If the reference is empty then nothing will be changed. If the listener has been registered twice (or more) then all references will be
    */
  def removeTopWindowListener(xListener: XTopWindowListener): Unit = js.native
}

object XExtendedToolkit {
  @scala.inline
  def apply(
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
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeFocusListener: XFocusListener => Unit,
    removeKeyHandler: XKeyHandler => Unit,
    removeTopWindowListener: XTopWindowListener => Unit
  ): XExtendedToolkit = {
    val __obj = js.Dynamic.literal(ActiveTopWindow = ActiveTopWindow.asInstanceOf[js.Any], TopWindowCount = TopWindowCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addTopWindowListener = js.Any.fromFunction1(addTopWindowListener), fireFocusGained = js.Any.fromFunction1(fireFocusGained), fireFocusLost = js.Any.fromFunction1(fireFocusLost), getActiveTopWindow = js.Any.fromFunction0(getActiveTopWindow), getTopWindow = js.Any.fromFunction1(getTopWindow), getTopWindowCount = js.Any.fromFunction0(getTopWindowCount), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeTopWindowListener = js.Any.fromFunction1(removeTopWindowListener))
    __obj.asInstanceOf[XExtendedToolkit]
  }
  @scala.inline
  implicit class XExtendedToolkitOps[Self <: XExtendedToolkit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveTopWindow(value: XTopWindow): Self = this.set("ActiveTopWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopWindowCount(value: Double): Self = this.set("TopWindowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddFocusListener(value: XFocusListener => Unit): Self = this.set("addFocusListener", js.Any.fromFunction1(value))
    @scala.inline
    def setAddKeyHandler(value: XKeyHandler => Unit): Self = this.set("addKeyHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setAddTopWindowListener(value: XTopWindowListener => Unit): Self = this.set("addTopWindowListener", js.Any.fromFunction1(value))
    @scala.inline
    def setFireFocusGained(value: XInterface => Unit): Self = this.set("fireFocusGained", js.Any.fromFunction1(value))
    @scala.inline
    def setFireFocusLost(value: XInterface => Unit): Self = this.set("fireFocusLost", js.Any.fromFunction1(value))
    @scala.inline
    def setGetActiveTopWindow(value: () => XTopWindow): Self = this.set("getActiveTopWindow", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTopWindow(value: Double => XTopWindow): Self = this.set("getTopWindow", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTopWindowCount(value: () => Double): Self = this.set("getTopWindowCount", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveFocusListener(value: XFocusListener => Unit): Self = this.set("removeFocusListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveKeyHandler(value: XKeyHandler => Unit): Self = this.set("removeKeyHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveTopWindowListener(value: XTopWindowListener => Unit): Self = this.set("removeTopWindowListener", js.Any.fromFunction1(value))
  }
  
}

