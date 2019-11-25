package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersLineItemUpdate extends js.Object {
  /**
    * Update to the line item extension. Type must match the item's
    * existing extension type.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  /**
    * New line item-level state.
    */
  var orderState: js.UndefOr[GoogleActionsV2OrdersOrderState] = js.undefined
  /**
    * New price for the line item.
    */
  var price: js.UndefOr[GoogleActionsV2OrdersPrice] = js.undefined
  /**
    * Reason for the change. Required for price changes.
    */
  var reason: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2OrdersLineItemUpdate {
  @scala.inline
  def apply(
    extension: ApiClientObjectMap[_] = null,
    orderState: GoogleActionsV2OrdersOrderState = null,
    price: GoogleActionsV2OrdersPrice = null,
    reason: String = null
  ): GoogleActionsV2OrdersLineItemUpdate = {
    val __obj = js.Dynamic.literal()
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (orderState != null) __obj.updateDynamic("orderState")(orderState.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersLineItemUpdate]
  }
}

