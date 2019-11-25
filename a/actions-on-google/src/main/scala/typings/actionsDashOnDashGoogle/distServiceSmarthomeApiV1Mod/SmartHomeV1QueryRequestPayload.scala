package typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1QueryRequestPayload extends js.Object {
  var devices: js.Array[SmartHomeV1QueryRequestDevices]
}

object SmartHomeV1QueryRequestPayload {
  @scala.inline
  def apply(devices: js.Array[SmartHomeV1QueryRequestDevices]): SmartHomeV1QueryRequestPayload = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SmartHomeV1QueryRequestPayload]
  }
}

