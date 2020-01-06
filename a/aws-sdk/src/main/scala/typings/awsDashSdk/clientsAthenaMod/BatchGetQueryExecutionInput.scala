package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

