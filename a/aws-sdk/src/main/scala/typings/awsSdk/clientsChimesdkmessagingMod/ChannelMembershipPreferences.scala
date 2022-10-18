package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelMembershipPreferences extends StObject {
  
  /**
    * The push notification configuration of a message.
    */
  var PushNotifications: js.UndefOr[PushNotificationPreferences] = js.undefined
}
object ChannelMembershipPreferences {
  
  inline def apply(): ChannelMembershipPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMembershipPreferences]
  }
  
  extension [Self <: ChannelMembershipPreferences](x: Self) {
    
    inline def setPushNotifications(value: PushNotificationPreferences): Self = StObject.set(x, "PushNotifications", value.asInstanceOf[js.Any])
    
    inline def setPushNotificationsUndefined: Self = StObject.set(x, "PushNotifications", js.undefined)
  }
}
