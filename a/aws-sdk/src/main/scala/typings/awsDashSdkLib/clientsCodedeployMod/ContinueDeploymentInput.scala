package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinueDeploymentInput extends js.Object {
  /**
    *  The unique ID of a blue/green deployment for which you want to start rerouting traffic to the replacement environment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  /**
    *  The status of the deployment's waiting period. READY_WAIT indicates the deployment is ready to start shifting traffic. TERMINATION_WAIT indicates the traffic is shifted, but the original target is not terminated. 
    */
  var deploymentWaitType: js.UndefOr[DeploymentWaitType] = js.undefined
}

object ContinueDeploymentInput {
  @scala.inline
  def apply(deploymentId: DeploymentId = null, deploymentWaitType: DeploymentWaitType = null): ContinueDeploymentInput = {
    val __obj = js.Dynamic.literal()
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId)
    if (deploymentWaitType != null) __obj.updateDynamic("deploymentWaitType")(deploymentWaitType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueDeploymentInput]
  }
}

