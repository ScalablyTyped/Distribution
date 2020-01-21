package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1ExecutePayload extends js.Object {
  var commands: js.Array[SmartHomeV1ExecuteResponseCommands]
  var debugString: js.UndefOr[String] = js.undefined
  var errorCode: js.UndefOr[SmartHomeV1ExecuteErrors] = js.undefined
}

object SmartHomeV1ExecutePayload {
  @scala.inline
  def apply(
    commands: js.Array[SmartHomeV1ExecuteResponseCommands],
    debugString: String = null,
    errorCode: SmartHomeV1ExecuteErrors = null
  ): SmartHomeV1ExecutePayload = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    if (debugString != null) __obj.updateDynamic("debugString")(debugString.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecutePayload]
  }
}

