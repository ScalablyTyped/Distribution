package typings.ably.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushChannelSubscription extends js.Object {
  var channel: String
  var clientId: js.UndefOr[String] = js.undefined
  var deviceId: js.UndefOr[String] = js.undefined
}

object PushChannelSubscription {
  @scala.inline
  def apply(channel: String, clientId: String = null, deviceId: String = null): PushChannelSubscription = {
    val __obj = js.Dynamic.literal(channel = channel)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    __obj.asInstanceOf[PushChannelSubscription]
  }
}

