package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSkillGroupsResponse extends js.Object {
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
  /**
    * The skill groups that meet the filter criteria, in sort order.
    */
  var SkillGroups: js.UndefOr[SkillGroupDataList] = js.undefined
  /**
    * The total number of skill groups returned.
    */
  var TotalCount: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.TotalCount] = js.undefined
}

object SearchSkillGroupsResponse {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    SkillGroups: SkillGroupDataList = null,
    TotalCount: Int | Double = null
  ): SearchSkillGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SkillGroups != null) __obj.updateDynamic("SkillGroups")(SkillGroups)
    if (TotalCount != null) __obj.updateDynamic("TotalCount")(TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSkillGroupsResponse]
  }
}

