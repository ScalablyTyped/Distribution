package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSeverityLevelsRequest extends StObject {
  
  /**
    * The language in which Amazon Web Services Support handles the case. Amazon Web Services Support currently supports Chinese (“zh”), English ("en"), Japanese ("ja") and Korean (“ko”). You must specify the ISO 639-1 code for the language parameter if you want support in that language.
    */
  var language: js.UndefOr[Language] = js.undefined
}
object DescribeSeverityLevelsRequest {
  
  inline def apply(): DescribeSeverityLevelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSeverityLevelsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSeverityLevelsRequest] (val x: Self) extends AnyVal {
    
    inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}
