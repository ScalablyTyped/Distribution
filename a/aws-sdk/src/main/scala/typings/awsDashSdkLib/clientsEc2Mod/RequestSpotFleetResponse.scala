package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestSpotFleetResponse extends js.Object {
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.undefined
}

object RequestSpotFleetResponse {
  @scala.inline
  def apply(SpotFleetRequestId: String = null): RequestSpotFleetResponse = {
    val __obj = js.Dynamic.literal()
    if (SpotFleetRequestId != null) __obj.updateDynamic("SpotFleetRequestId")(SpotFleetRequestId)
    __obj.asInstanceOf[RequestSpotFleetResponse]
  }
}

