package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentStrategyRequest extends js.Object {
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
  implicit class GetDeploymentStrategyRequestOps[Self <: GetDeploymentStrategyRequest] (val x: Self) extends AnyVal {
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

