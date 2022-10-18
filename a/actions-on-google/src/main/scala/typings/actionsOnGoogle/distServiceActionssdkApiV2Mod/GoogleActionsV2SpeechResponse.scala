package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2SpeechResponse extends StObject {
  
  /**
    * Structured spoken response to the user in the SSML format, e.g.
    * \"<speak> Say animal name after the sound.  <audio src =
    * 'https://www.pullstring.com/moo.mps' />, what’s the animal?  </speak>\".
    * Mutually exclusive with text_to_speech.
    */
  var ssml: js.UndefOr[String] = js.undefined
  
  /**
    * Plain text of the speech output, e.g., \"where do you want to go?\"/
    */
  var textToSpeech: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2SpeechResponse {
  
  inline def apply(): GoogleActionsV2SpeechResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2SpeechResponse]
  }
  
  extension [Self <: GoogleActionsV2SpeechResponse](x: Self) {
    
    inline def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
    
    inline def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
    
    inline def setTextToSpeech(value: String): Self = StObject.set(x, "textToSpeech", value.asInstanceOf[js.Any])
    
    inline def setTextToSpeechUndefined: Self = StObject.set(x, "textToSpeech", js.undefined)
  }
}
