package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFlowsRequest extends js.Object {
  
  /**
    *  Specifies the maximum number of items that should be returned in the result set. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    *  The pagination token for next page of data. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListFlowsRequest {
  
  @scala.inline
  def apply(): ListFlowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFlowsRequest]
  }
  
  @scala.inline
  implicit class ListFlowsRequestOps[Self <: ListFlowsRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
