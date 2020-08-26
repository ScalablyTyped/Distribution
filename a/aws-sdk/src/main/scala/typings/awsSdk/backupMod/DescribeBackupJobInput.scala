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
  @scala.inline
  implicit class DescribeBackupJobInputOps[Self <: DescribeBackupJobInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackupJobId(value: String): Self = this.set("BackupJobId", value.asInstanceOf[js.Any])
  }
  
}

