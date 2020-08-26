package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRecoveryPointOutput extends js.Object {
  /**
    * The size, in bytes, of a backup.
    */
  var BackupSizeInBytes: js.UndefOr[Long_] = js.native
  /**
    * An ARN that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.native
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: js.UndefOr[typings.awsSdk.backupMod.BackupVaultName] = js.native
  /**
    * A CalculatedLifecycle object containing DeleteAt and MoveToColdStorageAt timestamps.
    */
  var CalculatedLifecycle: js.UndefOr[typings.awsSdk.backupMod.CalculatedLifecycle] = js.native
  /**
    * The date and time that a job to create a recovery point is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CompletionDate: js.UndefOr[timestamp] = js.native
  /**
    * Contains identifying information about the creation of a recovery point, including the BackupPlanArn, BackupPlanId, BackupPlanVersion, and BackupRuleId of the backup plan used to create it.
    */
  var CreatedBy: js.UndefOr[RecoveryPointCreator] = js.native
  /**
    * The date and time that a recovery point is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.native
  /**
    * The server-side encryption key used to protect your backups; for example, arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
    */
  var EncryptionKeyArn: js.UndefOr[ARN] = js.native
  /**
    * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: js.UndefOr[IAMRoleArn] = js.native
  /**
    * A Boolean value that is returned as TRUE if the specified recovery point is encrypted, or FALSE if the recovery point is not encrypted.
    */
  var IsEncrypted: js.UndefOr[scala.Boolean] = js.native
  /**
    * The date and time that a recovery point was last restored, in Unix format and Coordinated Universal Time (UTC). The value of LastRestoreTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var LastRestoreTime: js.UndefOr[timestamp] = js.native
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups that are transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  var Lifecycle: js.UndefOr[typings.awsSdk.backupMod.Lifecycle] = js.native
  /**
    * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.native
  /**
    * An ARN that uniquely identifies a saved resource. The format of the ARN depends on the resource type.
    */
  var ResourceArn: js.UndefOr[ARN] = js.native
  /**
    * The type of AWS resource to save as a recovery point; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.backupMod.ResourceType] = js.native
  /**
    * A status code specifying the state of the recovery point.  A partial status indicates that the recovery point was not successfully re-created and must be retried. 
    */
  var Status: js.UndefOr[RecoveryPointStatus] = js.native
  /**
    * Specifies the storage class of the recovery point. Valid values are WARM or COLD.
    */
  var StorageClass: js.UndefOr[typings.awsSdk.backupMod.StorageClass] = js.native
}

object DescribeRecoveryPointOutput {
  @scala.inline
  def apply(): DescribeRecoveryPointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecoveryPointOutput]
  }
  @scala.inline
  implicit class DescribeRecoveryPointOutputOps[Self <: DescribeRecoveryPointOutput] (val x: Self) extends AnyVal {
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
    def setBackupSizeInBytes(value: Long_): Self = this.set("BackupSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupSizeInBytes: Self = this.set("BackupSizeInBytes", js.undefined)
    @scala.inline
    def setBackupVaultArn(value: ARN): Self = this.set("BackupVaultArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupVaultArn: Self = this.set("BackupVaultArn", js.undefined)
    @scala.inline
    def setBackupVaultName(value: BackupVaultName): Self = this.set("BackupVaultName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupVaultName: Self = this.set("BackupVaultName", js.undefined)
    @scala.inline
    def setCalculatedLifecycle(value: CalculatedLifecycle): Self = this.set("CalculatedLifecycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculatedLifecycle: Self = this.set("CalculatedLifecycle", js.undefined)
    @scala.inline
    def setCompletionDate(value: timestamp): Self = this.set("CompletionDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletionDate: Self = this.set("CompletionDate", js.undefined)
    @scala.inline
    def setCreatedBy(value: RecoveryPointCreator): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("CreatedBy", js.undefined)
    @scala.inline
    def setCreationDate(value: timestamp): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setEncryptionKeyArn(value: ARN): Self = this.set("EncryptionKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionKeyArn: Self = this.set("EncryptionKeyArn", js.undefined)
    @scala.inline
    def setIamRoleArn(value: IAMRoleArn): Self = this.set("IamRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamRoleArn: Self = this.set("IamRoleArn", js.undefined)
    @scala.inline
    def setIsEncrypted(value: scala.Boolean): Self = this.set("IsEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEncrypted: Self = this.set("IsEncrypted", js.undefined)
    @scala.inline
    def setLastRestoreTime(value: timestamp): Self = this.set("LastRestoreTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastRestoreTime: Self = this.set("LastRestoreTime", js.undefined)
    @scala.inline
    def setLifecycle(value: Lifecycle): Self = this.set("Lifecycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycle: Self = this.set("Lifecycle", js.undefined)
    @scala.inline
    def setRecoveryPointArn(value: ARN): Self = this.set("RecoveryPointArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecoveryPointArn: Self = this.set("RecoveryPointArn", js.undefined)
    @scala.inline
    def setResourceArn(value: ARN): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    @scala.inline
    def setStatus(value: RecoveryPointStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStorageClass(value: StorageClass): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
  }
  
}

