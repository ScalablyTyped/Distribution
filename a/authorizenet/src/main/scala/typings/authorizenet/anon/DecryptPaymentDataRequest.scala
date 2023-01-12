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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecryptPaymentDataRequest] (val x: Self) extends AnyVal {
    
    inline def setDecryptPaymentDataRequest(value: typings.authorizenet.mod.APIContracts.DecryptPaymentDataRequest): Self = StObject.set(x, "decryptPaymentDataRequest", value.asInstanceOf[js.Any])
  }
}
