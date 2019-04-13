package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetModelRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The model ID.
    */
  var ModelId: __string
}

object GetModelRequest {
  @scala.inline
  def apply(ApiId: __string, ModelId: __string): GetModelRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, ModelId = ModelId)
  
    __obj.asInstanceOf[GetModelRequest]
  }
}

