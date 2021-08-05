package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentStrategyRequest extends StObject {
  
  /**
    * The ID of the deployment strategy to get.
    */
  var DeploymentStrategyId: typings.awsSdk.appconfigMod.DeploymentStrategyId
}
object GetDeploymentStrategyRequest {
  
  inline def apply(DeploymentStrategyId: DeploymentStrategyId): GetDeploymentStrategyRequest = {
    val __obj = js.Dynamic.literal(DeploymentStrategyId = DeploymentStrategyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentStrategyRequest]
  }
  
  extension [Self <: GetDeploymentStrategyRequest](x: Self) {
    
    inline def setDeploymentStrategyId(value: DeploymentStrategyId): Self = StObject.set(x, "DeploymentStrategyId", value.asInstanceOf[js.Any])
  }
}
