package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyBackupToRegionRequest extends js.Object {
  /**
    * The ID of the backup that will be copied to the destination region. 
    */
  var BackupId: typings.awsDashSdk.clientsCloudhsmv2Mod.BackupId = js.native
  /**
    * The AWS region that will contain your copied CloudHSM cluster backup.
    */
  var DestinationRegion: Region = js.native
}

object CopyBackupToRegionRequest {
  @scala.inline
  def apply(BackupId: BackupId, DestinationRegion: Region): CopyBackupToRegionRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any], DestinationRegion = DestinationRegion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CopyBackupToRegionRequest]
  }
}

