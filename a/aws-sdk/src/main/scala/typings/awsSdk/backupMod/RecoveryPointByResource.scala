package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecoveryPointByResource extends js.Object {
  /**
    * The size, in bytes, of a backup.
    */
  var BackupSizeBytes: js.UndefOr[Long_] = js.native
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: js.UndefOr[typings.awsSdk.backupMod.BackupVaultName] = js.native
  /**
    * The date and time a recovery point is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.native
  /**
    * The server-side encryption key that is used to protect your backups; for example, arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
    */
  var EncryptionKeyArn: js.UndefOr[ARN] = js.native
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.native
  /**
    * A status code specifying the state of the recovery point.
    */
  var Status: js.UndefOr[RecoveryPointStatus] = js.native
}

object RecoveryPointByResource {
  @scala.inline
  def apply(
    BackupSizeBytes: js.UndefOr[Long_] = js.undefined,
    BackupVaultName: BackupVaultName = null,
    CreationDate: timestamp = null,
    EncryptionKeyArn: ARN = null,
    RecoveryPointArn: ARN = null,
    Status: RecoveryPointStatus = null
  ): RecoveryPointByResource = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BackupSizeBytes)) __obj.updateDynamic("BackupSizeBytes")(BackupSizeBytes.get.asInstanceOf[js.Any])
    if (BackupVaultName != null) __obj.updateDynamic("BackupVaultName")(BackupVaultName.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (EncryptionKeyArn != null) __obj.updateDynamic("EncryptionKeyArn")(EncryptionKeyArn.asInstanceOf[js.Any])
    if (RecoveryPointArn != null) __obj.updateDynamic("RecoveryPointArn")(RecoveryPointArn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecoveryPointByResource]
  }
}

