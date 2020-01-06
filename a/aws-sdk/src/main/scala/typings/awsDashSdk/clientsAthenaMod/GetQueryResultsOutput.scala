package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueryResultsOutput extends js.Object {
  /**
    * A token to be used by the next request if this request is truncated.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The results of the query execution.
    */
  var ResultSet: js.UndefOr[typings.awsDashSdk.clientsAthenaMod.ResultSet] = js.native
  /**
    * The number of rows inserted with a CREATE TABLE AS SELECT statement. 
    */
  var UpdateCount: js.UndefOr[Long] = js.native
}

object GetQueryResultsOutput {
  @scala.inline
  def apply(NextToken: Token = null, ResultSet: ResultSet = null, UpdateCount: Int | Double = null): GetQueryResultsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResultSet != null) __obj.updateDynamic("ResultSet")(ResultSet.asInstanceOf[js.Any])
    if (UpdateCount != null) __obj.updateDynamic("UpdateCount")(UpdateCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryResultsOutput]
  }
}

