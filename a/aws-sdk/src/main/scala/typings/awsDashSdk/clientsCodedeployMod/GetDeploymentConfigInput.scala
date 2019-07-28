package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeploymentConfigInput extends js.Object {
  /**
    * The name of a deployment configuration associated with the IAM user or AWS account.
    */
  var deploymentConfigName: DeploymentConfigName
}

object GetDeploymentConfigInput {
  @scala.inline
  def apply(deploymentConfigName: DeploymentConfigName): GetDeploymentConfigInput = {
    val __obj = js.Dynamic.literal(deploymentConfigName = deploymentConfigName)
  
    __obj.asInstanceOf[GetDeploymentConfigInput]
  }
}

