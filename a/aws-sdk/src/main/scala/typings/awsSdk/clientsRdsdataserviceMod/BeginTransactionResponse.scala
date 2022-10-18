package typings.awsSdk.clientsRdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginTransactionResponse extends StObject {
  
  /**
    * The transaction ID of the transaction started by the call.
    */
  var transactionId: js.UndefOr[Id] = js.undefined
}
object BeginTransactionResponse {
  
  inline def apply(): BeginTransactionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginTransactionResponse]
  }
  
  extension [Self <: BeginTransactionResponse](x: Self) {
    
    inline def setTransactionId(value: Id): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
