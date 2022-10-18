package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransactionRequest extends StObject {
  
  /**
    * The transaction for which to return status.
    */
  var TransactionId: TransactionIdString
}
object DescribeTransactionRequest {
  
  inline def apply(TransactionId: TransactionIdString): DescribeTransactionRequest = {
    val __obj = js.Dynamic.literal(TransactionId = TransactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTransactionRequest]
  }
  
  extension [Self <: DescribeTransactionRequest](x: Self) {
    
    inline def setTransactionId(value: TransactionIdString): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
  }
}
