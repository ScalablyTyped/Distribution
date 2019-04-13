package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopQueryExecutionInput extends js.Object {
  /**
    * The unique ID of the query execution to stop.
    */
  var QueryExecutionId: awsDashSdkLib.clientsAthenaMod.QueryExecutionId
}

object StopQueryExecutionInput {
  @scala.inline
  def apply(QueryExecutionId: QueryExecutionId): StopQueryExecutionInput = {
    val __obj = js.Dynamic.literal(QueryExecutionId = QueryExecutionId)
  
    __obj.asInstanceOf[StopQueryExecutionInput]
  }
}

