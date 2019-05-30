package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemInstanceSummary extends js.Object {
  /**
    * The ARN of the system instance.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  /**
    * The date when the system instance was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ID of the Greengrass group where the system instance is deployed.
    */
  var greengrassGroupId: js.UndefOr[GreengrassGroupId] = js.undefined
  /**
    * The ID of the Greengrass group where the system instance is deployed.
    */
  var greengrassGroupName: js.UndefOr[GroupName] = js.undefined
  /**
    * The version of the Greengrass group where the system instance is deployed.
    */
  var greengrassGroupVersionId: js.UndefOr[GreengrassGroupVersionId] = js.undefined
  /**
    * The ID of the system instance.
    */
  var id: js.UndefOr[Urn] = js.undefined
  /**
    * The status of the system instance.
    */
  var status: js.UndefOr[SystemInstanceDeploymentStatus] = js.undefined
  /**
    * The target of the system instance.
    */
  var target: js.UndefOr[DeploymentTarget] = js.undefined
  /**
    *  The date and time when the system instance was last updated.
    */
  var updatedAt: js.UndefOr[Timestamp] = js.undefined
}

object SystemInstanceSummary {
  @scala.inline
  def apply(
    arn: Arn = null,
    createdAt: Timestamp = null,
    greengrassGroupId: GreengrassGroupId = null,
    greengrassGroupName: GroupName = null,
    greengrassGroupVersionId: GreengrassGroupVersionId = null,
    id: Urn = null,
    status: SystemInstanceDeploymentStatus = null,
    target: DeploymentTarget = null,
    updatedAt: Timestamp = null
  ): SystemInstanceSummary = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (greengrassGroupId != null) __obj.updateDynamic("greengrassGroupId")(greengrassGroupId)
    if (greengrassGroupName != null) __obj.updateDynamic("greengrassGroupName")(greengrassGroupName)
    if (greengrassGroupVersionId != null) __obj.updateDynamic("greengrassGroupVersionId")(greengrassGroupVersionId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt)
    __obj.asInstanceOf[SystemInstanceSummary]
  }
}

