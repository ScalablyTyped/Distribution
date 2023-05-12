package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatalakeExceptionsSubscriptionRequest extends StObject {
  
  /**
    * The Amazon Web Services account where you want to receive exception notifications.
    */
  var notificationEndpoint: SafeString
  
  /**
    * The subscription protocol to which exception notifications are posted. 
    */
  var subscriptionProtocol: SubscriptionProtocolType
}
object CreateDatalakeExceptionsSubscriptionRequest {
  
  inline def apply(notificationEndpoint: SafeString, subscriptionProtocol: SubscriptionProtocolType): CreateDatalakeExceptionsSubscriptionRequest = {
    val __obj = js.Dynamic.literal(notificationEndpoint = notificationEndpoint.asInstanceOf[js.Any], subscriptionProtocol = subscriptionProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatalakeExceptionsSubscriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDatalakeExceptionsSubscriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setNotificationEndpoint(value: SafeString): Self = StObject.set(x, "notificationEndpoint", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionProtocol(value: SubscriptionProtocolType): Self = StObject.set(x, "subscriptionProtocol", value.asInstanceOf[js.Any])
  }
}
