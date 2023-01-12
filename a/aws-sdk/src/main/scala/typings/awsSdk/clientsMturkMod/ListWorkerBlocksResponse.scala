package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkerBlocksResponse extends StObject {
  
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  The number of assignments on the page in the filtered results list, equivalent to the number of assignments returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The list of WorkerBlocks, containing the collection of Worker IDs and reasons for blocking.
    */
  var WorkerBlocks: js.UndefOr[WorkerBlockList] = js.undefined
}
object ListWorkerBlocksResponse {
  
  inline def apply(): ListWorkerBlocksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkerBlocksResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWorkerBlocksResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setNumResults(value: Integer): Self = StObject.set(x, "NumResults", value.asInstanceOf[js.Any])
    
    inline def setNumResultsUndefined: Self = StObject.set(x, "NumResults", js.undefined)
    
    inline def setWorkerBlocks(value: WorkerBlockList): Self = StObject.set(x, "WorkerBlocks", value.asInstanceOf[js.Any])
    
    inline def setWorkerBlocksUndefined: Self = StObject.set(x, "WorkerBlocks", js.undefined)
    
    inline def setWorkerBlocksVarargs(value: WorkerBlock*): Self = StObject.set(x, "WorkerBlocks", js.Array(value*))
  }
}
