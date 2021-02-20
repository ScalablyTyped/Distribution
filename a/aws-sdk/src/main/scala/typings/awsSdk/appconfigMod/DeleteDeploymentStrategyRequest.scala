package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDeploymentStrategyRequest extends StObject {
  
  /**
    * The ID of the deployment strategy you want to delete.
    */
  var DeploymentStrategyId: typings.awsSdk.appconfigMod.DeploymentStrategyId = js.native
}
object DeleteDeploymentStrategyRequest {
  
  @scala.inline
  def apply(DeploymentStrategyId: DeploymentStrategyId): DeleteDeploymentStrategyRequest = {
    val __obj = js.Dynamic.literal(DeploymentStrategyId = DeploymentStrategyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDeploymentStrategyRequest]
  }
  
  @scala.inline
  implicit class DeleteDeploymentStrategyRequestMutableBuilder[Self <: DeleteDeploymentStrategyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentStrategyId(value: DeploymentStrategyId): Self = StObject.set(x, "DeploymentStrategyId", value.asInstanceOf[js.Any])
  }
}
