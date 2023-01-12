package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTransactionsResponse extends StObject {
  
  /**
    * A continuation token indicating whether additional data is available.
    */
  var NextToken: js.UndefOr[TokenString] = js.undefined
  
  /**
    * A list of transactions. The record for each transaction is a TransactionDescription object.
    */
  var Transactions: js.UndefOr[TransactionDescriptionList] = js.undefined
}
object ListTransactionsResponse {
  
  inline def apply(): ListTransactionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTransactionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTransactionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: TokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransactions(value: TransactionDescriptionList): Self = StObject.set(x, "Transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsUndefined: Self = StObject.set(x, "Transactions", js.undefined)
    
    inline def setTransactionsVarargs(value: TransactionDescription*): Self = StObject.set(x, "Transactions", js.Array(value*))
  }
}
