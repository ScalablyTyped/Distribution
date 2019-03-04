package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushChannelSubscription extends js.Object {
  var channel: java.lang.String
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
}

object PushChannelSubscription {
  @scala.inline
  def apply(channel: java.lang.String, clientId: java.lang.String = null, deviceId: java.lang.String = null): PushChannelSubscription = {
    val __obj = js.Dynamic.literal(channel = channel)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    __obj.asInstanceOf[PushChannelSubscription]
  }
}

