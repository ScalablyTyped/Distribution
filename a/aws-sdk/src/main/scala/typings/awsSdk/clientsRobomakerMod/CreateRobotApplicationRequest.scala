package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRobotApplicationRequest extends StObject {
  
  /**
    * The object that contains that URI of the Docker image that you use for your robot application.
    */
  var environment: js.UndefOr[Environment] = js.undefined
  
  /**
    * The name of the robot application.
    */
  var name: Name
  
  /**
    * The robot software suite (ROS distribuition) used by the robot application.
    */
  var robotSoftwareSuite: RobotSoftwareSuite
  
  /**
    * The sources of the robot application.
    */
  var sources: js.UndefOr[SourceConfigs] = js.undefined
  
  /**
    * A map that contains tag keys and tag values that are attached to the robot application.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateRobotApplicationRequest {
  
  inline def apply(name: Name, robotSoftwareSuite: RobotSoftwareSuite): CreateRobotApplicationRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], robotSoftwareSuite = robotSoftwareSuite.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRobotApplicationRequest]
  }
  
  extension [Self <: CreateRobotApplicationRequest](x: Self) {
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRobotSoftwareSuite(value: RobotSoftwareSuite): Self = StObject.set(x, "robotSoftwareSuite", value.asInstanceOf[js.Any])
    
    inline def setSources(value: SourceConfigs): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: SourceConfig*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
