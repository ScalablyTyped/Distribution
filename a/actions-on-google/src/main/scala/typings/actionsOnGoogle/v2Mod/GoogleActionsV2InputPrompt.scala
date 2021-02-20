package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2InputPrompt extends StObject {
  
  /**
    * Initial prompts asking user to provide an input.
    * Only a single initial_prompt is supported.
    */
  var initialPrompts: js.UndefOr[js.Array[GoogleActionsV2SpeechResponse]] = js.native
  
  /**
    * Prompt used to ask user when there is no input from user.
    */
  var noInputPrompts: js.UndefOr[js.Array[GoogleActionsV2SimpleResponse]] = js.native
  
  /**
    * Prompt payload.
    */
  var richInitialPrompt: js.UndefOr[GoogleActionsV2RichResponse] = js.native
}
object GoogleActionsV2InputPrompt {
  
  @scala.inline
  def apply(): GoogleActionsV2InputPrompt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2InputPrompt]
  }
  
  @scala.inline
  implicit class GoogleActionsV2InputPromptMutableBuilder[Self <: GoogleActionsV2InputPrompt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialPrompts(value: js.Array[GoogleActionsV2SpeechResponse]): Self = StObject.set(x, "initialPrompts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialPromptsUndefined: Self = StObject.set(x, "initialPrompts", js.undefined)
    
    @scala.inline
    def setInitialPromptsVarargs(value: GoogleActionsV2SpeechResponse*): Self = StObject.set(x, "initialPrompts", js.Array(value :_*))
    
    @scala.inline
    def setNoInputPrompts(value: js.Array[GoogleActionsV2SimpleResponse]): Self = StObject.set(x, "noInputPrompts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoInputPromptsUndefined: Self = StObject.set(x, "noInputPrompts", js.undefined)
    
    @scala.inline
    def setNoInputPromptsVarargs(value: GoogleActionsV2SimpleResponse*): Self = StObject.set(x, "noInputPrompts", js.Array(value :_*))
    
    @scala.inline
    def setRichInitialPrompt(value: GoogleActionsV2RichResponse): Self = StObject.set(x, "richInitialPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRichInitialPromptUndefined: Self = StObject.set(x, "richInitialPrompt", js.undefined)
  }
}
