package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteModelRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * The model ID.
    */
  var ModelId: string = js.native
}

object DeleteModelRequest {
  @scala.inline
  def apply(ApiId: string, ModelId: string): DeleteModelRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], ModelId = ModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelRequest]
  }
  @scala.inline
  implicit class DeleteModelRequestOps[Self <: DeleteModelRequest] (val x: Self) extends AnyVal {
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
    def setModelId(value: string): Self = this.set("ModelId", value.asInstanceOf[js.Any])
  }
  
}

