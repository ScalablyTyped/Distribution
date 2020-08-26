package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2TransactionDecisionValueSpec extends js.Object {
  /**
    * Options associated with the order.
    */
  var orderOptions: js.UndefOr[GoogleActionsV2OrdersOrderOptions] = js.native
  /**
    * Payment options for this order, or empty if no payment
    * is associated with the order.
    */
  var paymentOptions: js.UndefOr[GoogleActionsV2OrdersPaymentOptions] = js.native
  /**
    * Options used to customize order presentation to the user.
    */
  var presentationOptions: js.UndefOr[GoogleActionsV2OrdersPresentationOptions] = js.native
  /**
    * The proposed order that's ready for user to approve.
    */
  var proposedOrder: js.UndefOr[GoogleActionsV2OrdersProposedOrder] = js.native
}

object GoogleActionsV2TransactionDecisionValueSpec {
  @scala.inline
  def apply(): GoogleActionsV2TransactionDecisionValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2TransactionDecisionValueSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2TransactionDecisionValueSpecOps[Self <: GoogleActionsV2TransactionDecisionValueSpec] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setPresentationOptions(value: GoogleActionsV2OrdersPresentationOptions): Self = this.set("presentationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresentationOptions: Self = this.set("presentationOptions", js.undefined)
    @scala.inline
    def setProposedOrder(value: GoogleActionsV2OrdersProposedOrder): Self = this.set("proposedOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProposedOrder: Self = this.set("proposedOrder", js.undefined)
  }
  
}

