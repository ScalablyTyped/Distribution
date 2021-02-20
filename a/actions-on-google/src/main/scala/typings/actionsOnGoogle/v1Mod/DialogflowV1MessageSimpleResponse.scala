package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.google
import typings.actionsOnGoogle.actionsOnGoogleStrings.simple_response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1MessageSimpleResponse
  extends DialogflowV1BaseGoogleMessage[simple_response]
     with DialogflowV1Message {
  
  var displayText: js.UndefOr[String] = js.native
  
  var textToSpeech: js.UndefOr[String] = js.native
}
object DialogflowV1MessageSimpleResponse {
  
  @scala.inline
  def apply(platform: google): DialogflowV1MessageSimpleResponse = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageSimpleResponse]
  }
  
  @scala.inline
  implicit class DialogflowV1MessageSimpleResponseMutableBuilder[Self <: DialogflowV1MessageSimpleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
    
    @scala.inline
    def setTextToSpeech(value: String): Self = StObject.set(x, "textToSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextToSpeechUndefined: Self = StObject.set(x, "textToSpeech", js.undefined)
  }
}
