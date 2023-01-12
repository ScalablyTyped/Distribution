package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrustedAdvisorCheckResultResponse extends StObject {
  
  /**
    * The detailed results of the Trusted Advisor check.
    */
  var result: js.UndefOr[TrustedAdvisorCheckResult] = js.undefined
}
object DescribeTrustedAdvisorCheckResultResponse {
  
  inline def apply(): DescribeTrustedAdvisorCheckResultResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckResultResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTrustedAdvisorCheckResultResponse] (val x: Self) extends AnyVal {
    
    inline def setResult(value: TrustedAdvisorCheckResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
