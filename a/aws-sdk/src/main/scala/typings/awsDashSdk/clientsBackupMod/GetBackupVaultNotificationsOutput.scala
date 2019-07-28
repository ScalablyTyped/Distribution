package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBackupVaultNotificationsOutput extends js.Object {
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.undefined
  /**
    * An array of events that indicate the status of jobs to back up resources to the backup vault.
    */
  var BackupVaultEvents: js.UndefOr[typings.awsDashSdk.clientsBackupMod.BackupVaultEvents] = js.undefined
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: js.UndefOr[typings.awsDashSdk.clientsBackupMod.BackupVaultName] = js.undefined
  /**
    * An ARN that uniquely identifies an Amazon Simple Notification Service (Amazon SNS) topic; for example, arn:aws:sns:us-west-2:111122223333:MyTopic.
    */
  var SNSTopicArn: js.UndefOr[ARN] = js.undefined
}

object GetBackupVaultNotificationsOutput {
  @scala.inline
  def apply(
    BackupVaultArn: ARN = null,
    BackupVaultEvents: BackupVaultEvents = null,
    BackupVaultName: BackupVaultName = null,
    SNSTopicArn: ARN = null
  ): GetBackupVaultNotificationsOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupVaultArn != null) __obj.updateDynamic("BackupVaultArn")(BackupVaultArn)
    if (BackupVaultEvents != null) __obj.updateDynamic("BackupVaultEvents")(BackupVaultEvents)
    if (BackupVaultName != null) __obj.updateDynamic("BackupVaultName")(BackupVaultName)
    if (SNSTopicArn != null) __obj.updateDynamic("SNSTopicArn")(SNSTopicArn)
    __obj.asInstanceOf[GetBackupVaultNotificationsOutput]
  }
}

