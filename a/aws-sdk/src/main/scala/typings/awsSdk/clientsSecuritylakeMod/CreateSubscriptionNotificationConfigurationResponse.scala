package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSubscriptionNotificationConfigurationResponse extends StObject {
  
  /**
    * Returns the Amazon Resource Name (ARN) of the queue.
    */
  var queueArn: js.UndefOr[SafeString] = js.undefined
}
object CreateSubscriptionNotificationConfigurationResponse {
  
  inline def apply(): CreateSubscriptionNotificationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSubscriptionNotificationConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSubscriptionNotificationConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setQueueArn(value: SafeString): Self = StObject.set(x, "queueArn", value.asInstanceOf[js.Any])
    
    inline def setQueueArnUndefined: Self = StObject.set(x, "queueArn", js.undefined)
  }
}
