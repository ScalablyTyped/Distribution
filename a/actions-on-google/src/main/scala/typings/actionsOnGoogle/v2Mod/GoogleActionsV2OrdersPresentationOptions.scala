package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var callToAction: js.UndefOr[String] = js.native
}

object GoogleActionsV2OrdersPresentationOptions {
  @scala.inline
  def apply(): GoogleActionsV2OrdersPresentationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersPresentationOptions]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersPresentationOptionsOps[Self <: GoogleActionsV2OrdersPresentationOptions] (val x: Self) extends AnyVal {
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
    def setCallToAction(value: String): Self = this.set("callToAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallToAction: Self = this.set("callToAction", js.undefined)
  }
  
}

