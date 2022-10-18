package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import typings.actionsOnGoogle.distCommonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2Input extends StObject {
  
  /**
    * A list of provided argument values for the input requested by the Action.
    */
  var arguments: js.UndefOr[js.Array[GoogleActionsV2Argument]] = js.undefined
  
  /**
    * Opaque context set in the interactive canvas web app for all subsequent
    * intents
    */
  var canvasState: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
  
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
  var intent: js.UndefOr[String] = js.undefined
  
  /**
    * Raw input transcription from each turn of conversation.
    * Multiple conversation turns may be required for Actions on Google to
    * provide some types of input to the Action.
    */
  var rawInputs: js.UndefOr[js.Array[GoogleActionsV2RawInput]] = js.undefined
}
object GoogleActionsV2Input {
  
  inline def apply(): GoogleActionsV2Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Input]
  }
  
  extension [Self <: GoogleActionsV2Input](x: Self) {
    
    inline def setArguments(value: js.Array[GoogleActionsV2Argument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArgumentsVarargs(value: GoogleActionsV2Argument*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setCanvasState(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "canvasState", value.asInstanceOf[js.Any])
    
    inline def setCanvasStateUndefined: Self = StObject.set(x, "canvasState", js.undefined)
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setRawInputs(value: js.Array[GoogleActionsV2RawInput]): Self = StObject.set(x, "rawInputs", value.asInstanceOf[js.Any])
    
    inline def setRawInputsUndefined: Self = StObject.set(x, "rawInputs", js.undefined)
    
    inline def setRawInputsVarargs(value: GoogleActionsV2RawInput*): Self = StObject.set(x, "rawInputs", js.Array(value*))
  }
}
