package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProblemsRequest extends js.Object {
  /**
    * The time when the problem ended, in epoch seconds. If not specified, problems within the past seven days are returned.
    */
  var EndTime: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.EndTime] = js.native
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[MaxEntities] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.ResourceGroupName] = js.native
  /**
    * The time when the problem was detected, in epoch seconds. If you don't specify a time frame for the request, problems within the past seven days are returned.
    */
  var StartTime: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.StartTime] = js.native
}

object ListProblemsRequest {
  @scala.inline
  def apply(
    EndTime: EndTime = null,
    MaxResults: Int | Double = null,
    NextToken: PaginationToken = null,
    ResourceGroupName: ResourceGroupName = null,
    StartTime: StartTime = null
  ): ListProblemsRequest = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResourceGroupName != null) __obj.updateDynamic("ResourceGroupName")(ResourceGroupName.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProblemsRequest]
  }
}

