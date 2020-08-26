package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2TransactionRequirementsCheckSpec extends js.Object {
  /**
    * Options associated with the order.
    */
  var orderOptions: js.UndefOr[GoogleActionsV2OrdersOrderOptions] = js.native
  /**
    * Payment options for this Order, or empty if no payment
    * is associated with the Order.
    */
  var paymentOptions: js.UndefOr[GoogleActionsV2OrdersPaymentOptions] = js.native
}

object GoogleActionsV2TransactionRequirementsCheckSpec {
  @scala.inline
  def apply(): GoogleActionsV2TransactionRequirementsCheckSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2TransactionRequirementsCheckSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2TransactionRequirementsCheckSpecOps[Self <: GoogleActionsV2TransactionRequirementsCheckSpec] (val x: Self) extends AnyVal {
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
    def setOrderOptions(value: GoogleActionsV2OrdersOrderOptions): Self = this.set("orderOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderOptions: Self = this.set("orderOptions", js.undefined)
    @scala.inline
    def setPaymentOptions(value: GoogleActionsV2OrdersPaymentOptions): Self = this.set("paymentOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentOptions: Self = this.set("paymentOptions", js.undefined)
  }
  
}

