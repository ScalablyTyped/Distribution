package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRecoveryPointLifecycleOutput extends js.Object {
  /**
    * An ARN that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.undefined
  /**
    * A CalculatedLifecycle object containing DeleteAt and MoveToColdStorageAt timestamps.
    */
  var CalculatedLifecycle: js.UndefOr[typings.awsDashSdk.clientsBackupMod.CalculatedLifecycle] = js.undefined
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  var Lifecycle: js.UndefOr[typings.awsDashSdk.clientsBackupMod.Lifecycle] = js.undefined
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
}

object UpdateRecoveryPointLifecycleOutput {
  @scala.inline
  def apply(
    BackupVaultArn: ARN = null,
    CalculatedLifecycle: CalculatedLifecycle = null,
    Lifecycle: Lifecycle = null,
    RecoveryPointArn: ARN = null
  ): UpdateRecoveryPointLifecycleOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupVaultArn != null) __obj.updateDynamic("BackupVaultArn")(BackupVaultArn)
    if (CalculatedLifecycle != null) __obj.updateDynamic("CalculatedLifecycle")(CalculatedLifecycle)
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle)
    if (RecoveryPointArn != null) __obj.updateDynamic("RecoveryPointArn")(RecoveryPointArn)
    __obj.asInstanceOf[UpdateRecoveryPointLifecycleOutput]
  }
}

