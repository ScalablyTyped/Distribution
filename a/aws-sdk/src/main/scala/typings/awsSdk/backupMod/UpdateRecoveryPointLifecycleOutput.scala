package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRecoveryPointLifecycleOutput extends StObject {
  
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
  implicit class UpdateRecoveryPointLifecycleOutputMutableBuilder[Self <: UpdateRecoveryPointLifecycleOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupVaultArn(value: ARN): Self = StObject.set(x, "BackupVaultArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupVaultArnUndefined: Self = StObject.set(x, "BackupVaultArn", js.undefined)
    
    @scala.inline
    def setCalculatedLifecycle(value: CalculatedLifecycle): Self = StObject.set(x, "CalculatedLifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculatedLifecycleUndefined: Self = StObject.set(x, "CalculatedLifecycle", js.undefined)
    
    @scala.inline
    def setLifecycle(value: Lifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    @scala.inline
    def setRecoveryPointArn(value: ARN): Self = StObject.set(x, "RecoveryPointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecoveryPointArnUndefined: Self = StObject.set(x, "RecoveryPointArn", js.undefined)
  }
}
