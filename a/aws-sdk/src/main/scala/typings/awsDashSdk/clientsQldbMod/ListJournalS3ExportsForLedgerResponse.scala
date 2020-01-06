package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJournalS3ExportsForLedgerResponse extends js.Object {
  /**
    * The array of journal export job descriptions that are associated with the specified ledger.
    */
  var JournalS3Exports: js.UndefOr[JournalS3ExportList] = js.native
  /**
    *   If NextToken is empty, then the last page of results has been processed and there are no more results to be retrieved.   If NextToken is not empty, then there are more results available. To retrieve the next page of results, use the value of NextToken in a subsequent ListJournalS3ExportsForLedger call.  
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsQldbMod.NextToken] = js.native
}

object ListJournalS3ExportsForLedgerResponse {
  @scala.inline
  def apply(JournalS3Exports: JournalS3ExportList = null, NextToken: NextToken = null): ListJournalS3ExportsForLedgerResponse = {
    val __obj = js.Dynamic.literal()
    if (JournalS3Exports != null) __obj.updateDynamic("JournalS3Exports")(JournalS3Exports.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJournalS3ExportsForLedgerResponse]
  }
}

