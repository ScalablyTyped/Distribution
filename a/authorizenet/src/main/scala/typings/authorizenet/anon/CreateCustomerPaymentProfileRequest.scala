package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomerPaymentProfileRequest extends StObject {
  
  var createCustomerPaymentProfileRequest: typings.authorizenet.mod.APIContracts.CreateCustomerPaymentProfileRequest
}
object CreateCustomerPaymentProfileRequest {
  
  inline def apply(
    createCustomerPaymentProfileRequest: typings.authorizenet.mod.APIContracts.CreateCustomerPaymentProfileRequest
  ): CreateCustomerPaymentProfileRequest = {
    val __obj = js.Dynamic.literal(createCustomerPaymentProfileRequest = createCustomerPaymentProfileRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomerPaymentProfileRequest]
  }
  
  extension [Self <: CreateCustomerPaymentProfileRequest](x: Self) {
    
    inline def setCreateCustomerPaymentProfileRequest(value: typings.authorizenet.mod.APIContracts.CreateCustomerPaymentProfileRequest): Self = StObject.set(x, "createCustomerPaymentProfileRequest", value.asInstanceOf[js.Any])
  }
}
