package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersOrderUpdate extends js.Object {
  /**
    * Required. The canonical order id referencing this order.
    * If integrators don't generate the canonical order id in their system,
    * they can simply copy over google_order_id included in order.
    */
  var actionOrderId: js.UndefOr[String] = js.undefined
  /**
    * Information about cancellation state.
    */
  var cancellationInfo: js.UndefOr[GoogleActionsV2OrdersCancellationInfo] = js.undefined
  /**
    * Information about fulfillment state.
    */
  var fulfillmentInfo: js.UndefOr[GoogleActionsV2OrdersFulfillmentInfo] = js.undefined
  /**
    * Id of the order is the Google-issued id.
    */
  var googleOrderId: js.UndefOr[String] = js.undefined
  /**
    * Information about in transit state.
    */
  var inTransitInfo: js.UndefOr[GoogleActionsV2OrdersInTransitInfo] = js.undefined
  /**
    * Extra data based on a custom order state or in addition to info of a
    * standard state.
    */
  var infoExtension: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  /**
    * Map of line item-level changes, keyed by item id. Optional.
    */
  var lineItemUpdates: js.UndefOr[ApiClientObjectMap[GoogleActionsV2OrdersLineItemUpdate]] = js.undefined
  /**
    * Updated applicable management actions for the order, e.g. manage, modify,
    * contact support.
    */
  var orderManagementActions: js.UndefOr[js.Array[GoogleActionsV2OrdersOrderUpdateAction]] = js.undefined
  /**
    * The new state of the order.
    */
  var orderState: js.UndefOr[GoogleActionsV2OrdersOrderState] = js.undefined
  /**
    * Receipt for order.
    */
  var receipt: js.UndefOr[GoogleActionsV2OrdersReceipt] = js.undefined
  /**
    * Information about rejection state.
    */
  var rejectionInfo: js.UndefOr[GoogleActionsV2OrdersRejectionInfo] = js.undefined
  /**
    * Information about returned state.
    */
  var returnInfo: js.UndefOr[GoogleActionsV2OrdersReturnInfo] = js.undefined
  /**
    * New total price of the order
    */
  var totalPrice: js.UndefOr[GoogleActionsV2OrdersPrice] = js.undefined
  /**
    * When the order was updated from the app's perspective.
    */
  var updateTime: js.UndefOr[String] = js.undefined
  /**
    * If specified, displays a notification to the user with the specified
    * title and text. Specifying a notification is a suggestion to
    * notify and is not guaranteed to result in a notification.
    */
  var userNotification: js.UndefOr[GoogleActionsV2OrdersOrderUpdateUserNotification] = js.undefined
}

object GoogleActionsV2OrdersOrderUpdate {
  @scala.inline
  def apply(
    actionOrderId: String = null,
    cancellationInfo: GoogleActionsV2OrdersCancellationInfo = null,
    fulfillmentInfo: GoogleActionsV2OrdersFulfillmentInfo = null,
    googleOrderId: String = null,
    inTransitInfo: GoogleActionsV2OrdersInTransitInfo = null,
    infoExtension: ApiClientObjectMap[_] = null,
    lineItemUpdates: ApiClientObjectMap[GoogleActionsV2OrdersLineItemUpdate] = null,
    orderManagementActions: js.Array[GoogleActionsV2OrdersOrderUpdateAction] = null,
    orderState: GoogleActionsV2OrdersOrderState = null,
    receipt: GoogleActionsV2OrdersReceipt = null,
    rejectionInfo: GoogleActionsV2OrdersRejectionInfo = null,
    returnInfo: GoogleActionsV2OrdersReturnInfo = null,
    totalPrice: GoogleActionsV2OrdersPrice = null,
    updateTime: String = null,
    userNotification: GoogleActionsV2OrdersOrderUpdateUserNotification = null
  ): GoogleActionsV2OrdersOrderUpdate = {
    val __obj = js.Dynamic.literal()
    if (actionOrderId != null) __obj.updateDynamic("actionOrderId")(actionOrderId.asInstanceOf[js.Any])
    if (cancellationInfo != null) __obj.updateDynamic("cancellationInfo")(cancellationInfo.asInstanceOf[js.Any])
    if (fulfillmentInfo != null) __obj.updateDynamic("fulfillmentInfo")(fulfillmentInfo.asInstanceOf[js.Any])
    if (googleOrderId != null) __obj.updateDynamic("googleOrderId")(googleOrderId.asInstanceOf[js.Any])
    if (inTransitInfo != null) __obj.updateDynamic("inTransitInfo")(inTransitInfo.asInstanceOf[js.Any])
    if (infoExtension != null) __obj.updateDynamic("infoExtension")(infoExtension.asInstanceOf[js.Any])
    if (lineItemUpdates != null) __obj.updateDynamic("lineItemUpdates")(lineItemUpdates.asInstanceOf[js.Any])
    if (orderManagementActions != null) __obj.updateDynamic("orderManagementActions")(orderManagementActions.asInstanceOf[js.Any])
    if (orderState != null) __obj.updateDynamic("orderState")(orderState.asInstanceOf[js.Any])
    if (receipt != null) __obj.updateDynamic("receipt")(receipt.asInstanceOf[js.Any])
    if (rejectionInfo != null) __obj.updateDynamic("rejectionInfo")(rejectionInfo.asInstanceOf[js.Any])
    if (returnInfo != null) __obj.updateDynamic("returnInfo")(returnInfo.asInstanceOf[js.Any])
    if (totalPrice != null) __obj.updateDynamic("totalPrice")(totalPrice.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (userNotification != null) __obj.updateDynamic("userNotification")(userNotification.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderUpdate]
  }
}

