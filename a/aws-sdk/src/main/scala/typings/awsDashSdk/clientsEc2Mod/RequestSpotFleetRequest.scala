package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestSpotFleetRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The configuration for the Spot Fleet request.
    */
  var SpotFleetRequestConfig: SpotFleetRequestConfigData = js.native
}

object RequestSpotFleetRequest {
  @scala.inline
  def apply(
    SpotFleetRequestConfig: SpotFleetRequestConfigData,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): RequestSpotFleetRequest = {
    val __obj = js.Dynamic.literal(SpotFleetRequestConfig = SpotFleetRequestConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSpotFleetRequest]
  }
}

