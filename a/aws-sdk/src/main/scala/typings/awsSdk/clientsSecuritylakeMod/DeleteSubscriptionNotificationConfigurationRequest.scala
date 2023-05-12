package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSubscriptionNotificationConfigurationRequest extends StObject {
  
  /**
    * The ID of the Security Lake subscriber account.
    */
  var subscriptionId: UUID
}
object DeleteSubscriptionNotificationConfigurationRequest {
  
  inline def apply(subscriptionId: UUID): DeleteSubscriptionNotificationConfigurationRequest = {
    val __obj = js.Dynamic.literal(subscriptionId = subscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSubscriptionNotificationConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSubscriptionNotificationConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setSubscriptionId(value: UUID): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
  }
}
