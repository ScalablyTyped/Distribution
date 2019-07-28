package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDeploymentGroupInput extends js.Object {
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
    */
  var applicationName: ApplicationName
  /**
    * The name of a deployment group for the specified application.
    */
  var deploymentGroupName: DeploymentGroupName
}

object DeleteDeploymentGroupInput {
  @scala.inline
  def apply(applicationName: ApplicationName, deploymentGroupName: DeploymentGroupName): DeleteDeploymentGroupInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName, deploymentGroupName = deploymentGroupName)
  
    __obj.asInstanceOf[DeleteDeploymentGroupInput]
  }
}

