package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRouteResponseRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
  
  /**
    * The route ID.
    */
  var RouteId: string
  
  /**
    * The route response ID.
    */
  var RouteResponseId: string
}
object GetRouteResponseRequest {
  
  inline def apply(ApiId: string, RouteId: string, RouteResponseId: string): GetRouteResponseRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], RouteId = RouteId.asInstanceOf[js.Any], RouteResponseId = RouteResponseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteResponseRequest]
  }
  
  extension [Self <: GetRouteResponseRequest](x: Self) {
    
    inline def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    inline def setRouteId(value: string): Self = StObject.set(x, "RouteId", value.asInstanceOf[js.Any])
    
    inline def setRouteResponseId(value: string): Self = StObject.set(x, "RouteResponseId", value.asInstanceOf[js.Any])
  }
}
