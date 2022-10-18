package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkflowStepGroupsRequest extends StObject {
  
  /**
    * The maximum number of results that can be returned.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The pagination token.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The ID of the migration workflow.
    */
  var workflowId: MigrationWorkflowId
}
object ListWorkflowStepGroupsRequest {
  
  inline def apply(workflowId: MigrationWorkflowId): ListWorkflowStepGroupsRequest = {
    val __obj = js.Dynamic.literal(workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkflowStepGroupsRequest]
  }
  
  extension [Self <: ListWorkflowStepGroupsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setWorkflowId(value: MigrationWorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
  }
}
