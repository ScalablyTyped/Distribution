package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApiRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string = js.native
}

object GetApiRequest {
  @scala.inline
  def apply(ApiId: __string): GetApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetApiRequest]
  }
}

