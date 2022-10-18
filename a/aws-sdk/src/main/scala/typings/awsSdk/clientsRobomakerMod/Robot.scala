package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Robot extends StObject {
  
  /**
    * The architecture of the robot.
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
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleetArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Greengrass group associated with the robot.
    */
  var greenGrassGroupId: js.UndefOr[Id] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the last deployment job.
    */
  var lastDeploymentJob: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time of the last deployment.
    */
  var lastDeploymentTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the robot.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The status of the robot.
    */
  var status: js.UndefOr[RobotStatus] = js.undefined
}
object Robot {
  
  inline def apply(): Robot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Robot]
  }
  
  extension [Self <: Robot](x: Self) {
    
    inline def setArchitecture(value: Architecture): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setFleetArn(value: Arn): Self = StObject.set(x, "fleetArn", value.asInstanceOf[js.Any])
    
    inline def setFleetArnUndefined: Self = StObject.set(x, "fleetArn", js.undefined)
    
    inline def setGreenGrassGroupId(value: Id): Self = StObject.set(x, "greenGrassGroupId", value.asInstanceOf[js.Any])
    
    inline def setGreenGrassGroupIdUndefined: Self = StObject.set(x, "greenGrassGroupId", js.undefined)
    
    inline def setLastDeploymentJob(value: Arn): Self = StObject.set(x, "lastDeploymentJob", value.asInstanceOf[js.Any])
    
    inline def setLastDeploymentJobUndefined: Self = StObject.set(x, "lastDeploymentJob", js.undefined)
    
    inline def setLastDeploymentTime(value: js.Date): Self = StObject.set(x, "lastDeploymentTime", value.asInstanceOf[js.Any])
    
    inline def setLastDeploymentTimeUndefined: Self = StObject.set(x, "lastDeploymentTime", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: RobotStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
