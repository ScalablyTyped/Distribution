package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnprocessedQueryExecutionId extends js.Object {
  /**
    * The error code returned when the query execution failed to process, if applicable.
    */
  var ErrorCode: js.UndefOr[ErrorCode] = js.undefined
  /**
    * The error message returned when the query execution failed to process, if applicable.
    */
  var ErrorMessage: js.UndefOr[ErrorMessage] = js.undefined
  /**
    * The unique identifier of the query execution.
    */
  var QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined
}

object UnprocessedQueryExecutionId {
  @scala.inline
  def apply(
    ErrorCode: ErrorCode = null,
    ErrorMessage: ErrorMessage = null,
    QueryExecutionId: QueryExecutionId = null
  ): UnprocessedQueryExecutionId = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (QueryExecutionId != null) __obj.updateDynamic("QueryExecutionId")(QueryExecutionId)
    __obj.asInstanceOf[UnprocessedQueryExecutionId]
  }
}

