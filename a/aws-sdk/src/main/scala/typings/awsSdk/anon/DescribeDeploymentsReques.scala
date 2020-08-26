package typings.awsSdk.anon

import typings.awsSdk.opsworksMod.String
import typings.awsSdk.opsworksMod.Strings
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/opsworks.DescribeDeploymentsRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeDeploymentsReques extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The app ID. If you include this parameter, the command returns a description of the commands associated with the specified app.
    */
  var AppId: js.UndefOr[String] = js.native
  /**
    * An array of deployment IDs to be described. If you include this parameter, the command returns a description of the specified deployments. Otherwise, it returns a description of every deployment.
    */
  var DeploymentIds: js.UndefOr[Strings] = js.native
  /**
    * The stack ID. If you include this parameter, the command returns a description of the commands associated with the specified stack.
    */
  var StackId: js.UndefOr[String] = js.native
}

object DescribeDeploymentsReques {
  @scala.inline
  def apply(): DescribeDeploymentsReques = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeploymentsReques]
  }
  @scala.inline
  implicit class DescribeDeploymentsRequesOps[Self <: DescribeDeploymentsReques] (val x: Self) extends AnyVal {
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
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
    @scala.inline
    def setAppId(value: String): Self = this.set("AppId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppId: Self = this.set("AppId", js.undefined)
    @scala.inline
    def setDeploymentIdsVarargs(value: String*): Self = this.set("DeploymentIds", js.Array(value :_*))
    @scala.inline
    def setDeploymentIds(value: Strings): Self = this.set("DeploymentIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentIds: Self = this.set("DeploymentIds", js.undefined)
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
  }
  
}

