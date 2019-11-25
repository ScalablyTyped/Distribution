package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersPresentationOptions extends js.Object {
  /**
    * call_to_action can be one of the following values:
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
    * call_to_action refers to the action verb which best describes this order.
    * This will be used in various places like prompt, suggestion chip etc while
    * proposing the order to the user.
    */
  var callToAction: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2OrdersPresentationOptions {
  @scala.inline
  def apply(callToAction: String = null): GoogleActionsV2OrdersPresentationOptions = {
    val __obj = js.Dynamic.literal()
    if (callToAction != null) __obj.updateDynamic("callToAction")(callToAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersPresentationOptions]
  }
}

