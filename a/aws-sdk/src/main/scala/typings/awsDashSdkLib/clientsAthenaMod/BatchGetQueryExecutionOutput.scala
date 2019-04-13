package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetQueryExecutionOutput extends js.Object {
  /**
    * Information about a query execution.
    */
  var QueryExecutions: js.UndefOr[QueryExecutionList] = js.undefined
  /**
    * Information about the query executions that failed to run.
    */
  var UnprocessedQueryExecutionIds: js.UndefOr[UnprocessedQueryExecutionIdList] = js.undefined
}

object BatchGetQueryExecutionOutput {
  @scala.inline
  def apply(
    QueryExecutions: QueryExecutionList = null,
    UnprocessedQueryExecutionIds: UnprocessedQueryExecutionIdList = null
  ): BatchGetQueryExecutionOutput = {
    val __obj = js.Dynamic.literal()
    if (QueryExecutions != null) __obj.updateDynamic("QueryExecutions")(QueryExecutions)
    if (UnprocessedQueryExecutionIds != null) __obj.updateDynamic("UnprocessedQueryExecutionIds")(UnprocessedQueryExecutionIds)
    __obj.asInstanceOf[BatchGetQueryExecutionOutput]
  }
}

