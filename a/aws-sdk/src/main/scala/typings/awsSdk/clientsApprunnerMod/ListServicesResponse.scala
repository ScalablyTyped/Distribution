package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServicesResponse extends StObject {
  
  /**
    * The token that you can pass in a subsequent request to get the next result page. It's returned in a paginated request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of service summary information records. In a paginated request, the request returns up to MaxResults records for each call.
    */
  var ServiceSummaryList: typings.awsSdk.clientsApprunnerMod.ServiceSummaryList
}
object ListServicesResponse {
  
  inline def apply(ServiceSummaryList: ServiceSummaryList): ListServicesResponse = {
    val __obj = js.Dynamic.literal(ServiceSummaryList = ServiceSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServicesResponse]
  }
  
  extension [Self <: ListServicesResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceSummaryList(value: ServiceSummaryList): Self = StObject.set(x, "ServiceSummaryList", value.asInstanceOf[js.Any])
    
    inline def setServiceSummaryListVarargs(value: ServiceSummary*): Self = StObject.set(x, "ServiceSummaryList", js.Array(value*))
  }
}
