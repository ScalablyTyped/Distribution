package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkflowRunsResponse extends StObject {
  
  /**
    * A continuation token, if not all requested workflow runs have been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  
  /**
    * A list of workflow run metadata objects.
    */
  var Runs: js.UndefOr[WorkflowRuns] = js.undefined
}
object GetWorkflowRunsResponse {
  
  inline def apply(): GetWorkflowRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkflowRunsResponse]
  }
  
  extension [Self <: GetWorkflowRunsResponse](x: Self) {
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRuns(value: WorkflowRuns): Self = StObject.set(x, "Runs", value.asInstanceOf[js.Any])
    
    inline def setRunsUndefined: Self = StObject.set(x, "Runs", js.undefined)
    
    inline def setRunsVarargs(value: WorkflowRun*): Self = StObject.set(x, "Runs", js.Array(value*))
  }
}
