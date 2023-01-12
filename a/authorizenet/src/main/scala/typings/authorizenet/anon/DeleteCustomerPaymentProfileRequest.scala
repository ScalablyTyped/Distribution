package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomerPaymentProfileRequest extends StObject {
  
  var deleteCustomerPaymentProfileRequest: typings.authorizenet.mod.APIContracts.DeleteCustomerPaymentProfileRequest
}
object DeleteCustomerPaymentProfileRequest {
  
  inline def apply(
    deleteCustomerPaymentProfileRequest: typings.authorizenet.mod.APIContracts.DeleteCustomerPaymentProfileRequest
  ): DeleteCustomerPaymentProfileRequest = {
    val __obj = js.Dynamic.literal(deleteCustomerPaymentProfileRequest = deleteCustomerPaymentProfileRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomerPaymentProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCustomerPaymentProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setDeleteCustomerPaymentProfileRequest(value: typings.authorizenet.mod.APIContracts.DeleteCustomerPaymentProfileRequest): Self = StObject.set(x, "deleteCustomerPaymentProfileRequest", value.asInstanceOf[js.Any])
  }
}
