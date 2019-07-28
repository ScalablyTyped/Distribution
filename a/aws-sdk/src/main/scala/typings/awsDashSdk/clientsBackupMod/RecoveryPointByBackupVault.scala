package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecoveryPointByBackupVault extends js.Object {
  /**
    * The size, in bytes, of a backup.
    */
  var BackupSizeInBytes: js.UndefOr[Long] = js.undefined
  /**
    * An ARN that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.undefined
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: js.UndefOr[typings.awsDashSdk.clientsBackupMod.BackupVaultName] = js.undefined
  /**
    * A CalculatedLifecycle object containing DeleteAt and MoveToColdStorageAt timestamps.
    */
  var CalculatedLifecycle: js.UndefOr[typings.awsDashSdk.clientsBackupMod.CalculatedLifecycle] = js.undefined
  /**
    * The date and time a job to restore a recovery point is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CompletionDate: js.UndefOr[timestamp] = js.undefined
  /**
    * Contains identifying information about the creation of a recovery point, including the BackupPlanArn, BackupPlanId, BackupPlanVersion, and BackupRuleId of the backup plan that is used to create it.
    */
  var CreatedBy: js.UndefOr[RecoveryPointCreator] = js.undefined
  /**
    * The date and time a recovery point is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.undefined
  /**
    * The server-side encryption key that is used to protect your backups; for example, arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
    */
  var EncryptionKeyArn: js.UndefOr[ARN] = js.undefined
  /**
    * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: js.UndefOr[IAMRoleArn] = js.undefined
  /**
    * A Boolean value that is returned as TRUE if the specified recovery point is encrypted, or FALSE if the recovery point is not encrypted.
    */
  var IsEncrypted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The date and time a recovery point was last restored, in Unix format and Coordinated Universal Time (UTC). The value of LastRestoreTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var LastRestoreTime: js.UndefOr[timestamp] = js.undefined
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  var Lifecycle: js.UndefOr[typings.awsDashSdk.clientsBackupMod.Lifecycle] = js.undefined
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.undefined
  /**
    * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var ResourceArn: js.UndefOr[ARN] = js.undefined
  /**
    * The type of AWS resource saved as a recovery point; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
    */
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsBackupMod.ResourceType] = js.undefined
  /**
    * A status code specifying the state of the recovery point.
    */
  var Status: js.UndefOr[RecoveryPointStatus] = js.undefined
}

object RecoveryPointByBackupVault {
  @scala.inline
  def apply(
    BackupSizeInBytes: js.UndefOr[Long] = js.undefined,
    BackupVaultArn: ARN = null,
    BackupVaultName: BackupVaultName = null,
    CalculatedLifecycle: CalculatedLifecycle = null,
    CompletionDate: timestamp = null,
    CreatedBy: RecoveryPointCreator = null,
    CreationDate: timestamp = null,
    EncryptionKeyArn: ARN = null,
    IamRoleArn: IAMRoleArn = null,
    IsEncrypted: js.UndefOr[scala.Boolean] = js.undefined,
    LastRestoreTime: timestamp = null,
    Lifecycle: Lifecycle = null,
    RecoveryPointArn: ARN = null,
    ResourceArn: ARN = null,
    ResourceType: ResourceType = null,
    Status: RecoveryPointStatus = null
  ): RecoveryPointByBackupVault = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BackupSizeInBytes)) __obj.updateDynamic("BackupSizeInBytes")(BackupSizeInBytes)
    if (BackupVaultArn != null) __obj.updateDynamic("BackupVaultArn")(BackupVaultArn)
    if (BackupVaultName != null) __obj.updateDynamic("BackupVaultName")(BackupVaultName)
    if (CalculatedLifecycle != null) __obj.updateDynamic("CalculatedLifecycle")(CalculatedLifecycle)
    if (CompletionDate != null) __obj.updateDynamic("CompletionDate")(CompletionDate)
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (EncryptionKeyArn != null) __obj.updateDynamic("EncryptionKeyArn")(EncryptionKeyArn)
    if (IamRoleArn != null) __obj.updateDynamic("IamRoleArn")(IamRoleArn)
    if (!js.isUndefined(IsEncrypted)) __obj.updateDynamic("IsEncrypted")(IsEncrypted)
    if (LastRestoreTime != null) __obj.updateDynamic("LastRestoreTime")(LastRestoreTime)
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle)
    if (RecoveryPointArn != null) __obj.updateDynamic("RecoveryPointArn")(RecoveryPointArn)
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecoveryPointByBackupVault]
  }
}

