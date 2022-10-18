package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNotificationConfigurationResponse extends StObject {
  
  /**
    * The current notification configuration for this profiling group.
    */
  var notificationConfiguration: NotificationConfiguration
}
object GetNotificationConfigurationResponse {
  
  inline def apply(notificationConfiguration: NotificationConfiguration): GetNotificationConfigurationResponse = {
    val __obj = js.Dynamic.literal(notificationConfiguration = notificationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNotificationConfigurationResponse]
  }
  
  extension [Self <: GetNotificationConfigurationResponse](x: Self) {
    
    inline def setNotificationConfiguration(value: NotificationConfiguration): Self = StObject.set(x, "notificationConfiguration", value.asInstanceOf[js.Any])
  }
}
