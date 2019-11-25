package typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod

import typings.actionsDashOnDashGoogle.Anon_Ack
import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1ExecuteRequestExecution extends js.Object {
  var challenge: js.UndefOr[Anon_Ack] = js.undefined
  var command: String
  var params: ApiClientObjectMap[_]
}

object SmartHomeV1ExecuteRequestExecution {
  @scala.inline
  def apply(command: String, params: ApiClientObjectMap[_], challenge: Anon_Ack = null): SmartHomeV1ExecuteRequestExecution = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    if (challenge != null) __obj.updateDynamic("challenge")(challenge.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteRequestExecution]
  }
}

