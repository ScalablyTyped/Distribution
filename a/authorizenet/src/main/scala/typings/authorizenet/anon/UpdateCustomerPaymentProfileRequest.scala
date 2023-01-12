package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomerPaymentProfileRequest extends StObject {
  
  var updateCustomerPaymentProfileRequest: typings.authorizenet.mod.APIContracts.UpdateCustomerPaymentProfileRequest
}
object UpdateCustomerPaymentProfileRequest {
  
  inline def apply(
    updateCustomerPaymentProfileRequest: typings.authorizenet.mod.APIContracts.UpdateCustomerPaymentProfileRequest
  ): UpdateCustomerPaymentProfileRequest = {
    val __obj = js.Dynamic.literal(updateCustomerPaymentProfileRequest = updateCustomerPaymentProfileRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCustomerPaymentProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCustomerPaymentProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setUpdateCustomerPaymentProfileRequest(value: typings.authorizenet.mod.APIContracts.UpdateCustomerPaymentProfileRequest): Self = StObject.set(x, "updateCustomerPaymentProfileRequest", value.asInstanceOf[js.Any])
  }
}
