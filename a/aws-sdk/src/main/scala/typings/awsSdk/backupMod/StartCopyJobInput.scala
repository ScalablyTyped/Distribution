package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The name of a logical source container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var SourceBackupVaultName: BackupVaultName = js.native
}
object StartCopyJobInput {
  
  @scala.inline
  def apply(
    DestinationBackupVaultArn: ARN,
    IamRoleArn: IAMRoleArn,
    RecoveryPointArn: ARN,
    SourceBackupVaultName: BackupVaultName
  ): StartCopyJobInput = {
    val __obj = js.Dynamic.literal(DestinationBackupVaultArn = DestinationBackupVaultArn.asInstanceOf[js.Any], IamRoleArn = IamRoleArn.asInstanceOf[js.Any], RecoveryPointArn = RecoveryPointArn.asInstanceOf[js.Any], SourceBackupVaultName = SourceBackupVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartCopyJobInput]
  }
  
  @scala.inline
  implicit class StartCopyJobInputOps[Self <: StartCopyJobInput] (val x: Self) extends AnyVal {
    
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
    def setDestinationBackupVaultArn(value: ARN): Self = this.set("DestinationBackupVaultArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleArn(value: IAMRoleArn): Self = this.set("IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecoveryPointArn(value: ARN): Self = this.set("RecoveryPointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBackupVaultName(value: BackupVaultName): Self = this.set("SourceBackupVaultName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotencyToken(value: String): Self = this.set("IdempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdempotencyToken: Self = this.set("IdempotencyToken", js.undefined)
    
    @scala.inline
    def setLifecycle(value: Lifecycle): Self = this.set("Lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycle: Self = this.set("Lifecycle", js.undefined)
  }
}
