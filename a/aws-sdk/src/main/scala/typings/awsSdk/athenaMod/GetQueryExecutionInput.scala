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
}

