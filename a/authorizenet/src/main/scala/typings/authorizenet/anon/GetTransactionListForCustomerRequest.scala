package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransactionListForCustomerRequest extends StObject {
  
  var getTransactionListForCustomerRequest: typings.authorizenet.mod.APIContracts.GetTransactionListForCustomerRequest
}
object GetTransactionListForCustomerRequest {
  
  inline def apply(
    getTransactionListForCustomerRequest: typings.authorizenet.mod.APIContracts.GetTransactionListForCustomerRequest
  ): GetTransactionListForCustomerRequest = {
    val __obj = js.Dynamic.literal(getTransactionListForCustomerRequest = getTransactionListForCustomerRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransactionListForCustomerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTransactionListForCustomerRequest] (val x: Self) extends AnyVal {
    
    inline def setGetTransactionListForCustomerRequest(value: typings.authorizenet.mod.APIContracts.GetTransactionListForCustomerRequest): Self = StObject.set(x, "getTransactionListForCustomerRequest", value.asInstanceOf[js.Any])
  }
}
