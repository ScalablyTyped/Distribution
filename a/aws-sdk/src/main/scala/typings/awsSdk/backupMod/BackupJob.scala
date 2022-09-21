package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupJob extends StObject {
  
  /**
    * The account ID that owns the backup job.
    */
  var AccountId: js.UndefOr[typings.awsSdk.backupMod.AccountId] = js.undefined
  
  /**
    * Uniquely identifies a request to Backup to back up a resource.
    */
  var BackupJobId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the backup option for a selected resource. This option is only available for Windows Volume Shadow Copy Service (VSS) backup jobs. Valid values: Set to "WindowsVSS":"enabled" to enable the WindowsVSS backup option and create a Windows VSS backup. Set to "WindowsVSS":"disabled" to create a regular backup. If you specify an invalid option, you get an InvalidParameterValueException exception.
    */
  var BackupOptions: js.UndefOr[typings.awsSdk.backupMod.BackupOptions] = js.undefined
  
  /**
    * The size, in bytes, of a backup.
    */
  var BackupSizeInBytes: js.UndefOr[Long_] = js.undefined
  
  /**
    * Represents the type of backup for a backup job.
    */
  var BackupType: js.UndefOr[String] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Amazon Web Services Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: js.UndefOr[typings.awsSdk.backupMod.BackupVaultName] = js.undefined
  
  /**
    * The size in bytes transferred to a backup vault at the time that the job status was queried.
    */
  var BytesTransferred: js.UndefOr[Long_] = js.undefined
  
  /**
    * The date and time a job to create a backup job is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CompletionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Contains identifying information about the creation of a backup job, including the BackupPlanArn, BackupPlanId, BackupPlanVersion, and BackupRuleId of the backup plan used to create it.
    */
  var CreatedBy: js.UndefOr[RecoveryPointCreator] = js.undefined
  
  /**
    * The date and time a backup job is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time a job to back up resources is expected to be completed, in Unix format and Coordinated Universal Time (UTC). The value of ExpectedCompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var ExpectedCompletionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the IAM role ARN used to create the target recovery point. IAM roles other than the default role must include either AWSBackup or AwsBackup in the role name. For example, arn:aws:iam::123456789012:role/AWSBackupRDSAccess. Role names without those strings lack permissions to perform backup jobs.
    */
  var IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined
  
  /**
    * Contains an estimated percentage complete of a job at the time the job status was queried.
    */
  var PercentDone: js.UndefOr[String] = js.undefined
  
  /**
    * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var ResourceArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The type of Amazon Web Services resource to be backed up; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database. For Windows Volume Shadow Copy Service (VSS) backups, the only supported resource type is Amazon EC2.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.backupMod.ResourceType] = js.undefined
  
  /**
    * Specifies the time in Unix format and Coordinated Universal Time (UTC) when a backup job must be started before it is canceled. The value is calculated by adding the start window to the scheduled time. So if the scheduled time were 6:00 PM and the start window is 2 hours, the StartBy time would be 8:00 PM on the date specified. The value of StartBy is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var StartBy: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current state of a resource recovery point.
    */
  var State: js.UndefOr[BackupJobState] = js.undefined
  
  /**
    * A detailed message explaining the status of the job to back up a resource.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}
object BackupJob {
  
  inline def apply(): BackupJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupJob]
  }
  
  extension [Self <: BackupJob](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setBackupJobId(value: String): Self = StObject.set(x, "BackupJobId", value.asInstanceOf[js.Any])
    
    inline def setBackupJobIdUndefined: Self = StObject.set(x, "BackupJobId", js.undefined)
    
    inline def setBackupOptions(value: BackupOptions): Self = StObject.set(x, "BackupOptions", value.asInstanceOf[js.Any])
    
    inline def setBackupOptionsUndefined: Self = StObject.set(x, "BackupOptions", js.undefined)
    
    inline def setBackupSizeInBytes(value: Long_): Self = StObject.set(x, "BackupSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setBackupSizeInBytesUndefined: Self = StObject.set(x, "BackupSizeInBytes", js.undefined)
    
    inline def setBackupType(value: String): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
    
    inline def setBackupTypeUndefined: Self = StObject.set(x, "BackupType", js.undefined)
    
    inline def setBackupVaultArn(value: ARN): Self = StObject.set(x, "BackupVaultArn", value.asInstanceOf[js.Any])
    
    inline def setBackupVaultArnUndefined: Self = StObject.set(x, "BackupVaultArn", js.undefined)
    
    inline def setBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
    
    inline def setBackupVaultNameUndefined: Self = StObject.set(x, "BackupVaultName", js.undefined)
    
    inline def setBytesTransferred(value: Long_): Self = StObject.set(x, "BytesTransferred", value.asInstanceOf[js.Any])
    
    inline def setBytesTransferredUndefined: Self = StObject.set(x, "BytesTransferred", js.undefined)
    
    inline def setCompletionDate(value: js.Date): Self = StObject.set(x, "CompletionDate", value.asInstanceOf[js.Any])
    
    inline def setCompletionDateUndefined: Self = StObject.set(x, "CompletionDate", js.undefined)
    
    inline def setCreatedBy(value: RecoveryPointCreator): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setExpectedCompletionDate(value: js.Date): Self = StObject.set(x, "ExpectedCompletionDate", value.asInstanceOf[js.Any])
    
    inline def setExpectedCompletionDateUndefined: Self = StObject.set(x, "ExpectedCompletionDate", js.undefined)
    
    inline def setIamRoleArn(value: IAMRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    inline def setPercentDone(value: String): Self = StObject.set(x, "PercentDone", value.asInstanceOf[js.Any])
    
    inline def setPercentDoneUndefined: Self = StObject.set(x, "PercentDone", js.undefined)
    
    inline def setRecoveryPointArn(value: ARN): Self = StObject.set(x, "RecoveryPointArn", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointArnUndefined: Self = StObject.set(x, "RecoveryPointArn", js.undefined)
    
    inline def setResourceArn(value: ARN): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setStartBy(value: js.Date): Self = StObject.set(x, "StartBy", value.asInstanceOf[js.Any])
    
    inline def setStartByUndefined: Self = StObject.set(x, "StartBy", js.undefined)
    
    inline def setState(value: BackupJobState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}
