package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkflowStepsResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The summary of steps in a migration workflow.
    */
  var workflowStepsSummary: WorkflowStepsSummaryList
}
object ListWorkflowStepsResponse {
  
  inline def apply(workflowStepsSummary: WorkflowStepsSummaryList): ListWorkflowStepsResponse = {
    val __obj = js.Dynamic.literal(workflowStepsSummary = workflowStepsSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkflowStepsResponse]
  }
  
  extension [Self <: ListWorkflowStepsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setWorkflowStepsSummary(value: WorkflowStepsSummaryList): Self = StObject.set(x, "workflowStepsSummary", value.asInstanceOf[js.Any])
    
    inline def setWorkflowStepsSummaryVarargs(value: WorkflowStepSummary*): Self = StObject.set(x, "workflowStepsSummary", js.Array(value*))
  }
}
