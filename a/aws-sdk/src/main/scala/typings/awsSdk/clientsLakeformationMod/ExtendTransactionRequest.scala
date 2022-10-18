package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendTransactionRequest extends StObject {
  
  /**
    * The transaction to extend.
    */
  var TransactionId: js.UndefOr[TransactionIdString] = js.undefined
}
object ExtendTransactionRequest {
  
  inline def apply(): ExtendTransactionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendTransactionRequest]
  }
  
  extension [Self <: ExtendTransactionRequest](x: Self) {
    
    inline def setTransactionId(value: TransactionIdString): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
  }
}
