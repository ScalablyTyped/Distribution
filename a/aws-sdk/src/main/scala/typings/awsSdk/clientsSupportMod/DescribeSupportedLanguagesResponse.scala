package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSupportedLanguagesResponse extends StObject {
  
  /**
    *  A JSON-formatted array that contains the available ISO 639-1 language codes. 
    */
  var supportedLanguages: js.UndefOr[SupportedLanguagesList] = js.undefined
}
object DescribeSupportedLanguagesResponse {
  
  inline def apply(): DescribeSupportedLanguagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSupportedLanguagesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSupportedLanguagesResponse] (val x: Self) extends AnyVal {
    
    inline def setSupportedLanguages(value: SupportedLanguagesList): Self = StObject.set(x, "supportedLanguages", value.asInstanceOf[js.Any])
    
    inline def setSupportedLanguagesUndefined: Self = StObject.set(x, "supportedLanguages", js.undefined)
    
    inline def setSupportedLanguagesVarargs(value: SupportedLanguage*): Self = StObject.set(x, "supportedLanguages", js.Array(value*))
  }
}
