package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomerProfileRequest extends StObject {
  
  var createCustomerProfileRequest: typings.authorizenet.mod.APIContracts.CreateCustomerProfileRequest
}
object CreateCustomerProfileRequest {
  
  inline def apply(createCustomerProfileRequest: typings.authorizenet.mod.APIContracts.CreateCustomerProfileRequest): CreateCustomerProfileRequest = {
    val __obj = js.Dynamic.literal(createCustomerProfileRequest = createCustomerProfileRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomerProfileRequest]
  }
  
  extension [Self <: CreateCustomerProfileRequest](x: Self) {
    
    inline def setCreateCustomerProfileRequest(value: typings.authorizenet.mod.APIContracts.CreateCustomerProfileRequest): Self = StObject.set(x, "createCustomerProfileRequest", value.asInstanceOf[js.Any])
  }
}
