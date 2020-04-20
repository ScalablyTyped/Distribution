package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRouteRequestParameterRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * The route request parameter key.
    */
  var RequestParameterKey: string = js.native
  /**
    * The route ID.
    */
  var RouteId: string = js.native
}

object DeleteRouteRequestParameterRequest {
  @scala.inline
  def apply(ApiId: string, RequestParameterKey: string, RouteId: string): DeleteRouteRequestParameterRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], RequestParameterKey = RequestParameterKey.asInstanceOf[js.Any], RouteId = RouteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRouteRequestParameterRequest]
  }
}

