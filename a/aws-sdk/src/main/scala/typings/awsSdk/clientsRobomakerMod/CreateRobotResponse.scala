package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRobotResponse extends StObject {
  
  /**
    * The target architecture of the robot.
    */
  var architecture: js.UndefOr[Architecture] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the robot.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the robot was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Greengrass group associated with the robot.
    */
  var greengrassGroupId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name of the robot.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The list of all tags added to the robot.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateRobotResponse {
  
  inline def apply(): CreateRobotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRobotResponse]
  }
  
  extension [Self <: CreateRobotResponse](x: Self) {
    
    inline def setArchitecture(value: Architecture): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setGreengrassGroupId(value: Id): Self = StObject.set(x, "greengrassGroupId", value.asInstanceOf[js.Any])
    
    inline def setGreengrassGroupIdUndefined: Self = StObject.set(x, "greengrassGroupId", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
