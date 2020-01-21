package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFindingsRequest extends js.Object {
  /**
    * The ARN of the analyzer to retrieve findings from.
    */
  var analyzerArn: AnalyzerArn = js.native
  /**
    * A filter to match for the findings to return.
    */
  var filter: js.UndefOr[FilterCriteriaMap] = js.native
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.native
  /**
    * The sort order for the findings returned.
    */
  var sort: js.UndefOr[SortCriteria] = js.native
}

object ListFindingsRequest {
  @scala.inline
  def apply(
    analyzerArn: AnalyzerArn,
    filter: FilterCriteriaMap = null,
    maxResults: Int | Double = null,
    nextToken: Token = null,
    sort: SortCriteria = null
  ): ListFindingsRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFindingsRequest]
  }
}

