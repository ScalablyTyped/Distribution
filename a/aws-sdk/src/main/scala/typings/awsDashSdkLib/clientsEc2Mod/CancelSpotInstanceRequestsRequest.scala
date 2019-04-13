package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelSpotInstanceRequestsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * One or more Spot Instance request IDs.
    */
  var SpotInstanceRequestIds: SpotInstanceRequestIdList
}

object CancelSpotInstanceRequestsRequest {
  @scala.inline
  def apply(SpotInstanceRequestIds: SpotInstanceRequestIdList, DryRun: js.UndefOr[Boolean] = js.undefined): CancelSpotInstanceRequestsRequest = {
    val __obj = js.Dynamic.literal(SpotInstanceRequestIds = SpotInstanceRequestIds)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[CancelSpotInstanceRequestsRequest]
  }
}

