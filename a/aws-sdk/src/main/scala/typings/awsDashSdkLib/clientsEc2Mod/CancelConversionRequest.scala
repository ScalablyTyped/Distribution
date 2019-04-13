package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelConversionRequest extends js.Object {
  /**
    * The ID of the conversion task.
    */
  var ConversionTaskId: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The reason for canceling the conversion task.
    */
  var ReasonMessage: js.UndefOr[String] = js.undefined
}

object CancelConversionRequest {
  @scala.inline
  def apply(ConversionTaskId: String, DryRun: js.UndefOr[Boolean] = js.undefined, ReasonMessage: String = null): CancelConversionRequest = {
    val __obj = js.Dynamic.literal(ConversionTaskId = ConversionTaskId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (ReasonMessage != null) __obj.updateDynamic("ReasonMessage")(ReasonMessage)
    __obj.asInstanceOf[CancelConversionRequest]
  }
}

