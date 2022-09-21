package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomerProfileRequest extends StObject {
  
  var deleteCustomerProfileRequest: typings.authorizenet.mod.APIContracts.DeleteCustomerProfileRequest
}
object DeleteCustomerProfileRequest {
  
  inline def apply(deleteCustomerProfileRequest: typings.authorizenet.mod.APIContracts.DeleteCustomerProfileRequest): DeleteCustomerProfileRequest = {
    val __obj = js.Dynamic.literal(deleteCustomerProfileRequest = deleteCustomerProfileRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomerProfileRequest]
  }
  
  extension [Self <: DeleteCustomerProfileRequest](x: Self) {
    
    inline def setDeleteCustomerProfileRequest(value: typings.authorizenet.mod.APIContracts.DeleteCustomerProfileRequest): Self = StObject.set(x, "deleteCustomerProfileRequest", value.asInstanceOf[js.Any])
  }
}
