package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.decisionMod.TransactionDecisionArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsTransactionsV3TransactionDecisionValue extends TransactionDecisionArgument {
  /**
    * If user requests for delivery address update, this field includes the
    * new delivery address. This field will be present only when
    * `transaction_decision` is `DELIVERY_ADDRESS_UPDATED`.
    */
  var deliveryAddress: js.UndefOr[GoogleActionsV2Location] = js.native
  /**
    * The order that user has approved. This field will be present only when
    * `transaction_decision` is `ORDER_ACCEPTED`.
    */
  var order: js.UndefOr[GoogleActionsOrdersV3Order] = js.native
  /**
    * Decision regarding the order.
    */
  var transactionDecision: js.UndefOr[GoogleActionsTransactionsV3TransactionDecisionValueTransactionDecision] = js.native
}

object GoogleActionsTransactionsV3TransactionDecisionValue {
  @scala.inline
  def apply(): GoogleActionsTransactionsV3TransactionDecisionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3TransactionDecisionValue]
  }
  @scala.inline
  implicit class GoogleActionsTransactionsV3TransactionDecisionValueOps[Self <: GoogleActionsTransactionsV3TransactionDecisionValue] (val x: Self) extends AnyVal {
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
    def setDeliveryAddress(value: GoogleActionsV2Location): Self = this.set("deliveryAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryAddress: Self = this.set("deliveryAddress", js.undefined)
    @scala.inline
    def setOrder(value: GoogleActionsOrdersV3Order): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setTransactionDecision(value: GoogleActionsTransactionsV3TransactionDecisionValueTransactionDecision): Self = this.set("transactionDecision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactionDecision: Self = this.set("transactionDecision", js.undefined)
  }
  
}

