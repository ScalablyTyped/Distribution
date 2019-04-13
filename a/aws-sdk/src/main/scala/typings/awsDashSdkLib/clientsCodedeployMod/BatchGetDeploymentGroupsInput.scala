package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetDeploymentGroupsInput extends js.Object {
  /**
    * The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
    */
  var applicationName: ApplicationName
  /**
    * The names of the deployment groups.
    */
  var deploymentGroupNames: DeploymentGroupsList
}

object BatchGetDeploymentGroupsInput {
  @scala.inline
  def apply(applicationName: ApplicationName, deploymentGroupNames: DeploymentGroupsList): BatchGetDeploymentGroupsInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName, deploymentGroupNames = deploymentGroupNames)
  
    __obj.asInstanceOf[BatchGetDeploymentGroupsInput]
  }
}

