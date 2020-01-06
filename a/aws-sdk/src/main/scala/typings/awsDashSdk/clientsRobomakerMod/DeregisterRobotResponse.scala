package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterRobotResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: js.UndefOr[Arn] = js.native
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var robot: js.UndefOr[Arn] = js.native
}

object DeregisterRobotResponse {
  @scala.inline
  def apply(fleet: Arn = null, robot: Arn = null): DeregisterRobotResponse = {
    val __obj = js.Dynamic.literal()
    if (fleet != null) __obj.updateDynamic("fleet")(fleet.asInstanceOf[js.Any])
    if (robot != null) __obj.updateDynamic("robot")(robot.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterRobotResponse]
  }
}

