package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSkillGroupsResponse extends js.Object {
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The skill groups that meet the filter criteria, in sort order.
    */
  var SkillGroups: js.UndefOr[SkillGroupDataList] = js.undefined
  /**
    * The total number of skill groups returned.
    */
  var TotalCount: js.UndefOr[TotalCount] = js.undefined
}

object SearchSkillGroupsResponse {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    SkillGroups: SkillGroupDataList = null,
    TotalCount: js.UndefOr[TotalCount] = js.undefined
  ): SearchSkillGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SkillGroups != null) __obj.updateDynamic("SkillGroups")(SkillGroups)
    if (!js.isUndefined(TotalCount)) __obj.updateDynamic("TotalCount")(TotalCount)
    __obj.asInstanceOf[SearchSkillGroupsResponse]
  }
}

