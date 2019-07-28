package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetQueryExecutionInput extends js.Object {
  /**
    * An array of query execution IDs.
    */
  var QueryExecutionIds: QueryExecutionIdList
}

object BatchGetQueryExecutionInput {
  @scala.inline
  def apply(QueryExecutionIds: QueryExecutionIdList): BatchGetQueryExecutionInput = {
    val __obj = js.Dynamic.literal(QueryExecutionIds = QueryExecutionIds)
  
    __obj.asInstanceOf[BatchGetQueryExecutionInput]
  }
}

