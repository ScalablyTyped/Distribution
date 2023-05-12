package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDatalakeExceptionsSubscriptionResponse extends StObject {
  
  /**
    * Retrieves the exception notification subscription information.
    */
  var protocolAndNotificationEndpoint: ProtocolAndNotificationEndpoint
}
object GetDatalakeExceptionsSubscriptionResponse {
  
  inline def apply(protocolAndNotificationEndpoint: ProtocolAndNotificationEndpoint): GetDatalakeExceptionsSubscriptionResponse = {
    val __obj = js.Dynamic.literal(protocolAndNotificationEndpoint = protocolAndNotificationEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDatalakeExceptionsSubscriptionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDatalakeExceptionsSubscriptionResponse] (val x: Self) extends AnyVal {
    
    inline def setProtocolAndNotificationEndpoint(value: ProtocolAndNotificationEndpoint): Self = StObject.set(x, "protocolAndNotificationEndpoint", value.asInstanceOf[js.Any])
  }
}
