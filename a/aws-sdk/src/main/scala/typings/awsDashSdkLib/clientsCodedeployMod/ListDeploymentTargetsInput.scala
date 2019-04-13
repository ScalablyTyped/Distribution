package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeploymentTargetsInput extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  /**
    *  A token identifier returned from the previous ListDeploymentTargets call. It can be used to return the next set of deployment targets in the list. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    *  A key used to filter the returned targets. 
    */
  var targetFilters: js.UndefOr[TargetFilters] = js.undefined
}

object ListDeploymentTargetsInput {
  @scala.inline
  def apply(
    deploymentId: DeploymentId = null,
    nextToken: NextToken = null,
    targetFilters: TargetFilters = null
  ): ListDeploymentTargetsInput = {
    val __obj = js.Dynamic.literal()
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (targetFilters != null) __obj.updateDynamic("targetFilters")(targetFilters)
    __obj.asInstanceOf[ListDeploymentTargetsInput]
  }
}

