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
  def apply(): CopyJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyJob]
  }
  @scala.inline
  implicit class CopyJobOps[Self <: CopyJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setBackupSizeInBytes(value: Long_): Self = this.set("BackupSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupSizeInBytes: Self = this.set("BackupSizeInBytes", js.undefined)
    @scala.inline
    def setCompletionDate(value: timestamp): Self = this.set("CompletionDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletionDate: Self = this.set("CompletionDate", js.undefined)
    @scala.inline
    def setCopyJobId(value: String): Self = this.set("CopyJobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyJobId: Self = this.set("CopyJobId", js.undefined)
    @scala.inline
    def setCreatedBy(value: RecoveryPointCreator): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("CreatedBy", js.undefined)
    @scala.inline
    def setCreationDate(value: timestamp): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setDestinationBackupVaultArn(value: ARN): Self = this.set("DestinationBackupVaultArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationBackupVaultArn: Self = this.set("DestinationBackupVaultArn", js.undefined)
    @scala.inline
    def setDestinationRecoveryPointArn(value: ARN): Self = this.set("DestinationRecoveryPointArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationRecoveryPointArn: Self = this.set("DestinationRecoveryPointArn", js.undefined)
    @scala.inline
    def setIamRoleArn(value: IAMRoleArn): Self = this.set("IamRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamRoleArn: Self = this.set("IamRoleArn", js.undefined)
    @scala.inline
    def setResourceArn(value: ARN): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    @scala.inline
    def setSourceBackupVaultArn(value: ARN): Self = this.set("SourceBackupVaultArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceBackupVaultArn: Self = this.set("SourceBackupVaultArn", js.undefined)
    @scala.inline
    def setSourceRecoveryPointArn(value: ARN): Self = this.set("SourceRecoveryPointArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceRecoveryPointArn: Self = this.set("SourceRecoveryPointArn", js.undefined)
    @scala.inline
    def setState(value: CopyJobState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
  }
  
}

