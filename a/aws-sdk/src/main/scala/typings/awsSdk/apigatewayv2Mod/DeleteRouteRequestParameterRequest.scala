package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRouteRequestParameterRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
  
  /**
    * The route request parameter key.
    */
  var RequestParameterKey: string
  
  /**
    * The route ID.
    */
  var RouteId: string
}
object DeleteRouteRequestParameterRequest {
  
  inline def apply(ApiId: string, RequestParameterKey: string, RouteId: string): DeleteRouteRequestParameterRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], RequestParameterKey = RequestParameterKey.asInstanceOf[js.Any], RouteId = RouteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRouteRequestParameterRequest]
  }
  
  extension [Self <: DeleteRouteRequestParameterRequest](x: Self) {
    
    inline def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    inline def setRequestParameterKey(value: string): Self = StObject.set(x, "RequestParameterKey", value.asInstanceOf[js.Any])
    
    inline def setRouteId(value: string): Self = StObject.set(x, "RouteId", value.asInstanceOf[js.Any])
  }
}
