package typings.accedoAccedoOne.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceId extends js.Object {
  var deviceId: String
  var sessionKey: String
}

object DeviceId {
  @scala.inline
  def apply(deviceId: String, sessionKey: String): DeviceId = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], sessionKey = sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceId]
  }
}

