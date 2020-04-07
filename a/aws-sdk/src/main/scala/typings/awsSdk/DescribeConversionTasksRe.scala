package typings.awsSdk

import typings.awsSdk.ec2Mod.Boolean
import typings.awsSdk.ec2Mod.ConversionIdStringList
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeConversionTasksRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeConversionTasksRe extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The conversion task IDs.
    */
  var ConversionTaskIds: js.UndefOr[ConversionIdStringList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}

object DescribeConversionTasksRe {
  @scala.inline
  def apply(
    $waiter: WaiterConfiguration = null,
    ConversionTaskIds: ConversionIdStringList = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): DescribeConversionTasksRe = {
    val __obj = js.Dynamic.literal()
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    if (ConversionTaskIds != null) __obj.updateDynamic("ConversionTaskIds")(ConversionTaskIds.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConversionTasksRe]
  }
}

