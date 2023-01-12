package typings.awsSdk.clientsServicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAWSDefaultServiceQuotasResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsServicequotasMod.NextToken] = js.undefined
  
  /**
    * Information about the quotas.
    */
  var Quotas: js.UndefOr[ServiceQuotaListDefinition] = js.undefined
}
object ListAWSDefaultServiceQuotasResponse {
  
  inline def apply(): ListAWSDefaultServiceQuotasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAWSDefaultServiceQuotasResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAWSDefaultServiceQuotasResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQuotas(value: ServiceQuotaListDefinition): Self = StObject.set(x, "Quotas", value.asInstanceOf[js.Any])
    
    inline def setQuotasUndefined: Self = StObject.set(x, "Quotas", js.undefined)
    
    inline def setQuotasVarargs(value: ServiceQuota*): Self = StObject.set(x, "Quotas", js.Array(value*))
  }
}
