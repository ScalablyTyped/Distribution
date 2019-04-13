package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlueInstanceTerminationOption extends js.Object {
  /**
    * The action to take on instances in the original environment after a successful blue/green deployment.   TERMINATE: Instances are terminated after a specified wait time.   KEEP_ALIVE: Instances are left running after they are deregistered from the load balancer and removed from the deployment group.  
    */
  var action: js.UndefOr[InstanceAction] = js.undefined
  /**
    * The number of minutes to wait after a successful blue/green deployment before terminating instances from the original environment. The maximum setting is 2880 minutes (2 days).
    */
  var terminationWaitTimeInMinutes: js.UndefOr[Duration] = js.undefined
}

object BlueInstanceTerminationOption {
  @scala.inline
  def apply(action: InstanceAction = null, terminationWaitTimeInMinutes: js.UndefOr[Duration] = js.undefined): BlueInstanceTerminationOption = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(terminationWaitTimeInMinutes)) __obj.updateDynamic("terminationWaitTimeInMinutes")(terminationWaitTimeInMinutes)
    __obj.asInstanceOf[BlueInstanceTerminationOption]
  }
}

