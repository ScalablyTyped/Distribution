package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentReadyOption extends js.Object {
  /**
    * Information about when to reroute traffic from an original environment to a replacement environment in a blue/green deployment.   CONTINUE_DEPLOYMENT: Register new instances with the load balancer immediately after the new application revision is installed on the instances in the replacement environment.   STOP_DEPLOYMENT: Do not register new instances with a load balancer unless traffic rerouting is started using ContinueDeployment. If traffic rerouting is not started before the end of the specified wait period, the deployment status is changed to Stopped.  
    */
  var actionOnTimeout: js.UndefOr[DeploymentReadyAction] = js.undefined
  /**
    * The number of minutes to wait before the status of a blue/green deployment is changed to Stopped if rerouting is not started manually. Applies only to the STOP_DEPLOYMENT option for actionOnTimeout
    */
  var waitTimeInMinutes: js.UndefOr[Duration] = js.undefined
}

object DeploymentReadyOption {
  @scala.inline
  def apply(
    actionOnTimeout: DeploymentReadyAction = null,
    waitTimeInMinutes: js.UndefOr[Duration] = js.undefined
  ): DeploymentReadyOption = {
    val __obj = js.Dynamic.literal()
    if (actionOnTimeout != null) __obj.updateDynamic("actionOnTimeout")(actionOnTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(waitTimeInMinutes)) __obj.updateDynamic("waitTimeInMinutes")(waitTimeInMinutes)
    __obj.asInstanceOf[DeploymentReadyOption]
  }
}

