package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive window events.
  * @see XActivateListener
  */
trait XTopWindowListener extends XEventListener {
  /** is invoked when a window is activated. */
  def windowActivated(e: EventObject): Unit
  /** is invoked when a window has been closed. */
  def windowClosed(e: EventObject): Unit
  /**
    * is invoked when a window is in the process of being closed.
    *
    * The close operation can be overridden at this point.
    */
  def windowClosing(e: EventObject): Unit
  /** is invoked when a window is deactivated. */
  def windowDeactivated(e: EventObject): Unit
  /** is invoked when a window is iconified. */
  def windowMinimized(e: EventObject): Unit
  /** is invoked when a window is deiconified. */
  def windowNormalized(e: EventObject): Unit
  /** is invoked when a window has been opened. */
  def windowOpened(e: EventObject): Unit
}

object XTopWindowListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    windowActivated: EventObject => Unit,
    windowClosed: EventObject => Unit,
    windowClosing: EventObject => Unit,
    windowDeactivated: EventObject => Unit,
    windowMinimized: EventObject => Unit,
    windowNormalized: EventObject => Unit,
    windowOpened: EventObject => Unit
  ): XTopWindowListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), windowActivated = js.Any.fromFunction1(windowActivated), windowClosed = js.Any.fromFunction1(windowClosed), windowClosing = js.Any.fromFunction1(windowClosing), windowDeactivated = js.Any.fromFunction1(windowDeactivated), windowMinimized = js.Any.fromFunction1(windowMinimized), windowNormalized = js.Any.fromFunction1(windowNormalized), windowOpened = js.Any.fromFunction1(windowOpened))
  
    __obj.asInstanceOf[XTopWindowListener]
  }
}

