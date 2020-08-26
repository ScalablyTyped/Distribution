package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartHomeV1QueryRequestInputs extends js.Object {
  var intent: SmartHomeV1Intents = js.native
  var payload: SmartHomeV1QueryRequestPayload = js.native
}

object SmartHomeV1QueryRequestInputs {
  @scala.inline
  def apply(intent: SmartHomeV1Intents, payload: SmartHomeV1QueryRequestPayload): SmartHomeV1QueryRequestInputs = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1QueryRequestInputs]
  }
  @scala.inline
  implicit class SmartHomeV1QueryRequestInputsOps[Self <: SmartHomeV1QueryRequestInputs] (val x: Self) extends AnyVal {
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
    def setIntent(value: SmartHomeV1Intents): Self = this.set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: SmartHomeV1QueryRequestPayload): Self = this.set("payload", value.asInstanceOf[js.Any])
  }
  
}

