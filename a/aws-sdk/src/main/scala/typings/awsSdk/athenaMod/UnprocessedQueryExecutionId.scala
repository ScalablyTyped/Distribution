package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnprocessedQueryExecutionId extends js.Object {
  /**
    * The error code returned when the query execution failed to process, if applicable.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.athenaMod.ErrorCode] = js.native
  /**
    * The error message returned when the query execution failed to process, if applicable.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.athenaMod.ErrorMessage] = js.native
  /**
    * The unique identifier of the query execution.
    */
  var QueryExecutionId: js.UndefOr[typings.awsSdk.athenaMod.QueryExecutionId] = js.native
}

object UnprocessedQueryExecutionId {
  @scala.inline
  def apply(
    ErrorCode: ErrorCode = null,
    ErrorMessage: ErrorMessage = null,
    QueryExecutionId: QueryExecutionId = null
  ): UnprocessedQueryExecutionId = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (QueryExecutionId != null) __obj.updateDynamic("QueryExecutionId")(QueryExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnprocessedQueryExecutionId]
  }
}

