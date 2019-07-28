package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The route ID.
    */
  var RouteId: __string
}

object GetRouteRequest {
  @scala.inline
  def apply(ApiId: __string, RouteId: __string): GetRouteRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, RouteId = RouteId)
  
    __obj.asInstanceOf[GetRouteRequest]
  }
}

