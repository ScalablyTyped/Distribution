package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransactionResponse extends StObject {
  
  /**
    * Returns a TransactionDescription object containing information about the transaction.
    */
  var TransactionDescription: js.UndefOr[typings.awsSdk.clientsLakeformationMod.TransactionDescription] = js.undefined
}
object DescribeTransactionResponse {
  
  inline def apply(): DescribeTransactionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransactionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTransactionResponse] (val x: Self) extends AnyVal {
    
    inline def setTransactionDescription(value: TransactionDescription): Self = StObject.set(x, "TransactionDescription", value.asInstanceOf[js.Any])
    
    inline def setTransactionDescriptionUndefined: Self = StObject.set(x, "TransactionDescription", js.undefined)
  }
}
