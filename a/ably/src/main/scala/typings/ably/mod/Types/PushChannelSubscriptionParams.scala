package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushChannelSubscriptionParams extends js.Object {
  var channel: js.UndefOr[String] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  var deviceId: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
}

object PushChannelSubscriptionParams {
  @scala.inline
  def apply(
    channel: String = null,
    clientId: String = null,
    deviceId: String = null,
    limit: js.UndefOr[Double] = js.undefined
  ): PushChannelSubscriptionParams = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushChannelSubscriptionParams]
  }
}

