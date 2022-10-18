package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddNotificationChannelRequest extends StObject {
  
  /**
    *  A NotificationChannelConfig object that specifies what type of notification channel to add. The one supported notification channel is Amazon Simple Notification Service (Amazon SNS). 
    */
  var Config: NotificationChannelConfig
}
object AddNotificationChannelRequest {
  
  inline def apply(Config: NotificationChannelConfig): AddNotificationChannelRequest = {
    val __obj = js.Dynamic.literal(Config = Config.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddNotificationChannelRequest]
  }
  
  extension [Self <: AddNotificationChannelRequest](x: Self) {
    
    inline def setConfig(value: NotificationChannelConfig): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
  }
}
