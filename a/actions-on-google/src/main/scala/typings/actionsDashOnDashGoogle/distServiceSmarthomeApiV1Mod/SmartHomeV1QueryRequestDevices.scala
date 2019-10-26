package typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1QueryRequestDevices extends js.Object {
  var customData: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  var id: String
}

object SmartHomeV1QueryRequestDevices {
  @scala.inline
  def apply(id: String, customData: ApiClientObjectMap[_] = null): SmartHomeV1QueryRequestDevices = {
    val __obj = js.Dynamic.literal(id = id)
    if (customData != null) __obj.updateDynamic("customData")(customData)
    __obj.asInstanceOf[SmartHomeV1QueryRequestDevices]
  }
}

