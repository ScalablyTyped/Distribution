package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsTransactionsV3TransactionDecisionValueSpec extends js.Object {
  /**
    * The order that's ready for user to approve.
    */
  var order: js.UndefOr[GoogleActionsOrdersV3Order] = js.undefined
  /**
    * Options associated with the order.
    */
  var orderOptions: js.UndefOr[GoogleActionsTransactionsV3OrderOptions] = js.undefined
  /**
    * Parameters for requesting payment for this order.
    */
  var paymentParameters: js.UndefOr[GoogleActionsTransactionsV3PaymentParameters] = js.undefined
  /**
    * Options used to customize order presentation to the user.
    */
  var presentationOptions: js.UndefOr[GoogleActionsTransactionsV3PresentationOptions] = js.undefined
}

object GoogleActionsTransactionsV3TransactionDecisionValueSpec {
  @scala.inline
  def apply(
    order: GoogleActionsOrdersV3Order = null,
    orderOptions: GoogleActionsTransactionsV3OrderOptions = null,
    paymentParameters: GoogleActionsTransactionsV3PaymentParameters = null,
    presentationOptions: GoogleActionsTransactionsV3PresentationOptions = null
  ): GoogleActionsTransactionsV3TransactionDecisionValueSpec = {
    val __obj = js.Dynamic.literal()
    if (order != null) __obj.updateDynamic("order")(order)
    if (orderOptions != null) __obj.updateDynamic("orderOptions")(orderOptions)
    if (paymentParameters != null) __obj.updateDynamic("paymentParameters")(paymentParameters)
    if (presentationOptions != null) __obj.updateDynamic("presentationOptions")(presentationOptions)
    __obj.asInstanceOf[GoogleActionsTransactionsV3TransactionDecisionValueSpec]
  }
}

