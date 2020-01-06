package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserHierarchyGroupsResponse extends js.Object {
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConnectMod.NextToken] = js.native
  /**
    * Information about the hierarchy groups.
    */
  var UserHierarchyGroupSummaryList: js.UndefOr[HierarchyGroupSummaryList] = js.native
}

object ListUserHierarchyGroupsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, UserHierarchyGroupSummaryList: HierarchyGroupSummaryList = null): ListUserHierarchyGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (UserHierarchyGroupSummaryList != null) __obj.updateDynamic("UserHierarchyGroupSummaryList")(UserHierarchyGroupSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserHierarchyGroupsResponse]
  }
}

