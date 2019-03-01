package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushChannelSubscriptionParams extends js.Object {
  var channel: js.UndefOr[java.lang.String] = js.undefined
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
}

object PushChannelSubscriptionParams {
  @scala.inline
  def apply(
    channel: java.lang.String = null,
    clientId: java.lang.String = null,
    deviceId: java.lang.String = null,
    limit: scala.Int | scala.Double = null
  ): PushChannelSubscriptionParams = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushChannelSubscriptionParams]
  }
}

