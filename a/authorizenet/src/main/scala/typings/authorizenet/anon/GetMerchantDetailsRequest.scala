package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMerchantDetailsRequest extends StObject {
  
  var getMerchantDetailsRequest: typings.authorizenet.mod.APIContracts.GetMerchantDetailsRequest
}
object GetMerchantDetailsRequest {
  
  inline def apply(getMerchantDetailsRequest: typings.authorizenet.mod.APIContracts.GetMerchantDetailsRequest): GetMerchantDetailsRequest = {
    val __obj = js.Dynamic.literal(getMerchantDetailsRequest = getMerchantDetailsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMerchantDetailsRequest]
  }
  
  extension [Self <: GetMerchantDetailsRequest](x: Self) {
    
    inline def setGetMerchantDetailsRequest(value: typings.authorizenet.mod.APIContracts.GetMerchantDetailsRequest): Self = StObject.set(x, "getMerchantDetailsRequest", value.asInstanceOf[js.Any])
  }
}
