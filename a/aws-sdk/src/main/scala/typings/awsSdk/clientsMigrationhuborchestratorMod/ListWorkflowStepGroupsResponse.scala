package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkflowStepGroupsResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The summary of step groups in a migration workflow.
    */
  var workflowStepGroupsSummary: WorkflowStepGroupsSummaryList
}
object ListWorkflowStepGroupsResponse {
  
  inline def apply(workflowStepGroupsSummary: WorkflowStepGroupsSummaryList): ListWorkflowStepGroupsResponse = {
    val __obj = js.Dynamic.literal(workflowStepGroupsSummary = workflowStepGroupsSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkflowStepGroupsResponse]
  }
  
  extension [Self <: ListWorkflowStepGroupsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setWorkflowStepGroupsSummary(value: WorkflowStepGroupsSummaryList): Self = StObject.set(x, "workflowStepGroupsSummary", value.asInstanceOf[js.Any])
    
    inline def setWorkflowStepGroupsSummaryVarargs(value: WorkflowStepGroupSummary*): Self = StObject.set(x, "workflowStepGroupsSummary", js.Array(value*))
  }
}
