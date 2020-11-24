package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var actionDisplayName: js.UndefOr[String] = js.native
}
object GoogleActionsTransactionsV3PresentationOptions {
  
  @scala.inline
  def apply(): GoogleActionsTransactionsV3PresentationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3PresentationOptions]
  }
  
  @scala.inline
  implicit class GoogleActionsTransactionsV3PresentationOptionsOps[Self <: GoogleActionsTransactionsV3PresentationOptions] (val x: Self) extends AnyVal {
    
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
    def setActionDisplayName(value: String): Self = this.set("actionDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionDisplayName: Self = this.set("actionDisplayName", js.undefined)
  }
}
