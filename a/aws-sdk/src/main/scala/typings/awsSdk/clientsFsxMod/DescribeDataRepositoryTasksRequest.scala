package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDataRepositoryTasksRequest extends StObject {
  
  /**
    * (Optional) You can use filters to narrow the DescribeDataRepositoryTasks response to include just tasks for specific file systems, or tasks in a specific lifecycle state.
    */
  var Filters: js.UndefOr[DataRepositoryTaskFilters] = js.undefined
  
  var MaxResults: js.UndefOr[typings.awsSdk.clientsFsxMod.MaxResults] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsFsxMod.NextToken] = js.undefined
  
  /**
    * (Optional) IDs of the tasks whose descriptions you want to retrieve (String).
    */
  var TaskIds: js.UndefOr[typings.awsSdk.clientsFsxMod.TaskIds] = js.undefined
}
object DescribeDataRepositoryTasksRequest {
  
  inline def apply(): DescribeDataRepositoryTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataRepositoryTasksRequest]
  }
  
  extension [Self <: DescribeDataRepositoryTasksRequest](x: Self) {
    
    inline def setFilters(value: DataRepositoryTaskFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: DataRepositoryTaskFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTaskIds(value: TaskIds): Self = StObject.set(x, "TaskIds", value.asInstanceOf[js.Any])
    
    inline def setTaskIdsUndefined: Self = StObject.set(x, "TaskIds", js.undefined)
    
    inline def setTaskIdsVarargs(value: TaskId*): Self = StObject.set(x, "TaskIds", js.Array(value*))
  }
}
