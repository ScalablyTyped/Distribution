package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeploymentStrategyRequest extends StObject {
  
  /**
    * The ID of the deployment strategy you want to delete.
    */
  var DeploymentStrategyId: typings.awsSdk.clientsAppconfigMod.DeploymentStrategyId
}
object DeleteDeploymentStrategyRequest {
  
  inline def apply(DeploymentStrategyId: DeploymentStrategyId): DeleteDeploymentStrategyRequest = {
    val __obj = js.Dynamic.literal(DeploymentStrategyId = DeploymentStrategyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeploymentStrategyRequest]
  }
  
  extension [Self <: DeleteDeploymentStrategyRequest](x: Self) {
    
    inline def setDeploymentStrategyId(value: DeploymentStrategyId): Self = StObject.set(x, "DeploymentStrategyId", value.asInstanceOf[js.Any])
  }
}
