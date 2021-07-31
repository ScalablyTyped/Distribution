package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFlowExecutionRecordsRequest extends StObject {
  
  /**
    *  The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only. 
    */
  var flowName: FlowName
  
  /**
    *  Specifies the maximum number of items that should be returned in the result set. The default for maxResults is 20 (for all paginated API operations). 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  The pagination token for the next page of data. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeFlowExecutionRecordsRequest {
  
  @scala.inline
  def apply(flowName: FlowName): DescribeFlowExecutionRecordsRequest = {
    val __obj = js.Dynamic.literal(flowName = flowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFlowExecutionRecordsRequest]
  }
  
  @scala.inline
  implicit class DescribeFlowExecutionRecordsRequestMutableBuilder[Self <: DescribeFlowExecutionRecordsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowName(value: FlowName): Self = StObject.set(x, "flowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
