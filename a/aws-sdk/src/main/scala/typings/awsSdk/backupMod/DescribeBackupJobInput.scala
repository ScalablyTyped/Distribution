package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBackupJobInput extends js.Object {
  /**
    * Uniquely identifies a request to AWS Backup to back up a resource.
    */
  var BackupJobId: String = js.native
}

object DescribeBackupJobInput {
  @scala.inline
  def apply(BackupJobId: String): DescribeBackupJobInput = {
    val __obj = js.Dynamic.literal(BackupJobId = BackupJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBackupJobInput]
  }
}

