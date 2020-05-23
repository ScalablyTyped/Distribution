package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceState extends js.Object {
  var deviceName: String
  var deviceState: String
}

object DeviceState {
  @scala.inline
  def apply(deviceName: String, deviceState: String): DeviceState = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], deviceState = deviceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceState]
  }
}

