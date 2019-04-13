package typings
package awsDashSdkLib.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBackupRequest extends js.Object {
  /**
    * The ID of the backup to be deleted. To find the ID of a backup, use the DescribeBackups operation.
    */
  var BackupId: awsDashSdkLib.clientsCloudhsmv2Mod.BackupId
}

object DeleteBackupRequest {
  @scala.inline
  def apply(BackupId: BackupId): DeleteBackupRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId)
  
    __obj.asInstanceOf[DeleteBackupRequest]
  }
}

