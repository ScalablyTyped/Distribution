package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRouteRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string = js.native
  /**
    * The route ID.
    */
  var RouteId: __string = js.native
}

object GetRouteRequest {
  @scala.inline
  def apply(ApiId: __string, RouteId: __string): GetRouteRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], RouteId = RouteId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRouteRequest]
  }
}

