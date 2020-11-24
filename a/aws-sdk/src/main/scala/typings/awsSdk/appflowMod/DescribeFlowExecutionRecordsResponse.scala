package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFlowExecutionRecordsResponse extends js.Object {
  
  /**
    *  Returns a list of all instances when this flow was run. 
    */
  var flowExecutions: js.UndefOr[FlowExecutionList] = js.native
  
  /**
    *  The pagination token for the next page of data. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeFlowExecutionRecordsResponse {
  
  @scala.inline
  def apply(): DescribeFlowExecutionRecordsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFlowExecutionRecordsResponse]
  }
  
  @scala.inline
  implicit class DescribeFlowExecutionRecordsResponseOps[Self <: DescribeFlowExecutionRecordsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFlowExecutionsVarargs(value: ExecutionRecord*): Self = this.set("flowExecutions", js.Array(value :_*))
    
    @scala.inline
    def setFlowExecutions(value: FlowExecutionList): Self = this.set("flowExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowExecutions: Self = this.set("flowExecutions", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
