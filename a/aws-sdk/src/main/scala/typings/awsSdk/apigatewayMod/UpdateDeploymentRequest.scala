package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeploymentRequest extends js.Object {
  /**
    * The replacement identifier for the Deployment resource to change information about.
    */
  var deploymentId: String = js.native
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}

object UpdateDeploymentRequest {
  @scala.inline
  def apply(deploymentId: String, restApiId: String): UpdateDeploymentRequest = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeploymentRequest]
  }
  @scala.inline
  implicit class UpdateDeploymentRequestOps[Self <: UpdateDeploymentRequest] (val x: Self) extends AnyVal {
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
    def setDeploymentId(value: String): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestApiId(value: String): Self = this.set("restApiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatchOperationsVarargs(value: PatchOperation*): Self = this.set("patchOperations", js.Array(value :_*))
    @scala.inline
    def setPatchOperations(value: ListOfPatchOperation): Self = this.set("patchOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatchOperations: Self = this.set("patchOperations", js.undefined)
  }
  
}

