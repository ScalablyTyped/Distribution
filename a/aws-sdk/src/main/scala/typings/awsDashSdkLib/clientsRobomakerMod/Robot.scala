package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Robot extends js.Object {
  /**
    * The architecture of the robot.
    */
  var architecture: js.UndefOr[Architecture] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the robot was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleetArn: js.UndefOr[Arn] = js.undefined
  /**
    * The Greengrass group associated with the robot.
    */
  var greenGrassGroupId: js.UndefOr[Id] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the last deployment job.
    */
  var lastDeploymentJob: js.UndefOr[Arn] = js.undefined
  /**
    * The time of the last deployment.
    */
  var lastDeploymentTime: js.UndefOr[CreatedAt] = js.undefined
  /**
    * The name of the robot.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The status of the robot.
    */
  var status: js.UndefOr[RobotStatus] = js.undefined
}

object Robot {
  @scala.inline
  def apply(
    architecture: Architecture = null,
    arn: Arn = null,
    createdAt: CreatedAt = null,
    fleetArn: Arn = null,
    greenGrassGroupId: Id = null,
    lastDeploymentJob: Arn = null,
    lastDeploymentTime: CreatedAt = null,
    name: Name = null,
    status: RobotStatus = null
  ): Robot = {
    val __obj = js.Dynamic.literal()
    if (architecture != null) __obj.updateDynamic("architecture")(architecture.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (fleetArn != null) __obj.updateDynamic("fleetArn")(fleetArn)
    if (greenGrassGroupId != null) __obj.updateDynamic("greenGrassGroupId")(greenGrassGroupId)
    if (lastDeploymentJob != null) __obj.updateDynamic("lastDeploymentJob")(lastDeploymentJob)
    if (lastDeploymentTime != null) __obj.updateDynamic("lastDeploymentTime")(lastDeploymentTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Robot]
  }
}

