package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.simple_response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1MessageSimpleResponse
  extends StObject
     with DialogflowV1BaseGoogleMessage[simple_response]
     with DialogflowV1Message {
  
  var displayText: js.UndefOr[String] = js.undefined
  
  var textToSpeech: js.UndefOr[String] = js.undefined
}
object DialogflowV1MessageSimpleResponse {
  
  inline def apply(): DialogflowV1MessageSimpleResponse = {
    val __obj = js.Dynamic.literal(platform = "google")
    __obj.asInstanceOf[DialogflowV1MessageSimpleResponse]
  }
  
  extension [Self <: DialogflowV1MessageSimpleResponse](x: Self) {
    
    inline def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    inline def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
    
    inline def setTextToSpeech(value: String): Self = StObject.set(x, "textToSpeech", value.asInstanceOf[js.Any])
    
    inline def setTextToSpeechUndefined: Self = StObject.set(x, "textToSpeech", js.undefined)
  }
}
