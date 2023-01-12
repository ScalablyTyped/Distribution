package typings.awsSdk.clientsPinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlainTextMessageType extends StObject {
  
  /**
    * The language to use when delivering the message. For a complete list of supported languages, see the Amazon Polly Developer Guide.
    */
  var LanguageCode: js.UndefOr[String] = js.undefined
  
  /**
    * The plain (not SSML-formatted) text to deliver to the recipient.
    */
  var Text: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the voice that you want to use to deliver the message. For a complete list of supported voices, see the Amazon Polly Developer Guide.
    */
  var VoiceId: js.UndefOr[String] = js.undefined
}
object PlainTextMessageType {
  
  inline def apply(): PlainTextMessageType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlainTextMessageType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlainTextMessageType] (val x: Self) extends AnyVal {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setText(value: NonEmptyString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    inline def setVoiceId(value: String): Self = StObject.set(x, "VoiceId", value.asInstanceOf[js.Any])
    
    inline def setVoiceIdUndefined: Self = StObject.set(x, "VoiceId", js.undefined)
  }
}
