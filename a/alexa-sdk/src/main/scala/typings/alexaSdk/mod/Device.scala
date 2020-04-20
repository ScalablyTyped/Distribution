package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var deviceId: String
  var supportedInterfaces: DeviceInterfaces
}

object Device {
  @scala.inline
  def apply(deviceId: String, supportedInterfaces: DeviceInterfaces): Device = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], supportedInterfaces = supportedInterfaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

