package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackInfo extends StObject {
  
  /**
    * The ID of the deployment rollback.
    */
  var rollbackDeploymentId: js.UndefOr[DeploymentId] = js.undefined
  
  /**
    * Information that describes the status of a deployment rollback (for example, whether the deployment can't be rolled back, is in progress, failed, or succeeded). 
    */
  var rollbackMessage: js.UndefOr[Description] = js.undefined
  
  /**
    * The deployment ID of the deployment that was underway and triggered a rollback deployment because it failed or was stopped.
    */
  var rollbackTriggeringDeploymentId: js.UndefOr[DeploymentId] = js.undefined
}
object RollbackInfo {
  
  inline def apply(): RollbackInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RollbackInfo] (val x: Self) extends AnyVal {
    
    inline def setRollbackDeploymentId(value: DeploymentId): Self = StObject.set(x, "rollbackDeploymentId", value.asInstanceOf[js.Any])
    
    inline def setRollbackDeploymentIdUndefined: Self = StObject.set(x, "rollbackDeploymentId", js.undefined)
    
    inline def setRollbackMessage(value: Description): Self = StObject.set(x, "rollbackMessage", value.asInstanceOf[js.Any])
    
    inline def setRollbackMessageUndefined: Self = StObject.set(x, "rollbackMessage", js.undefined)
    
    inline def setRollbackTriggeringDeploymentId(value: DeploymentId): Self = StObject.set(x, "rollbackTriggeringDeploymentId", value.asInstanceOf[js.Any])
    
    inline def setRollbackTriggeringDeploymentIdUndefined: Self = StObject.set(x, "rollbackTriggeringDeploymentId", js.undefined)
  }
}
