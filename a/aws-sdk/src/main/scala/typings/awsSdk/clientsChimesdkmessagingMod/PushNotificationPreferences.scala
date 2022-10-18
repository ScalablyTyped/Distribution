package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushNotificationPreferences extends StObject {
  
  /**
    * Enum value that indicates which push notifications to send to the requested member of a channel. ALL sends all push notifications, NONE sends no push notifications, FILTERED sends only filtered push notifications. 
    */
  var AllowNotifications: typings.awsSdk.clientsChimesdkmessagingMod.AllowNotifications
  
  /**
    * The simple JSON object used to send a subset of a push notification to the requested member.
    */
  var FilterRule: js.UndefOr[typings.awsSdk.clientsChimesdkmessagingMod.FilterRule] = js.undefined
}
object PushNotificationPreferences {
  
  inline def apply(AllowNotifications: AllowNotifications): PushNotificationPreferences = {
    val __obj = js.Dynamic.literal(AllowNotifications = AllowNotifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNotificationPreferences]
  }
  
  extension [Self <: PushNotificationPreferences](x: Self) {
    
    inline def setAllowNotifications(value: AllowNotifications): Self = StObject.set(x, "AllowNotifications", value.asInstanceOf[js.Any])
    
    inline def setFilterRule(value: FilterRule): Self = StObject.set(x, "FilterRule", value.asInstanceOf[js.Any])
    
    inline def setFilterRuleUndefined: Self = StObject.set(x, "FilterRule", js.undefined)
  }
}
