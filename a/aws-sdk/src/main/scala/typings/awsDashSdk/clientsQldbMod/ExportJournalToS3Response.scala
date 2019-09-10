package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportJournalToS3Response extends js.Object {
  /**
    * The unique ID that QLDB assigns to each journal export job. To describe your export request and check the status of the job, you can use ExportId to call DescribeJournalS3Export.
    */
  var ExportId: UniqueId
}

object ExportJournalToS3Response {
  @scala.inline
  def apply(ExportId: UniqueId): ExportJournalToS3Response = {
    val __obj = js.Dynamic.literal(ExportId = ExportId)
  
    __obj.asInstanceOf[ExportJournalToS3Response]
  }
}

