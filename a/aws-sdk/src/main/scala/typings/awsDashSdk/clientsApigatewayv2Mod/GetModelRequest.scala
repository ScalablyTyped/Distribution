package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetModelRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string = js.native
  /**
    * The model ID.
    */
  var ModelId: __string = js.native
}

object GetModelRequest {
  @scala.inline
  def apply(ApiId: __string, ModelId: __string): GetModelRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], ModelId = ModelId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetModelRequest]
  }
}

