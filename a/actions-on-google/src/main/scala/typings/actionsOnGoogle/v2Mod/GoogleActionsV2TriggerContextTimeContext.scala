package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2TriggerContextTimeContext extends js.Object {
  
  /**
    * The high-level frequency of the recurring update.
    */
  var frequency: js.UndefOr[GoogleActionsV2TriggerContextTimeContextFrequency] = js.native
}
object GoogleActionsV2TriggerContextTimeContext {
  
  @scala.inline
  def apply(): GoogleActionsV2TriggerContextTimeContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2TriggerContextTimeContext]
  }
  
  @scala.inline
  implicit class GoogleActionsV2TriggerContextTimeContextOps[Self <: GoogleActionsV2TriggerContextTimeContext] (val x: Self) extends AnyVal {
    
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
    def setFrequency(value: GoogleActionsV2TriggerContextTimeContextFrequency): Self = this.set("frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
  }
}
