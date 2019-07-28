package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deployment extends js.Object {
  /**
    * The time, in milliseconds since the epoch, when the deployment was created.
    */
  var CreatedAt: js.UndefOr[__string] = js.undefined
  /**
    * The ARN of the deployment.
    */
  var DeploymentArn: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the deployment.
    */
  var DeploymentId: js.UndefOr[__string] = js.undefined
  /**
    * The type of the deployment.
    */
  var DeploymentType: js.UndefOr[typings.awsDashSdk.clientsGreengrassMod.DeploymentType] = js.undefined
  /**
    * The ARN of the group for this deployment.
    */
  var GroupArn: js.UndefOr[__string] = js.undefined
}

object Deployment {
  @scala.inline
  def apply(
    CreatedAt: __string = null,
    DeploymentArn: __string = null,
    DeploymentId: __string = null,
    DeploymentType: DeploymentType = null,
    GroupArn: __string = null
  ): Deployment = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (DeploymentArn != null) __obj.updateDynamic("DeploymentArn")(DeploymentArn)
    if (DeploymentId != null) __obj.updateDynamic("DeploymentId")(DeploymentId)
    if (DeploymentType != null) __obj.updateDynamic("DeploymentType")(DeploymentType.asInstanceOf[js.Any])
    if (GroupArn != null) __obj.updateDynamic("GroupArn")(GroupArn)
    __obj.asInstanceOf[Deployment]
  }
}

