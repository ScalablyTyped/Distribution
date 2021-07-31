package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRestoreJobInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: IAMRoleArn
  
  /**
    * A customer chosen string that can be used to distinguish between calls to StartRestoreJob.
    */
  var IdempotencyToken: js.UndefOr[String] = js.undefined
  
  /**
    * A set of metadata key-value pairs. Contains information, such as a resource name, required to restore a recovery point.  You can get configuration metadata about a resource at the time it was backed up by calling GetRecoveryPointRestoreMetadata. However, values in addition to those provided by GetRecoveryPointRestoreMetadata might be required to restore a resource. For example, you might need to provide a new resource name if the original already exists. You need to specify specific metadata to restore an Amazon Elastic File System (Amazon EFS) instance:    file-system-id: The ID of the Amazon EFS file system that is backed up by AWS Backup. Returned in GetRecoveryPointRestoreMetadata.    Encrypted: A Boolean value that, if true, specifies that the file system is encrypted. If KmsKeyId is specified, Encrypted must be set to true.    KmsKeyId: Specifies the AWS KMS key that is used to encrypt the restored file system. You can specify a key from another AWS account provided that key it is properly shared with your account via AWS KMS.    PerformanceMode: Specifies the throughput mode of the file system.    CreationToken: A user-supplied value that ensures the uniqueness (idempotency) of the request.    newFileSystem: A Boolean value that, if true, specifies that the recovery point is restored to a new Amazon EFS file system.    ItemsToRestore : A serialized list of up to five strings where each string is a file path. Use ItemsToRestore to restore specific files or directories rather than the entire file system. This parameter is optional.  
    */
  var Metadata: typings.awsSdk.backupMod.Metadata
  
  /**
    * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: ARN
  
  /**
    * Starts a job to restore a recovery point for one of the following resources:    DynamoDB for Amazon DynamoDB    EBS for Amazon Elastic Block Store    EC2 for Amazon Elastic Compute Cloud    EFS for Amazon Elastic File System    RDS for Amazon Relational Database Service    Storage Gateway for AWS Storage Gateway  
    */
  var ResourceType: js.UndefOr[typings.awsSdk.backupMod.ResourceType] = js.undefined
}
object StartRestoreJobInput {
  
  @scala.inline
  def apply(IamRoleArn: IAMRoleArn, Metadata: Metadata, RecoveryPointArn: ARN): StartRestoreJobInput = {
    val __obj = js.Dynamic.literal(IamRoleArn = IamRoleArn.asInstanceOf[js.Any], Metadata = Metadata.asInstanceOf[js.Any], RecoveryPointArn = RecoveryPointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRestoreJobInput]
  }
  
  @scala.inline
  implicit class StartRestoreJobInputMutableBuilder[Self <: StartRestoreJobInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIamRoleArn(value: IAMRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotencyToken(value: String): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecoveryPointArn(value: ARN): Self = StObject.set(x, "RecoveryPointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
