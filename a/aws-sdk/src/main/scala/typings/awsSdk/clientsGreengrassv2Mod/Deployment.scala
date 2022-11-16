package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deployment extends StObject {
  
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
  var deploymentName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of the deployment.
    */
  var deploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined
  
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
    * The ARN of the target IoT thing or thing group. When creating a subdeployment, the targetARN can only be a thing group.
    */
  var targetArn: js.UndefOr[TargetARN] = js.undefined
}
object Deployment {
  
  inline def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  
  extension [Self <: Deployment](x: Self) {
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDeploymentId(value: NonEmptyString): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    inline def setDeploymentName(value: NonEmptyString): Self = StObject.set(x, "deploymentName", value.asInstanceOf[js.Any])
    
    inline def setDeploymentNameUndefined: Self = StObject.set(x, "deploymentName", js.undefined)
    
    inline def setDeploymentStatus(value: DeploymentStatus): Self = StObject.set(x, "deploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusUndefined: Self = StObject.set(x, "deploymentStatus", js.undefined)
    
    inline def setIsLatestForTarget(value: IsLatestForTarget): Self = StObject.set(x, "isLatestForTarget", value.asInstanceOf[js.Any])
    
    inline def setIsLatestForTargetUndefined: Self = StObject.set(x, "isLatestForTarget", js.undefined)
    
    inline def setParentTargetArn(value: ThingGroupARN): Self = StObject.set(x, "parentTargetArn", value.asInstanceOf[js.Any])
    
    inline def setParentTargetArnUndefined: Self = StObject.set(x, "parentTargetArn", js.undefined)
    
    inline def setRevisionId(value: NonEmptyString): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setTargetArn(value: TargetARN): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArnUndefined: Self = StObject.set(x, "targetArn", js.undefined)
  }
}
