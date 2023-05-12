package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkflowsRequest extends StObject {
  
  /**
    * The maximum number of workflows to return in one page of results.
    */
  var maxResults: js.UndefOr[ListWorkflowsRequestMaxResultsInteger] = js.undefined
  
  /**
    * The workflows' name.
    */
  var name: js.UndefOr[WorkflowName] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var startingToken: js.UndefOr[WorkflowListToken] = js.undefined
  
  /**
    * The workflows' type.
    */
  var `type`: js.UndefOr[WorkflowType] = js.undefined
}
object ListWorkflowsRequest {
  
  inline def apply(): ListWorkflowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkflowsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWorkflowsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListWorkflowsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setName(value: WorkflowName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStartingToken(value: WorkflowListToken): Self = StObject.set(x, "startingToken", value.asInstanceOf[js.Any])
    
    inline def setStartingTokenUndefined: Self = StObject.set(x, "startingToken", js.undefined)
    
    inline def setType(value: WorkflowType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
