package typings.awsSdk

import typings.awsSdk.opsworksMod.String
import typings.awsSdk.opsworksMod.Strings
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/opsworks.DescribeDeploymentsRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
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
  def apply(
    $waiter: WaiterConfiguration = null,
    AppId: String = null,
    DeploymentIds: Strings = null,
    StackId: String = null
  ): DescribeDeploymentsReques = {
    val __obj = js.Dynamic.literal()
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    if (AppId != null) __obj.updateDynamic("AppId")(AppId.asInstanceOf[js.Any])
    if (DeploymentIds != null) __obj.updateDynamic("DeploymentIds")(DeploymentIds.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeploymentsReques]
  }
}

