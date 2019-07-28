package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the interface for receiving notifications about reset events.
  *
  * The listener is called if a component implementing the {@link XReset} interface performs a reset. ;  Order of events: a reset is triggered on a
  * componentthe component calls XReset::approveReset() on all its listenersif all listeners approve the reset operation, the data is resetthe component
  * calls XReset::resetted() on all its listeners
  * @see XReset
  */
trait XResetListener extends XEventListener {
  /**
    * is invoked before a component is reset.
    * @param rEvent the event happened.
    * @returns `TRUE` when reset was approved, `FALSE` when the reset operation should be canceled.
    */
  def approveReset(rEvent: EventObject): Boolean
  /**
    * is invoked when a component has been reset.
    * @param rEvent the event happened.
    */
  def resetted(rEvent: EventObject): Unit
}

object XResetListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveReset: EventObject => Boolean,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    resetted: EventObject => Unit
  ): XResetListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveReset = js.Any.fromFunction1(approveReset), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resetted = js.Any.fromFunction1(resetted))
  
    __obj.asInstanceOf[XResetListener]
  }
}

