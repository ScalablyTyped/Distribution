package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelledSpotInstanceRequest extends js.Object {
  /**
    * The ID of the Spot Instance request.
    */
  var SpotInstanceRequestId: js.UndefOr[String] = js.undefined
  /**
    * The state of the Spot Instance request.
    */
  var State: js.UndefOr[CancelSpotInstanceRequestState] = js.undefined
}

object CancelledSpotInstanceRequest {
  @scala.inline
  def apply(SpotInstanceRequestId: String = null, State: CancelSpotInstanceRequestState = null): CancelledSpotInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (SpotInstanceRequestId != null) __obj.updateDynamic("SpotInstanceRequestId")(SpotInstanceRequestId)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelledSpotInstanceRequest]
  }
}

