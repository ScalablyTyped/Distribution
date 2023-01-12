package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomerProfileFromTransactionRequest extends StObject {
  
  var createCustomerProfileFromTransactionRequest: typings.authorizenet.mod.APIContracts.CreateCustomerProfileFromTransactionRequest
}
object CreateCustomerProfileFromTransactionRequest {
  
  inline def apply(
    createCustomerProfileFromTransactionRequest: typings.authorizenet.mod.APIContracts.CreateCustomerProfileFromTransactionRequest
  ): CreateCustomerProfileFromTransactionRequest = {
    val __obj = js.Dynamic.literal(createCustomerProfileFromTransactionRequest = createCustomerProfileFromTransactionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomerProfileFromTransactionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCustomerProfileFromTransactionRequest] (val x: Self) extends AnyVal {
    
    inline def setCreateCustomerProfileFromTransactionRequest(value: typings.authorizenet.mod.APIContracts.CreateCustomerProfileFromTransactionRequest): Self = StObject.set(x, "createCustomerProfileFromTransactionRequest", value.asInstanceOf[js.Any])
  }
}
