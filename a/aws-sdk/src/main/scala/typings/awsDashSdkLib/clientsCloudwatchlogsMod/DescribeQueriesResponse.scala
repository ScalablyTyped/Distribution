package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeQueriesResponse extends js.Object {
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The list of queries that match the request.
    */
  var queries: js.UndefOr[QueryInfoList] = js.undefined
}

object DescribeQueriesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, queries: QueryInfoList = null): DescribeQueriesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (queries != null) __obj.updateDynamic("queries")(queries)
    __obj.asInstanceOf[DescribeQueriesResponse]
  }
}

