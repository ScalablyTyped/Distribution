package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueryExecutionOutput extends js.Object {
  /**
    * Information about the query execution.
    */
  var QueryExecution: js.UndefOr[typings.awsDashSdk.clientsAthenaMod.QueryExecution] = js.native
}

object GetQueryExecutionOutput {
  @scala.inline
  def apply(QueryExecution: QueryExecution = null): GetQueryExecutionOutput = {
    val __obj = js.Dynamic.literal()
    if (QueryExecution != null) __obj.updateDynamic("QueryExecution")(QueryExecution.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryExecutionOutput]
  }
}

