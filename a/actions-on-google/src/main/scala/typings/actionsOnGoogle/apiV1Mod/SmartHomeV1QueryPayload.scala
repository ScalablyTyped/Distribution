package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1QueryPayload extends js.Object {
  var devices: ApiClientObjectMap[_]
}

object SmartHomeV1QueryPayload {
  @scala.inline
  def apply(devices: ApiClientObjectMap[_]): SmartHomeV1QueryPayload = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SmartHomeV1QueryPayload]
  }
}

