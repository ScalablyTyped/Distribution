package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBackupVaultInput extends js.Object {
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typings.awsSdk.backupMod.BackupVaultName = js.native
  /**
    * Metadata that you can assign to help organize the resources that you create. Each tag is a key-value pair.
    */
  var BackupVaultTags: js.UndefOr[Tags] = js.native
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of executing the operation twice.
    */
  var CreatorRequestId: js.UndefOr[String] = js.native
  /**
    * The server-side encryption key that is used to protect your backups; for example, arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
    */
  var EncryptionKeyArn: js.UndefOr[ARN] = js.native
}

object CreateBackupVaultInput {
  @scala.inline
  def apply(
    BackupVaultName: BackupVaultName,
    BackupVaultTags: Tags = null,
    CreatorRequestId: String = null,
    EncryptionKeyArn: ARN = null
  ): CreateBackupVaultInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any])
    if (BackupVaultTags != null) __obj.updateDynamic("BackupVaultTags")(BackupVaultTags.asInstanceOf[js.Any])
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId.asInstanceOf[js.Any])
    if (EncryptionKeyArn != null) __obj.updateDynamic("EncryptionKeyArn")(EncryptionKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupVaultInput]
  }
}

