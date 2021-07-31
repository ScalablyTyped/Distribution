package typings.awsSdk.chimeMod

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
  
  @scala.inline
  def apply(): GetMessagingSessionEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMessagingSessionEndpointResponse]
  }
  
  @scala.inline
  implicit class GetMessagingSessionEndpointResponseMutableBuilder[Self <: GetMessagingSessionEndpointResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: MessagingSessionEndpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
  }
}
