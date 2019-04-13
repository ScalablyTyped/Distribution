package typings
package awsDashSdkLib.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyBackupToRegionRequest extends js.Object {
  /**
    * The ID of the backup that will be copied to the destination region. 
    */
  var BackupId: awsDashSdkLib.clientsCloudhsmv2Mod.BackupId
  /**
    * The AWS region that will contain your copied CloudHSM cluster backup.
    */
  var DestinationRegion: Region
}

object CopyBackupToRegionRequest {
  @scala.inline
  def apply(BackupId: BackupId, DestinationRegion: Region): CopyBackupToRegionRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId, DestinationRegion = DestinationRegion)
  
    __obj.asInstanceOf[CopyBackupToRegionRequest]
  }
}

