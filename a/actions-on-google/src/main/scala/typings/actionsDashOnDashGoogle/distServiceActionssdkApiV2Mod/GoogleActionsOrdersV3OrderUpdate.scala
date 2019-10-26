package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3OrderUpdate extends js.Object {
  var order: js.UndefOr[GoogleActionsOrdersV3Order] = js.undefined
  /**
    * Reason for the change/update.
    */
  var reason: js.UndefOr[String] = js.undefined
  /**
    * Deprecated: Use OrderUpdate.update_mask instead.
    * If type = SNAPSHOT, OrderUpdate.order should be the entire order.
    * If type = ORDER_STATUS, this is the order level status change. Only
    * order.last_update_time and this vertical status are picked up.
    * Note: type.ORDER_STATUS only supports PurcahaseOrderExtension status
    * updates and there is no plan to extend this support. Instead, we recommend
    * using update_mask as it is more generic, extensible and can be used for all
    * verticals.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3OrderUpdateType] = js.undefined
  /**
    * Note: There are following consideration/recommendations for following
    * special fields:
    * 1. order.last_update_time will always be updated as part of the update
    * request.
    * 2. order.create_time, order.google_order_id and order.merchant_order_id
    * will be ignored if provided as part of the update_mask.
    */
  var updateMask: js.UndefOr[String] = js.undefined
  /**
    * If specified, displays a notification to the user with the specified
    * title and text. Specifying a notification is a suggestion to
    * notify and is not guaranteed to result in a notification.
    */
  var userNotification: js.UndefOr[GoogleActionsOrdersV3OrderUpdateUserNotification] = js.undefined
}

object GoogleActionsOrdersV3OrderUpdate {
  @scala.inline
  def apply(
    order: GoogleActionsOrdersV3Order = null,
    reason: String = null,
    `type`: GoogleActionsOrdersV3OrderUpdateType = null,
    updateMask: String = null,
    userNotification: GoogleActionsOrdersV3OrderUpdateUserNotification = null
  ): GoogleActionsOrdersV3OrderUpdate = {
    val __obj = js.Dynamic.literal()
    if (order != null) __obj.updateDynamic("order")(order)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask)
    if (userNotification != null) __obj.updateDynamic("userNotification")(userNotification)
    __obj.asInstanceOf[GoogleActionsOrdersV3OrderUpdate]
  }
}

