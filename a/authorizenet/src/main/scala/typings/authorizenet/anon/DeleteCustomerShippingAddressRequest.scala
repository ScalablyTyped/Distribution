package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomerShippingAddressRequest extends StObject {
  
  var deleteCustomerShippingAddressRequest: typings.authorizenet.mod.APIContracts.DeleteCustomerShippingAddressRequest
}
object DeleteCustomerShippingAddressRequest {
  
  inline def apply(
    deleteCustomerShippingAddressRequest: typings.authorizenet.mod.APIContracts.DeleteCustomerShippingAddressRequest
  ): DeleteCustomerShippingAddressRequest = {
    val __obj = js.Dynamic.literal(deleteCustomerShippingAddressRequest = deleteCustomerShippingAddressRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomerShippingAddressRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCustomerShippingAddressRequest] (val x: Self) extends AnyVal {
    
    inline def setDeleteCustomerShippingAddressRequest(value: typings.authorizenet.mod.APIContracts.DeleteCustomerShippingAddressRequest): Self = StObject.set(x, "deleteCustomerShippingAddressRequest", value.asInstanceOf[js.Any])
  }
}
