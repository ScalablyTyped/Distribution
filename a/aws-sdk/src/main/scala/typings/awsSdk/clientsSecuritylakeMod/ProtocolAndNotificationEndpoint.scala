package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtocolAndNotificationEndpoint extends StObject {
  
  /**
    * The account that is subscribed to receive exception notifications. 
    */
  var endpoint: js.UndefOr[SafeString] = js.undefined
  
  /**
    * The protocol to which notification messages are posted. 
    */
  var protocol: js.UndefOr[SafeString] = js.undefined
}
object ProtocolAndNotificationEndpoint {
  
  inline def apply(): ProtocolAndNotificationEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtocolAndNotificationEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtocolAndNotificationEndpoint] (val x: Self) extends AnyVal {
    
    inline def setEndpoint(value: SafeString): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setProtocol(value: SafeString): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
