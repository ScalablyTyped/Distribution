package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRecoveryPointLifecycleOutput extends js.Object {
  
  /**
    * An ARN that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.native
  
  /**
    * A CalculatedLifecycle object containing DeleteAt and MoveToColdStorageAt timestamps.
    */
  var CalculatedLifecycle: js.UndefOr[typings.awsSdk.backupMod.CalculatedLifecycle] = js.native
  
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  var Lifecycle: js.UndefOr[typings.awsSdk.backupMod.Lifecycle] = js.native
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.native
}
object UpdateRecoveryPointLifecycleOutput {
  
  @scala.inline
  def apply(): UpdateRecoveryPointLifecycleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRecoveryPointLifecycleOutput]
  }
  
  @scala.inline
  implicit class UpdateRecoveryPointLifecycleOutputOps[Self <: UpdateRecoveryPointLifecycleOutput] (val x: Self) extends AnyVal {
    
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
    def setCalculatedLifecycle(value: CalculatedLifecycle): Self = this.set("CalculatedLifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculatedLifecycle: Self = this.set("CalculatedLifecycle", js.undefined)
    
    @scala.inline
    def setLifecycle(value: Lifecycle): Self = this.set("Lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycle: Self = this.set("Lifecycle", js.undefined)
    
    @scala.inline
    def setRecoveryPointArn(value: ARN): Self = this.set("RecoveryPointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecoveryPointArn: Self = this.set("RecoveryPointArn", js.undefined)
  }
}
