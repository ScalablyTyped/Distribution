package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartQueryExecutionOutput extends js.Object {
  /**
    * The unique ID of the query that ran as a result of this request.
    */
  var QueryExecutionId: js.UndefOr[QueryExecutionId] = js.undefined
}

object StartQueryExecutionOutput {
  @scala.inline
  def apply(QueryExecutionId: QueryExecutionId = null): StartQueryExecutionOutput = {
    val __obj = js.Dynamic.literal()
    if (QueryExecutionId != null) __obj.updateDynamic("QueryExecutionId")(QueryExecutionId)
    __obj.asInstanceOf[StartQueryExecutionOutput]
  }
}

