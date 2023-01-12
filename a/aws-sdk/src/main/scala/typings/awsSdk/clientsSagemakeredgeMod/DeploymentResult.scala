package typings.awsSdk.clientsSagemakeredgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentResult extends StObject {
  
  /**
    * The timestamp of when the deployment was ended, and the agent got the deployment results.
    */
  var DeploymentEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Returns a list of models deployed on the agent.
    */
  var DeploymentModels: js.UndefOr[typings.awsSdk.clientsSagemakeredgeMod.DeploymentModels] = js.undefined
  
  /**
    * The name and unique ID of the deployment.
    */
  var DeploymentName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The timestamp of when the deployment was started on the agent.
    */
  var DeploymentStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Returns the bucket error code.
    */
  var DeploymentStatus: js.UndefOr[EntityName] = js.undefined
  
  /**
    * Returns the detailed error message.
    */
  var DeploymentStatusMessage: js.UndefOr[String] = js.undefined
}
object DeploymentResult {
  
  inline def apply(): DeploymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentResult] (val x: Self) extends AnyVal {
    
    inline def setDeploymentEndTime(value: js.Date): Self = StObject.set(x, "DeploymentEndTime", value.asInstanceOf[js.Any])
    
    inline def setDeploymentEndTimeUndefined: Self = StObject.set(x, "DeploymentEndTime", js.undefined)
    
    inline def setDeploymentModels(value: DeploymentModels): Self = StObject.set(x, "DeploymentModels", value.asInstanceOf[js.Any])
    
    inline def setDeploymentModelsUndefined: Self = StObject.set(x, "DeploymentModels", js.undefined)
    
    inline def setDeploymentModelsVarargs(value: DeploymentModel*): Self = StObject.set(x, "DeploymentModels", js.Array(value*))
    
    inline def setDeploymentName(value: EntityName): Self = StObject.set(x, "DeploymentName", value.asInstanceOf[js.Any])
    
    inline def setDeploymentNameUndefined: Self = StObject.set(x, "DeploymentName", js.undefined)
    
    inline def setDeploymentStartTime(value: js.Date): Self = StObject.set(x, "DeploymentStartTime", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStartTimeUndefined: Self = StObject.set(x, "DeploymentStartTime", js.undefined)
    
    inline def setDeploymentStatus(value: EntityName): Self = StObject.set(x, "DeploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusMessage(value: String): Self = StObject.set(x, "DeploymentStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusMessageUndefined: Self = StObject.set(x, "DeploymentStatusMessage", js.undefined)
    
    inline def setDeploymentStatusUndefined: Self = StObject.set(x, "DeploymentStatus", js.undefined)
  }
}
