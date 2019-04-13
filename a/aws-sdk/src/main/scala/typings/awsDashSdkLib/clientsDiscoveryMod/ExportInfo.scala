package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportInfo extends js.Object {
  /**
    * A URL for an Amazon S3 bucket where you can review the exported data. The URL is displayed only if the export succeeded.
    */
  var configurationsDownloadUrl: js.UndefOr[ConfigurationsDownloadUrl] = js.undefined
  /**
    * A unique identifier used to query an export.
    */
  var exportId: ConfigurationsExportId
  /**
    * The time that the data export was initiated.
    */
  var exportRequestTime: ExportRequestTime
  /**
    * The status of the data export job.
    */
  var exportStatus: ExportStatus
  /**
    * If true, the export of agent information exceeded the size limit for a single export and the exported data is incomplete for the requested time range. To address this, select a smaller time range for the export by using startDate and endDate.
    */
  var isTruncated: js.UndefOr[Boolean] = js.undefined
  /**
    * The endTime used in the StartExportTask request. If no endTime was requested, this result does not appear in ExportInfo.
    */
  var requestedEndTime: js.UndefOr[TimeStamp] = js.undefined
  /**
    * The value of startTime parameter in the StartExportTask request. If no startTime was requested, this result does not appear in ExportInfo.
    */
  var requestedStartTime: js.UndefOr[TimeStamp] = js.undefined
  /**
    * A status message provided for API callers.
    */
  var statusMessage: ExportStatusMessage
}

object ExportInfo {
  @scala.inline
  def apply(
    exportId: ConfigurationsExportId,
    exportRequestTime: ExportRequestTime,
    exportStatus: ExportStatus,
    statusMessage: ExportStatusMessage,
    configurationsDownloadUrl: ConfigurationsDownloadUrl = null,
    isTruncated: js.UndefOr[Boolean] = js.undefined,
    requestedEndTime: TimeStamp = null,
    requestedStartTime: TimeStamp = null
  ): ExportInfo = {
    val __obj = js.Dynamic.literal(exportId = exportId, exportRequestTime = exportRequestTime, exportStatus = exportStatus.asInstanceOf[js.Any], statusMessage = statusMessage)
    if (configurationsDownloadUrl != null) __obj.updateDynamic("configurationsDownloadUrl")(configurationsDownloadUrl)
    if (!js.isUndefined(isTruncated)) __obj.updateDynamic("isTruncated")(isTruncated)
    if (requestedEndTime != null) __obj.updateDynamic("requestedEndTime")(requestedEndTime)
    if (requestedStartTime != null) __obj.updateDynamic("requestedStartTime")(requestedStartTime)
    __obj.asInstanceOf[ExportInfo]
  }
}

