package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2ExpectedInput extends StObject {
  
  /**
    * The customized prompt used to ask user for input.
    */
  var inputPrompt: js.UndefOr[GoogleActionsV2InputPrompt] = js.undefined
  
  /**
    * List of intents that can be used to fulfill this input.
    * To have Actions on Google just return the raw user input, the app
    * should ask for the `actions.intent.TEXT` intent.
    */
  var possibleIntents: js.UndefOr[js.Array[GoogleActionsV2ExpectedIntent]] = js.undefined
  
  /**
    * List of phrases the Action wants Google to use for speech biasing.
    * Up to 1000 phrases are allowed.
    */
  var speechBiasingHints: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleActionsV2ExpectedInput {
  
  inline def apply(): GoogleActionsV2ExpectedInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2ExpectedInput]
  }
  
  extension [Self <: GoogleActionsV2ExpectedInput](x: Self) {
    
    inline def setInputPrompt(value: GoogleActionsV2InputPrompt): Self = StObject.set(x, "inputPrompt", value.asInstanceOf[js.Any])
    
    inline def setInputPromptUndefined: Self = StObject.set(x, "inputPrompt", js.undefined)
    
    inline def setPossibleIntents(value: js.Array[GoogleActionsV2ExpectedIntent]): Self = StObject.set(x, "possibleIntents", value.asInstanceOf[js.Any])
    
    inline def setPossibleIntentsUndefined: Self = StObject.set(x, "possibleIntents", js.undefined)
    
    inline def setPossibleIntentsVarargs(value: GoogleActionsV2ExpectedIntent*): Self = StObject.set(x, "possibleIntents", js.Array(value :_*))
    
    inline def setSpeechBiasingHints(value: js.Array[String]): Self = StObject.set(x, "speechBiasingHints", value.asInstanceOf[js.Any])
    
    inline def setSpeechBiasingHintsUndefined: Self = StObject.set(x, "speechBiasingHints", js.undefined)
    
    inline def setSpeechBiasingHintsVarargs(value: String*): Self = StObject.set(x, "speechBiasingHints", js.Array(value :_*))
  }
}
