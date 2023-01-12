package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMessagingSessionEndpointResponse extends StObject {
  
  /**
    * The endpoint returned in the response.
    */
  var Endpoint: js.UndefOr[MessagingSessionEndpoint] = js.undefined
}
object GetMessagingSessionEndpointResponse {
  
  inline def apply(): GetMessagingSessionEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMessagingSessionEndpointResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMessagingSessionEndpointResponse] (val x: Self) extends AnyVal {
    
    inline def setEndpoint(value: MessagingSessionEndpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
  }
}
