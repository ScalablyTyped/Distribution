package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReadSetExportJobsRequest extends StObject {
  
  /**
    * A filter to apply to the list.
    */
  var filter: js.UndefOr[ExportReadSetFilter] = js.undefined
  
  /**
    * The maximum number of jobs to return in one page of results.
    */
  var maxResults: js.UndefOr[ListReadSetExportJobsRequestMaxResultsInteger] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The jobs' sequence store ID.
    */
  var sequenceStoreId: SequenceStoreId
}
object ListReadSetExportJobsRequest {
  
  inline def apply(sequenceStoreId: SequenceStoreId): ListReadSetExportJobsRequest = {
    val __obj = js.Dynamic.literal(sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReadSetExportJobsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReadSetExportJobsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: ExportReadSetFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMaxResults(value: ListReadSetExportJobsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
  }
}
