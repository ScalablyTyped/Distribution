package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3OrderUpdate extends StObject {
  
  var order: js.UndefOr[GoogleActionsOrdersV3Order] = js.undefined
  
  /**
    * Reason for the change/update.
    */
  var reason: js.UndefOr[String] = js.undefined
  
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
  
  inline def apply(): GoogleActionsOrdersV3OrderUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3OrderUpdate]
  }
  
  extension [Self <: GoogleActionsOrdersV3OrderUpdate](x: Self) {
    
    inline def setOrder(value: GoogleActionsOrdersV3Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    inline def setUserNotification(value: GoogleActionsOrdersV3OrderUpdateUserNotification): Self = StObject.set(x, "userNotification", value.asInstanceOf[js.Any])
    
    inline def setUserNotificationUndefined: Self = StObject.set(x, "userNotification", js.undefined)
  }
}
