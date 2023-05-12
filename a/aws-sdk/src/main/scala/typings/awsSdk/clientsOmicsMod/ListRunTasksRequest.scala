package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRunTasksRequest extends StObject {
  
  /**
    * The run's ID.
    */
  var id: RunId
  
  /**
    * The maximum number of run tasks to return in one page of results.
    */
  var maxResults: js.UndefOr[ListRunTasksRequestMaxResultsInteger] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var startingToken: js.UndefOr[TaskListToken] = js.undefined
  
  /**
    * Filter the list by status.
    */
  var status: js.UndefOr[TaskStatus] = js.undefined
}
object ListRunTasksRequest {
  
  inline def apply(id: RunId): ListRunTasksRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRunTasksRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRunTasksRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: RunId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ListRunTasksRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setStartingToken(value: TaskListToken): Self = StObject.set(x, "startingToken", value.asInstanceOf[js.Any])
    
    inline def setStartingTokenUndefined: Self = StObject.set(x, "startingToken", js.undefined)
    
    inline def setStatus(value: TaskStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
