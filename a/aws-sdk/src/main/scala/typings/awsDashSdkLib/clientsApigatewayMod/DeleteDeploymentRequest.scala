package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDeploymentRequest extends js.Object {
  /**
    * [Required] The identifier of the Deployment resource to delete.
    */
  var deploymentId: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object DeleteDeploymentRequest {
  @scala.inline
  def apply(deploymentId: String, restApiId: String): DeleteDeploymentRequest = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId, restApiId = restApiId)
  
    __obj.asInstanceOf[DeleteDeploymentRequest]
  }
}

