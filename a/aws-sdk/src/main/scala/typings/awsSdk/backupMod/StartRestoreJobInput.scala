package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartRestoreJobInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM role that AWS Backup uses to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: IAMRoleArn = js.native
  /**
    * A customer chosen string that can be used to distinguish between calls to StartRestoreJob.
    */
  var IdempotencyToken: js.UndefOr[String] = js.native
  /**
    * A set of metadata key-value pairs. Contains information, such as a resource name, required to restore a recovery point.  You can get configuration metadata about a resource at the time it was backed up by calling GetRecoveryPointRestoreMetadata. However, values in addition to those provided by GetRecoveryPointRestoreMetadata might be required to restore a resource. For example, you might need to provide a new resource name if the original already exists. You need to specify specific metadata to restore an Amazon Elastic File System (Amazon EFS) instance:    file-system-id: ID of the Amazon EFS file system that is backed up by AWS Backup. Returned in GetRecoveryPointRestoreMetadata.    Encrypted: A Boolean value that, if true, specifies that the file system is encrypted. If KmsKeyId is specified, Encrypted must be set to true.    KmsKeyId: Specifies the AWS KMS key that is used to encrypt the restored file system.    PerformanceMode: Specifies the throughput mode of the file system.    CreationToken: A user-supplied value that ensures the uniqueness (idempotency) of the request.    newFileSystem: A Boolean value that, if true, specifies that the recovery point is restored to a new Amazon EFS file system.  
    */
  var Metadata: typings.awsSdk.backupMod.Metadata = js.native
  /**
    * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: ARN = js.native
  /**
    * Starts a job to restore a recovery point for one of the following resources:    EBS for Amazon Elastic Block Store    Storage Gateway for AWS Storage Gateway    RDS for Amazon Relational Database Service    DDB for Amazon DynamoDB    EFS for Amazon Elastic File System  
    */
  var ResourceType: js.UndefOr[typings.awsSdk.backupMod.ResourceType] = js.native
}

object StartRestoreJobInput {
  @scala.inline
  def apply(
    IamRoleArn: IAMRoleArn,
    Metadata: Metadata,
    RecoveryPointArn: ARN,
    IdempotencyToken: String = null,
    ResourceType: ResourceType = null
  ): StartRestoreJobInput = {
    val __obj = js.Dynamic.literal(IamRoleArn = IamRoleArn.asInstanceOf[js.Any], Metadata = Metadata.asInstanceOf[js.Any], RecoveryPointArn = RecoveryPointArn.asInstanceOf[js.Any])
    if (IdempotencyToken != null) __obj.updateDynamic("IdempotencyToken")(IdempotencyToken.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRestoreJobInput]
  }
}

