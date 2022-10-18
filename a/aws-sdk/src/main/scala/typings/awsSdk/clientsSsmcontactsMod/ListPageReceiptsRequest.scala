package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPageReceiptsRequest extends StObject {
  
  /**
    * The maximum number of acknowledgements per page of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.MaxResults] = js.undefined
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the engagement to a specific contact channel.
    */
  var PageId: SsmContactsArn
}
object ListPageReceiptsRequest {
  
  inline def apply(PageId: SsmContactsArn): ListPageReceiptsRequest = {
    val __obj = js.Dynamic.literal(PageId = PageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPageReceiptsRequest]
  }
  
  extension [Self <: ListPageReceiptsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPageId(value: SsmContactsArn): Self = StObject.set(x, "PageId", value.asInstanceOf[js.Any])
  }
}
