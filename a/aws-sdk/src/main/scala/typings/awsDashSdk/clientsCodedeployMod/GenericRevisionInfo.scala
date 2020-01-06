package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericRevisionInfo extends js.Object {
  /**
    * The deployment groups for which this is the current target revision.
    */
  var deploymentGroups: js.UndefOr[DeploymentGroupsList] = js.native
  /**
    * A comment about the revision.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * When the revision was first used by AWS CodeDeploy.
    */
  var firstUsedTime: js.UndefOr[Timestamp] = js.native
  /**
    * When the revision was last used by AWS CodeDeploy.
    */
  var lastUsedTime: js.UndefOr[Timestamp] = js.native
  /**
    * When the revision was registered with AWS CodeDeploy.
    */
  var registerTime: js.UndefOr[Timestamp] = js.native
}

object GenericRevisionInfo {
  @scala.inline
  def apply(
    deploymentGroups: DeploymentGroupsList = null,
    description: Description = null,
    firstUsedTime: Timestamp = null,
    lastUsedTime: Timestamp = null,
    registerTime: Timestamp = null
  ): GenericRevisionInfo = {
    val __obj = js.Dynamic.literal()
    if (deploymentGroups != null) __obj.updateDynamic("deploymentGroups")(deploymentGroups.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (firstUsedTime != null) __obj.updateDynamic("firstUsedTime")(firstUsedTime.asInstanceOf[js.Any])
    if (lastUsedTime != null) __obj.updateDynamic("lastUsedTime")(lastUsedTime.asInstanceOf[js.Any])
    if (registerTime != null) __obj.updateDynamic("registerTime")(registerTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericRevisionInfo]
  }
}

