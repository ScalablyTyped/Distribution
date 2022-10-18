package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentStage extends StObject {
  
  /**
    * Configuration of the deployment details.
    */
  var DeploymentConfig: js.UndefOr[EdgeDeploymentConfig] = js.undefined
  
  /**
    * Configuration of the devices in the stage.
    */
  var DeviceSelectionConfig: typings.awsSdk.clientsSagemakerMod.DeviceSelectionConfig
  
  /**
    * The name of the stage.
    */
  var StageName: EntityName
}
object DeploymentStage {
  
  inline def apply(DeviceSelectionConfig: DeviceSelectionConfig, StageName: EntityName): DeploymentStage = {
    val __obj = js.Dynamic.literal(DeviceSelectionConfig = DeviceSelectionConfig.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentStage]
  }
  
  extension [Self <: DeploymentStage](x: Self) {
    
    inline def setDeploymentConfig(value: EdgeDeploymentConfig): Self = StObject.set(x, "DeploymentConfig", value.asInstanceOf[js.Any])
    
    inline def setDeploymentConfigUndefined: Self = StObject.set(x, "DeploymentConfig", js.undefined)
    
    inline def setDeviceSelectionConfig(value: DeviceSelectionConfig): Self = StObject.set(x, "DeviceSelectionConfig", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: EntityName): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
  }
}
