package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQueryExecutionInput extends js.Object {
  /**
    * The unique ID of the query execution.
    */
  var QueryExecutionId: awsDashSdkLib.clientsAthenaMod.QueryExecutionId
}

object GetQueryExecutionInput {
  @scala.inline
  def apply(QueryExecutionId: QueryExecutionId): GetQueryExecutionInput = {
    val __obj = js.Dynamic.literal(QueryExecutionId = QueryExecutionId)
  
    __obj.asInstanceOf[GetQueryExecutionInput]
  }
}

