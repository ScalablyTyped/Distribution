package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExportSnapshotRecordsResult extends js.Object {
  /**
    * A list of objects describing the export snapshot records.
    */
  var exportSnapshotRecords: js.UndefOr[ExportSnapshotRecordList] = js.undefined
  /**
    * A token used for advancing to the next page of results of your get relational database bundles request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object GetExportSnapshotRecordsResult {
  @scala.inline
  def apply(exportSnapshotRecords: ExportSnapshotRecordList = null, nextPageToken: String = null): GetExportSnapshotRecordsResult = {
    val __obj = js.Dynamic.literal()
    if (exportSnapshotRecords != null) __obj.updateDynamic("exportSnapshotRecords")(exportSnapshotRecords)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[GetExportSnapshotRecordsResult]
  }
}

