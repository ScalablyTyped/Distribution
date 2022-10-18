package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkflowsResponse extends StObject {
  
  /**
    * List containing workflow details.
    */
  var Items: js.UndefOr[WorkflowList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[token] = js.undefined
}
object ListWorkflowsResponse {
  
  inline def apply(): ListWorkflowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkflowsResponse]
  }
  
  extension [Self <: ListWorkflowsResponse](x: Self) {
    
    inline def setItems(value: WorkflowList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: ListWorkflowsItem*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
