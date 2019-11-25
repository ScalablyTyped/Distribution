package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersReceipt extends js.Object {
  /**
    * Confirmed order id when order has been received by the integrator. This is
    * the canonical order id used in integrator's system referencing the order
    * and may subsequently be used to identify the order as `action_order_id`.
    *
    * Note that this field is deprecated. Please pass the field through
    * OrderUpdate.action_order_id instead.
    */
  var confirmedActionOrderId: js.UndefOr[String] = js.undefined
  /**
    * Optional. The user facing id referencing to current order, which will show
    * up in the receipt card if present. This should be the id that usually
    * appears on a printed receipt or receipt sent to user's email. User should
    * be able to use this id referencing her order for customer service provided
    * by integrators. Note that this field must be populated if integrator does
    * generate user facing id for an order with a printed receipt / email
    * receipt.
    */
  var userVisibleOrderId: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2OrdersReceipt {
  @scala.inline
  def apply(confirmedActionOrderId: String = null, userVisibleOrderId: String = null): GoogleActionsV2OrdersReceipt = {
    val __obj = js.Dynamic.literal()
    if (confirmedActionOrderId != null) __obj.updateDynamic("confirmedActionOrderId")(confirmedActionOrderId.asInstanceOf[js.Any])
    if (userVisibleOrderId != null) __obj.updateDynamic("userVisibleOrderId")(userVisibleOrderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersReceipt]
  }
}

