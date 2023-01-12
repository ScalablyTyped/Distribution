package typings.awsSdk.clientsServicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRequestedServiceQuotaChangeRequest extends StObject {
  
  /**
    * The ID of the quota increase request.
    */
  var RequestId: typings.awsSdk.clientsServicequotasMod.RequestId
}
object GetRequestedServiceQuotaChangeRequest {
  
  inline def apply(RequestId: RequestId): GetRequestedServiceQuotaChangeRequest = {
    val __obj = js.Dynamic.literal(RequestId = RequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRequestedServiceQuotaChangeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRequestedServiceQuotaChangeRequest] (val x: Self) extends AnyVal {
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
  }
}
