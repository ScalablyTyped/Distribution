package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartBackupJobOutput extends js.Object {
  /**
    * Uniquely identifies a request to AWS Backup to back up a resource.
    */
  var BackupJobId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date and time that a backup job is started, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.undefined
  /**
    * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
}

object StartBackupJobOutput {
  @scala.inline
  def apply(BackupJobId: java.lang.String = null, CreationDate: timestamp = null, RecoveryPointArn: ARN = null): StartBackupJobOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupJobId != null) __obj.updateDynamic("BackupJobId")(BackupJobId)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (RecoveryPointArn != null) __obj.updateDynamic("RecoveryPointArn")(RecoveryPointArn)
    __obj.asInstanceOf[StartBackupJobOutput]
  }
}

