package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCorsConfigurationRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string = js.native
}

object DeleteCorsConfigurationRequest {
  @scala.inline
  def apply(ApiId: __string): DeleteCorsConfigurationRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteCorsConfigurationRequest]
  }
}

