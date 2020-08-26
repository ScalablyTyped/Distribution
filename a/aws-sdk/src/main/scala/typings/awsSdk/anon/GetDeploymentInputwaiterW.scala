package typings.awsSdk.anon

import typings.awsSdk.codedeployMod.DeploymentId
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/codedeploy.GetDeploymentInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait GetDeploymentInputwaiterW extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    *  The unique ID of a deployment associated with the IAM user or AWS account. 
    */
  var deploymentId: DeploymentId = js.native
}

object GetDeploymentInputwaiterW {
  @scala.inline
  def apply(deploymentId: DeploymentId): GetDeploymentInputwaiterW = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentInputwaiterW]
  }
  @scala.inline
  implicit class GetDeploymentInputwaiterWOps[Self <: GetDeploymentInputwaiterW] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeploymentId(value: DeploymentId): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
  }
  
}

