package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSpotInstanceRequestsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more Spot Instance request IDs.
    */
  var SpotInstanceRequestIds: SpotInstanceRequestIdList = js.native
}

object CancelSpotInstanceRequestsRequest {
  @scala.inline
  def apply(
    SpotInstanceRequestIds: SpotInstanceRequestIdList,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): CancelSpotInstanceRequestsRequest = {
    val __obj = js.Dynamic.literal(SpotInstanceRequestIds = SpotInstanceRequestIds.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSpotInstanceRequestsRequest]
  }
}

