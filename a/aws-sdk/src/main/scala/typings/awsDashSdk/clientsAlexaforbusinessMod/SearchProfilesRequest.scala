package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchProfilesRequest extends js.Object {
  /**
    * The filters to use to list a specified set of room profiles. Supported filter keys are ProfileName and Address. Required. 
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.MaxResults] = js.undefined
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
  /**
    * The sort order to use in listing the specified set of room profiles. Supported sort keys are ProfileName and Address.
    */
  var SortCriteria: js.UndefOr[SortList] = js.undefined
}

object SearchProfilesRequest {
  @scala.inline
  def apply(
    Filters: FilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    SortCriteria: SortList = null
  ): SearchProfilesRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SortCriteria != null) __obj.updateDynamic("SortCriteria")(SortCriteria)
    __obj.asInstanceOf[SearchProfilesRequest]
  }
}

