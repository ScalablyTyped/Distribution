package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterRobotRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: Arn
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var robot: Arn
}

object RegisterRobotRequest {
  @scala.inline
  def apply(fleet: Arn, robot: Arn): RegisterRobotRequest = {
    val __obj = js.Dynamic.literal(fleet = fleet, robot = robot)
  
    __obj.asInstanceOf[RegisterRobotRequest]
  }
}

