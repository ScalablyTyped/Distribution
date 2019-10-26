package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension extends js.Object {
  /**
    * The event applied to all line item tickets.
    */
  var ticketEvent: js.UndefOr[GoogleActionsOrdersV3VerticalsTicketTicketEvent] = js.undefined
}

object GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension {
  @scala.inline
  def apply(ticketEvent: GoogleActionsOrdersV3VerticalsTicketTicketEvent = null): GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension = {
    val __obj = js.Dynamic.literal()
    if (ticketEvent != null) __obj.updateDynamic("ticketEvent")(ticketEvent)
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension]
  }
}

