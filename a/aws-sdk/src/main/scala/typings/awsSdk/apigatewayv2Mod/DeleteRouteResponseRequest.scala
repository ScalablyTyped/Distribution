package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRouteResponseRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  
  /**
    * The route ID.
    */
  var RouteId: string = js.native
  
  /**
    * The route response ID.
    */
  var RouteResponseId: string = js.native
}
object DeleteRouteResponseRequest {
  
  @scala.inline
  def apply(ApiId: string, RouteId: string, RouteResponseId: string): DeleteRouteResponseRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], RouteId = RouteId.asInstanceOf[js.Any], RouteResponseId = RouteResponseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRouteResponseRequest]
  }
  
  @scala.inline
  implicit class DeleteRouteResponseRequestMutableBuilder[Self <: DeleteRouteResponseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteId(value: string): Self = StObject.set(x, "RouteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteResponseId(value: string): Self = StObject.set(x, "RouteResponseId", value.asInstanceOf[js.Any])
  }
}
