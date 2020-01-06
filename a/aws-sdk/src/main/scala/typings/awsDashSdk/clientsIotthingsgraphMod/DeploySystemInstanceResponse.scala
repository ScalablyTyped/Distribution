package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploySystemInstanceResponse extends js.Object {
  /**
    * The ID of the Greengrass deployment used to deploy the system instance.
    */
  var greengrassDeploymentId: js.UndefOr[GreengrassDeploymentId] = js.native
  /**
    * An object that contains summary information about a system instance that was deployed. 
    */
  var summary: SystemInstanceSummary = js.native
}

object DeploySystemInstanceResponse {
  @scala.inline
  def apply(summary: SystemInstanceSummary, greengrassDeploymentId: GreengrassDeploymentId = null): DeploySystemInstanceResponse = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    if (greengrassDeploymentId != null) __obj.updateDynamic("greengrassDeploymentId")(greengrassDeploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploySystemInstanceResponse]
  }
}

