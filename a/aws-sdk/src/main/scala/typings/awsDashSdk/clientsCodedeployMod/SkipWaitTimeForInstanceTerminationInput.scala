package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipWaitTimeForInstanceTerminationInput extends js.Object {
  /**
    *  The unique ID of a blue/green deployment for which you want to skip the instance termination wait time. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
}

object SkipWaitTimeForInstanceTerminationInput {
  @scala.inline
  def apply(deploymentId: DeploymentId = null): SkipWaitTimeForInstanceTerminationInput = {
    val __obj = js.Dynamic.literal()
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId)
    __obj.asInstanceOf[SkipWaitTimeForInstanceTerminationInput]
  }
}

