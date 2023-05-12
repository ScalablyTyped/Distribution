package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrustedAdvisorChecksRequest extends StObject {
  
  /**
    * The ISO 639-1 code for the language that you want your checks to appear in. The Amazon Web Services Support API currently supports the following languages for Trusted Advisor:   Chinese, Simplified - zh    Chinese, Traditional - zh_TW    English - en    French - fr    German - de    Indonesian - id    Italian - it    Japanese - ja    Korean - ko    Portuguese, Brazilian - pt_BR    Spanish - es   
    */
  var language: String
}
object DescribeTrustedAdvisorChecksRequest {
  
  inline def apply(language: String): DescribeTrustedAdvisorChecksRequest = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorChecksRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTrustedAdvisorChecksRequest] (val x: Self) extends AnyVal {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
  }
}
