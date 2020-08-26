package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartHomeV1SyncDevices extends js.Object {
  var attributes: js.UndefOr[ApiClientObjectMap[_]] = js.native
  var customData: js.UndefOr[ApiClientObjectMap[_]] = js.native
  var deviceInfo: js.UndefOr[SmartHomeV1SyncDeviceInfo] = js.native
  var id: String = js.native
  var name: SmartHomeV1SyncName = js.native
  var otherDeviceIds: js.UndefOr[js.Array[SmartHomeV1SyncOtherDeviceIds]] = js.native
  var roomHint: js.UndefOr[String] = js.native
  var traits: js.Array[String] = js.native
  var `type`: String = js.native
  var willReportState: Boolean = js.native
}

object SmartHomeV1SyncDevices {
  @scala.inline
  def apply(
    id: String,
    name: SmartHomeV1SyncName,
    traits: js.Array[String],
    `type`: String,
    willReportState: Boolean
  ): SmartHomeV1SyncDevices = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], traits = traits.asInstanceOf[js.Any], willReportState = willReportState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncDevices]
  }
  @scala.inline
  implicit class SmartHomeV1SyncDevicesOps[Self <: SmartHomeV1SyncDevices] (val x: Self) extends AnyVal {
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
    def setName(value: SmartHomeV1SyncName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTraitsVarargs(value: String*): Self = this.set("traits", js.Array(value :_*))
    @scala.inline
    def setTraits(value: js.Array[String]): Self = this.set("traits", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWillReportState(value: Boolean): Self = this.set("willReportState", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: ApiClientObjectMap[_]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setCustomData(value: ApiClientObjectMap[_]): Self = this.set("customData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
    @scala.inline
    def setDeviceInfo(value: SmartHomeV1SyncDeviceInfo): Self = this.set("deviceInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceInfo: Self = this.set("deviceInfo", js.undefined)
    @scala.inline
    def setOtherDeviceIdsVarargs(value: SmartHomeV1SyncOtherDeviceIds*): Self = this.set("otherDeviceIds", js.Array(value :_*))
    @scala.inline
    def setOtherDeviceIds(value: js.Array[SmartHomeV1SyncOtherDeviceIds]): Self = this.set("otherDeviceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherDeviceIds: Self = this.set("otherDeviceIds", js.undefined)
    @scala.inline
    def setRoomHint(value: String): Self = this.set("roomHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoomHint: Self = this.set("roomHint", js.undefined)
  }
  
}

