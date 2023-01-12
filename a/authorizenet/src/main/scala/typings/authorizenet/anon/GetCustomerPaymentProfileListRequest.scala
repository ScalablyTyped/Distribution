package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomerPaymentProfileListRequest extends StObject {
  
  var getCustomerPaymentProfileListRequest: typings.authorizenet.mod.APIContracts.GetCustomerPaymentProfileListRequest
}
object GetCustomerPaymentProfileListRequest {
  
  inline def apply(
    getCustomerPaymentProfileListRequest: typings.authorizenet.mod.APIContracts.GetCustomerPaymentProfileListRequest
  ): GetCustomerPaymentProfileListRequest = {
    val __obj = js.Dynamic.literal(getCustomerPaymentProfileListRequest = getCustomerPaymentProfileListRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomerPaymentProfileListRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCustomerPaymentProfileListRequest] (val x: Self) extends AnyVal {
    
    inline def setGetCustomerPaymentProfileListRequest(value: typings.authorizenet.mod.APIContracts.GetCustomerPaymentProfileListRequest): Self = StObject.set(x, "getCustomerPaymentProfileListRequest", value.asInstanceOf[js.Any])
  }
}
