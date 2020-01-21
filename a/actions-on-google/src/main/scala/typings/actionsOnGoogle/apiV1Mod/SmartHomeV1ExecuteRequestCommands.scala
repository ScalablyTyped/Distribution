package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1ExecuteRequestCommands extends js.Object {
  var devices: js.Array[SmartHomeV1QueryRequestDevices]
  var execution: js.Array[SmartHomeV1ExecuteRequestExecution]
}

object SmartHomeV1ExecuteRequestCommands {
  @scala.inline
  def apply(
    devices: js.Array[SmartHomeV1QueryRequestDevices],
    execution: js.Array[SmartHomeV1ExecuteRequestExecution]
  ): SmartHomeV1ExecuteRequestCommands = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SmartHomeV1ExecuteRequestCommands]
  }
}

