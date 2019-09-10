package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJournalS3ExportsRequest extends js.Object {
  /**
    * The maximum number of results to return in a single ListJournalS3Exports request. (The actual number of results returned might be fewer.)
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsQldbMod.MaxResults] = js.undefined
  /**
    * A pagination token, indicating that you want to retrieve the next page of results. If you received a value for NextToken in the response from a previous ListJournalS3Exports call, then you should use that value as input here.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsQldbMod.NextToken] = js.undefined
}

object ListJournalS3ExportsRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: NextToken = null): ListJournalS3ExportsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListJournalS3ExportsRequest]
  }
}

