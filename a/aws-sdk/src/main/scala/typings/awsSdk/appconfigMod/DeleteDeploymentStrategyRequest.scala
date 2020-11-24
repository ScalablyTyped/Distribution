package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDeploymentStrategyRequest extends js.Object {
  
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
  implicit class DeleteDeploymentStrategyRequestOps[Self <: DeleteDeploymentStrategyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeploymentStrategyId(value: DeploymentStrategyId): Self = this.set("DeploymentStrategyId", value.asInstanceOf[js.Any])
  }
}
