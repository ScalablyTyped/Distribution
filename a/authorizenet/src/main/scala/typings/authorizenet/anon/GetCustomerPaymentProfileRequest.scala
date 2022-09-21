package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomerPaymentProfileRequest extends StObject {
  
  var getCustomerPaymentProfileRequest: typings.authorizenet.mod.APIContracts.GetCustomerPaymentProfileRequest
}
object GetCustomerPaymentProfileRequest {
  
  inline def apply(
    getCustomerPaymentProfileRequest: typings.authorizenet.mod.APIContracts.GetCustomerPaymentProfileRequest
  ): GetCustomerPaymentProfileRequest = {
    val __obj = js.Dynamic.literal(getCustomerPaymentProfileRequest = getCustomerPaymentProfileRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomerPaymentProfileRequest]
  }
  
  extension [Self <: GetCustomerPaymentProfileRequest](x: Self) {
    
    inline def setGetCustomerPaymentProfileRequest(value: typings.authorizenet.mod.APIContracts.GetCustomerPaymentProfileRequest): Self = StObject.set(x, "getCustomerPaymentProfileRequest", value.asInstanceOf[js.Any])
  }
}
