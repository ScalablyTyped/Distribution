package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeJournalS3ExportRequest extends js.Object {
  /**
    * The unique ID of the journal export job that you want to describe.
    */
  var ExportId: UniqueId
  /**
    * The name of the ledger.
    */
  var Name: LedgerName
}

object DescribeJournalS3ExportRequest {
  @scala.inline
  def apply(ExportId: UniqueId, Name: LedgerName): DescribeJournalS3ExportRequest = {
    val __obj = js.Dynamic.literal(ExportId = ExportId, Name = Name)
  
    __obj.asInstanceOf[DescribeJournalS3ExportRequest]
  }
}

