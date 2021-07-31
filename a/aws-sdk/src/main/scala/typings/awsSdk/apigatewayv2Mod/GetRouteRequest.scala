package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRouteRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
  
  /**
    * The route ID.
    */
  var RouteId: string
}
object GetRouteRequest {
  
  @scala.inline
  def apply(ApiId: string, RouteId: string): GetRouteRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], RouteId = RouteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteRequest]
  }
  
  @scala.inline
  implicit class GetRouteRequestMutableBuilder[Self <: GetRouteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteId(value: string): Self = StObject.set(x, "RouteId", value.asInstanceOf[js.Any])
  }
}
