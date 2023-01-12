package typings.awsSdk.clientsServicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestServiceQuotaIncreaseResponse extends StObject {
  
  /**
    * Information about the quota increase request.
    */
  var RequestedQuota: js.UndefOr[RequestedServiceQuotaChange] = js.undefined
}
object RequestServiceQuotaIncreaseResponse {
  
  inline def apply(): RequestServiceQuotaIncreaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestServiceQuotaIncreaseResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestServiceQuotaIncreaseResponse] (val x: Self) extends AnyVal {
    
    inline def setRequestedQuota(value: RequestedServiceQuotaChange): Self = StObject.set(x, "RequestedQuota", value.asInstanceOf[js.Any])
    
    inline def setRequestedQuotaUndefined: Self = StObject.set(x, "RequestedQuota", js.undefined)
  }
}
