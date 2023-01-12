package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndpointRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  /**
    * The unique identifier for the endpoint.
    */
  var EndpointId: string
  
  var EndpointRequest: typings.awsSdk.clientsPinpointMod.EndpointRequest
}
object UpdateEndpointRequest {
  
  inline def apply(ApplicationId: string, EndpointId: string, EndpointRequest: EndpointRequest): UpdateEndpointRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any], EndpointRequest = EndpointRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setEndpointId(value: string): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
    
    inline def setEndpointRequest(value: EndpointRequest): Self = StObject.set(x, "EndpointRequest", value.asInstanceOf[js.Any])
  }
}
