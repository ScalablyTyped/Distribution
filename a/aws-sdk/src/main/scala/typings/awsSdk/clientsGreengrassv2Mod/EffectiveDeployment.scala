package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectiveDeployment extends StObject {
  
  /**
    * The status of the deployment job on the Greengrass core device.
    */
  var coreDeviceExecutionStatus: EffectiveDeploymentExecutionStatus
  
  /**
    * The time at which the deployment was created, expressed in ISO 8601 format.
    */
  var creationTimestamp: js.Date
  
  /**
    * The ID of the deployment.
    */
  var deploymentId: DeploymentID
  
  /**
    * The name of the deployment.
    */
  var deploymentName: DeploymentName
  
  /**
    * The description of the deployment job.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The ARN of the IoT job that applies the deployment to target devices.
    */
  var iotJobArn: js.UndefOr[IoTJobARN] = js.undefined
  
  /**
    * The ID of the IoT job that applies the deployment to target devices.
    */
  var iotJobId: js.UndefOr[IoTJobId] = js.undefined
  
  /**
    * The time at which the deployment job was last modified, expressed in ISO 8601 format.
    */
  var modifiedTimestamp: js.Date
  
  /**
    * The reason code for the update, if the job was updated.
    */
  var reason: js.UndefOr[Reason] = js.undefined
  
  /**
    * The status details that explain why a deployment has an error. This response will be null if the deployment is in a success state.
    */
  var statusDetails: js.UndefOr[EffectiveDeploymentStatusDetails] = js.undefined
  
  /**
    * The ARN of the target IoT thing or thing group.
    */
  var targetArn: TargetARN
}
object EffectiveDeployment {
  
  inline def apply(
    coreDeviceExecutionStatus: EffectiveDeploymentExecutionStatus,
    creationTimestamp: js.Date,
    deploymentId: DeploymentID,
    deploymentName: DeploymentName,
    modifiedTimestamp: js.Date,
    targetArn: TargetARN
  ): EffectiveDeployment = {
    val __obj = js.Dynamic.literal(coreDeviceExecutionStatus = coreDeviceExecutionStatus.asInstanceOf[js.Any], creationTimestamp = creationTimestamp.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], deploymentName = deploymentName.asInstanceOf[js.Any], modifiedTimestamp = modifiedTimestamp.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectiveDeployment]
  }
  
  extension [Self <: EffectiveDeployment](x: Self) {
    
    inline def setCoreDeviceExecutionStatus(value: EffectiveDeploymentExecutionStatus): Self = StObject.set(x, "coreDeviceExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setDeploymentId(value: DeploymentID): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentName(value: DeploymentName): Self = StObject.set(x, "deploymentName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIotJobArn(value: IoTJobARN): Self = StObject.set(x, "iotJobArn", value.asInstanceOf[js.Any])
    
    inline def setIotJobArnUndefined: Self = StObject.set(x, "iotJobArn", js.undefined)
    
    inline def setIotJobId(value: IoTJobId): Self = StObject.set(x, "iotJobId", value.asInstanceOf[js.Any])
    
    inline def setIotJobIdUndefined: Self = StObject.set(x, "iotJobId", js.undefined)
    
    inline def setModifiedTimestamp(value: js.Date): Self = StObject.set(x, "modifiedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setStatusDetails(value: EffectiveDeploymentStatusDetails): Self = StObject.set(x, "statusDetails", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailsUndefined: Self = StObject.set(x, "statusDetails", js.undefined)
    
    inline def setTargetArn(value: TargetARN): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
  }
}
