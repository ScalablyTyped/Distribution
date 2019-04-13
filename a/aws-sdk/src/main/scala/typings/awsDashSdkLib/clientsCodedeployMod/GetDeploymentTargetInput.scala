package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeploymentTargetInput extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  /**
    *  The unique ID of a deployment target. 
    */
  var targetId: js.UndefOr[TargetId] = js.undefined
}

object GetDeploymentTargetInput {
  @scala.inline
  def apply(deploymentId: DeploymentId = null, targetId: TargetId = null): GetDeploymentTargetInput = {
    val __obj = js.Dynamic.literal()
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId)
    if (targetId != null) __obj.updateDynamic("targetId")(targetId)
    __obj.asInstanceOf[GetDeploymentTargetInput]
  }
}

