package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1ExecuteRequestInputs extends js.Object {
  
  var intent: SmartHomeV1Intents = js.native
  
  var payload: SmartHomeV1ExecuteRequestPayload = js.native
}
object SmartHomeV1ExecuteRequestInputs {
  
  @scala.inline
  def apply(intent: SmartHomeV1Intents, payload: SmartHomeV1ExecuteRequestPayload): SmartHomeV1ExecuteRequestInputs = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteRequestInputs]
  }
  
  @scala.inline
  implicit class SmartHomeV1ExecuteRequestInputsOps[Self <: SmartHomeV1ExecuteRequestInputs] (val x: Self) extends AnyVal {
    
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
    def setPayload(value: SmartHomeV1ExecuteRequestPayload): Self = this.set("payload", value.asInstanceOf[js.Any])
  }
}
