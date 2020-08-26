package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRouteRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * The route ID.
    */
  var RouteId: string = js.native
}

object DeleteRouteRequest {
  @scala.inline
  def apply(ApiId: string, RouteId: string): DeleteRouteRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], RouteId = RouteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRouteRequest]
  }
  @scala.inline
  implicit class DeleteRouteRequestOps[Self <: DeleteRouteRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiId(value: string): Self = this.set("ApiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouteId(value: string): Self = this.set("RouteId", value.asInstanceOf[js.Any])
  }
  
}

