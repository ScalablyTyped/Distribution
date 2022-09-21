package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecryptPaymentDataRequest extends StObject {
  
  var decryptPaymentDataRequest: typings.authorizenet.mod.APIContracts.DecryptPaymentDataRequest
}
object DecryptPaymentDataRequest {
  
  inline def apply(decryptPaymentDataRequest: typings.authorizenet.mod.APIContracts.DecryptPaymentDataRequest): DecryptPaymentDataRequest = {
    val __obj = js.Dynamic.literal(decryptPaymentDataRequest = decryptPaymentDataRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptPaymentDataRequest]
  }
  
  extension [Self <: DecryptPaymentDataRequest](x: Self) {
    
    inline def setDecryptPaymentDataRequest(value: typings.authorizenet.mod.APIContracts.DecryptPaymentDataRequest): Self = StObject.set(x, "decryptPaymentDataRequest", value.asInstanceOf[js.Any])
  }
}
