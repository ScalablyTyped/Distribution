package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueryExecutionInput extends js.Object {
  /**
    * The unique ID of the query execution.
    */
  var QueryExecutionId: typings.awsSdk.athenaMod.QueryExecutionId = js.native
}

object GetQueryExecutionInput {
  @scala.inline
  def apply(QueryExecutionId: QueryExecutionId): GetQueryExecutionInput = {
    val __obj = js.Dynamic.literal(QueryExecutionId = QueryExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryExecutionInput]
  }
  @scala.inline
  implicit class GetQueryExecutionInputOps[Self <: GetQueryExecutionInput] (val x: Self) extends AnyVal {
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
    def setQueryExecutionId(value: QueryExecutionId): Self = this.set("QueryExecutionId", value.asInstanceOf[js.Any])
  }
  
}

