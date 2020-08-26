package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * The deployment ID.
    */
  var DeploymentId: string = js.native
}

object GetDeploymentRequest {
  @scala.inline
  def apply(ApiId: string, DeploymentId: string): GetDeploymentRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], DeploymentId = DeploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentRequest]
  }
  @scala.inline
  implicit class GetDeploymentRequestOps[Self <: GetDeploymentRequest] (val x: Self) extends AnyVal {
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
    def setDeploymentId(value: string): Self = this.set("DeploymentId", value.asInstanceOf[js.Any])
  }
  
}

