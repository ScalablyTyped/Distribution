package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentStrategyRequest extends StObject {
  
  /**
    * The ID of the deployment strategy to get.
    */
  var DeploymentStrategyId: typings.awsSdk.clientsAppconfigMod.DeploymentStrategyId
}
object GetDeploymentStrategyRequest {
  
  inline def apply(DeploymentStrategyId: DeploymentStrategyId): GetDeploymentStrategyRequest = {
    val __obj = js.Dynamic.literal(DeploymentStrategyId = DeploymentStrategyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentStrategyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDeploymentStrategyRequest] (val x: Self) extends AnyVal {
    
    inline def setDeploymentStrategyId(value: DeploymentStrategyId): Self = StObject.set(x, "DeploymentStrategyId", value.asInstanceOf[js.Any])
  }
}
