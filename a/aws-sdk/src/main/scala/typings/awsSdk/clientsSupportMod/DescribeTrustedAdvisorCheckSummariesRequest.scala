package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrustedAdvisorCheckSummariesRequest extends StObject {
  
  /**
    * The IDs of the Trusted Advisor checks.
    */
  var checkIds: StringList
}
object DescribeTrustedAdvisorCheckSummariesRequest {
  
  inline def apply(checkIds: StringList): DescribeTrustedAdvisorCheckSummariesRequest = {
    val __obj = js.Dynamic.literal(checkIds = checkIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckSummariesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTrustedAdvisorCheckSummariesRequest] (val x: Self) extends AnyVal {
    
    inline def setCheckIds(value: StringList): Self = StObject.set(x, "checkIds", value.asInstanceOf[js.Any])
    
    inline def setCheckIdsVarargs(value: String*): Self = StObject.set(x, "checkIds", js.Array(value*))
  }
}
