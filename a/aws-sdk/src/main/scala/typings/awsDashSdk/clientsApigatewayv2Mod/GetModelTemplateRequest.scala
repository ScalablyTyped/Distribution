package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetModelTemplateRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The model ID.
    */
  var ModelId: __string
}

object GetModelTemplateRequest {
  @scala.inline
  def apply(ApiId: __string, ModelId: __string): GetModelTemplateRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, ModelId = ModelId)
  
    __obj.asInstanceOf[GetModelTemplateRequest]
  }
}

