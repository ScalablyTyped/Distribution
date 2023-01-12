package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserEndpointsResponse extends StObject {
  
  var EndpointsResponse: typings.awsSdk.clientsPinpointMod.EndpointsResponse
}
object DeleteUserEndpointsResponse {
  
  inline def apply(EndpointsResponse: EndpointsResponse): DeleteUserEndpointsResponse = {
    val __obj = js.Dynamic.literal(EndpointsResponse = EndpointsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserEndpointsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteUserEndpointsResponse] (val x: Self) extends AnyVal {
    
    inline def setEndpointsResponse(value: EndpointsResponse): Self = StObject.set(x, "EndpointsResponse", value.asInstanceOf[js.Any])
  }
}
