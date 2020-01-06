package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetDeploymentGroupsOutput extends js.Object {
  /**
    * Information about the deployment groups.
    */
  var deploymentGroupsInfo: js.UndefOr[DeploymentGroupInfoList] = js.native
  /**
    * Information about errors that might have occurred during the API call.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.native
}

object BatchGetDeploymentGroupsOutput {
  @scala.inline
  def apply(deploymentGroupsInfo: DeploymentGroupInfoList = null, errorMessage: ErrorMessage = null): BatchGetDeploymentGroupsOutput = {
    val __obj = js.Dynamic.literal()
    if (deploymentGroupsInfo != null) __obj.updateDynamic("deploymentGroupsInfo")(deploymentGroupsInfo.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDeploymentGroupsOutput]
  }
}

