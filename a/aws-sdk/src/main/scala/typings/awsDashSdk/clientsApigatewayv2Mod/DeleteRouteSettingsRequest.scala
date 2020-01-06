package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRouteSettingsRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string = js.native
  /**
    * The route key.
    */
  var RouteKey: __string = js.native
  /**
    * The stage name. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.
    */
  var StageName: __string = js.native
}

object DeleteRouteSettingsRequest {
  @scala.inline
  def apply(ApiId: __string, RouteKey: __string, StageName: __string): DeleteRouteSettingsRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], RouteKey = RouteKey.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteRouteSettingsRequest]
  }
}

