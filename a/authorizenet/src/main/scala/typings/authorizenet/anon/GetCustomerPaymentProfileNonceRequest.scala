package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomerPaymentProfileNonceRequest extends StObject {
  
  var getCustomerPaymentProfileNonceRequest: typings.authorizenet.mod.APIContracts.GetCustomerPaymentProfileNonceRequest
}
object GetCustomerPaymentProfileNonceRequest {
  
  inline def apply(
    getCustomerPaymentProfileNonceRequest: typings.authorizenet.mod.APIContracts.GetCustomerPaymentProfileNonceRequest
  ): GetCustomerPaymentProfileNonceRequest = {
    val __obj = js.Dynamic.literal(getCustomerPaymentProfileNonceRequest = getCustomerPaymentProfileNonceRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomerPaymentProfileNonceRequest]
  }
  
  extension [Self <: GetCustomerPaymentProfileNonceRequest](x: Self) {
    
    inline def setGetCustomerPaymentProfileNonceRequest(value: typings.authorizenet.mod.APIContracts.GetCustomerPaymentProfileNonceRequest): Self = StObject.set(x, "getCustomerPaymentProfileNonceRequest", value.asInstanceOf[js.Any])
  }
}
