package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEndpointResponse extends StObject {
  
  var EndpointResponse: typings.awsSdk.clientsPinpointMod.EndpointResponse
}
object GetEndpointResponse {
  
  inline def apply(EndpointResponse: EndpointResponse): GetEndpointResponse = {
    val __obj = js.Dynamic.literal(EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEndpointResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEndpointResponse] (val x: Self) extends AnyVal {
    
    inline def setEndpointResponse(value: EndpointResponse): Self = StObject.set(x, "EndpointResponse", value.asInstanceOf[js.Any])
  }
}
