package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserEndpointsResponse extends StObject {
  
  var EndpointsResponse: typings.awsSdk.clientsPinpointMod.EndpointsResponse
}
object GetUserEndpointsResponse {
  
  inline def apply(EndpointsResponse: EndpointsResponse): GetUserEndpointsResponse = {
    val __obj = js.Dynamic.literal(EndpointsResponse = EndpointsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserEndpointsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetUserEndpointsResponse] (val x: Self) extends AnyVal {
    
    inline def setEndpointsResponse(value: EndpointsResponse): Self = StObject.set(x, "EndpointsResponse", value.asInstanceOf[js.Any])
  }
}
