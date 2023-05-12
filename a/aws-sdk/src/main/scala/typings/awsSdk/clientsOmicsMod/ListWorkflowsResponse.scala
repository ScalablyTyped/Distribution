package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkflowsResponse extends StObject {
  
  /**
    * The workflows' items.
    */
  var items: js.UndefOr[WorkflowList] = js.undefined
  
  /**
    * A pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[WorkflowListToken] = js.undefined
}
object ListWorkflowsResponse {
  
  inline def apply(): ListWorkflowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkflowsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWorkflowsResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: WorkflowList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: WorkflowListItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: WorkflowListToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
