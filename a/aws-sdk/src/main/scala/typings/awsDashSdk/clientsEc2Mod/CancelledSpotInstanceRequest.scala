package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelledSpotInstanceRequest extends js.Object {
  /**
    * The ID of the Spot Instance request.
    */
  var SpotInstanceRequestId: js.UndefOr[String] = js.native
  /**
    * The state of the Spot Instance request.
    */
  var State: js.UndefOr[CancelSpotInstanceRequestState] = js.native
}

object CancelledSpotInstanceRequest {
  @scala.inline
  def apply(SpotInstanceRequestId: String = null, State: CancelSpotInstanceRequestState = null): CancelledSpotInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (SpotInstanceRequestId != null) __obj.updateDynamic("SpotInstanceRequestId")(SpotInstanceRequestId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelledSpotInstanceRequest]
  }
}

