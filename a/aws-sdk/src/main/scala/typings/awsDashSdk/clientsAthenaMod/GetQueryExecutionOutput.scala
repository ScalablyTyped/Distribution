package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQueryExecutionOutput extends js.Object {
  /**
    * Information about the query execution.
    */
  var QueryExecution: js.UndefOr[typings.awsDashSdk.clientsAthenaMod.QueryExecution] = js.undefined
}

object GetQueryExecutionOutput {
  @scala.inline
  def apply(QueryExecution: QueryExecution = null): GetQueryExecutionOutput = {
    val __obj = js.Dynamic.literal()
    if (QueryExecution != null) __obj.updateDynamic("QueryExecution")(QueryExecution)
    __obj.asInstanceOf[GetQueryExecutionOutput]
  }
}

