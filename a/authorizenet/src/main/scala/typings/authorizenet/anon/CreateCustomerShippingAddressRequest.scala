package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomerShippingAddressRequest extends StObject {
  
  var createCustomerShippingAddressRequest: typings.authorizenet.mod.APIContracts.CreateCustomerShippingAddressRequest
}
object CreateCustomerShippingAddressRequest {
  
  inline def apply(
    createCustomerShippingAddressRequest: typings.authorizenet.mod.APIContracts.CreateCustomerShippingAddressRequest
  ): CreateCustomerShippingAddressRequest = {
    val __obj = js.Dynamic.literal(createCustomerShippingAddressRequest = createCustomerShippingAddressRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomerShippingAddressRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCustomerShippingAddressRequest] (val x: Self) extends AnyVal {
    
    inline def setCreateCustomerShippingAddressRequest(value: typings.authorizenet.mod.APIContracts.CreateCustomerShippingAddressRequest): Self = StObject.set(x, "createCustomerShippingAddressRequest", value.asInstanceOf[js.Any])
  }
}
