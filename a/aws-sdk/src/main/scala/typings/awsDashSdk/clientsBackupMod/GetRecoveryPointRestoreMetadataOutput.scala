package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecoveryPointRestoreMetadataOutput extends js.Object {
  /**
    * An ARN that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.native
  /**
    * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.native
  /**
    * A set of metadata key-value pairs that lists the metadata key-value pairs that are required to restore the recovery point.
    */
  var RestoreMetadata: js.UndefOr[Metadata] = js.native
}

object GetRecoveryPointRestoreMetadataOutput {
  @scala.inline
  def apply(BackupVaultArn: ARN = null, RecoveryPointArn: ARN = null, RestoreMetadata: Metadata = null): GetRecoveryPointRestoreMetadataOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupVaultArn != null) __obj.updateDynamic("BackupVaultArn")(BackupVaultArn.asInstanceOf[js.Any])
    if (RecoveryPointArn != null) __obj.updateDynamic("RecoveryPointArn")(RecoveryPointArn.asInstanceOf[js.Any])
    if (RestoreMetadata != null) __obj.updateDynamic("RestoreMetadata")(RestoreMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecoveryPointRestoreMetadataOutput]
  }
}

