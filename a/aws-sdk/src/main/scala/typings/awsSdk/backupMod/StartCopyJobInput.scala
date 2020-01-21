package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartCopyJobInput extends js.Object {
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a destination backup vault to copy to; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var DestinationBackupVaultArn: ARN = js.native
  /**
    * Specifies the IAM role ARN used to copy the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: IAMRoleArn = js.native
  /**
    * A customer chosen string that can be used to distinguish between calls to StartCopyJob.
    */
  var IdempotencyToken: js.UndefOr[String] = js.native
  var Lifecycle: js.UndefOr[typings.awsSdk.backupMod.Lifecycle] = js.native
  /**
    * An ARN that uniquely identifies a recovery point to use for the copy job; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45. 
    */
  var RecoveryPointArn: ARN = js.native
  /**
    * The name of a logical source container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens. &gt;
    */
  var SourceBackupVaultName: BackupVaultName = js.native
}

object StartCopyJobInput {
  @scala.inline
  def apply(
    DestinationBackupVaultArn: ARN,
    IamRoleArn: IAMRoleArn,
    RecoveryPointArn: ARN,
    SourceBackupVaultName: BackupVaultName,
    IdempotencyToken: String = null,
    Lifecycle: Lifecycle = null
  ): StartCopyJobInput = {
    val __obj = js.Dynamic.literal(DestinationBackupVaultArn = DestinationBackupVaultArn.asInstanceOf[js.Any], IamRoleArn = IamRoleArn.asInstanceOf[js.Any], RecoveryPointArn = RecoveryPointArn.asInstanceOf[js.Any], SourceBackupVaultName = SourceBackupVaultName.asInstanceOf[js.Any])
    if (IdempotencyToken != null) __obj.updateDynamic("IdempotencyToken")(IdempotencyToken.asInstanceOf[js.Any])
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartCopyJobInput]
  }
}

