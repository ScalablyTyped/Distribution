package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationBackup extends js.Object {
  var CreateTimestamp: js.UndefOr[Timestamp] = js.native
  var SourceBackup: js.UndefOr[BackupId] = js.native
  var SourceCluster: js.UndefOr[ClusterId] = js.native
  var SourceRegion: js.UndefOr[Region] = js.native
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
    if (CreateTimestamp != null) __obj.updateDynamic("CreateTimestamp")(CreateTimestamp.asInstanceOf[js.Any])
    if (SourceBackup != null) __obj.updateDynamic("SourceBackup")(SourceBackup.asInstanceOf[js.Any])
    if (SourceCluster != null) __obj.updateDynamic("SourceCluster")(SourceCluster.asInstanceOf[js.Any])
    if (SourceRegion != null) __obj.updateDynamic("SourceRegion")(SourceRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationBackup]
  }
}

