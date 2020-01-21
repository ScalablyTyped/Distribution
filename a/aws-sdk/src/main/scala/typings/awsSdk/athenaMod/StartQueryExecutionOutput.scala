package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartQueryExecutionOutput extends js.Object {
  /**
    * The unique ID of the query that ran as a result of this request.
    */
  var QueryExecutionId: js.UndefOr[typings.awsSdk.athenaMod.QueryExecutionId] = js.native
}

object StartQueryExecutionOutput {
  @scala.inline
  def apply(QueryExecutionId: QueryExecutionId = null): StartQueryExecutionOutput = {
    val __obj = js.Dynamic.literal()
    if (QueryExecutionId != null) __obj.updateDynamic("QueryExecutionId")(QueryExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartQueryExecutionOutput]
  }
}

