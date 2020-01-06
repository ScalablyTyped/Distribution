package typings.awsDashSdk.clientsBackupMod

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
    * A customer chosen string that can be used to distinguish between calls to StartRestoreJob. Idempotency tokens time out after one hour. Therefore, if you call StartRestoreJob multiple times with the same idempotency token within one hour, AWS Backup recognizes that you are requesting only one restore job and initiates only one. If you change the idempotency token for each call, AWS Backup recognizes that you are requesting to start multiple restores. 
    */
  var IdempotencyToken: js.UndefOr[String] = js.native
  /**
    * A set of metadata key-value pairs. Lists the metadata that the recovery point was created with.
    */
  var Metadata: typings.awsDashSdk.clientsBackupMod.Metadata = js.native
  /**
    * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: ARN = js.native
  /**
    * Starts a job to restore a recovery point for one of the following resources:    EBS for Amazon Elastic Block Store    SGW for AWS Storage Gateway    RDS for Amazon Relational Database Service    DDB for Amazon DynamoDB    EFS for Amazon Elastic File System  
    */
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsBackupMod.ResourceType] = js.native
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

