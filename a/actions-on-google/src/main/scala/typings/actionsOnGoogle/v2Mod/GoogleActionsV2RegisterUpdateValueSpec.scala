package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2RegisterUpdateValueSpec extends js.Object {
  
  /**
    * The list of arguments to necessary to fulfill an update.
    */
  var arguments: js.UndefOr[js.Array[GoogleActionsV2Argument]] = js.native
  
  /**
    * The intent that the user wants to get updates from.
    */
  var intent: js.UndefOr[String] = js.native
  
  /**
    * The trigger context that defines how the update will be triggered.
    * This may modify the dialog in order to narrow down the user's preferences
    * for getting his or her updates.
    */
  var triggerContext: js.UndefOr[GoogleActionsV2TriggerContext] = js.native
}
object GoogleActionsV2RegisterUpdateValueSpec {
  
  @scala.inline
  def apply(): GoogleActionsV2RegisterUpdateValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2RegisterUpdateValueSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2RegisterUpdateValueSpecOps[Self <: GoogleActionsV2RegisterUpdateValueSpec] (val x: Self) extends AnyVal {
    
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
    def setArgumentsVarargs(value: GoogleActionsV2Argument*): Self = this.set("arguments", js.Array(value :_*))
    
    @scala.inline
    def setArguments(value: js.Array[GoogleActionsV2Argument]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    
    @scala.inline
    def setIntent(value: String): Self = this.set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntent: Self = this.set("intent", js.undefined)
    
    @scala.inline
    def setTriggerContext(value: GoogleActionsV2TriggerContext): Self = this.set("triggerContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerContext: Self = this.set("triggerContext", js.undefined)
  }
}
