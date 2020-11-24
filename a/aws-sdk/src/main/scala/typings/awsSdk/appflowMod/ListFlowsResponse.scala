package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFlowsResponse extends js.Object {
  
  /**
    *  The list of flows associated with your account. 
    */
  var flows: js.UndefOr[FlowList] = js.native
  
  /**
    *  The pagination token for next page of data. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListFlowsResponse {
  
  @scala.inline
  def apply(): ListFlowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFlowsResponse]
  }
  
  @scala.inline
  implicit class ListFlowsResponseOps[Self <: ListFlowsResponse] (val x: Self) extends AnyVal {
    
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
    def setFlowsVarargs(value: FlowDefinition*): Self = this.set("flows", js.Array(value :_*))
    
    @scala.inline
    def setFlows(value: FlowList): Self = this.set("flows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlows: Self = this.set("flows", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
