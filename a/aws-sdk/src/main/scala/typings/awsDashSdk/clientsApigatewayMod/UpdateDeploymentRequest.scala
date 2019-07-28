package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDeploymentRequest extends js.Object {
  /**
    * The replacement identifier for the Deployment resource to change information about.
    */
  var deploymentId: String
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object UpdateDeploymentRequest {
  @scala.inline
  def apply(deploymentId: String, restApiId: String, patchOperations: ListOfPatchOperation = null): UpdateDeploymentRequest = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId, restApiId = restApiId)
    if (patchOperations != null) __obj.updateDynamic("patchOperations")(patchOperations)
    __obj.asInstanceOf[UpdateDeploymentRequest]
  }
}

