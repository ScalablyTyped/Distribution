package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyJob extends StObject {
  
  /**
    * The account ID that owns the copy job.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsBackupMod.AccountId] = js.undefined
  
  /**
    * The size, in bytes, of a copy job.
    */
  var BackupSizeInBytes: js.UndefOr[Long_] = js.undefined
  
  /**
    * This returns the statistics of the included child (nested) copy jobs.
    */
  var ChildJobsInState: js.UndefOr[CopyJobChildJobsInState] = js.undefined
  
  /**
    * The date and time a copy job is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CompletionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * This is the identifier of a resource within a composite group, such as nested (child) recovery point belonging to a composite (parent) stack. The ID is transferred from the  logical ID within a stack.
    */
  var CompositeMemberIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies a copy job.
    */
  var CopyJobId: js.UndefOr[String] = js.undefined
  
  var CreatedBy: js.UndefOr[RecoveryPointCreator] = js.undefined
  
  /**
    * The date and time a copy job is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
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
    * This is a boolean value indicating this is a parent (composite) copy job.
    */
  var IsParent: js.UndefOr[scala.Boolean] = js.undefined
  
  /**
    * This is the number of child (nested) copy jobs.
    */
  var NumberOfChildJobs: js.UndefOr[Long_] = js.undefined
  
  /**
    * This uniquely identifies a request to Backup to copy a resource. The return will be the parent (composite) job ID.
    */
  var ParentJobId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
    */
  var ResourceArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * This is the non-unique name of the resource that belongs to the specified backup.
    */
  var ResourceName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of Amazon Web Services resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.clientsBackupMod.ResourceType] = js.undefined
  
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
  
  inline def apply(): CopyJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopyJob] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setBackupSizeInBytes(value: Long_): Self = StObject.set(x, "BackupSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setBackupSizeInBytesUndefined: Self = StObject.set(x, "BackupSizeInBytes", js.undefined)
    
    inline def setChildJobsInState(value: CopyJobChildJobsInState): Self = StObject.set(x, "ChildJobsInState", value.asInstanceOf[js.Any])
    
    inline def setChildJobsInStateUndefined: Self = StObject.set(x, "ChildJobsInState", js.undefined)
    
    inline def setCompletionDate(value: js.Date): Self = StObject.set(x, "CompletionDate", value.asInstanceOf[js.Any])
    
    inline def setCompletionDateUndefined: Self = StObject.set(x, "CompletionDate", js.undefined)
    
    inline def setCompositeMemberIdentifier(value: String): Self = StObject.set(x, "CompositeMemberIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCompositeMemberIdentifierUndefined: Self = StObject.set(x, "CompositeMemberIdentifier", js.undefined)
    
    inline def setCopyJobId(value: String): Self = StObject.set(x, "CopyJobId", value.asInstanceOf[js.Any])
    
    inline def setCopyJobIdUndefined: Self = StObject.set(x, "CopyJobId", js.undefined)
    
    inline def setCreatedBy(value: RecoveryPointCreator): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDestinationBackupVaultArn(value: ARN): Self = StObject.set(x, "DestinationBackupVaultArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationBackupVaultArnUndefined: Self = StObject.set(x, "DestinationBackupVaultArn", js.undefined)
    
    inline def setDestinationRecoveryPointArn(value: ARN): Self = StObject.set(x, "DestinationRecoveryPointArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationRecoveryPointArnUndefined: Self = StObject.set(x, "DestinationRecoveryPointArn", js.undefined)
    
    inline def setIamRoleArn(value: IAMRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    inline def setIsParent(value: scala.Boolean): Self = StObject.set(x, "IsParent", value.asInstanceOf[js.Any])
    
    inline def setIsParentUndefined: Self = StObject.set(x, "IsParent", js.undefined)
    
    inline def setNumberOfChildJobs(value: Long_): Self = StObject.set(x, "NumberOfChildJobs", value.asInstanceOf[js.Any])
    
    inline def setNumberOfChildJobsUndefined: Self = StObject.set(x, "NumberOfChildJobs", js.undefined)
    
    inline def setParentJobId(value: String): Self = StObject.set(x, "ParentJobId", value.asInstanceOf[js.Any])
    
    inline def setParentJobIdUndefined: Self = StObject.set(x, "ParentJobId", js.undefined)
    
    inline def setResourceArn(value: ARN): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setSourceBackupVaultArn(value: ARN): Self = StObject.set(x, "SourceBackupVaultArn", value.asInstanceOf[js.Any])
    
    inline def setSourceBackupVaultArnUndefined: Self = StObject.set(x, "SourceBackupVaultArn", js.undefined)
    
    inline def setSourceRecoveryPointArn(value: ARN): Self = StObject.set(x, "SourceRecoveryPointArn", value.asInstanceOf[js.Any])
    
    inline def setSourceRecoveryPointArnUndefined: Self = StObject.set(x, "SourceRecoveryPointArn", js.undefined)
    
    inline def setState(value: CopyJobState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}
