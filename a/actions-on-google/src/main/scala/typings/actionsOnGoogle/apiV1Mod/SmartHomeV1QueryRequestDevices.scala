package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartHomeV1QueryRequestDevices extends js.Object {
  var customData: js.UndefOr[ApiClientObjectMap[_]] = js.native
  var id: String = js.native
}

object SmartHomeV1QueryRequestDevices {
  @scala.inline
  def apply(id: String): SmartHomeV1QueryRequestDevices = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1QueryRequestDevices]
  }
  @scala.inline
  implicit class SmartHomeV1QueryRequestDevicesOps[Self <: SmartHomeV1QueryRequestDevices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomData(value: ApiClientObjectMap[_]): Self = this.set("customData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
  }
  
}

