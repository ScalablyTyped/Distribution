package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDeploymentRequest extends js.Object {
  /**
    * [Required] The identifier of the Deployment resource to delete.
    */
  var deploymentId: String = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}

object DeleteDeploymentRequest {
  @scala.inline
  def apply(deploymentId: String, restApiId: String): DeleteDeploymentRequest = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeploymentRequest]
  }
}

