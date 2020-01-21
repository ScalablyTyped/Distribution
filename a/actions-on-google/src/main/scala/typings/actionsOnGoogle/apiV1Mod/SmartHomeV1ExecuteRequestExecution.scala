package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.AnonAck
import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1ExecuteRequestExecution extends js.Object {
  var challenge: js.UndefOr[AnonAck] = js.undefined
  var command: String
  var params: ApiClientObjectMap[_]
}

object SmartHomeV1ExecuteRequestExecution {
  @scala.inline
  def apply(command: String, params: ApiClientObjectMap[_], challenge: AnonAck = null): SmartHomeV1ExecuteRequestExecution = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    if (challenge != null) __obj.updateDynamic("challenge")(challenge.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteRequestExecution]
  }
}

