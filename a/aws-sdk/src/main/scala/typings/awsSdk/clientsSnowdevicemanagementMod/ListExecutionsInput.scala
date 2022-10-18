package typings.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExecutionsInput extends StObject {
  
  /**
    * The maximum number of tasks to list per page.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A pagination token to continue to the next page of tasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A structure used to filter the tasks by their current state.
    */
  var state: js.UndefOr[ExecutionState] = js.undefined
  
  /**
    * The ID of the task.
    */
  var taskId: TaskId
}
object ListExecutionsInput {
  
  inline def apply(taskId: TaskId): ListExecutionsInput = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExecutionsInput]
  }
  
  extension [Self <: ListExecutionsInput](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setState(value: ExecutionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTaskId(value: TaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
