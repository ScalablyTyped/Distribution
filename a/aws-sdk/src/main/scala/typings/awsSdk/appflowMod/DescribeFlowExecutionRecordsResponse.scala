package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFlowExecutionRecordsResponse extends StObject {
  
  /**
    *  Returns a list of all instances when this flow was run. 
    */
  var flowExecutions: js.UndefOr[FlowExecutionList] = js.undefined
  
  /**
    *  The pagination token for the next page of data. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeFlowExecutionRecordsResponse {
  
  @scala.inline
  def apply(): DescribeFlowExecutionRecordsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFlowExecutionRecordsResponse]
  }
  
  @scala.inline
  implicit class DescribeFlowExecutionRecordsResponseMutableBuilder[Self <: DescribeFlowExecutionRecordsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowExecutions(value: FlowExecutionList): Self = StObject.set(x, "flowExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowExecutionsUndefined: Self = StObject.set(x, "flowExecutions", js.undefined)
    
    @scala.inline
    def setFlowExecutionsVarargs(value: ExecutionRecord*): Self = StObject.set(x, "flowExecutions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
