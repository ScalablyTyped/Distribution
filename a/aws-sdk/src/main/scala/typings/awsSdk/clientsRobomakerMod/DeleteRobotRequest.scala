package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRobotRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var robot: Arn
}
object DeleteRobotRequest {
  
  inline def apply(robot: Arn): DeleteRobotRequest = {
    val __obj = js.Dynamic.literal(robot = robot.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRobotRequest]
  }
  
  extension [Self <: DeleteRobotRequest](x: Self) {
    
    inline def setRobot(value: Arn): Self = StObject.set(x, "robot", value.asInstanceOf[js.Any])
  }
}
