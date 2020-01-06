package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingsRequest extends js.Object {
  /**
    * The findings attributes used to define a condition to filter the findings returned.
    */
  var Filters: js.UndefOr[AwsSecurityFindingFilters] = js.native
  /**
    * The maximum number of findings to return.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.MaxResults] = js.native
  /**
    * Paginates results. On your first call to the GetFindings operation, set the value of this parameter to NULL. For subsequent calls to the operation, fill nextToken in the request with the value of nextToken from the previous response to continue listing data.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.NextToken] = js.native
  /**
    * Findings attributes used to sort the list of findings returned.
    */
  var SortCriteria: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.SortCriteria] = js.native
}

object GetFindingsRequest {
  @scala.inline
  def apply(
    Filters: AwsSecurityFindingFilters = null,
    MaxResults: Int | scala.Double = null,
    NextToken: NextToken = null,
    SortCriteria: SortCriteria = null
  ): GetFindingsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortCriteria != null) __obj.updateDynamic("SortCriteria")(SortCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsRequest]
  }
}

