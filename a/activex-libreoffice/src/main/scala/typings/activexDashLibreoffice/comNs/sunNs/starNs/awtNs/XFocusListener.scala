package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive keyboard focus events.
  *
  * The window which has the keyboard focus is the window which gets the keyboard events.
  */
trait XFocusListener extends XEventListener {
  /**
    * is invoked when a window gains the keyboard focus.
    * @see XActivateListener.windowActivated
    */
  def focusGained(e: FocusEvent): Unit
  /**
    * is invoked when a window loses the keyboard focus.
    * @see XActivateListener.windowDeactivated
    */
  def focusLost(e: FocusEvent): Unit
}

object XFocusListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    focusGained: FocusEvent => Unit,
    focusLost: FocusEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFocusListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), focusGained = js.Any.fromFunction1(focusGained), focusLost = js.Any.fromFunction1(focusLost), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFocusListener]
  }
}

