package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopDeploymentInput extends js.Object {
  /**
    *  Indicates, when a deployment is stopped, whether instances that have been updated should be rolled back to the previous version of the application revision. 
    */
  var autoRollbackEnabled: js.UndefOr[NullableBoolean] = js.undefined
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: DeploymentId
}

object StopDeploymentInput {
  @scala.inline
  def apply(deploymentId: DeploymentId, autoRollbackEnabled: js.UndefOr[NullableBoolean] = js.undefined): StopDeploymentInput = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId)
    if (!js.isUndefined(autoRollbackEnabled)) __obj.updateDynamic("autoRollbackEnabled")(autoRollbackEnabled)
    __obj.asInstanceOf[StopDeploymentInput]
  }
}

