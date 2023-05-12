package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkflowStepExecutionsRequest extends StObject {
  
  /**
    * The maximum items to return in a request.
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.undefined
  
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The unique identifier that Image Builder assigned to keep track of runtime details when it ran the workflow.
    */
  var workflowExecutionId: WorkflowExecutionId
}
object ListWorkflowStepExecutionsRequest {
  
  inline def apply(workflowExecutionId: WorkflowExecutionId): ListWorkflowStepExecutionsRequest = {
    val __obj = js.Dynamic.literal(workflowExecutionId = workflowExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkflowStepExecutionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWorkflowStepExecutionsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: RestrictedInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setWorkflowExecutionId(value: WorkflowExecutionId): Self = StObject.set(x, "workflowExecutionId", value.asInstanceOf[js.Any])
  }
}
