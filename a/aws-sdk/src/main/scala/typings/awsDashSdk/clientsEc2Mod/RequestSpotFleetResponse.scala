package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestSpotFleetResponse extends js.Object {
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.native
}

object RequestSpotFleetResponse {
  @scala.inline
  def apply(SpotFleetRequestId: String = null): RequestSpotFleetResponse = {
    val __obj = js.Dynamic.literal()
    if (SpotFleetRequestId != null) __obj.updateDynamic("SpotFleetRequestId")(SpotFleetRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSpotFleetResponse]
  }
}

