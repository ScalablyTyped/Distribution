package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2SimpleResponse extends StObject {
  
  /**
    * Optional text to display in the chat bubble. If not given, a display
    * rendering of the text_to_speech or ssml above will be used. Limited to 640
    * chars.
    */
  var displayText: js.UndefOr[String] = js.undefined
  
  /**
    * Structured spoken response to the user in the SSML format, e.g.
    * `<speak> Say animal name after the sound.  <audio src =
    * 'https://www.pullstring.com/moo.mps' />, what’s the animal?  </speak>`.
    * Mutually exclusive with text_to_speech.
    */
  var ssml: js.UndefOr[String] = js.undefined
  
  /**
    * Plain text of the speech output, e.g., \"where do you want to go?\"
    * Mutually exclusive with ssml.
    */
  var textToSpeech: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2SimpleResponse {
  
  inline def apply(): GoogleActionsV2SimpleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2SimpleResponse]
  }
  
  extension [Self <: GoogleActionsV2SimpleResponse](x: Self) {
    
    inline def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    inline def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
    
    inline def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
    
    inline def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
    
    inline def setTextToSpeech(value: String): Self = StObject.set(x, "textToSpeech", value.asInstanceOf[js.Any])
    
    inline def setTextToSpeechUndefined: Self = StObject.set(x, "textToSpeech", js.undefined)
  }
}
