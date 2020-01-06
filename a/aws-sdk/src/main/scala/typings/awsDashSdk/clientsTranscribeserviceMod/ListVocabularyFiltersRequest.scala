package typings.awsDashSdk.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVocabularyFiltersRequest extends js.Object {
  /**
    * The maximum number of filters to return in the response. If there are fewer results in the list, this response contains only the actual results.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.MaxResults] = js.native
  /**
    * Filters the response so that it only contains vocabulary filters whose name contains the specified string.
    */
  var NameContains: js.UndefOr[VocabularyFilterName] = js.native
  /**
    * If the result of the previous request to ListVocabularyFilters was truncated, include the NextToken to fetch the next set of collections.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsTranscribeserviceMod.NextToken] = js.native
}

object ListVocabularyFiltersRequest {
  @scala.inline
  def apply(
    MaxResults: Int | Double = null,
    NameContains: VocabularyFilterName = null,
    NextToken: NextToken = null
  ): ListVocabularyFiltersRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVocabularyFiltersRequest]
  }
}

