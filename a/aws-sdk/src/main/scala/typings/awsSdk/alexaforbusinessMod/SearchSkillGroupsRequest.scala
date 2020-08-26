package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSkillGroupsRequest extends js.Object {
  /**
    * The filters to use to list a specified set of skill groups. The supported filter key is SkillGroupName. 
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.alexaforbusinessMod.MaxResults] = js.native
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults. Required.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
  /**
    * The sort order to use in listing the specified set of skill groups. The supported sort key is SkillGroupName. 
    */
  var SortCriteria: js.UndefOr[SortList] = js.native
}

object SearchSkillGroupsRequest {
  @scala.inline
  def apply(): SearchSkillGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSkillGroupsRequest]
  }
  @scala.inline
  implicit class SearchSkillGroupsRequestOps[Self <: SearchSkillGroupsRequest] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSortCriteriaVarargs(value: Sort*): Self = this.set("SortCriteria", js.Array(value :_*))
    @scala.inline
    def setSortCriteria(value: SortList): Self = this.set("SortCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortCriteria: Self = this.set("SortCriteria", js.undefined)
  }
  
}

