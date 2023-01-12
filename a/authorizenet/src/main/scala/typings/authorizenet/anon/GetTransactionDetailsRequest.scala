package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransactionDetailsRequest extends StObject {
  
  var getTransactionDetailsRequest: typings.authorizenet.mod.APIContracts.GetTransactionDetailsRequest
}
object GetTransactionDetailsRequest {
  
  inline def apply(getTransactionDetailsRequest: typings.authorizenet.mod.APIContracts.GetTransactionDetailsRequest): GetTransactionDetailsRequest = {
    val __obj = js.Dynamic.literal(getTransactionDetailsRequest = getTransactionDetailsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransactionDetailsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTransactionDetailsRequest] (val x: Self) extends AnyVal {
    
    inline def setGetTransactionDetailsRequest(value: typings.authorizenet.mod.APIContracts.GetTransactionDetailsRequest): Self = StObject.set(x, "getTransactionDetailsRequest", value.asInstanceOf[js.Any])
  }
}
