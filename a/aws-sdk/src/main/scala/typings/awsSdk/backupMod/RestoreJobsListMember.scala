package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreJobsListMember extends StObject {
  
  /**
    * The account ID that owns the restore job.
    */
  var AccountId: js.UndefOr[typings.awsSdk.backupMod.AccountId] = js.undefined
  
  /**
    * The size, in bytes, of the restored resource.
    */
  var BackupSizeInBytes: js.UndefOr[Long_] = js.undefined
  
  /**
    * The date and time a job to restore a recovery point is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CompletionDate: js.UndefOr[timestamp] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var CreatedResourceArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The date and time a restore job is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.undefined
  
  /**
    * The amount of time in minutes that a job restoring a recovery point is expected to take.
    */
  var ExpectedCompletionTimeMinutes: js.UndefOr[Long_] = js.undefined
  
  /**
    * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
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
    * The resource type of the listed restore jobs; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database. For VSS Windows backups, the only supported resource type is Amazon EC2.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.backupMod.ResourceType] = js.undefined
  
  /**
    * Uniquely identifies the job that restores a recovery point.
    */
  var RestoreJobId: js.UndefOr[String] = js.undefined
  
  /**
    * A status code specifying the state of the job initiated by AWS Backup to restore a recovery point.
    */
  var Status: js.UndefOr[RestoreJobStatus] = js.undefined
  
  /**
    * A detailed message explaining the status of the job to restore a recovery point.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}
object RestoreJobsListMember {
  
  inline def apply(): RestoreJobsListMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreJobsListMember]
  }
  
  extension [Self <: RestoreJobsListMember](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setBackupSizeInBytes(value: Long_): Self = StObject.set(x, "BackupSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setBackupSizeInBytesUndefined: Self = StObject.set(x, "BackupSizeInBytes", js.undefined)
    
    inline def setCompletionDate(value: timestamp): Self = StObject.set(x, "CompletionDate", value.asInstanceOf[js.Any])
    
    inline def setCompletionDateUndefined: Self = StObject.set(x, "CompletionDate", js.undefined)
    
    inline def setCreatedResourceArn(value: ARN): Self = StObject.set(x, "CreatedResourceArn", value.asInstanceOf[js.Any])
    
    inline def setCreatedResourceArnUndefined: Self = StObject.set(x, "CreatedResourceArn", js.undefined)
    
    inline def setCreationDate(value: timestamp): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setExpectedCompletionTimeMinutes(value: Long_): Self = StObject.set(x, "ExpectedCompletionTimeMinutes", value.asInstanceOf[js.Any])
    
    inline def setExpectedCompletionTimeMinutesUndefined: Self = StObject.set(x, "ExpectedCompletionTimeMinutes", js.undefined)
    
    inline def setIamRoleArn(value: IAMRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    inline def setPercentDone(value: String): Self = StObject.set(x, "PercentDone", value.asInstanceOf[js.Any])
    
    inline def setPercentDoneUndefined: Self = StObject.set(x, "PercentDone", js.undefined)
    
    inline def setRecoveryPointArn(value: ARN): Self = StObject.set(x, "RecoveryPointArn", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointArnUndefined: Self = StObject.set(x, "RecoveryPointArn", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setRestoreJobId(value: String): Self = StObject.set(x, "RestoreJobId", value.asInstanceOf[js.Any])
    
    inline def setRestoreJobIdUndefined: Self = StObject.set(x, "RestoreJobId", js.undefined)
    
    inline def setStatus(value: RestoreJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
