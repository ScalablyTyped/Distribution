package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fleet extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the fleet was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the last deployment job.
    */
  var lastDeploymentJob: js.UndefOr[Arn] = js.undefined
  /**
    * The status of the last fleet deployment.
    */
  var lastDeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined
  /**
    * The time of the last deployment.
    */
  var lastDeploymentTime: js.UndefOr[CreatedAt] = js.undefined
  /**
    * The name of the fleet.
    */
  var name: js.UndefOr[Name] = js.undefined
}

object Fleet {
  @scala.inline
  def apply(
    arn: Arn = null,
    createdAt: CreatedAt = null,
    lastDeploymentJob: Arn = null,
    lastDeploymentStatus: DeploymentStatus = null,
    lastDeploymentTime: CreatedAt = null,
    name: Name = null
  ): Fleet = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (lastDeploymentJob != null) __obj.updateDynamic("lastDeploymentJob")(lastDeploymentJob)
    if (lastDeploymentStatus != null) __obj.updateDynamic("lastDeploymentStatus")(lastDeploymentStatus.asInstanceOf[js.Any])
    if (lastDeploymentTime != null) __obj.updateDynamic("lastDeploymentTime")(lastDeploymentTime)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Fleet]
  }
}

