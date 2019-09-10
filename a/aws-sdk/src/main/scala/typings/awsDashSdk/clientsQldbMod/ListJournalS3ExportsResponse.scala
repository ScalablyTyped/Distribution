package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJournalS3ExportsResponse extends js.Object {
  /**
    * The array of journal export job descriptions for all ledgers that are associated with the current AWS account and Region.
    */
  var JournalS3Exports: js.UndefOr[JournalS3ExportList] = js.undefined
  /**
    *   If NextToken is empty, then the last page of results has been processed and there are no more results to be retrieved.   If NextToken is not empty, then there are more results available. To retrieve the next page of results, use the value of NextToken in a subsequent ListJournalS3Exports call.  
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsQldbMod.NextToken] = js.undefined
}

object ListJournalS3ExportsResponse {
  @scala.inline
  def apply(JournalS3Exports: JournalS3ExportList = null, NextToken: NextToken = null): ListJournalS3ExportsResponse = {
    val __obj = js.Dynamic.literal()
    if (JournalS3Exports != null) __obj.updateDynamic("JournalS3Exports")(JournalS3Exports)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListJournalS3ExportsResponse]
  }
}

