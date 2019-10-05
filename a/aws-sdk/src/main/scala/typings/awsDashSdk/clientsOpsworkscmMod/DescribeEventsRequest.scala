package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventsRequest extends js.Object {
  /**
    * To receive a paginated response, use this parameter to specify the maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results. 
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.MaxResults] = js.undefined
  /**
    * NextToken is a string that is returned in some command responses. It indicates that not all entries have been returned, and that you must run at least one more request to get remaining items. To get remaining results, call DescribeEvents again, and assign the token from the previous results as the value of the nextToken parameter. If there are no more results, the response object's nextToken parameter value is null. Setting a nextToken value that was not returned in your previous results causes an InvalidNextTokenException to occur. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.NextToken] = js.undefined
  /**
    * The name of the server for which you want to view events.
    */
  var ServerName: typings.awsDashSdk.clientsOpsworkscmMod.ServerName
}

object DescribeEventsRequest {
  @scala.inline
  def apply(ServerName: ServerName, MaxResults: Int | Double = null, NextToken: NextToken = null): DescribeEventsRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeEventsRequest]
  }
}

