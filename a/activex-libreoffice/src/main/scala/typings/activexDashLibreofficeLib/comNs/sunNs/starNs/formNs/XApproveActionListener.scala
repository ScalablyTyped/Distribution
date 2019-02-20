package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * can be implemented to listen and probably veto actions to be performed on components.
  *
  * An example for an action would be the click of a CommandButton.
  * @see XApproveActionBroadcaster
  * @see com.sun.star.form.component.CommandButton
  * @see com.sun.star.form.control.CommandButton
  */
trait XApproveActionListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is invoked when an action is performed.
    * @param aEvent A descriptor specifying the source of the event.
    * @returns `TRUE` when the action is permitted, otherwise `FALSE` .
    */
  def approveAction(aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Boolean
}

