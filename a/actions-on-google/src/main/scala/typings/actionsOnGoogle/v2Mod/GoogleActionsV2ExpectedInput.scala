package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2ExpectedInput extends js.Object {
  
  /**
    * The customized prompt used to ask user for input.
    */
  var inputPrompt: js.UndefOr[GoogleActionsV2InputPrompt] = js.native
  
  /**
    * List of intents that can be used to fulfill this input.
    * To have Actions on Google just return the raw user input, the app
    * should ask for the `actions.intent.TEXT` intent.
    */
  var possibleIntents: js.UndefOr[js.Array[GoogleActionsV2ExpectedIntent]] = js.native
  
  /**
    * List of phrases the Action wants Google to use for speech biasing.
    * Up to 1000 phrases are allowed.
    */
  var speechBiasingHints: js.UndefOr[js.Array[String]] = js.native
}
object GoogleActionsV2ExpectedInput {
  
  @scala.inline
  def apply(): GoogleActionsV2ExpectedInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2ExpectedInput]
  }
  
  @scala.inline
  implicit class GoogleActionsV2ExpectedInputOps[Self <: GoogleActionsV2ExpectedInput] (val x: Self) extends AnyVal {
    
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
    def setInputPrompt(value: GoogleActionsV2InputPrompt): Self = this.set("inputPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputPrompt: Self = this.set("inputPrompt", js.undefined)
    
    @scala.inline
    def setPossibleIntentsVarargs(value: GoogleActionsV2ExpectedIntent*): Self = this.set("possibleIntents", js.Array(value :_*))
    
    @scala.inline
    def setPossibleIntents(value: js.Array[GoogleActionsV2ExpectedIntent]): Self = this.set("possibleIntents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePossibleIntents: Self = this.set("possibleIntents", js.undefined)
    
    @scala.inline
    def setSpeechBiasingHintsVarargs(value: String*): Self = this.set("speechBiasingHints", js.Array(value :_*))
    
    @scala.inline
    def setSpeechBiasingHints(value: js.Array[String]): Self = this.set("speechBiasingHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeechBiasingHints: Self = this.set("speechBiasingHints", js.undefined)
  }
}
