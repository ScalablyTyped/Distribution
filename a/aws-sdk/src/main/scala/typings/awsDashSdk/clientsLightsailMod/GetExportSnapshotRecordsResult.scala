package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExportSnapshotRecordsResult extends js.Object {
  /**
    * A list of objects describing the export snapshot records.
    */
  var exportSnapshotRecords: js.UndefOr[ExportSnapshotRecordList] = js.native
  /**
    * A token used for advancing to the next page of results of your get relational database bundles request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetExportSnapshotRecordsResult {
  @scala.inline
  def apply(exportSnapshotRecords: ExportSnapshotRecordList = null, nextPageToken: String = null): GetExportSnapshotRecordsResult = {
    val __obj = js.Dynamic.literal()
    if (exportSnapshotRecords != null) __obj.updateDynamic("exportSnapshotRecords")(exportSnapshotRecords.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportSnapshotRecordsResult]
  }
}

