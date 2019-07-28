package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterRobotResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: js.UndefOr[Arn] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var robot: js.UndefOr[Arn] = js.undefined
}

object DeregisterRobotResponse {
  @scala.inline
  def apply(fleet: Arn = null, robot: Arn = null): DeregisterRobotResponse = {
    val __obj = js.Dynamic.literal()
    if (fleet != null) __obj.updateDynamic("fleet")(fleet)
    if (robot != null) __obj.updateDynamic("robot")(robot)
    __obj.asInstanceOf[DeregisterRobotResponse]
  }
}

