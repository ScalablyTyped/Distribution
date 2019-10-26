package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsTransactionsV3PresentationOptions extends js.Object {
  /**
    * action_display_name can be one of the following values:
    *
    * `PLACE_ORDER`: Used for placing an order.
    * `PAY`: Used for a payment.
    * `BUY`: Used for a purchase.
    * `SEND`: Used for a money transfer.
    * `BOOK`: Used for a booking.
    * `RESERVE`: Used for reservation.
    * `SCHEDULE`: Used for scheduling an appointment.
    * `SUBSCRIBE`: Used for subscription.
    *
    * action_display_name refers to the name of the action which best describes
    * this order. This will be used in various places like prompt, suggestion
    * chip etc while proposing the order to the user.
    */
  var actionDisplayName: js.UndefOr[String] = js.undefined
}

object GoogleActionsTransactionsV3PresentationOptions {
  @scala.inline
  def apply(actionDisplayName: String = null): GoogleActionsTransactionsV3PresentationOptions = {
    val __obj = js.Dynamic.literal()
    if (actionDisplayName != null) __obj.updateDynamic("actionDisplayName")(actionDisplayName)
    __obj.asInstanceOf[GoogleActionsTransactionsV3PresentationOptions]
  }
}

