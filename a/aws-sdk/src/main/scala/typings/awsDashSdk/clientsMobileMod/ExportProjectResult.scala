package typings.awsDashSdk.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportProjectResult extends js.Object {
  /**
    *  URL which can be used to download the exported project configuation file(s). 
    */
  var downloadUrl: js.UndefOr[DownloadUrl] = js.undefined
  /**
    *  URL which can be shared to allow other AWS users to create their own project in AWS Mobile Hub with the same configuration as the specified project. This URL pertains to a snapshot in time of the project configuration that is created when this API is called. If you want to share additional changes to your project configuration, then you will need to create and share a new snapshot by calling this method again. 
    */
  var shareUrl: js.UndefOr[ShareUrl] = js.undefined
  /**
    *  Unique identifier for the exported snapshot of the project configuration. This snapshot identifier is included in the share URL. 
    */
  var snapshotId: js.UndefOr[SnapshotId] = js.undefined
}

object ExportProjectResult {
  @scala.inline
  def apply(downloadUrl: DownloadUrl = null, shareUrl: ShareUrl = null, snapshotId: SnapshotId = null): ExportProjectResult = {
    val __obj = js.Dynamic.literal()
    if (downloadUrl != null) __obj.updateDynamic("downloadUrl")(downloadUrl)
    if (shareUrl != null) __obj.updateDynamic("shareUrl")(shareUrl)
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId)
    __obj.asInstanceOf[ExportProjectResult]
  }
}

