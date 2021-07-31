package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFlowsResponse extends StObject {
  
  /**
    *  The list of flows associated with your account. 
    */
  var flows: js.UndefOr[FlowList] = js.undefined
  
  /**
    *  The pagination token for next page of data. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListFlowsResponse {
  
  @scala.inline
  def apply(): ListFlowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFlowsResponse]
  }
  
  @scala.inline
  implicit class ListFlowsResponseMutableBuilder[Self <: ListFlowsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlows(value: FlowList): Self = StObject.set(x, "flows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowsUndefined: Self = StObject.set(x, "flows", js.undefined)
    
    @scala.inline
    def setFlowsVarargs(value: FlowDefinition*): Self = StObject.set(x, "flows", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
