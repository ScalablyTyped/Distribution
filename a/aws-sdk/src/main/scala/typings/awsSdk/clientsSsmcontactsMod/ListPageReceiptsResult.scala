package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPageReceiptsResult extends StObject {
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A list of each acknowledgement.
    */
  var Receipts: js.UndefOr[ReceiptsList] = js.undefined
}
object ListPageReceiptsResult {
  
  inline def apply(): ListPageReceiptsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPageReceiptsResult]
  }
  
  extension [Self <: ListPageReceiptsResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReceipts(value: ReceiptsList): Self = StObject.set(x, "Receipts", value.asInstanceOf[js.Any])
    
    inline def setReceiptsUndefined: Self = StObject.set(x, "Receipts", js.undefined)
    
    inline def setReceiptsVarargs(value: Receipt*): Self = StObject.set(x, "Receipts", js.Array(value*))
  }
}
