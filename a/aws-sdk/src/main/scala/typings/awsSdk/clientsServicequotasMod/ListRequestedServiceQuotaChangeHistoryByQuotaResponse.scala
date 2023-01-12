package typings.awsSdk.clientsServicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRequestedServiceQuotaChangeHistoryByQuotaResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsServicequotasMod.NextToken] = js.undefined
  
  /**
    * Information about the quota increase requests.
    */
  var RequestedQuotas: js.UndefOr[RequestedServiceQuotaChangeHistoryListDefinition] = js.undefined
}
object ListRequestedServiceQuotaChangeHistoryByQuotaResponse {
  
  inline def apply(): ListRequestedServiceQuotaChangeHistoryByQuotaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRequestedServiceQuotaChangeHistoryByQuotaResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRequestedServiceQuotaChangeHistoryByQuotaResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestedQuotas(value: RequestedServiceQuotaChangeHistoryListDefinition): Self = StObject.set(x, "RequestedQuotas", value.asInstanceOf[js.Any])
    
    inline def setRequestedQuotasUndefined: Self = StObject.set(x, "RequestedQuotas", js.undefined)
    
    inline def setRequestedQuotasVarargs(value: RequestedServiceQuotaChange*): Self = StObject.set(x, "RequestedQuotas", js.Array(value*))
  }
}
