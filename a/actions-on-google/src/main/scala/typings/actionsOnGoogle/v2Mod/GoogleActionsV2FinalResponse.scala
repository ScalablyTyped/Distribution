package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2FinalResponse extends StObject {
  
  /**
    * Rich response when user is not required to provide an input.
    */
  var richResponse: js.UndefOr[GoogleActionsV2RichResponse] = js.undefined
  
  /**
    * Spoken response when user is not required to provide an input.
    */
  var speechResponse: js.UndefOr[GoogleActionsV2SpeechResponse] = js.undefined
}
object GoogleActionsV2FinalResponse {
  
  inline def apply(): GoogleActionsV2FinalResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2FinalResponse]
  }
  
  extension [Self <: GoogleActionsV2FinalResponse](x: Self) {
    
    inline def setRichResponse(value: GoogleActionsV2RichResponse): Self = StObject.set(x, "richResponse", value.asInstanceOf[js.Any])
    
    inline def setRichResponseUndefined: Self = StObject.set(x, "richResponse", js.undefined)
    
    inline def setSpeechResponse(value: GoogleActionsV2SpeechResponse): Self = StObject.set(x, "speechResponse", value.asInstanceOf[js.Any])
    
    inline def setSpeechResponseUndefined: Self = StObject.set(x, "speechResponse", js.undefined)
  }
}
