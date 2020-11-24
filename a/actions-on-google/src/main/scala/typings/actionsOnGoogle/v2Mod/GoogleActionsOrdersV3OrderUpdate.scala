package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3OrderUpdate extends js.Object {
  
  var order: js.UndefOr[GoogleActionsOrdersV3Order] = js.native
  
  /**
    * Reason for the change/update.
    */
  var reason: js.UndefOr[String] = js.native
  
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
  var `type`: js.UndefOr[GoogleActionsOrdersV3OrderUpdateType] = js.native
  
  /**
    * Note: There are following consideration/recommendations for following
    * special fields:
    * 1. order.last_update_time will always be updated as part of the update
    * request.
    * 2. order.create_time, order.google_order_id and order.merchant_order_id
    * will be ignored if provided as part of the update_mask.
    */
  var updateMask: js.UndefOr[String] = js.native
  
  /**
    * If specified, displays a notification to the user with the specified
    * title and text. Specifying a notification is a suggestion to
    * notify and is not guaranteed to result in a notification.
    */
  var userNotification: js.UndefOr[GoogleActionsOrdersV3OrderUpdateUserNotification] = js.native
}
object GoogleActionsOrdersV3OrderUpdate {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3OrderUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3OrderUpdate]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3OrderUpdateOps[Self <: GoogleActionsOrdersV3OrderUpdate] (val x: Self) extends AnyVal {
    
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
    def setOrder(value: GoogleActionsOrdersV3Order): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setType(value: GoogleActionsOrdersV3OrderUpdateType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
    
    @scala.inline
    def setUserNotification(value: GoogleActionsOrdersV3OrderUpdateUserNotification): Self = this.set("userNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserNotification: Self = this.set("userNotification", js.undefined)
  }
}
