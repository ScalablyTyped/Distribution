package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeploymentTargetsInput extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    *  A token identifier returned from the previous ListDeploymentTargets call. It can be used to return the next set of deployment targets in the list. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    *  A key used to filter the returned targets. The two valid values are:    TargetStatus - A TargetStatus filter string can be Failed, InProgress, Pending, Ready, Skipped, Succeeded, or Unknown.     ServerInstanceLabel - A ServerInstanceLabel filter string can be Blue or Green.   
    */
  var targetFilters: js.UndefOr[TargetFilters] = js.native
}

object ListDeploymentTargetsInput {
  @scala.inline
  def apply(
    deploymentId: DeploymentId = null,
    nextToken: NextToken = null,
    targetFilters: TargetFilters = null
  ): ListDeploymentTargetsInput = {
    val __obj = js.Dynamic.literal()
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (targetFilters != null) __obj.updateDynamic("targetFilters")(targetFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeploymentTargetsInput]
  }
}

