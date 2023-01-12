package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomerProfileTransactionRequest extends StObject {
  
  var createCustomerProfileTransactionRequest: typings.authorizenet.mod.APIContracts.CreateCustomerProfileTransactionRequest
}
object CreateCustomerProfileTransactionRequest {
  
  inline def apply(
    createCustomerProfileTransactionRequest: typings.authorizenet.mod.APIContracts.CreateCustomerProfileTransactionRequest
  ): CreateCustomerProfileTransactionRequest = {
    val __obj = js.Dynamic.literal(createCustomerProfileTransactionRequest = createCustomerProfileTransactionRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomerProfileTransactionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCustomerProfileTransactionRequest] (val x: Self) extends AnyVal {
    
    inline def setCreateCustomerProfileTransactionRequest(value: typings.authorizenet.mod.APIContracts.CreateCustomerProfileTransactionRequest): Self = StObject.set(x, "createCustomerProfileTransactionRequest", value.asInstanceOf[js.Any])
  }
}
