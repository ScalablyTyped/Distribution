package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBackupJobOutput extends StObject {
  
  /**
    * Returns the account ID that owns the backup job.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsBackupMod.AccountId] = js.undefined
  
  /**
    * Uniquely identifies a request to Backup to back up a resource.
    */
  var BackupJobId: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the options specified as part of backup plan or on-demand backup job.
    */
  var BackupOptions: js.UndefOr[typings.awsSdk.clientsBackupMod.BackupOptions] = js.undefined
  
  /**
    * The size, in bytes, of a backup.
    */
  var BackupSizeInBytes: js.UndefOr[Long_] = js.undefined
  
  /**
    * Represents the actual backup type selected for a backup job. For example, if a successful Windows Volume Shadow Copy Service (VSS) backup was taken, BackupType returns "WindowsVSS". If BackupType is empty, then the backup type was a regular backup.
    */
  var BackupType: js.UndefOr[String] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Amazon Web Services Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: js.UndefOr[typings.awsSdk.clientsBackupMod.BackupVaultName] = js.undefined
  
  /**
    * The size in bytes transferred to a backup vault at the time that the job status was queried.
    */
  var BytesTransferred: js.UndefOr[Long_] = js.undefined
  
  /**
    * This returns the statistics of the included child (nested) backup jobs.
    */
  var ChildJobsInState: js.UndefOr[BackupJobChildJobsInState] = js.undefined
  
  /**
    * The date and time that a job to create a backup job is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CompletionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Contains identifying information about the creation of a backup job, including the BackupPlanArn, BackupPlanId, BackupPlanVersion, and BackupRuleId of the backup plan that is used to create it.
    */
  var CreatedBy: js.UndefOr[RecoveryPointCreator] = js.undefined
  
  /**
    * The date and time that a backup job is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time that a job to back up resources is expected to be completed, in Unix format and Coordinated Universal Time (UTC). The value of ExpectedCompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var ExpectedCompletionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined
  
  /**
    * This returns the boolean value that a backup job is a parent (composite) job.
    */
  var IsParent: js.UndefOr[scala.Boolean] = js.undefined
  
  /**
    * This returns the number of child (nested) backup jobs.
    */
  var NumberOfChildJobs: js.UndefOr[Long_] = js.undefined
  
  /**
    * This returns the parent (composite) resource backup job ID.
    */
  var ParentJobId: js.UndefOr[String] = js.undefined
  
  /**
    * Contains an estimated percentage that is complete of a job at the time the job status was queried.
    */
  var PercentDone: js.UndefOr[String] = js.undefined
  
  /**
    * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * An ARN that uniquely identifies a saved resource. The format of the ARN depends on the resource type.
    */
  var ResourceArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * This is the non-unique name of the resource that belongs to the specified backup.
    */
  var ResourceName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of Amazon Web Services resource to be backed up; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.clientsBackupMod.ResourceType] = js.undefined
  
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
object DescribeBackupJobOutput {
  
  inline def apply(): DescribeBackupJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBackupJobOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeBackupJobOutput] (val x: Self) extends AnyVal {
    
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
    
    inline def setChildJobsInState(value: BackupJobChildJobsInState): Self = StObject.set(x, "ChildJobsInState", value.asInstanceOf[js.Any])
    
    inline def setChildJobsInStateUndefined: Self = StObject.set(x, "ChildJobsInState", js.undefined)
    
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
    
    inline def setIsParent(value: scala.Boolean): Self = StObject.set(x, "IsParent", value.asInstanceOf[js.Any])
    
    inline def setIsParentUndefined: Self = StObject.set(x, "IsParent", js.undefined)
    
    inline def setNumberOfChildJobs(value: Long_): Self = StObject.set(x, "NumberOfChildJobs", value.asInstanceOf[js.Any])
    
    inline def setNumberOfChildJobsUndefined: Self = StObject.set(x, "NumberOfChildJobs", js.undefined)
    
    inline def setParentJobId(value: String): Self = StObject.set(x, "ParentJobId", value.asInstanceOf[js.Any])
    
    inline def setParentJobIdUndefined: Self = StObject.set(x, "ParentJobId", js.undefined)
    
    inline def setPercentDone(value: String): Self = StObject.set(x, "PercentDone", value.asInstanceOf[js.Any])
    
    inline def setPercentDoneUndefined: Self = StObject.set(x, "PercentDone", js.undefined)
    
    inline def setRecoveryPointArn(value: ARN): Self = StObject.set(x, "RecoveryPointArn", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointArnUndefined: Self = StObject.set(x, "RecoveryPointArn", js.undefined)
    
    inline def setResourceArn(value: ARN): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
    
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
