package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJournalS3ExportsForLedgerRequest extends js.Object {
  /**
    * The maximum number of results to return in a single ListJournalS3ExportsForLedger request. (The actual number of results returned might be fewer.)
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsQldbMod.MaxResults] = js.undefined
  /**
    * The name of the ledger.
    */
  var Name: LedgerName
  /**
    * A pagination token, indicating that you want to retrieve the next page of results. If you received a value for NextToken in the response from a previous ListJournalS3ExportsForLedger call, then you should use that value as input here.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsQldbMod.NextToken] = js.undefined
}

object ListJournalS3ExportsForLedgerRequest {
  @scala.inline
  def apply(Name: LedgerName, MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: NextToken = null): ListJournalS3ExportsForLedgerRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListJournalS3ExportsForLedgerRequest]
  }
}

