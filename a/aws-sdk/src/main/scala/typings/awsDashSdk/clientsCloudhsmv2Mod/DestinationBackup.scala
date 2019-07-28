package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestinationBackup extends js.Object {
  var CreateTimestamp: js.UndefOr[Timestamp] = js.undefined
  var SourceBackup: js.UndefOr[BackupId] = js.undefined
  var SourceCluster: js.UndefOr[ClusterId] = js.undefined
  var SourceRegion: js.UndefOr[Region] = js.undefined
}

object DestinationBackup {
  @scala.inline
  def apply(
    CreateTimestamp: Timestamp = null,
    SourceBackup: BackupId = null,
    SourceCluster: ClusterId = null,
    SourceRegion: Region = null
  ): DestinationBackup = {
    val __obj = js.Dynamic.literal()
    if (CreateTimestamp != null) __obj.updateDynamic("CreateTimestamp")(CreateTimestamp)
    if (SourceBackup != null) __obj.updateDynamic("SourceBackup")(SourceBackup)
    if (SourceCluster != null) __obj.updateDynamic("SourceCluster")(SourceCluster)
    if (SourceRegion != null) __obj.updateDynamic("SourceRegion")(SourceRegion)
    __obj.asInstanceOf[DestinationBackup]
  }
}

