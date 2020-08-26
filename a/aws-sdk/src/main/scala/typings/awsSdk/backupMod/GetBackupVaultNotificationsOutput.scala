package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackupVaultNotificationsOutput extends js.Object {
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.native
  /**
    * An array of events that indicate the status of jobs to back up resources to the backup vault.
    */
  var BackupVaultEvents: js.UndefOr[typings.awsSdk.backupMod.BackupVaultEvents] = js.native
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: js.UndefOr[typings.awsSdk.backupMod.BackupVaultName] = js.native
  /**
    * An ARN that uniquely identifies an Amazon Simple Notification Service (Amazon SNS) topic; for example, arn:aws:sns:us-west-2:111122223333:MyTopic.
    */
  var SNSTopicArn: js.UndefOr[ARN] = js.native
}

object GetBackupVaultNotificationsOutput {
  @scala.inline
  def apply(): GetBackupVaultNotificationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackupVaultNotificationsOutput]
  }
  @scala.inline
  implicit class GetBackupVaultNotificationsOutputOps[Self <: GetBackupVaultNotificationsOutput] (val x: Self) extends AnyVal {
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
    def setBackupVaultArn(value: ARN): Self = this.set("BackupVaultArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupVaultArn: Self = this.set("BackupVaultArn", js.undefined)
    @scala.inline
    def setBackupVaultEventsVarargs(value: BackupVaultEvent*): Self = this.set("BackupVaultEvents", js.Array(value :_*))
    @scala.inline
    def setBackupVaultEvents(value: BackupVaultEvents): Self = this.set("BackupVaultEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupVaultEvents: Self = this.set("BackupVaultEvents", js.undefined)
    @scala.inline
    def setBackupVaultName(value: BackupVaultName): Self = this.set("BackupVaultName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupVaultName: Self = this.set("BackupVaultName", js.undefined)
    @scala.inline
    def setSNSTopicArn(value: ARN): Self = this.set("SNSTopicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSNSTopicArn: Self = this.set("SNSTopicArn", js.undefined)
  }
  
}

