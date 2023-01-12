package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRobotRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the robot to be described.
    */
  var robot: Arn
}
object DescribeRobotRequest {
  
  inline def apply(robot: Arn): DescribeRobotRequest = {
    val __obj = js.Dynamic.literal(robot = robot.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRobotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRobotRequest] (val x: Self) extends AnyVal {
    
    inline def setRobot(value: Arn): Self = StObject.set(x, "robot", value.asInstanceOf[js.Any])
  }
}
