package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRestoreJobOutput extends StObject {
  
  /**
    * Returns the account ID that owns the restore job.
    */
  var AccountId: js.UndefOr[typings.awsSdk.backupMod.AccountId] = js.native
  
  /**
    * The size, in bytes, of the restored resource.
    */
  var BackupSizeInBytes: js.UndefOr[Long_] = js.native
  
  /**
    * The date and time that a job to restore a recovery point is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CompletionDate: js.UndefOr[timestamp] = js.native
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a resource whose recovery point is being restored. The format of the ARN depends on the resource type of the backed-up resource.
    */
  var CreatedResourceArn: js.UndefOr[ARN] = js.native
  
  /**
    * The date and time that a restore job is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.native
  
  /**
    * The amount of time in minutes that a job restoring a recovery point is expected to take.
    */
  var ExpectedCompletionTimeMinutes: js.UndefOr[Long_] = js.native
  
  /**
    * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: js.UndefOr[IAMRoleArn] = js.native
  
  /**
    * Contains an estimated percentage that is complete of a job at the time the job status was queried.
    */
  var PercentDone: js.UndefOr[String] = js.native
  
  /**
    * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.native
  
  /**
    * Returns metadata associated with a restore job listed by resource type.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.backupMod.ResourceType] = js.native
  
  /**
    * Uniquely identifies the job that restores a recovery point.
    */
  var RestoreJobId: js.UndefOr[String] = js.native
  
  /**
    * Status code specifying the state of the job that is initiated by AWS Backup to restore a recovery point.
    */
  var Status: js.UndefOr[RestoreJobStatus] = js.native
  
  /**
    * A message showing the status of a job to restore a recovery point.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}
object DescribeRestoreJobOutput {
  
  @scala.inline
  def apply(): DescribeRestoreJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRestoreJobOutput]
  }
  
  @scala.inline
  implicit class DescribeRestoreJobOutputMutableBuilder[Self <: DescribeRestoreJobOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setBackupSizeInBytes(value: Long_): Self = StObject.set(x, "BackupSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupSizeInBytesUndefined: Self = StObject.set(x, "BackupSizeInBytes", js.undefined)
    
    @scala.inline
    def setCompletionDate(value: timestamp): Self = StObject.set(x, "CompletionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionDateUndefined: Self = StObject.set(x, "CompletionDate", js.undefined)
    
    @scala.inline
    def setCreatedResourceArn(value: ARN): Self = StObject.set(x, "CreatedResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedResourceArnUndefined: Self = StObject.set(x, "CreatedResourceArn", js.undefined)
    
    @scala.inline
    def setCreationDate(value: timestamp): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setExpectedCompletionTimeMinutes(value: Long_): Self = StObject.set(x, "ExpectedCompletionTimeMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedCompletionTimeMinutesUndefined: Self = StObject.set(x, "ExpectedCompletionTimeMinutes", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: IAMRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    @scala.inline
    def setPercentDone(value: String): Self = StObject.set(x, "PercentDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentDoneUndefined: Self = StObject.set(x, "PercentDone", js.undefined)
    
    @scala.inline
    def setRecoveryPointArn(value: ARN): Self = StObject.set(x, "RecoveryPointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecoveryPointArnUndefined: Self = StObject.set(x, "RecoveryPointArn", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setRestoreJobId(value: String): Self = StObject.set(x, "RestoreJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreJobIdUndefined: Self = StObject.set(x, "RestoreJobId", js.undefined)
    
    @scala.inline
    def setStatus(value: RestoreJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
