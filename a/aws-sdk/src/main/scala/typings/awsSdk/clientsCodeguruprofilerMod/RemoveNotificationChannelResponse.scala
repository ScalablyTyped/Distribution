package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveNotificationChannelResponse extends StObject {
  
  /**
    * The new notification configuration for this profiling group.
    */
  var notificationConfiguration: js.UndefOr[NotificationConfiguration] = js.undefined
}
object RemoveNotificationChannelResponse {
  
  inline def apply(): RemoveNotificationChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveNotificationChannelResponse]
  }
  
  extension [Self <: RemoveNotificationChannelResponse](x: Self) {
    
    inline def setNotificationConfiguration(value: NotificationConfiguration): Self = StObject.set(x, "notificationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigurationUndefined: Self = StObject.set(x, "notificationConfiguration", js.undefined)
  }
}
