package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyJob extends js.Object {
  /**
    * The account ID that owns the copy job.
    */
  var AccountId: js.UndefOr[typings.awsSdk.backupMod.AccountId] = js.native
  /**
    * The size, in bytes, of a copy job.
    */
  var BackupSizeInBytes: js.UndefOr[Long_] = js.native
  /**
    * The date and time a copy job is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CompletionDate: js.UndefOr[timestamp] = js.native
  /**
    * Uniquely identifies a copy job.
    */
  var CopyJobId: js.UndefOr[String] = js.native
  var CreatedBy: js.UndefOr[RecoveryPointCreator] = js.native
  /**
    * The date and time a copy job is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.native
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a destination copy vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var DestinationBackupVaultArn: js.UndefOr[ARN] = js.native
  /**
    * An ARN that uniquely identifies a destination recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var DestinationRecoveryPointArn: js.UndefOr[ARN] = js.native
  /**
    * Specifies the IAM role ARN used to copy the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: js.UndefOr[IAMRoleArn] = js.native
  /**
    * The AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
    */
  var ResourceArn: js.UndefOr[ARN] = js.native
  /**
    * The type of AWS resource to be copied; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.backupMod.ResourceType] = js.native
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a source copy vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault. 
    */
  var SourceBackupVaultArn: js.UndefOr[ARN] = js.native
  /**
    * An ARN that uniquely identifies a source recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var SourceRecoveryPointArn: js.UndefOr[ARN] = js.native
  /**
    * The current state of a copy job.
    */
  var State: js.UndefOr[CopyJobState] = js.native
  /**
    * A detailed message explaining the status of the job to copy a resource.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}

object CopyJob {
  @scala.inline
  def apply(
    AccountId: AccountId = null,
    BackupSizeInBytes: js.UndefOr[Long_] = js.undefined,
    CompletionDate: timestamp = null,
    CopyJobId: String = null,
    CreatedBy: RecoveryPointCreator = null,
    CreationDate: timestamp = null,
    DestinationBackupVaultArn: ARN = null,
    DestinationRecoveryPointArn: ARN = null,
    IamRoleArn: IAMRoleArn = null,
    ResourceArn: ARN = null,
    ResourceType: ResourceType = null,
    SourceBackupVaultArn: ARN = null,
    SourceRecoveryPointArn: ARN = null,
    State: CopyJobState = null,
    StatusMessage: String = null
  ): CopyJob = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (!js.isUndefined(BackupSizeInBytes)) __obj.updateDynamic("BackupSizeInBytes")(BackupSizeInBytes.get.asInstanceOf[js.Any])
    if (CompletionDate != null) __obj.updateDynamic("CompletionDate")(CompletionDate.asInstanceOf[js.Any])
    if (CopyJobId != null) __obj.updateDynamic("CopyJobId")(CopyJobId.asInstanceOf[js.Any])
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (DestinationBackupVaultArn != null) __obj.updateDynamic("DestinationBackupVaultArn")(DestinationBackupVaultArn.asInstanceOf[js.Any])
    if (DestinationRecoveryPointArn != null) __obj.updateDynamic("DestinationRecoveryPointArn")(DestinationRecoveryPointArn.asInstanceOf[js.Any])
    if (IamRoleArn != null) __obj.updateDynamic("IamRoleArn")(IamRoleArn.asInstanceOf[js.Any])
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (SourceBackupVaultArn != null) __obj.updateDynamic("SourceBackupVaultArn")(SourceBackupVaultArn.asInstanceOf[js.Any])
    if (SourceRecoveryPointArn != null) __obj.updateDynamic("SourceRecoveryPointArn")(SourceRecoveryPointArn.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyJob]
  }
}

