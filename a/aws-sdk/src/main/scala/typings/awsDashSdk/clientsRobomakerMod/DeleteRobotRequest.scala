package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRobotRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var robot: Arn
}

object DeleteRobotRequest {
  @scala.inline
  def apply(robot: Arn): DeleteRobotRequest = {
    val __obj = js.Dynamic.literal(robot = robot)
  
    __obj.asInstanceOf[DeleteRobotRequest]
  }
}

