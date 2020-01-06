package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyBackupToRegionResponse extends js.Object {
  /**
    * Information on the backup that will be copied to the destination region, including CreateTimestamp, SourceBackup, SourceCluster, and Source Region. CreateTimestamp of the destination backup will be the same as that of the source backup. You will need to use the sourceBackupID returned in this operation to use the DescribeBackups operation on the backup that will be copied to the destination region.
    */
  var DestinationBackup: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.DestinationBackup] = js.native
}

object CopyBackupToRegionResponse {
  @scala.inline
  def apply(DestinationBackup: DestinationBackup = null): CopyBackupToRegionResponse = {
    val __obj = js.Dynamic.literal()
    if (DestinationBackup != null) __obj.updateDynamic("DestinationBackup")(DestinationBackup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyBackupToRegionResponse]
  }
}

