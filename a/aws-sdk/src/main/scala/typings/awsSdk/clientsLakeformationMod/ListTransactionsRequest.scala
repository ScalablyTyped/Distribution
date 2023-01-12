package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTransactionsRequest extends StObject {
  
  /**
    * The catalog for which to list transactions. Defaults to the account ID of the caller.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The maximum number of transactions to return in a single call.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A continuation token if this is not the first call to retrieve transactions.
    */
  var NextToken: js.UndefOr[TokenString] = js.undefined
  
  /**
    *  A filter indicating the status of transactions to return. Options are ALL | COMPLETED | COMMITTED | ABORTED | ACTIVE. The default is ALL.
    */
  var StatusFilter: js.UndefOr[TransactionStatusFilter] = js.undefined
}
object ListTransactionsRequest {
  
  inline def apply(): ListTransactionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTransactionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTransactionsRequest] (val x: Self) extends AnyVal {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: TokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatusFilter(value: TransactionStatusFilter): Self = StObject.set(x, "StatusFilter", value.asInstanceOf[js.Any])
    
    inline def setStatusFilterUndefined: Self = StObject.set(x, "StatusFilter", js.undefined)
  }
}
