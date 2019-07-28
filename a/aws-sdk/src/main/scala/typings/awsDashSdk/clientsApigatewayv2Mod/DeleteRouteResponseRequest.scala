package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRouteResponseRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The route ID.
    */
  var RouteId: __string
  /**
    * The route response ID.
    */
  var RouteResponseId: __string
}

object DeleteRouteResponseRequest {
  @scala.inline
  def apply(ApiId: __string, RouteId: __string, RouteResponseId: __string): DeleteRouteResponseRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, RouteId = RouteId, RouteResponseId = RouteResponseId)
  
    __obj.asInstanceOf[DeleteRouteResponseRequest]
  }
}

