package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListQueryExecutionsOutput extends js.Object {
  
  /**
    * A token to be used by the next request if this request is truncated.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * The unique IDs of each query execution as an array of strings.
    */
  var QueryExecutionIds: js.UndefOr[QueryExecutionIdList] = js.native
}
object ListQueryExecutionsOutput {
  
  @scala.inline
  def apply(): ListQueryExecutionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueryExecutionsOutput]
  }
  
  @scala.inline
  implicit class ListQueryExecutionsOutputOps[Self <: ListQueryExecutionsOutput] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setQueryExecutionIdsVarargs(value: QueryExecutionId*): Self = this.set("QueryExecutionIds", js.Array(value :_*))
    
    @scala.inline
    def setQueryExecutionIds(value: QueryExecutionIdList): Self = this.set("QueryExecutionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryExecutionIds: Self = this.set("QueryExecutionIds", js.undefined)
  }
}
