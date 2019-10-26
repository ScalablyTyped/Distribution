package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2TransactionDecisionValueSpec extends js.Object {
  /**
    * Options associated with the order.
    */
  var orderOptions: js.UndefOr[GoogleActionsV2OrdersOrderOptions] = js.undefined
  /**
    * Payment options for this order, or empty if no payment
    * is associated with the order.
    */
  var paymentOptions: js.UndefOr[GoogleActionsV2OrdersPaymentOptions] = js.undefined
  /**
    * Options used to customize order presentation to the user.
    */
  var presentationOptions: js.UndefOr[GoogleActionsV2OrdersPresentationOptions] = js.undefined
  /**
    * The proposed order that's ready for user to approve.
    */
  var proposedOrder: js.UndefOr[GoogleActionsV2OrdersProposedOrder] = js.undefined
}

object GoogleActionsV2TransactionDecisionValueSpec {
  @scala.inline
  def apply(
    orderOptions: GoogleActionsV2OrdersOrderOptions = null,
    paymentOptions: GoogleActionsV2OrdersPaymentOptions = null,
    presentationOptions: GoogleActionsV2OrdersPresentationOptions = null,
    proposedOrder: GoogleActionsV2OrdersProposedOrder = null
  ): GoogleActionsV2TransactionDecisionValueSpec = {
    val __obj = js.Dynamic.literal()
    if (orderOptions != null) __obj.updateDynamic("orderOptions")(orderOptions)
    if (paymentOptions != null) __obj.updateDynamic("paymentOptions")(paymentOptions)
    if (presentationOptions != null) __obj.updateDynamic("presentationOptions")(presentationOptions)
    if (proposedOrder != null) __obj.updateDynamic("proposedOrder")(proposedOrder)
    __obj.asInstanceOf[GoogleActionsV2TransactionDecisionValueSpec]
  }
}

