package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSkillGroupsResponse extends js.Object {
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
  /**
    * The skill groups that meet the filter criteria, in sort order.
    */
  var SkillGroups: js.UndefOr[SkillGroupDataList] = js.native
  /**
    * The total number of skill groups returned.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TotalCount] = js.native
}

object SearchSkillGroupsResponse {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    SkillGroups: SkillGroupDataList = null,
    TotalCount: js.UndefOr[TotalCount] = js.undefined
  ): SearchSkillGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SkillGroups != null) __obj.updateDynamic("SkillGroups")(SkillGroups.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalCount)) __obj.updateDynamic("TotalCount")(TotalCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSkillGroupsResponse]
  }
}

