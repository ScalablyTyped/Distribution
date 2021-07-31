package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBackupJobInput extends StObject {
  
  /**
    * Specifies the backup option for a selected resource. This option is only available for Windows VSS backup jobs. Valid values: Set to "WindowsVSS”:“enabled" to enable WindowsVSS backup option and create a VSS Windows backup. Set to “WindowsVSS”:”disabled” to create a regular backup. The WindowsVSS option is not enabled by default.
    */
  var BackupOptions: js.UndefOr[typings.awsSdk.backupMod.BackupOptions] = js.undefined
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typings.awsSdk.backupMod.BackupVaultName
  
  /**
    * A value in minutes after a backup job is successfully started before it must be completed or it will be canceled by AWS Backup. This value is optional.
    */
  var CompleteWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
  
  /**
    * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: IAMRoleArn
  
  /**
    * A customer chosen string that can be used to distinguish between calls to StartBackupJob.
    */
  var IdempotencyToken: js.UndefOr[String] = js.undefined
  
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup will transition and expire backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  var Lifecycle: js.UndefOr[typings.awsSdk.backupMod.Lifecycle] = js.undefined
  
  /**
    * To help organize your resources, you can assign your own metadata to the resources that you create. Each tag is a key-value pair.
    */
  var RecoveryPointTags: js.UndefOr[Tags] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var ResourceArn: ARN
  
  /**
    * A value in minutes after a backup is scheduled before a job will be canceled if it doesn't start successfully. This value is optional.
    */
  var StartWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
}
object StartBackupJobInput {
  
  @scala.inline
  def apply(BackupVaultName: BackupVaultName, IamRoleArn: IAMRoleArn, ResourceArn: ARN): StartBackupJobInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any], IamRoleArn = IamRoleArn.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBackupJobInput]
  }
  
  @scala.inline
  implicit class StartBackupJobInputMutableBuilder[Self <: StartBackupJobInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupOptions(value: BackupOptions): Self = StObject.set(x, "BackupOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupOptionsUndefined: Self = StObject.set(x, "BackupOptions", js.undefined)
    
    @scala.inline
    def setBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteWindowMinutes(value: WindowMinutes): Self = StObject.set(x, "CompleteWindowMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteWindowMinutesUndefined: Self = StObject.set(x, "CompleteWindowMinutes", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: IAMRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotencyToken(value: String): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    @scala.inline
    def setLifecycle(value: Lifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    @scala.inline
    def setRecoveryPointTags(value: Tags): Self = StObject.set(x, "RecoveryPointTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecoveryPointTagsUndefined: Self = StObject.set(x, "RecoveryPointTags", js.undefined)
    
    @scala.inline
    def setResourceArn(value: ARN): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartWindowMinutes(value: WindowMinutes): Self = StObject.set(x, "StartWindowMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartWindowMinutesUndefined: Self = StObject.set(x, "StartWindowMinutes", js.undefined)
  }
}
