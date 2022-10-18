package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEndpointResponse extends StObject {
  
  var EndpointResponse: typings.awsSdk.clientsPinpointMod.EndpointResponse
}
object DeleteEndpointResponse {
  
  inline def apply(EndpointResponse: EndpointResponse): DeleteEndpointResponse = {
    val __obj = js.Dynamic.literal(EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointResponse]
  }
  
  extension [Self <: DeleteEndpointResponse](x: Self) {
    
    inline def setEndpointResponse(value: EndpointResponse): Self = StObject.set(x, "EndpointResponse", value.asInstanceOf[js.Any])
  }
}
