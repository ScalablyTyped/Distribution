package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomerProfileIdsRequest extends StObject {
  
  var getCustomerProfileIdsRequest: typings.authorizenet.mod.APIContracts.GetCustomerProfileIdsRequest
}
object GetCustomerProfileIdsRequest {
  
  inline def apply(getCustomerProfileIdsRequest: typings.authorizenet.mod.APIContracts.GetCustomerProfileIdsRequest): GetCustomerProfileIdsRequest = {
    val __obj = js.Dynamic.literal(getCustomerProfileIdsRequest = getCustomerProfileIdsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomerProfileIdsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCustomerProfileIdsRequest] (val x: Self) extends AnyVal {
    
    inline def setGetCustomerProfileIdsRequest(value: typings.authorizenet.mod.APIContracts.GetCustomerProfileIdsRequest): Self = StObject.set(x, "getCustomerProfileIdsRequest", value.asInstanceOf[js.Any])
  }
}
