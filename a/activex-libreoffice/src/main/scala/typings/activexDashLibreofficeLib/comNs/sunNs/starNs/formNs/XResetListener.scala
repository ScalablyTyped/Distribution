package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

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
trait XResetListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is invoked before a component is reset.
    * @param rEvent the event happened.
    * @returns `TRUE` when reset was approved, `FALSE` when the reset operation should be canceled.
    */
  def approveReset(rEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Boolean
  /**
    * is invoked when a component has been reset.
    * @param rEvent the event happened.
    */
  def resetted(rEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

object XResetListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    approveReset: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Boolean],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    resetted: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit]
  ): XResetListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, approveReset = approveReset, disposing = disposing, queryInterface = queryInterface, release = release, resetted = resetted)
  
    __obj.asInstanceOf[XResetListener]
  }
}

