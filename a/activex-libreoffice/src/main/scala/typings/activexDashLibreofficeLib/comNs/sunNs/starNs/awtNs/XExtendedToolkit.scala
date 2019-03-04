package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

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
trait XExtendedToolkit
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Return the currently active top-level window, i.e. which has currently the input focus.
    * @returns The returned reference may be empty when no top-level window is active.
    */
  val ActiveTopWindow: XTopWindow
  /**
    * This function returns the number of currently existing top-level windows.
    * @returns Returns the number of top-level windows. This includes all top-level windows, regardless of whether they are iconized, visible, or active.
    */
  val TopWindowCount: scala.Double
  /**
    * Add a new listener that is called on {@link com.sun.star.awt.FocusEvent} . Use this focus broadcaster to keep track of the object that currently has
    * the input focus.
    * @param xListener If this is a valid reference it is inserted into the list of listeners. It is the task of the caller to not register the same listener
    */
  def addFocusListener(xListener: XFocusListener): scala.Unit
  /**
    * Add a new listener that is called on {@link com.sun.star.awt.KeyEvent} . Every listener is given the opportunity to consume the event, i.e. prevent
    * the not yet called listeners from being called.
    * @param xHandler If this is a valid reference it is inserted into the list of handlers. It is the task of the caller to not register the same handler twi
    */
  def addKeyHandler(xHandler: XKeyHandler): scala.Unit
  /**
    * Add a new listener that is called for events that involve {@link com.sun.star.awt.XTopWindow} . After having obtained the current list of existing
    * top-level windows you can keep this list up-to-date by listening to opened or closed top-level windows. Wait for activations or deactivations of
    * top-level windows to keep track of the currently active frame.
    * @param xListener If this is a valid reference it is inserted into the list of listeners. It is the task of the caller to not register the same listener
    */
  def addTopWindowListener(xListener: XTopWindowListener): scala.Unit
  /**
    * Broadcasts the a focusGained on all registered focus listeners
    * @param source The object that has gained the input focus. It should implement {@link com.sun.star.accessibility.XAccessible} .
    */
  def fireFocusGained(source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): scala.Unit
  /**
    * Broadcasts the a focusGained on all registered focus listeners
    * @param source The object that has lost the input focus. It should implement {@link com.sun.star.accessibility.XAccessible} .
    */
  def fireFocusLost(source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): scala.Unit
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
  def getTopWindow(nIndex: scala.Double): XTopWindow
  /**
    * This function returns the number of currently existing top-level windows.
    * @returns Returns the number of top-level windows. This includes all top-level windows, regardless of whether they are iconized, visible, or active.
    */
  def getTopWindowCount(): scala.Double
  /**
    * Remove the specified listener from the list of listeners.
    * @param xListener If the reference is empty then nothing will be changed. If the listener has been registered twice (or more) then all references will be
    */
  def removeFocusListener(xListener: XFocusListener): scala.Unit
  /**
    * Remove the specified listener from the list of listeners.
    * @param xHandler If the reference is empty then nothing will be changed. If the handler has been registered twice (or more) then all references will be r
    */
  def removeKeyHandler(xHandler: XKeyHandler): scala.Unit
  /**
    * Remove the specified listener from the list of listeners.
    * @param xListener If the reference is empty then nothing will be changed. If the listener has been registered twice (or more) then all references will be
    */
  def removeTopWindowListener(xListener: XTopWindowListener): scala.Unit
}

object XExtendedToolkit {
  @scala.inline
  def apply(
    ActiveTopWindow: XTopWindow,
    TopWindowCount: scala.Double,
    acquire: js.Function0[scala.Unit],
    addFocusListener: js.Function1[XFocusListener, scala.Unit],
    addKeyHandler: js.Function1[XKeyHandler, scala.Unit],
    addTopWindowListener: js.Function1[XTopWindowListener, scala.Unit],
    fireFocusGained: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    fireFocusLost: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    getActiveTopWindow: js.Function0[XTopWindow],
    getTopWindow: js.Function1[scala.Double, XTopWindow],
    getTopWindowCount: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeFocusListener: js.Function1[XFocusListener, scala.Unit],
    removeKeyHandler: js.Function1[XKeyHandler, scala.Unit],
    removeTopWindowListener: js.Function1[XTopWindowListener, scala.Unit]
  ): XExtendedToolkit = {
    val __obj = js.Dynamic.literal(ActiveTopWindow = ActiveTopWindow, TopWindowCount = TopWindowCount, acquire = acquire, addFocusListener = addFocusListener, addKeyHandler = addKeyHandler, addTopWindowListener = addTopWindowListener, fireFocusGained = fireFocusGained, fireFocusLost = fireFocusLost, getActiveTopWindow = getActiveTopWindow, getTopWindow = getTopWindow, getTopWindowCount = getTopWindowCount, queryInterface = queryInterface, release = release, removeFocusListener = removeFocusListener, removeKeyHandler = removeKeyHandler, removeTopWindowListener = removeTopWindowListener)
  
    __obj.asInstanceOf[XExtendedToolkit]
  }
}

