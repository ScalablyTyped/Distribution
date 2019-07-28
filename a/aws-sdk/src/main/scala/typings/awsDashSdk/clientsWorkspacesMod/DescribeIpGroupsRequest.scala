package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeIpGroupsRequest extends js.Object {
  /**
    * The identifiers of one or more IP access control groups.
    */
  var GroupIds: js.UndefOr[IpGroupIdList] = js.undefined
  /**
    * The maximum number of items to return.
    */
  var MaxResults: js.UndefOr[Limit] = js.undefined
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object DescribeIpGroupsRequest {
  @scala.inline
  def apply(
    GroupIds: IpGroupIdList = null,
    MaxResults: js.UndefOr[Limit] = js.undefined,
    NextToken: PaginationToken = null
  ): DescribeIpGroupsRequest = {
    val __obj = js.Dynamic.literal()
    if (GroupIds != null) __obj.updateDynamic("GroupIds")(GroupIds)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeIpGroupsRequest]
  }
}

