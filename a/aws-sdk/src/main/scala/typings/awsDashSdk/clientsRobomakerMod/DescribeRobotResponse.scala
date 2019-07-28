package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRobotResponse extends js.Object {
  /**
    * The target architecture of the robot application.
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
    * The Greengrass group id.
    */
  var greengrassGroupId: js.UndefOr[Id] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the last deployment job.
    */
  var lastDeploymentJob: js.UndefOr[Arn] = js.undefined
  /**
    * The time of the last deployment job.
    */
  var lastDeploymentTime: js.UndefOr[CreatedAt] = js.undefined
  /**
    * The name of the robot.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The status of the fleet.
    */
  var status: js.UndefOr[RobotStatus] = js.undefined
  /**
    * The list of all tags added to the specified robot.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}

object DescribeRobotResponse {
  @scala.inline
  def apply(
    architecture: Architecture = null,
    arn: Arn = null,
    createdAt: CreatedAt = null,
    fleetArn: Arn = null,
    greengrassGroupId: Id = null,
    lastDeploymentJob: Arn = null,
    lastDeploymentTime: CreatedAt = null,
    name: Name = null,
    status: RobotStatus = null,
    tags: TagMap = null
  ): DescribeRobotResponse = {
    val __obj = js.Dynamic.literal()
    if (architecture != null) __obj.updateDynamic("architecture")(architecture.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (fleetArn != null) __obj.updateDynamic("fleetArn")(fleetArn)
    if (greengrassGroupId != null) __obj.updateDynamic("greengrassGroupId")(greengrassGroupId)
    if (lastDeploymentJob != null) __obj.updateDynamic("lastDeploymentJob")(lastDeploymentJob)
    if (lastDeploymentTime != null) __obj.updateDynamic("lastDeploymentTime")(lastDeploymentTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[DescribeRobotResponse]
  }
}

