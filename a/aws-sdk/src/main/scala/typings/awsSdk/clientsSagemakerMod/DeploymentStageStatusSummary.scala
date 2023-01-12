package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentStageStatusSummary extends StObject {
  
  /**
    * Configuration of the deployment details.
    */
  var DeploymentConfig: EdgeDeploymentConfig
  
  /**
    * General status of the current state.
    */
  var DeploymentStatus: EdgeDeploymentStatus
  
  /**
    * Configuration of the devices in the stage.
    */
  var DeviceSelectionConfig: typings.awsSdk.clientsSagemakerMod.DeviceSelectionConfig
  
  /**
    * The name of the stage.
    */
  var StageName: EntityName
}
object DeploymentStageStatusSummary {
  
  inline def apply(
    DeploymentConfig: EdgeDeploymentConfig,
    DeploymentStatus: EdgeDeploymentStatus,
    DeviceSelectionConfig: DeviceSelectionConfig,
    StageName: EntityName
  ): DeploymentStageStatusSummary = {
    val __obj = js.Dynamic.literal(DeploymentConfig = DeploymentConfig.asInstanceOf[js.Any], DeploymentStatus = DeploymentStatus.asInstanceOf[js.Any], DeviceSelectionConfig = DeviceSelectionConfig.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentStageStatusSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentStageStatusSummary] (val x: Self) extends AnyVal {
    
    inline def setDeploymentConfig(value: EdgeDeploymentConfig): Self = StObject.set(x, "DeploymentConfig", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatus(value: EdgeDeploymentStatus): Self = StObject.set(x, "DeploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setDeviceSelectionConfig(value: DeviceSelectionConfig): Self = StObject.set(x, "DeviceSelectionConfig", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: EntityName): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
  }
}
