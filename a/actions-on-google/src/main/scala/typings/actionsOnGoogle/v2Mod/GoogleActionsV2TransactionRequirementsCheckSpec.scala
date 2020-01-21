package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2TransactionRequirementsCheckSpec extends js.Object {
  /**
    * Options associated with the order.
    */
  var orderOptions: js.UndefOr[GoogleActionsV2OrdersOrderOptions] = js.undefined
  /**
    * Payment options for this Order, or empty if no payment
    * is associated with the Order.
    */
  var paymentOptions: js.UndefOr[GoogleActionsV2OrdersPaymentOptions] = js.undefined
}

object GoogleActionsV2TransactionRequirementsCheckSpec {
  @scala.inline
  def apply(
    orderOptions: GoogleActionsV2OrdersOrderOptions = null,
    paymentOptions: GoogleActionsV2OrdersPaymentOptions = null
  ): GoogleActionsV2TransactionRequirementsCheckSpec = {
    val __obj = js.Dynamic.literal()
    if (orderOptions != null) __obj.updateDynamic("orderOptions")(orderOptions.asInstanceOf[js.Any])
    if (paymentOptions != null) __obj.updateDynamic("paymentOptions")(paymentOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2TransactionRequirementsCheckSpec]
  }
}

