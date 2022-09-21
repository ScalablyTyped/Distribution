package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateCustomerPaymentProfileRequest extends StObject {
  
  var validateCustomerPaymentProfileRequest: typings.authorizenet.mod.APIContracts.ValidateCustomerPaymentProfileRequest
}
object ValidateCustomerPaymentProfileRequest {
  
  inline def apply(
    validateCustomerPaymentProfileRequest: typings.authorizenet.mod.APIContracts.ValidateCustomerPaymentProfileRequest
  ): ValidateCustomerPaymentProfileRequest = {
    val __obj = js.Dynamic.literal(validateCustomerPaymentProfileRequest = validateCustomerPaymentProfileRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateCustomerPaymentProfileRequest]
  }
  
  extension [Self <: ValidateCustomerPaymentProfileRequest](x: Self) {
    
    inline def setValidateCustomerPaymentProfileRequest(value: typings.authorizenet.mod.APIContracts.ValidateCustomerPaymentProfileRequest): Self = StObject.set(x, "validateCustomerPaymentProfileRequest", value.asInstanceOf[js.Any])
  }
}
