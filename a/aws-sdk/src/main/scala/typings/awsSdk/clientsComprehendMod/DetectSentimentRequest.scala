package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectSentimentRequest extends StObject {
  
  /**
    * The language of the input documents. You can specify any of the primary languages supported by Amazon Comprehend. All documents must be in the same language.
    */
  var LanguageCode: typings.awsSdk.clientsComprehendMod.LanguageCode
  
  /**
    * A UTF-8 text string. The maximum string size is 5 KB.  Amazon Comprehend performs real-time sentiment analysis on the first 500 characters of the input text and ignores any additional text in the input. 
    */
  var Text: CustomerInputString
}
object DetectSentimentRequest {
  
  inline def apply(LanguageCode: LanguageCode, Text: CustomerInputString): DetectSentimentRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectSentimentRequest]
  }
  
  extension [Self <: DetectSentimentRequest](x: Self) {
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setText(value: CustomerInputString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
