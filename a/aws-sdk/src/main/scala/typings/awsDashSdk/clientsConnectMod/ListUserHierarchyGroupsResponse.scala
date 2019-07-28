package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUserHierarchyGroupsResponse extends js.Object {
  /**
    * A string returned in the response. Use the value returned in the response as the value of the NextToken in a subsequent request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConnectMod.NextToken] = js.undefined
  /**
    * An array of HierarchyGroupSummary objects.
    */
  var UserHierarchyGroupSummaryList: js.UndefOr[HierarchyGroupSummaryList] = js.undefined
}

object ListUserHierarchyGroupsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, UserHierarchyGroupSummaryList: HierarchyGroupSummaryList = null): ListUserHierarchyGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (UserHierarchyGroupSummaryList != null) __obj.updateDynamic("UserHierarchyGroupSummaryList")(UserHierarchyGroupSummaryList)
    __obj.asInstanceOf[ListUserHierarchyGroupsResponse]
  }
}

