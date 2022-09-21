package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomerProfileRequest extends StObject {
  
  var updateCustomerProfileRequest: typings.authorizenet.mod.APIContracts.UpdateCustomerProfileRequest
}
object UpdateCustomerProfileRequest {
  
  inline def apply(updateCustomerProfileRequest: typings.authorizenet.mod.APIContracts.UpdateCustomerProfileRequest): UpdateCustomerProfileRequest = {
    val __obj = js.Dynamic.literal(updateCustomerProfileRequest = updateCustomerProfileRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCustomerProfileRequest]
  }
  
  extension [Self <: UpdateCustomerProfileRequest](x: Self) {
    
    inline def setUpdateCustomerProfileRequest(value: typings.authorizenet.mod.APIContracts.UpdateCustomerProfileRequest): Self = StObject.set(x, "updateCustomerProfileRequest", value.asInstanceOf[js.Any])
  }
}
