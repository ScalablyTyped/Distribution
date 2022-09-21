package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomerShippingAddressRequest extends StObject {
  
  var updateCustomerShippingAddressRequest: typings.authorizenet.mod.APIContracts.UpdateCustomerShippingAddressRequest
}
object UpdateCustomerShippingAddressRequest {
  
  inline def apply(
    updateCustomerShippingAddressRequest: typings.authorizenet.mod.APIContracts.UpdateCustomerShippingAddressRequest
  ): UpdateCustomerShippingAddressRequest = {
    val __obj = js.Dynamic.literal(updateCustomerShippingAddressRequest = updateCustomerShippingAddressRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCustomerShippingAddressRequest]
  }
  
  extension [Self <: UpdateCustomerShippingAddressRequest](x: Self) {
    
    inline def setUpdateCustomerShippingAddressRequest(value: typings.authorizenet.mod.APIContracts.UpdateCustomerShippingAddressRequest): Self = StObject.set(x, "updateCustomerShippingAddressRequest", value.asInstanceOf[js.Any])
  }
}
