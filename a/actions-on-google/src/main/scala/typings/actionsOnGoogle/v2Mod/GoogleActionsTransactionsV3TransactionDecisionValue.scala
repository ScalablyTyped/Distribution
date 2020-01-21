package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.decisionMod.TransactionDecisionArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsTransactionsV3TransactionDecisionValue extends TransactionDecisionArgument {
  /**
    * If user requests for delivery address update, this field includes the
    * new delivery address. This field will be present only when
    * `transaction_decision` is `DELIVERY_ADDRESS_UPDATED`.
    */
  var deliveryAddress: js.UndefOr[GoogleActionsV2Location] = js.undefined
  /**
    * The order that user has approved. This field will be present only when
    * `transaction_decision` is `ORDER_ACCEPTED`.
    */
  var order: js.UndefOr[GoogleActionsOrdersV3Order] = js.undefined
  /**
    * Decision regarding the order.
    */
  var transactionDecision: js.UndefOr[GoogleActionsTransactionsV3TransactionDecisionValueTransactionDecision] = js.undefined
}

object GoogleActionsTransactionsV3TransactionDecisionValue {
  @scala.inline
  def apply(
    deliveryAddress: GoogleActionsV2Location = null,
    order: GoogleActionsOrdersV3Order = null,
    transactionDecision: GoogleActionsTransactionsV3TransactionDecisionValueTransactionDecision = null
  ): GoogleActionsTransactionsV3TransactionDecisionValue = {
    val __obj = js.Dynamic.literal()
    if (deliveryAddress != null) __obj.updateDynamic("deliveryAddress")(deliveryAddress.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (transactionDecision != null) __obj.updateDynamic("transactionDecision")(transactionDecision.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsTransactionsV3TransactionDecisionValue]
  }
}

