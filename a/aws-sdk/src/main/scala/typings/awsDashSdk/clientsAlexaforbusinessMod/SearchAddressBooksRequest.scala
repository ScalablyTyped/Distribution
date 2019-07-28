package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAddressBooksRequest extends js.Object {
  /**
    * The filters to use to list a specified set of address books. The supported filter key is AddressBookName.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.MaxResults] = js.undefined
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response only includes results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
  /**
    * The sort order to use in listing the specified set of address books. The supported sort key is AddressBookName.
    */
  var SortCriteria: js.UndefOr[SortList] = js.undefined
}

object SearchAddressBooksRequest {
  @scala.inline
  def apply(
    Filters: FilterList = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    SortCriteria: SortList = null
  ): SearchAddressBooksRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SortCriteria != null) __obj.updateDynamic("SortCriteria")(SortCriteria)
    __obj.asInstanceOf[SearchAddressBooksRequest]
  }
}

