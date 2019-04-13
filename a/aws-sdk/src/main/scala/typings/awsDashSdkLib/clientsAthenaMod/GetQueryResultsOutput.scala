package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQueryResultsOutput extends js.Object {
  /**
    * A token to be used by the next request if this request is truncated.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * The results of the query execution.
    */
  var ResultSet: js.UndefOr[ResultSet] = js.undefined
  /**
    * The number of rows inserted with a CREATE TABLE AS SELECT statement. 
    */
  var UpdateCount: js.UndefOr[Long] = js.undefined
}

object GetQueryResultsOutput {
  @scala.inline
  def apply(NextToken: Token = null, ResultSet: ResultSet = null, UpdateCount: js.UndefOr[Long] = js.undefined): GetQueryResultsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ResultSet != null) __obj.updateDynamic("ResultSet")(ResultSet)
    if (!js.isUndefined(UpdateCount)) __obj.updateDynamic("UpdateCount")(UpdateCount)
    __obj.asInstanceOf[GetQueryResultsOutput]
  }
}

