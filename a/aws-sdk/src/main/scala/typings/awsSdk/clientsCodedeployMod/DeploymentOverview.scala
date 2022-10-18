package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentOverview extends StObject {
  
  /**
    * The number of instances in the deployment in a failed state.
    */
  var Failed: js.UndefOr[InstanceCount] = js.undefined
  
  /**
    * The number of instances in which the deployment is in progress.
    */
  var InProgress: js.UndefOr[InstanceCount] = js.undefined
  
  /**
    * The number of instances in the deployment in a pending state.
    */
  var Pending: js.UndefOr[InstanceCount] = js.undefined
  
  /**
    * The number of instances in a replacement environment ready to receive traffic in a blue/green deployment.
    */
  var Ready: js.UndefOr[InstanceCount] = js.undefined
  
  /**
    * The number of instances in the deployment in a skipped state.
    */
  var Skipped: js.UndefOr[InstanceCount] = js.undefined
  
  /**
    * The number of instances in the deployment to which revisions have been successfully deployed.
    */
  var Succeeded: js.UndefOr[InstanceCount] = js.undefined
}
object DeploymentOverview {
  
  inline def apply(): DeploymentOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentOverview]
  }
  
  extension [Self <: DeploymentOverview](x: Self) {
    
    inline def setFailed(value: InstanceCount): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "Failed", js.undefined)
    
    inline def setInProgress(value: InstanceCount): Self = StObject.set(x, "InProgress", value.asInstanceOf[js.Any])
    
    inline def setInProgressUndefined: Self = StObject.set(x, "InProgress", js.undefined)
    
    inline def setPending(value: InstanceCount): Self = StObject.set(x, "Pending", value.asInstanceOf[js.Any])
    
    inline def setPendingUndefined: Self = StObject.set(x, "Pending", js.undefined)
    
    inline def setReady(value: InstanceCount): Self = StObject.set(x, "Ready", value.asInstanceOf[js.Any])
    
    inline def setReadyUndefined: Self = StObject.set(x, "Ready", js.undefined)
    
    inline def setSkipped(value: InstanceCount): Self = StObject.set(x, "Skipped", value.asInstanceOf[js.Any])
    
    inline def setSkippedUndefined: Self = StObject.set(x, "Skipped", js.undefined)
    
    inline def setSucceeded(value: InstanceCount): Self = StObject.set(x, "Succeeded", value.asInstanceOf[js.Any])
    
    inline def setSucceededUndefined: Self = StObject.set(x, "Succeeded", js.undefined)
  }
}
