package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceTarget extends StObject {
  
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  
  /**
    *  A label that identifies whether the instance is an original target (BLUE) or a replacement target (GREEN). 
    */
  var instanceLabel: js.UndefOr[TargetLabel] = js.undefined
  
  /**
    *  The date and time when the target instance was updated by a deployment. 
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The lifecycle events of the deployment to this target instance. 
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined
  
  /**
    *  The status an EC2/On-premises deployment's target instance. 
    */
  var status: js.UndefOr[TargetStatus] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the target. 
    */
  var targetArn: js.UndefOr[TargetArn] = js.undefined
  
  /**
    *  The unique ID of a deployment target that has a type of instanceTarget. 
    */
  var targetId: js.UndefOr[TargetId] = js.undefined
}
object InstanceTarget {
  
  inline def apply(): InstanceTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTarget]
  }
  
  extension [Self <: InstanceTarget](x: Self) {
    
    inline def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    inline def setInstanceLabel(value: TargetLabel): Self = StObject.set(x, "instanceLabel", value.asInstanceOf[js.Any])
    
    inline def setInstanceLabelUndefined: Self = StObject.set(x, "instanceLabel", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setLifecycleEvents(value: LifecycleEventList): Self = StObject.set(x, "lifecycleEvents", value.asInstanceOf[js.Any])
    
    inline def setLifecycleEventsUndefined: Self = StObject.set(x, "lifecycleEvents", js.undefined)
    
    inline def setLifecycleEventsVarargs(value: LifecycleEvent*): Self = StObject.set(x, "lifecycleEvents", js.Array(value*))
    
    inline def setStatus(value: TargetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetArn(value: TargetArn): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArnUndefined: Self = StObject.set(x, "targetArn", js.undefined)
    
    inline def setTargetId(value: TargetId): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
