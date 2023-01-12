package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkerBlocksRequest extends StObject {
  
  var MaxResults: js.UndefOr[ResultSize] = js.undefined
  
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListWorkerBlocksRequest {
  
  inline def apply(): ListWorkerBlocksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkerBlocksRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWorkerBlocksRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ResultSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
