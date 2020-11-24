package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2Input extends js.Object {
  
  /**
    * A list of provided argument values for the input requested by the Action.
    */
  var arguments: js.UndefOr[js.Array[GoogleActionsV2Argument]] = js.native
  
  /**
    * Opaque context set in the interactive canvas web app for all subsequent
    * intents
    */
  var canvasState: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  /**
    * Indicates the user's intent. For the first conversation turn, the intent
    * will refer to the triggering intent for the Action. For
    * subsequent conversation turns, the intent will be a common Actions on
    * Google intent (starts with 'actions.').
    * For example, if the expected input is `actions.intent.OPTION`, then the
    * the intent specified here will either be `actions.intent.OPTION` if the
    * Google Assistant was able to satisfy that intent, or
    * `actions.intent.TEXT` if the user provided other information.
    * See https://developers.google.com/actions/reference/rest/intents.
    */
  var intent: js.UndefOr[String] = js.native
  
  /**
    * Raw input transcription from each turn of conversation.
    * Multiple conversation turns may be required for Actions on Google to
    * provide some types of input to the Action.
    */
  var rawInputs: js.UndefOr[js.Array[GoogleActionsV2RawInput]] = js.native
}
object GoogleActionsV2Input {
  
  @scala.inline
  def apply(): GoogleActionsV2Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Input]
  }
  
  @scala.inline
  implicit class GoogleActionsV2InputOps[Self <: GoogleActionsV2Input] (val x: Self) extends AnyVal {
    
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
    def setCanvasState(value: ApiClientObjectMap[_]): Self = this.set("canvasState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvasState: Self = this.set("canvasState", js.undefined)
    
    @scala.inline
    def setIntent(value: String): Self = this.set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntent: Self = this.set("intent", js.undefined)
    
    @scala.inline
    def setRawInputsVarargs(value: GoogleActionsV2RawInput*): Self = this.set("rawInputs", js.Array(value :_*))
    
    @scala.inline
    def setRawInputs(value: js.Array[GoogleActionsV2RawInput]): Self = this.set("rawInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawInputs: Self = this.set("rawInputs", js.undefined)
  }
}
