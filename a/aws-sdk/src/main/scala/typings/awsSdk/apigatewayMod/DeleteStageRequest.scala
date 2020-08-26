package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteStageRequest extends js.Object {
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * [Required] The name of the Stage resource to delete.
    */
  var stageName: String = js.native
}

object DeleteStageRequest {
  @scala.inline
  def apply(restApiId: String, stageName: String): DeleteStageRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStageRequest]
  }
  @scala.inline
  implicit class DeleteStageRequestOps[Self <: DeleteStageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRestApiId(value: String): Self = this.set("restApiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStageName(value: String): Self = this.set("stageName", value.asInstanceOf[js.Any])
  }
  
}

