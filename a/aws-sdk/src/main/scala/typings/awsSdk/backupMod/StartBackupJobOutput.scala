package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartBackupJobOutput extends js.Object {
  /**
    * Uniquely identifies a request to AWS Backup to back up a resource.
    */
  var BackupJobId: js.UndefOr[String] = js.native
  /**
    * The date and time that a backup job is started, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.native
  /**
    * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.native
}

object StartBackupJobOutput {
  @scala.inline
  def apply(): StartBackupJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartBackupJobOutput]
  }
  @scala.inline
  implicit class StartBackupJobOutputOps[Self <: StartBackupJobOutput] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteBackupJobId: Self = this.set("BackupJobId", js.undefined)
    @scala.inline
    def setCreationDate(value: timestamp): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setRecoveryPointArn(value: ARN): Self = this.set("RecoveryPointArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecoveryPointArn: Self = this.set("RecoveryPointArn", js.undefined)
  }
  
}

