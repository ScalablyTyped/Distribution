package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceRegistrationParams extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var deviceId: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var state: js.UndefOr[DevicePushState] = js.undefined
}

object DeviceRegistrationParams {
  @scala.inline
  def apply(
    clientId: String = null,
    deviceId: String = null,
    limit: js.UndefOr[Double] = js.undefined,
    state: DevicePushState = null
  ): DeviceRegistrationParams = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceRegistrationParams]
  }
}

