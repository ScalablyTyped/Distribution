package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetDeploymentGroupsInput extends js.Object {
  /**
    * The name of an AWS CodeDeploy application associated with the applicable IAM user or AWS account.
    */
  var applicationName: ApplicationName = js.native
  /**
    * The names of the deployment groups.
    */
  var deploymentGroupNames: DeploymentGroupsList = js.native
}

object BatchGetDeploymentGroupsInput {
  @scala.inline
  def apply(applicationName: ApplicationName, deploymentGroupNames: DeploymentGroupsList): BatchGetDeploymentGroupsInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], deploymentGroupNames = deploymentGroupNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchGetDeploymentGroupsInput]
  }
}

