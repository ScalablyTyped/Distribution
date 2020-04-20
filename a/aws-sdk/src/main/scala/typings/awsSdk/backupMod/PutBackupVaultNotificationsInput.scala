package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBackupVaultNotificationsInput extends js.Object {
  /**
    * An array of events that indicate the status of jobs to back up resources to the backup vault.
    */
  var BackupVaultEvents: typings.awsSdk.backupMod.BackupVaultEvents = js.native
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typings.awsSdk.backupMod.BackupVaultName = js.native
  /**
    * The Amazon Resource Name (ARN) that specifies the topic for a backup vault’s events; for example, arn:aws:sns:us-west-2:111122223333:MyVaultTopic.
    */
  var SNSTopicArn: ARN = js.native
}

object PutBackupVaultNotificationsInput {
  @scala.inline
  def apply(BackupVaultEvents: BackupVaultEvents, BackupVaultName: BackupVaultName, SNSTopicArn: ARN): PutBackupVaultNotificationsInput = {
    val __obj = js.Dynamic.literal(BackupVaultEvents = BackupVaultEvents.asInstanceOf[js.Any], BackupVaultName = BackupVaultName.asInstanceOf[js.Any], SNSTopicArn = SNSTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBackupVaultNotificationsInput]
  }
}

