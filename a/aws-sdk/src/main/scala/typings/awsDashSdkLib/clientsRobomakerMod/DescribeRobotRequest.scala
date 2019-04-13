package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRobotRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the robot to be described.
    */
  var robot: Arn
}

object DescribeRobotRequest {
  @scala.inline
  def apply(robot: Arn): DescribeRobotRequest = {
    val __obj = js.Dynamic.literal(robot = robot)
  
    __obj.asInstanceOf[DescribeRobotRequest]
  }
}

