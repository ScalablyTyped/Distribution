package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCollectionsRequest extends StObject {
  
  /**
    * Maximum number of collection IDs to return. 
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * Pagination token from the previous response.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListCollectionsRequest {
  
  inline def apply(): ListCollectionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionsRequest]
  }
  
  extension [Self <: ListCollectionsRequest](x: Self) {
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
