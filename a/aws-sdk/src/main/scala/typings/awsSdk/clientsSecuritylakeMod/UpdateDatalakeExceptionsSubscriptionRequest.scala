package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatalakeExceptionsSubscriptionRequest extends StObject {
  
  /**
    * The account that is subscribed to receive exception notifications.
    */
  var notificationEndpoint: SafeString
  
  /**
    * The subscription protocol to which exception messages are posted. 
    */
  var subscriptionProtocol: SubscriptionProtocolType
}
object UpdateDatalakeExceptionsSubscriptionRequest {
  
  inline def apply(notificationEndpoint: SafeString, subscriptionProtocol: SubscriptionProtocolType): UpdateDatalakeExceptionsSubscriptionRequest = {
    val __obj = js.Dynamic.literal(notificationEndpoint = notificationEndpoint.asInstanceOf[js.Any], subscriptionProtocol = subscriptionProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatalakeExceptionsSubscriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDatalakeExceptionsSubscriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setNotificationEndpoint(value: SafeString): Self = StObject.set(x, "notificationEndpoint", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionProtocol(value: SubscriptionProtocolType): Self = StObject.set(x, "subscriptionProtocol", value.asInstanceOf[js.Any])
  }
}
