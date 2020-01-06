package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelConversionRequest extends js.Object {
  /**
    * The ID of the conversion task.
    */
  var ConversionTaskId: typings.awsDashSdk.clientsEc2Mod.ConversionTaskId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The reason for canceling the conversion task.
    */
  var ReasonMessage: js.UndefOr[String] = js.native
}

object CancelConversionRequest {
  @scala.inline
  def apply(
    ConversionTaskId: ConversionTaskId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    ReasonMessage: String = null
  ): CancelConversionRequest = {
    val __obj = js.Dynamic.literal(ConversionTaskId = ConversionTaskId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (ReasonMessage != null) __obj.updateDynamic("ReasonMessage")(ReasonMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelConversionRequest]
  }
}

