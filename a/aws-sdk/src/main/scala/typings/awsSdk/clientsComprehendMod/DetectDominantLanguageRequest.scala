package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectDominantLanguageRequest extends StObject {
  
  /**
    * A UTF-8 text string. The string must contain at least 20 characters. The maximum string size is 100 KB.
    */
  var Text: CustomerInputString
}
object DetectDominantLanguageRequest {
  
  inline def apply(Text: CustomerInputString): DetectDominantLanguageRequest = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectDominantLanguageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectDominantLanguageRequest] (val x: Self) extends AnyVal {
    
    inline def setText(value: CustomerInputString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
