package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectSyntaxRequest extends StObject {
  
  /**
    * The language code of the input documents. You can specify any of the following languages supported by Amazon Comprehend: German ("de"), English ("en"), Spanish ("es"), French ("fr"), Italian ("it"), or Portuguese ("pt").
    */
  var LanguageCode: SyntaxLanguageCode
  
  /**
    * A UTF-8 string. The maximum string size is 5 KB.
    */
  var Text: CustomerInputString
}
object DetectSyntaxRequest {
  
  inline def apply(LanguageCode: SyntaxLanguageCode, Text: CustomerInputString): DetectSyntaxRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectSyntaxRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectSyntaxRequest] (val x: Self) extends AnyVal {
    
    inline def setLanguageCode(value: SyntaxLanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setText(value: CustomerInputString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
