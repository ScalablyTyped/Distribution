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
  def apply(
    Filters: FilterList = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    SortCriteria: SortList = null
  ): SearchSkillGroupsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortCriteria != null) __obj.updateDynamic("SortCriteria")(SortCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSkillGroupsRequest]
  }
}

