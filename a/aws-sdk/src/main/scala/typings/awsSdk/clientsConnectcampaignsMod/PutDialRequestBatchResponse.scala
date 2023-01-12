package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDialRequestBatchResponse extends StObject {
  
  var failedRequests: js.UndefOr[FailedRequestList] = js.undefined
  
  var successfulRequests: js.UndefOr[SuccessfulRequestList] = js.undefined
}
object PutDialRequestBatchResponse {
  
  inline def apply(): PutDialRequestBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutDialRequestBatchResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutDialRequestBatchResponse] (val x: Self) extends AnyVal {
    
    inline def setFailedRequests(value: FailedRequestList): Self = StObject.set(x, "failedRequests", value.asInstanceOf[js.Any])
    
    inline def setFailedRequestsUndefined: Self = StObject.set(x, "failedRequests", js.undefined)
    
    inline def setFailedRequestsVarargs(value: FailedRequest*): Self = StObject.set(x, "failedRequests", js.Array(value*))
    
    inline def setSuccessfulRequests(value: SuccessfulRequestList): Self = StObject.set(x, "successfulRequests", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulRequestsUndefined: Self = StObject.set(x, "successfulRequests", js.undefined)
    
    inline def setSuccessfulRequestsVarargs(value: SuccessfulRequest*): Self = StObject.set(x, "successfulRequests", js.Array(value*))
  }
}
