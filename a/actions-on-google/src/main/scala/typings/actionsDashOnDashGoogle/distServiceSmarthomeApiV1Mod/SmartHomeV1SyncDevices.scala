package typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1SyncDevices extends js.Object {
  var attributes: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  var customData: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  var deviceInfo: js.UndefOr[SmartHomeV1SyncDeviceInfo] = js.undefined
  var id: String
  var name: SmartHomeV1SyncName
  var otherDeviceIds: js.UndefOr[js.Array[SmartHomeV1SyncOtherDeviceIds]] = js.undefined
  var roomHint: js.UndefOr[String] = js.undefined
  var traits: js.Array[String]
  var `type`: String
  var willReportState: Boolean
}

object SmartHomeV1SyncDevices {
  @scala.inline
  def apply(
    id: String,
    name: SmartHomeV1SyncName,
    traits: js.Array[String],
    `type`: String,
    willReportState: Boolean,
    attributes: ApiClientObjectMap[_] = null,
    customData: ApiClientObjectMap[_] = null,
    deviceInfo: SmartHomeV1SyncDeviceInfo = null,
    otherDeviceIds: js.Array[SmartHomeV1SyncOtherDeviceIds] = null,
    roomHint: String = null
  ): SmartHomeV1SyncDevices = {
    val __obj = js.Dynamic.literal(id = id, name = name, traits = traits, willReportState = willReportState)
    __obj.updateDynamic("type")(`type`)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (customData != null) __obj.updateDynamic("customData")(customData)
    if (deviceInfo != null) __obj.updateDynamic("deviceInfo")(deviceInfo)
    if (otherDeviceIds != null) __obj.updateDynamic("otherDeviceIds")(otherDeviceIds)
    if (roomHint != null) __obj.updateDynamic("roomHint")(roomHint)
    __obj.asInstanceOf[SmartHomeV1SyncDevices]
  }
}

