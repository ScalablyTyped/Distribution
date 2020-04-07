package typings.awsSdk

import typings.awsSdk.ec2Mod.Boolean
import typings.awsSdk.ec2Mod.InstanceId
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ec2.GetPasswordDataRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait GetPasswordDataRequestwai extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the Windows instance.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
}

object GetPasswordDataRequestwai {
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    $waiter: WaiterConfiguration = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): GetPasswordDataRequestwai = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPasswordDataRequestwai]
  }
}

