package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrustedAdvisorCheckRefreshStatusesResponse extends StObject {
  
  /**
    * The refresh status of the specified Trusted Advisor checks.
    */
  var statuses: TrustedAdvisorCheckRefreshStatusList
}
object DescribeTrustedAdvisorCheckRefreshStatusesResponse {
  
  inline def apply(statuses: TrustedAdvisorCheckRefreshStatusList): DescribeTrustedAdvisorCheckRefreshStatusesResponse = {
    val __obj = js.Dynamic.literal(statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckRefreshStatusesResponse]
  }
  
  extension [Self <: DescribeTrustedAdvisorCheckRefreshStatusesResponse](x: Self) {
    
    inline def setStatuses(value: TrustedAdvisorCheckRefreshStatusList): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesVarargs(value: TrustedAdvisorCheckRefreshStatus*): Self = StObject.set(x, "statuses", js.Array(value*))
  }
}
