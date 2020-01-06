package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRobotRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var robot: Arn = js.native
}

object DeleteRobotRequest {
  @scala.inline
  def apply(robot: Arn): DeleteRobotRequest = {
    val __obj = js.Dynamic.literal(robot = robot.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteRobotRequest]
  }
}

