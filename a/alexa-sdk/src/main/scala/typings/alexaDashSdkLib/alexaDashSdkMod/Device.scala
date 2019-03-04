package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var deviceId: java.lang.String
  var supportedInterfaces: DeviceInterfaces
}

object Device {
  @scala.inline
  def apply(deviceId: java.lang.String, supportedInterfaces: DeviceInterfaces): Device = {
    val __obj = js.Dynamic.literal(deviceId = deviceId, supportedInterfaces = supportedInterfaces)
  
    __obj.asInstanceOf[Device]
  }
}

