package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransactionListRequest extends StObject {
  
  var getTransactionListRequest: typings.authorizenet.mod.APIContracts.GetTransactionListRequest
}
object GetTransactionListRequest {
  
  inline def apply(getTransactionListRequest: typings.authorizenet.mod.APIContracts.GetTransactionListRequest): GetTransactionListRequest = {
    val __obj = js.Dynamic.literal(getTransactionListRequest = getTransactionListRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransactionListRequest]
  }
  
  extension [Self <: GetTransactionListRequest](x: Self) {
    
    inline def setGetTransactionListRequest(value: typings.authorizenet.mod.APIContracts.GetTransactionListRequest): Self = StObject.set(x, "getTransactionListRequest", value.asInstanceOf[js.Any])
  }
}
