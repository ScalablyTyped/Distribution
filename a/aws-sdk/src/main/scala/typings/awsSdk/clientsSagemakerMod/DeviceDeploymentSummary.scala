package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDeploymentSummary extends StObject {
  
  /**
    * The name of the deployed stage.
    */
  var DeployedStageName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The time when the deployment on the device started.
    */
  var DeploymentStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the device.
    */
  var Description: js.UndefOr[DeviceDescription] = js.undefined
  
  /**
    * The ARN of the device.
    */
  var DeviceArn: typings.awsSdk.clientsSagemakerMod.DeviceArn
  
  /**
    * The deployment status of the device.
    */
  var DeviceDeploymentStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DeviceDeploymentStatus] = js.undefined
  
  /**
    * The detailed error message for the deployoment status result.
    */
  var DeviceDeploymentStatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the fleet to which the device belongs to.
    */
  var DeviceFleetName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The name of the device.
    */
  var DeviceName: typings.awsSdk.clientsSagemakerMod.DeviceName
  
  /**
    * The ARN of the edge deployment plan.
    */
  var EdgeDeploymentPlanArn: typings.awsSdk.clientsSagemakerMod.EdgeDeploymentPlanArn
  
  /**
    * The name of the edge deployment plan.
    */
  var EdgeDeploymentPlanName: EntityName
  
  /**
    * The name of the stage in the edge deployment plan.
    */
  var StageName: EntityName
}
object DeviceDeploymentSummary {
  
  inline def apply(
    DeviceArn: DeviceArn,
    DeviceName: DeviceName,
    EdgeDeploymentPlanArn: EdgeDeploymentPlanArn,
    EdgeDeploymentPlanName: EntityName,
    StageName: EntityName
  ): DeviceDeploymentSummary = {
    val __obj = js.Dynamic.literal(DeviceArn = DeviceArn.asInstanceOf[js.Any], DeviceName = DeviceName.asInstanceOf[js.Any], EdgeDeploymentPlanArn = EdgeDeploymentPlanArn.asInstanceOf[js.Any], EdgeDeploymentPlanName = EdgeDeploymentPlanName.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDeploymentSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceDeploymentSummary] (val x: Self) extends AnyVal {
    
    inline def setDeployedStageName(value: EntityName): Self = StObject.set(x, "DeployedStageName", value.asInstanceOf[js.Any])
    
    inline def setDeployedStageNameUndefined: Self = StObject.set(x, "DeployedStageName", js.undefined)
    
    inline def setDeploymentStartTime(value: js.Date): Self = StObject.set(x, "DeploymentStartTime", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStartTimeUndefined: Self = StObject.set(x, "DeploymentStartTime", js.undefined)
    
    inline def setDescription(value: DeviceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceArn(value: DeviceArn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceDeploymentStatus(value: DeviceDeploymentStatus): Self = StObject.set(x, "DeviceDeploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setDeviceDeploymentStatusMessage(value: String): Self = StObject.set(x, "DeviceDeploymentStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setDeviceDeploymentStatusMessageUndefined: Self = StObject.set(x, "DeviceDeploymentStatusMessage", js.undefined)
    
    inline def setDeviceDeploymentStatusUndefined: Self = StObject.set(x, "DeviceDeploymentStatus", js.undefined)
    
    inline def setDeviceFleetName(value: EntityName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
    
    inline def setDeviceFleetNameUndefined: Self = StObject.set(x, "DeviceFleetName", js.undefined)
    
    inline def setDeviceName(value: DeviceName): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentPlanArn(value: EdgeDeploymentPlanArn): Self = StObject.set(x, "EdgeDeploymentPlanArn", value.asInstanceOf[js.Any])
    
    inline def setEdgeDeploymentPlanName(value: EntityName): Self = StObject.set(x, "EdgeDeploymentPlanName", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: EntityName): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
  }
}
