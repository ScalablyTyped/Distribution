package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VaultNotificationConfig extends StObject {
  
  /**
    * A list of one or more events for which Amazon S3 Glacier will send a notification to the specified Amazon SNS topic.
    */
  var Events: js.UndefOr[NotificationEventList] = js.undefined
  
  /**
    * The Amazon Simple Notification Service (Amazon SNS) topic Amazon Resource Name (ARN).
    */
  var SNSTopic: js.UndefOr[String] = js.undefined
}
object VaultNotificationConfig {
  
  inline def apply(): VaultNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VaultNotificationConfig]
  }
  
  extension [Self <: VaultNotificationConfig](x: Self) {
    
    inline def setEvents(value: NotificationEventList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: String*): Self = StObject.set(x, "Events", js.Array(value*))
    
    inline def setSNSTopic(value: String): Self = StObject.set(x, "SNSTopic", value.asInstanceOf[js.Any])
    
    inline def setSNSTopicUndefined: Self = StObject.set(x, "SNSTopic", js.undefined)
  }
}
