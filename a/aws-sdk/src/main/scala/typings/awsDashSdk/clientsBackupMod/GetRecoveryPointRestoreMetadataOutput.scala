package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRecoveryPointRestoreMetadataOutput extends js.Object {
  /**
    * An ARN that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.undefined
  /**
    * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
  /**
    * A set of metadata key-value pairs that lists the metadata key-value pairs that are required to restore the recovery point.
    */
  var RestoreMetadata: js.UndefOr[Metadata] = js.undefined
}

object GetRecoveryPointRestoreMetadataOutput {
  @scala.inline
  def apply(BackupVaultArn: ARN = null, RecoveryPointArn: ARN = null, RestoreMetadata: Metadata = null): GetRecoveryPointRestoreMetadataOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupVaultArn != null) __obj.updateDynamic("BackupVaultArn")(BackupVaultArn)
    if (RecoveryPointArn != null) __obj.updateDynamic("RecoveryPointArn")(RecoveryPointArn)
    if (RestoreMetadata != null) __obj.updateDynamic("RestoreMetadata")(RestoreMetadata)
    __obj.asInstanceOf[GetRecoveryPointRestoreMetadataOutput]
  }
}

