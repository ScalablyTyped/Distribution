package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListQueryExecutionsOutput extends js.Object {
  /**
    * A token to be used by the next request if this request is truncated.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * The unique IDs of each query execution as an array of strings.
    */
  var QueryExecutionIds: js.UndefOr[QueryExecutionIdList] = js.undefined
}

object ListQueryExecutionsOutput {
  @scala.inline
  def apply(NextToken: Token = null, QueryExecutionIds: QueryExecutionIdList = null): ListQueryExecutionsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (QueryExecutionIds != null) __obj.updateDynamic("QueryExecutionIds")(QueryExecutionIds)
    __obj.asInstanceOf[ListQueryExecutionsOutput]
  }
}

