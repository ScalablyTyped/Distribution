package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeExportTasksRequest extends StObject {
  
  /**
    * One or more unique identifiers used to query the status of an export request.
    */
  var exportIds: js.UndefOr[ExportIds] = js.undefined
  
  /**
    * One or more filters.    AgentId - ID of the agent whose collected data will be exported  
    */
  var filters: js.UndefOr[ExportFilters] = js.undefined
  
  /**
    * The maximum number of volume results returned by DescribeExportTasks in paginated output. When this parameter is used, DescribeExportTasks only returns maxResults results in a single page along with a nextToken response element.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated DescribeExportTasks request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeExportTasksRequest {
  
  inline def apply(): DescribeExportTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportTasksRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeExportTasksRequest] (val x: Self) extends AnyVal {
    
    inline def setExportIds(value: ExportIds): Self = StObject.set(x, "exportIds", value.asInstanceOf[js.Any])
    
    inline def setExportIdsUndefined: Self = StObject.set(x, "exportIds", js.undefined)
    
    inline def setExportIdsVarargs(value: ConfigurationsExportId*): Self = StObject.set(x, "exportIds", js.Array(value*))
    
    inline def setFilters(value: ExportFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: ExportFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
