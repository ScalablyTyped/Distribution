package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2TriggerContext extends js.Object {
  
  /**
    * The time context for which the update can be triggered.
    */
  var timeContext: js.UndefOr[GoogleActionsV2TriggerContextTimeContext] = js.native
}
object GoogleActionsV2TriggerContext {
  
  @scala.inline
  def apply(): GoogleActionsV2TriggerContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2TriggerContext]
  }
  
  @scala.inline
  implicit class GoogleActionsV2TriggerContextOps[Self <: GoogleActionsV2TriggerContext] (val x: Self) extends AnyVal {
    
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
    def setTimeContext(value: GoogleActionsV2TriggerContextTimeContext): Self = this.set("timeContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeContext: Self = this.set("timeContext", js.undefined)
  }
}
