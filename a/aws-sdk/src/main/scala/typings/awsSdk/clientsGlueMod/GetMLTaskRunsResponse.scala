package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMLTaskRunsResponse extends StObject {
  
  /**
    * A pagination token, if more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A list of task runs that are associated with the transform.
    */
  var TaskRuns: js.UndefOr[TaskRunList] = js.undefined
}
object GetMLTaskRunsResponse {
  
  inline def apply(): GetMLTaskRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMLTaskRunsResponse]
  }
  
  extension [Self <: GetMLTaskRunsResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTaskRuns(value: TaskRunList): Self = StObject.set(x, "TaskRuns", value.asInstanceOf[js.Any])
    
    inline def setTaskRunsUndefined: Self = StObject.set(x, "TaskRuns", js.undefined)
    
    inline def setTaskRunsVarargs(value: TaskRun*): Self = StObject.set(x, "TaskRuns", js.Array(value*))
  }
}
