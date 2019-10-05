package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentOverview extends js.Object {
  /**
    * The number of instances in the deployment in a failed state.
    */
  var Failed: js.UndefOr[InstanceCount] = js.undefined
  /**
    * The number of instances in which the deployment is in progress.
    */
  var InProgress: js.UndefOr[InstanceCount] = js.undefined
  /**
    * The number of instances in the deployment in a pending state.
    */
  var Pending: js.UndefOr[InstanceCount] = js.undefined
  /**
    * The number of instances in a replacement environment ready to receive traffic in a blue/green deployment.
    */
  var Ready: js.UndefOr[InstanceCount] = js.undefined
  /**
    * The number of instances in the deployment in a skipped state.
    */
  var Skipped: js.UndefOr[InstanceCount] = js.undefined
  /**
    * The number of instances in the deployment to which revisions have been successfully deployed.
    */
  var Succeeded: js.UndefOr[InstanceCount] = js.undefined
}

object DeploymentOverview {
  @scala.inline
  def apply(
    Failed: Int | Double = null,
    InProgress: Int | Double = null,
    Pending: Int | Double = null,
    Ready: Int | Double = null,
    Skipped: Int | Double = null,
    Succeeded: Int | Double = null
  ): DeploymentOverview = {
    val __obj = js.Dynamic.literal()
    if (Failed != null) __obj.updateDynamic("Failed")(Failed.asInstanceOf[js.Any])
    if (InProgress != null) __obj.updateDynamic("InProgress")(InProgress.asInstanceOf[js.Any])
    if (Pending != null) __obj.updateDynamic("Pending")(Pending.asInstanceOf[js.Any])
    if (Ready != null) __obj.updateDynamic("Ready")(Ready.asInstanceOf[js.Any])
    if (Skipped != null) __obj.updateDynamic("Skipped")(Skipped.asInstanceOf[js.Any])
    if (Succeeded != null) __obj.updateDynamic("Succeeded")(Succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentOverview]
  }
}

