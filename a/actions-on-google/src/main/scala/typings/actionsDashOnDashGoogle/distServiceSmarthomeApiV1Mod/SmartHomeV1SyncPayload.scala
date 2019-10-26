package typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1SyncPayload extends js.Object {
  var agentUserId: js.UndefOr[String] = js.undefined
  var debugString: js.UndefOr[String] = js.undefined
  var devices: js.Array[SmartHomeV1SyncDevices]
  var errorCode: js.UndefOr[String] = js.undefined
}

object SmartHomeV1SyncPayload {
  @scala.inline
  def apply(
    devices: js.Array[SmartHomeV1SyncDevices],
    agentUserId: String = null,
    debugString: String = null,
    errorCode: String = null
  ): SmartHomeV1SyncPayload = {
    val __obj = js.Dynamic.literal(devices = devices)
    if (agentUserId != null) __obj.updateDynamic("agentUserId")(agentUserId)
    if (debugString != null) __obj.updateDynamic("debugString")(debugString)
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode)
    __obj.asInstanceOf[SmartHomeV1SyncPayload]
  }
}

