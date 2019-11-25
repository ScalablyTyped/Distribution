package typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1SyncOtherDeviceIds extends js.Object {
  var agentId: js.UndefOr[String] = js.undefined
  var deviceId: String
}

object SmartHomeV1SyncOtherDeviceIds {
  @scala.inline
  def apply(deviceId: String, agentId: String = null): SmartHomeV1SyncOtherDeviceIds = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    if (agentId != null) __obj.updateDynamic("agentId")(agentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncOtherDeviceIds]
  }
}

