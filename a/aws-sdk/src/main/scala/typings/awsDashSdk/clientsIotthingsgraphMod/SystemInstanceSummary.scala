package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemInstanceSummary extends js.Object {
  /**
    * The ARN of the system instance.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The date when the system instance was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  /**
    * The ID of the Greengrass group where the system instance is deployed.
    */
  var greengrassGroupId: js.UndefOr[GreengrassGroupId] = js.native
  /**
    * The ID of the Greengrass group where the system instance is deployed.
    */
  var greengrassGroupName: js.UndefOr[GroupName] = js.native
  /**
    * The version of the Greengrass group where the system instance is deployed.
    */
  var greengrassGroupVersionId: js.UndefOr[GreengrassGroupVersionId] = js.native
  /**
    * The ID of the system instance.
    */
  var id: js.UndefOr[Urn] = js.native
  /**
    * The status of the system instance.
    */
  var status: js.UndefOr[SystemInstanceDeploymentStatus] = js.native
  /**
    * The target of the system instance.
    */
  var target: js.UndefOr[DeploymentTarget] = js.native
  /**
    *  The date and time when the system instance was last updated.
    */
  var updatedAt: js.UndefOr[Timestamp] = js.native
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
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (greengrassGroupId != null) __obj.updateDynamic("greengrassGroupId")(greengrassGroupId.asInstanceOf[js.Any])
    if (greengrassGroupName != null) __obj.updateDynamic("greengrassGroupName")(greengrassGroupName.asInstanceOf[js.Any])
    if (greengrassGroupVersionId != null) __obj.updateDynamic("greengrassGroupVersionId")(greengrassGroupVersionId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInstanceSummary]
  }
}

