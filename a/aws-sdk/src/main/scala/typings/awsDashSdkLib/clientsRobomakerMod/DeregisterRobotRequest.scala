package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterRobotRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: Arn
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var robot: Arn
}

object DeregisterRobotRequest {
  @scala.inline
  def apply(fleet: Arn, robot: Arn): DeregisterRobotRequest = {
    val __obj = js.Dynamic.literal(fleet = fleet, robot = robot)
  
    __obj.asInstanceOf[DeregisterRobotRequest]
  }
}

