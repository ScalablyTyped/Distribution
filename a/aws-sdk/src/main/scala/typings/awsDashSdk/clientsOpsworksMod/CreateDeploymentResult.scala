package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentResult extends js.Object {
  /**
    * The deployment ID, which can be used with other requests to identify the deployment.
    */
  var DeploymentId: js.UndefOr[String] = js.native
}

object CreateDeploymentResult {
  @scala.inline
  def apply(DeploymentId: String = null): CreateDeploymentResult = {
    val __obj = js.Dynamic.literal()
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentResult]
  }
}

