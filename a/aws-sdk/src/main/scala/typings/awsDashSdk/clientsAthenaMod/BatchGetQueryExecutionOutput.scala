package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetQueryExecutionOutput extends js.Object {
  /**
    * Information about a query execution.
    */
  var QueryExecutions: js.UndefOr[QueryExecutionList] = js.native
  /**
    * Information about the query executions that failed to run.
    */
  var UnprocessedQueryExecutionIds: js.UndefOr[UnprocessedQueryExecutionIdList] = js.native
}

object BatchGetQueryExecutionOutput {
  @scala.inline
  def apply(
    QueryExecutions: QueryExecutionList = null,
    UnprocessedQueryExecutionIds: UnprocessedQueryExecutionIdList = null
  ): BatchGetQueryExecutionOutput = {
    val __obj = js.Dynamic.literal()
    if (QueryExecutions != null) __obj.updateDynamic("QueryExecutions")(QueryExecutions.asInstanceOf[js.Any])
    if (UnprocessedQueryExecutionIds != null) __obj.updateDynamic("UnprocessedQueryExecutionIds")(UnprocessedQueryExecutionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetQueryExecutionOutput]
  }
}

