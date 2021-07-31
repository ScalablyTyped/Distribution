package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyJob extends StObject {
  
  /**
    * The account ID that owns the copy job.
    */
  var AccountId: js.UndefOr[typings.awsSdk.backupMod.AccountId] = js.undefined
  
  /**
    * The size, in bytes, of a copy job.
    */
  var BackupSizeInBytes: js.UndefOr[Long_] = js.undefined
  
  /**
    * The date and time a copy job is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CompletionDate: js.UndefOr[timestamp] = js.undefined
  
  /**
    * Uniquely identifies a copy job.
    */
  var CopyJobId: js.UndefOr[String] = js.undefined
  
  var CreatedBy: js.UndefOr[RecoveryPointCreator] = js.undefined
  
  /**
    * The date and time a copy job is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a destination copy vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var DestinationBackupVaultArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * An ARN that uniquely identifies a destination recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var DestinationRecoveryPointArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Specifies the IAM role ARN used to copy the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined
  
  /**
    * The AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
    */
  var ResourceArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The type of AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database. 
    */
  var ResourceType: js.UndefOr[typings.awsSdk.backupMod.ResourceType] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a source copy vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault. 
    */
  var SourceBackupVaultArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * An ARN that uniquely identifies a source recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var SourceRecoveryPointArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The current state of a copy job.
    */
  var State: js.UndefOr[CopyJobState] = js.undefined
  
  /**
    * A detailed message explaining the status of the job to copy a resource.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}
object CopyJob {
  
  @scala.inline
  def apply(): CopyJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyJob]
  }
  
  @scala.inline
  implicit class CopyJobMutableBuilder[Self <: CopyJob] (val x: Self) extends AnyVal {
    
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
    def setCopyJobId(value: String): Self = StObject.set(x, "CopyJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyJobIdUndefined: Self = StObject.set(x, "CopyJobId", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: RecoveryPointCreator): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setCreationDate(value: timestamp): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setDestinationBackupVaultArn(value: ARN): Self = StObject.set(x, "DestinationBackupVaultArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationBackupVaultArnUndefined: Self = StObject.set(x, "DestinationBackupVaultArn", js.undefined)
    
    @scala.inline
    def setDestinationRecoveryPointArn(value: ARN): Self = StObject.set(x, "DestinationRecoveryPointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationRecoveryPointArnUndefined: Self = StObject.set(x, "DestinationRecoveryPointArn", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: IAMRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    @scala.inline
    def setResourceArn(value: ARN): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setSourceBackupVaultArn(value: ARN): Self = StObject.set(x, "SourceBackupVaultArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBackupVaultArnUndefined: Self = StObject.set(x, "SourceBackupVaultArn", js.undefined)
    
    @scala.inline
    def setSourceRecoveryPointArn(value: ARN): Self = StObject.set(x, "SourceRecoveryPointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRecoveryPointArnUndefined: Self = StObject.set(x, "SourceRecoveryPointArn", js.undefined)
    
    @scala.inline
    def setState(value: CopyJobState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}
