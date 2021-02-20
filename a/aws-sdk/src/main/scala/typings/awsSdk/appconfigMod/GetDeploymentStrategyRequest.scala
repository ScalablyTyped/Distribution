package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeploymentStrategyRequest extends StObject {
  
  /**
    * The ID of the deployment strategy to get.
    */
  var DeploymentStrategyId: typings.awsSdk.appconfigMod.DeploymentStrategyId = js.native
}
object GetDeploymentStrategyRequest {
  
  @scala.inline
  def apply(DeploymentStrategyId: DeploymentStrategyId): GetDeploymentStrategyRequest = {
    val __obj = js.Dynamic.literal(DeploymentStrategyId = DeploymentStrategyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentStrategyRequest]
  }
  
  @scala.inline
  implicit class GetDeploymentStrategyRequestMutableBuilder[Self <: GetDeploymentStrategyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentStrategyId(value: DeploymentStrategyId): Self = StObject.set(x, "DeploymentStrategyId", value.asInstanceOf[js.Any])
  }
}
