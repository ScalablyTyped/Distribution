package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericRevisionInfo extends js.Object {
  /**
    * The deployment groups for which this is the current target revision.
    */
  var deploymentGroups: js.UndefOr[DeploymentGroupsList] = js.undefined
  /**
    * A comment about the revision.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * When the revision was first used by AWS CodeDeploy.
    */
  var firstUsedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * When the revision was last used by AWS CodeDeploy.
    */
  var lastUsedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * When the revision was registered with AWS CodeDeploy.
    */
  var registerTime: js.UndefOr[Timestamp] = js.undefined
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
    if (deploymentGroups != null) __obj.updateDynamic("deploymentGroups")(deploymentGroups)
    if (description != null) __obj.updateDynamic("description")(description)
    if (firstUsedTime != null) __obj.updateDynamic("firstUsedTime")(firstUsedTime)
    if (lastUsedTime != null) __obj.updateDynamic("lastUsedTime")(lastUsedTime)
    if (registerTime != null) __obj.updateDynamic("registerTime")(registerTime)
    __obj.asInstanceOf[GenericRevisionInfo]
  }
}

