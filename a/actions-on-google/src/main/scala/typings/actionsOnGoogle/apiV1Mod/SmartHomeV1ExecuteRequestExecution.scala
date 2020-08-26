package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.anon.Ack
import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartHomeV1ExecuteRequestExecution extends js.Object {
  var challenge: js.UndefOr[Ack] = js.native
  var command: String = js.native
  var params: ApiClientObjectMap[_] = js.native
}

object SmartHomeV1ExecuteRequestExecution {
  @scala.inline
  def apply(command: String, params: ApiClientObjectMap[_]): SmartHomeV1ExecuteRequestExecution = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteRequestExecution]
  }
  @scala.inline
  implicit class SmartHomeV1ExecuteRequestExecutionOps[Self <: SmartHomeV1ExecuteRequestExecution] (val x: Self) extends AnyVal {
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
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: ApiClientObjectMap[_]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setChallenge(value: Ack): Self = this.set("challenge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChallenge: Self = this.set("challenge", js.undefined)
  }
  
}

