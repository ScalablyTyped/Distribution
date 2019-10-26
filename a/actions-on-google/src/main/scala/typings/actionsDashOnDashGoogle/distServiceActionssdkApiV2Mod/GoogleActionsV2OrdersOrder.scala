package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersOrder extends js.Object {
  /**
    * Required: Merchant assigned internal order id. This id must be unique, and
    * is required for subsequent order update operations. This id may be set to
    * the provided google_order_id, or any other unique value. Note that the id
    * presented to users is the user_visible_order_id, which may be a different,
    * more user-friendly value.
    */
  var actionOrderId: js.UndefOr[String] = js.undefined
  /**
    * If requested, customer info e.g. email will be passed back to the app.
    */
  var customerInfo: js.UndefOr[GoogleActionsV2OrdersCustomerInfo] = js.undefined
  /**
    * Reflect back the proposed order that caused the order.
    */
  var finalOrder: js.UndefOr[GoogleActionsV2OrdersProposedOrder] = js.undefined
  /**
    * Order id assigned by Google.
    */
  var googleOrderId: js.UndefOr[String] = js.undefined
  /**
    * Date and time the order was created.
    */
  var orderDate: js.UndefOr[String] = js.undefined
  /**
    * Payment related info for the order.
    */
  var paymentInfo: js.UndefOr[GoogleActionsV2OrdersPaymentInfo] = js.undefined
}

object GoogleActionsV2OrdersOrder {
  @scala.inline
  def apply(
    actionOrderId: String = null,
    customerInfo: GoogleActionsV2OrdersCustomerInfo = null,
    finalOrder: GoogleActionsV2OrdersProposedOrder = null,
    googleOrderId: String = null,
    orderDate: String = null,
    paymentInfo: GoogleActionsV2OrdersPaymentInfo = null
  ): GoogleActionsV2OrdersOrder = {
    val __obj = js.Dynamic.literal()
    if (actionOrderId != null) __obj.updateDynamic("actionOrderId")(actionOrderId)
    if (customerInfo != null) __obj.updateDynamic("customerInfo")(customerInfo)
    if (finalOrder != null) __obj.updateDynamic("finalOrder")(finalOrder)
    if (googleOrderId != null) __obj.updateDynamic("googleOrderId")(googleOrderId)
    if (orderDate != null) __obj.updateDynamic("orderDate")(orderDate)
    if (paymentInfo != null) __obj.updateDynamic("paymentInfo")(paymentInfo)
    __obj.asInstanceOf[GoogleActionsV2OrdersOrder]
  }
}

