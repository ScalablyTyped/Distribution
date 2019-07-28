package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBackupRequest extends js.Object {
  /**
    * The ID of the backup to delete. Run the DescribeBackups command to get a list of backup IDs. Backup IDs are in the format ServerName-yyyyMMddHHmmssSSS. 
    */
  var BackupId: typings.awsDashSdk.clientsOpsworkscmMod.BackupId
}

object DeleteBackupRequest {
  @scala.inline
  def apply(BackupId: BackupId): DeleteBackupRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId)
  
    __obj.asInstanceOf[DeleteBackupRequest]
  }
}

