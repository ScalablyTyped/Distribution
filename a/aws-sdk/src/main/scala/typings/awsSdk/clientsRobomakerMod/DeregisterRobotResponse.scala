package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterRobotResponse extends StObject {
  
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
  
  inline def apply(): DeregisterRobotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterRobotResponse]
  }
  
  extension [Self <: DeregisterRobotResponse](x: Self) {
    
    inline def setFleet(value: Arn): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
    
    inline def setFleetUndefined: Self = StObject.set(x, "fleet", js.undefined)
    
    inline def setRobot(value: Arn): Self = StObject.set(x, "robot", value.asInstanceOf[js.Any])
    
    inline def setRobotUndefined: Self = StObject.set(x, "robot", js.undefined)
  }
}
