package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrustedAdvisorCheckResultRequest extends StObject {
  
  /**
    * The unique identifier for the Trusted Advisor check.
    */
  var checkId: String
  
  /**
    * The ISO 639-1 code for the language in which Amazon Web Services provides support. Amazon Web Services Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[String] = js.undefined
}
object DescribeTrustedAdvisorCheckResultRequest {
  
  inline def apply(checkId: String): DescribeTrustedAdvisorCheckResultRequest = {
    val __obj = js.Dynamic.literal(checkId = checkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckResultRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTrustedAdvisorCheckResultRequest] (val x: Self) extends AnyVal {
    
    inline def setCheckId(value: String): Self = StObject.set(x, "checkId", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}
