package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConversionTasksRequest extends js.Object {
  /**
    * The conversion task IDs.
    */
  var ConversionTaskIds: js.UndefOr[ConversionIdStringList] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}

object DescribeConversionTasksRequest {
  @scala.inline
  def apply(ConversionTaskIds: ConversionIdStringList = null, DryRun: js.UndefOr[scala.Boolean] = js.undefined): DescribeConversionTasksRequest = {
    val __obj = js.Dynamic.literal()
    if (ConversionTaskIds != null) __obj.updateDynamic("ConversionTaskIds")(ConversionTaskIds.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConversionTasksRequest]
  }
}

