package typings.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUnsettledTransactionListRequest extends StObject {
  
  var getUnsettledTransactionListRequest: typings.authorizenet.mod.APIContracts.GetUnsettledTransactionListRequest
}
object GetUnsettledTransactionListRequest {
  
  inline def apply(
    getUnsettledTransactionListRequest: typings.authorizenet.mod.APIContracts.GetUnsettledTransactionListRequest
  ): GetUnsettledTransactionListRequest = {
    val __obj = js.Dynamic.literal(getUnsettledTransactionListRequest = getUnsettledTransactionListRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUnsettledTransactionListRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetUnsettledTransactionListRequest] (val x: Self) extends AnyVal {
    
    inline def setGetUnsettledTransactionListRequest(value: typings.authorizenet.mod.APIContracts.GetUnsettledTransactionListRequest): Self = StObject.set(x, "getUnsettledTransactionListRequest", value.asInstanceOf[js.Any])
  }
}
