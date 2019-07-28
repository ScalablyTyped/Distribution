package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploySystemInstanceResponse extends js.Object {
  /**
    * The ID of the Greengrass deployment used to deploy the system instance.
    */
  var greengrassDeploymentId: js.UndefOr[GreengrassDeploymentId] = js.undefined
  /**
    * An object that contains summary information about a system instance that was deployed. 
    */
  var summary: SystemInstanceSummary
}

object DeploySystemInstanceResponse {
  @scala.inline
  def apply(summary: SystemInstanceSummary, greengrassDeploymentId: GreengrassDeploymentId = null): DeploySystemInstanceResponse = {
    val __obj = js.Dynamic.literal(summary = summary)
    if (greengrassDeploymentId != null) __obj.updateDynamic("greengrassDeploymentId")(greengrassDeploymentId)
    __obj.asInstanceOf[DeploySystemInstanceResponse]
  }
}

