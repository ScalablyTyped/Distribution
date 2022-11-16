package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentResponse extends StObject {
  
  /**
    * The components to deploy. This is a dictionary, where each key is the name of a component, and each key's value is the version and configuration to deploy for that component.
    */
  var components: js.UndefOr[ComponentDeploymentSpecifications] = js.undefined
  
  /**
    * The time at which the deployment was created, expressed in ISO 8601 format.
    */
  var creationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the deployment.
    */
  var deploymentId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the deployment.
    */
  var deploymentName: js.UndefOr[NullableString] = js.undefined
  
  /**
    * The deployment policies for the deployment. These policies define how the deployment updates components and handles failure.
    */
  var deploymentPolicies: js.UndefOr[DeploymentPolicies] = js.undefined
  
  /**
    * The status of the deployment.
    */
  var deploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined
  
  /**
    * The ARN of the IoT job that applies the deployment to target devices.
    */
  var iotJobArn: js.UndefOr[IoTJobARN] = js.undefined
  
  /**
    * The job configuration for the deployment configuration. The job configuration specifies the rollout, timeout, and stop configurations for the deployment configuration.
    */
  var iotJobConfiguration: js.UndefOr[DeploymentIoTJobConfiguration] = js.undefined
  
  /**
    * The ID of the IoT job that applies the deployment to target devices.
    */
  var iotJobId: js.UndefOr[NullableString] = js.undefined
  
  /**
    * Whether or not the deployment is the latest revision for its target.
    */
  var isLatestForTarget: js.UndefOr[IsLatestForTarget] = js.undefined
  
  /**
    * The parent deployment's target ARN within a subdeployment.
    */
  var parentTargetArn: js.UndefOr[ThingGroupARN] = js.undefined
  
  /**
    * The revision number of the deployment.
    */
  var revisionId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A list of key-value pairs that contain metadata for the resource. For more information, see Tag your resources in the IoT Greengrass V2 Developer Guide.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The ARN of the target IoT thing or thing group.
    */
  var targetArn: js.UndefOr[TargetARN] = js.undefined
}
object GetDeploymentResponse {
  
  inline def apply(): GetDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentResponse]
  }
  
  extension [Self <: GetDeploymentResponse](x: Self) {
    
    inline def setComponents(value: ComponentDeploymentSpecifications): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDeploymentId(value: NonEmptyString): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    inline def setDeploymentName(value: NullableString): Self = StObject.set(x, "deploymentName", value.asInstanceOf[js.Any])
    
    inline def setDeploymentNameUndefined: Self = StObject.set(x, "deploymentName", js.undefined)
    
    inline def setDeploymentPolicies(value: DeploymentPolicies): Self = StObject.set(x, "deploymentPolicies", value.asInstanceOf[js.Any])
    
    inline def setDeploymentPoliciesUndefined: Self = StObject.set(x, "deploymentPolicies", js.undefined)
    
    inline def setDeploymentStatus(value: DeploymentStatus): Self = StObject.set(x, "deploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusUndefined: Self = StObject.set(x, "deploymentStatus", js.undefined)
    
    inline def setIotJobArn(value: IoTJobARN): Self = StObject.set(x, "iotJobArn", value.asInstanceOf[js.Any])
    
    inline def setIotJobArnUndefined: Self = StObject.set(x, "iotJobArn", js.undefined)
    
    inline def setIotJobConfiguration(value: DeploymentIoTJobConfiguration): Self = StObject.set(x, "iotJobConfiguration", value.asInstanceOf[js.Any])
    
    inline def setIotJobConfigurationUndefined: Self = StObject.set(x, "iotJobConfiguration", js.undefined)
    
    inline def setIotJobId(value: NullableString): Self = StObject.set(x, "iotJobId", value.asInstanceOf[js.Any])
    
    inline def setIotJobIdUndefined: Self = StObject.set(x, "iotJobId", js.undefined)
    
    inline def setIsLatestForTarget(value: IsLatestForTarget): Self = StObject.set(x, "isLatestForTarget", value.asInstanceOf[js.Any])
    
    inline def setIsLatestForTargetUndefined: Self = StObject.set(x, "isLatestForTarget", js.undefined)
    
    inline def setParentTargetArn(value: ThingGroupARN): Self = StObject.set(x, "parentTargetArn", value.asInstanceOf[js.Any])
    
    inline def setParentTargetArnUndefined: Self = StObject.set(x, "parentTargetArn", js.undefined)
    
    inline def setRevisionId(value: NonEmptyString): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTargetArn(value: TargetARN): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArnUndefined: Self = StObject.set(x, "targetArn", js.undefined)
  }
}
