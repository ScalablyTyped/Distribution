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
  def apply(): SearchSkillGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSkillGroupsResponse]
  }
  @scala.inline
  implicit class SearchSkillGroupsResponseOps[Self <: SearchSkillGroupsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSkillGroupsVarargs(value: SkillGroupData*): Self = this.set("SkillGroups", js.Array(value :_*))
    @scala.inline
    def setSkillGroups(value: SkillGroupDataList): Self = this.set("SkillGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkillGroups: Self = this.set("SkillGroups", js.undefined)
    @scala.inline
    def setTotalCount(value: TotalCount): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalCount: Self = this.set("TotalCount", js.undefined)
  }
  
}

