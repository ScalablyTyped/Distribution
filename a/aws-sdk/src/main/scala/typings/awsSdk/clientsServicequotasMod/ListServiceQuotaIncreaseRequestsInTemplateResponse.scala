package typings.awsSdk.clientsServicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceQuotaIncreaseRequestsInTemplateResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsServicequotasMod.NextToken] = js.undefined
  
  /**
    * Information about the quota increase requests.
    */
  var ServiceQuotaIncreaseRequestInTemplateList: js.UndefOr[typings.awsSdk.clientsServicequotasMod.ServiceQuotaIncreaseRequestInTemplateList] = js.undefined
}
object ListServiceQuotaIncreaseRequestsInTemplateResponse {
  
  inline def apply(): ListServiceQuotaIncreaseRequestsInTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceQuotaIncreaseRequestsInTemplateResponse]
  }
  
  extension [Self <: ListServiceQuotaIncreaseRequestsInTemplateResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceQuotaIncreaseRequestInTemplateList(value: ServiceQuotaIncreaseRequestInTemplateList): Self = StObject.set(x, "ServiceQuotaIncreaseRequestInTemplateList", value.asInstanceOf[js.Any])
    
    inline def setServiceQuotaIncreaseRequestInTemplateListUndefined: Self = StObject.set(x, "ServiceQuotaIncreaseRequestInTemplateList", js.undefined)
    
    inline def setServiceQuotaIncreaseRequestInTemplateListVarargs(value: ServiceQuotaIncreaseRequestInTemplate*): Self = StObject.set(x, "ServiceQuotaIncreaseRequestInTemplateList", js.Array(value*))
  }
}
