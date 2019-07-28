package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDeploymentConfigInput extends js.Object {
  /**
    * The name of a deployment configuration associated with the IAM user or AWS account.
    */
  var deploymentConfigName: DeploymentConfigName
}

object DeleteDeploymentConfigInput {
  @scala.inline
  def apply(deploymentConfigName: DeploymentConfigName): DeleteDeploymentConfigInput = {
    val __obj = js.Dynamic.literal(deploymentConfigName = deploymentConfigName)
  
    __obj.asInstanceOf[DeleteDeploymentConfigInput]
  }
}

