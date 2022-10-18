package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudFormationTarget extends StObject {
  
  /**
    * The unique ID of an CloudFormation blue/green deployment.
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  
  /**
    *  The date and time when the target application was updated by an CloudFormation blue/green deployment. 
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The lifecycle events of the CloudFormation blue/green deployment to this target application. 
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined
  
  /**
    * The resource type for the CloudFormation blue/green deployment.
    */
  var resourceType: js.UndefOr[CloudFormationResourceType] = js.undefined
  
  /**
    *  The status of an CloudFormation blue/green deployment's target application. 
    */
  var status: js.UndefOr[TargetStatus] = js.undefined
  
  /**
    *  The unique ID of a deployment target that has a type of CloudFormationTarget. 
    */
  var targetId: js.UndefOr[TargetId] = js.undefined
  
  /**
    * The percentage of production traffic that the target version of an CloudFormation blue/green deployment receives.
    */
  var targetVersionWeight: js.UndefOr[TrafficWeight] = js.undefined
}
object CloudFormationTarget {
  
  inline def apply(): CloudFormationTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudFormationTarget]
  }
  
  extension [Self <: CloudFormationTarget](x: Self) {
    
    inline def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setLifecycleEvents(value: LifecycleEventList): Self = StObject.set(x, "lifecycleEvents", value.asInstanceOf[js.Any])
    
    inline def setLifecycleEventsUndefined: Self = StObject.set(x, "lifecycleEvents", js.undefined)
    
    inline def setLifecycleEventsVarargs(value: LifecycleEvent*): Self = StObject.set(x, "lifecycleEvents", js.Array(value*))
    
    inline def setResourceType(value: CloudFormationResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setStatus(value: TargetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetId(value: TargetId): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    inline def setTargetVersionWeight(value: TrafficWeight): Self = StObject.set(x, "targetVersionWeight", value.asInstanceOf[js.Any])
    
    inline def setTargetVersionWeightUndefined: Self = StObject.set(x, "targetVersionWeight", js.undefined)
  }
}
