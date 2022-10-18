package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RobotSoftwareSuite extends StObject {
  
  /**
    * The name of the robot software suite (ROS distribution).
    */
  var name: js.UndefOr[RobotSoftwareSuiteType] = js.undefined
  
  /**
    * The version of the robot software suite (ROS distribution).
    */
  var version: js.UndefOr[RobotSoftwareSuiteVersionType] = js.undefined
}
object RobotSoftwareSuite {
  
  inline def apply(): RobotSoftwareSuite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RobotSoftwareSuite]
  }
  
  extension [Self <: RobotSoftwareSuite](x: Self) {
    
    inline def setName(value: RobotSoftwareSuiteType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion(value: RobotSoftwareSuiteVersionType): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
