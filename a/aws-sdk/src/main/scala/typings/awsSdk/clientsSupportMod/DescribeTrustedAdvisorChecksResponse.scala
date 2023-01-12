package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrustedAdvisorChecksResponse extends StObject {
  
  /**
    * Information about all available Trusted Advisor checks.
    */
  var checks: TrustedAdvisorCheckList
}
object DescribeTrustedAdvisorChecksResponse {
  
  inline def apply(checks: TrustedAdvisorCheckList): DescribeTrustedAdvisorChecksResponse = {
    val __obj = js.Dynamic.literal(checks = checks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorChecksResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTrustedAdvisorChecksResponse] (val x: Self) extends AnyVal {
    
    inline def setChecks(value: TrustedAdvisorCheckList): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    inline def setChecksVarargs(value: TrustedAdvisorCheckDescription*): Self = StObject.set(x, "checks", js.Array(value*))
  }
}
