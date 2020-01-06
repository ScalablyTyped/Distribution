package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApiRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string = js.native
}

object DeleteApiRequest {
  @scala.inline
  def apply(ApiId: __string): DeleteApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteApiRequest]
  }
}

