package typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1ExecuteRequestPayload extends js.Object {
  var commands: js.Array[SmartHomeV1ExecuteRequestCommands]
}

object SmartHomeV1ExecuteRequestPayload {
  @scala.inline
  def apply(commands: js.Array[SmartHomeV1ExecuteRequestCommands]): SmartHomeV1ExecuteRequestPayload = {
    val __obj = js.Dynamic.literal(commands = commands)
  
    __obj.asInstanceOf[SmartHomeV1ExecuteRequestPayload]
  }
}

