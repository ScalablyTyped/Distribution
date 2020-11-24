package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetQueryExecutionInput extends js.Object {
  
  /**
    * An array of query execution IDs.
    */
  var QueryExecutionIds: QueryExecutionIdList = js.native
}
object BatchGetQueryExecutionInput {
  
  @scala.inline
  def apply(QueryExecutionIds: QueryExecutionIdList): BatchGetQueryExecutionInput = {
    val __obj = js.Dynamic.literal(QueryExecutionIds = QueryExecutionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetQueryExecutionInput]
  }
  
  @scala.inline
  implicit class BatchGetQueryExecutionInputOps[Self <: BatchGetQueryExecutionInput] (val x: Self) extends AnyVal {
    
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
    def setQueryExecutionIdsVarargs(value: QueryExecutionId*): Self = this.set("QueryExecutionIds", js.Array(value :_*))
    
    @scala.inline
    def setQueryExecutionIds(value: QueryExecutionIdList): Self = this.set("QueryExecutionIds", value.asInstanceOf[js.Any])
  }
}
