package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApiRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
}

object GetApiRequest {
  @scala.inline
  def apply(ApiId: string): GetApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApiRequest]
  }
}

