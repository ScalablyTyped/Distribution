package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2InputPrompt extends StObject {
  
  /**
    * Initial prompts asking user to provide an input.
    * Only a single initial_prompt is supported.
    */
  var initialPrompts: js.UndefOr[js.Array[GoogleActionsV2SpeechResponse]] = js.undefined
  
  /**
    * Prompt used to ask user when there is no input from user.
    */
  var noInputPrompts: js.UndefOr[js.Array[GoogleActionsV2SimpleResponse]] = js.undefined
  
  /**
    * Prompt payload.
    */
  var richInitialPrompt: js.UndefOr[GoogleActionsV2RichResponse] = js.undefined
}
object GoogleActionsV2InputPrompt {
  
  inline def apply(): GoogleActionsV2InputPrompt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2InputPrompt]
  }
  
  extension [Self <: GoogleActionsV2InputPrompt](x: Self) {
    
    inline def setInitialPrompts(value: js.Array[GoogleActionsV2SpeechResponse]): Self = StObject.set(x, "initialPrompts", value.asInstanceOf[js.Any])
    
    inline def setInitialPromptsUndefined: Self = StObject.set(x, "initialPrompts", js.undefined)
    
    inline def setInitialPromptsVarargs(value: GoogleActionsV2SpeechResponse*): Self = StObject.set(x, "initialPrompts", js.Array(value*))
    
    inline def setNoInputPrompts(value: js.Array[GoogleActionsV2SimpleResponse]): Self = StObject.set(x, "noInputPrompts", value.asInstanceOf[js.Any])
    
    inline def setNoInputPromptsUndefined: Self = StObject.set(x, "noInputPrompts", js.undefined)
    
    inline def setNoInputPromptsVarargs(value: GoogleActionsV2SimpleResponse*): Self = StObject.set(x, "noInputPrompts", js.Array(value*))
    
    inline def setRichInitialPrompt(value: GoogleActionsV2RichResponse): Self = StObject.set(x, "richInitialPrompt", value.asInstanceOf[js.Any])
    
    inline def setRichInitialPromptUndefined: Self = StObject.set(x, "richInitialPrompt", js.undefined)
  }
}
