package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1SyncRequestInputs extends js.Object {
  
  var intent: SmartHomeV1Intents = js.native
}
object SmartHomeV1SyncRequestInputs {
  
  @scala.inline
  def apply(intent: SmartHomeV1Intents): SmartHomeV1SyncRequestInputs = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncRequestInputs]
  }
  
  @scala.inline
  implicit class SmartHomeV1SyncRequestInputsOps[Self <: SmartHomeV1SyncRequestInputs] (val x: Self) extends AnyVal {
    
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
  }
}
