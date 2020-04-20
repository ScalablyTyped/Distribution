package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopBackupJobInput extends js.Object {
  /**
    * Uniquely identifies a request to AWS Backup to back up a resource.
    */
  var BackupJobId: String = js.native
}

object StopBackupJobInput {
  @scala.inline
  def apply(BackupJobId: String): StopBackupJobInput = {
    val __obj = js.Dynamic.literal(BackupJobId = BackupJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopBackupJobInput]
  }
}

