package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeQueriesResponse extends js.Object {
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The list of queries that match the request.
    */
  var queries: js.UndefOr[QueryInfoList] = js.native
}

object DescribeQueriesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, queries: QueryInfoList = null): DescribeQueriesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeQueriesResponse]
  }
}

