package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartBackupJobInput extends js.Object {
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typings.awsSdk.backupMod.BackupVaultName = js.native
  /**
    * A value in minutes after a backup job is successfully started before it must be completed or it will be canceled by AWS Backup. This value is optional.
    */
  var CompleteWindowMinutes: js.UndefOr[WindowMinutes] = js.native
  /**
    * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: IAMRoleArn = js.native
  /**
    * A customer chosen string that can be used to distinguish between calls to StartBackupJob.
    */
  var IdempotencyToken: js.UndefOr[String] = js.native
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup will transition and expire backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  var Lifecycle: js.UndefOr[typings.awsSdk.backupMod.Lifecycle] = js.native
  /**
    * To help organize your resources, you can assign your own metadata to the resources that you create. Each tag is a key-value pair.
    */
  var RecoveryPointTags: js.UndefOr[Tags] = js.native
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var ResourceArn: ARN = js.native
  /**
    * A value in minutes after a backup is scheduled before a job will be canceled if it doesn't start successfully. This value is optional.
    */
  var StartWindowMinutes: js.UndefOr[WindowMinutes] = js.native
}

object StartBackupJobInput {
  @scala.inline
  def apply(
    BackupVaultName: BackupVaultName,
    IamRoleArn: IAMRoleArn,
    ResourceArn: ARN,
    CompleteWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined,
    IdempotencyToken: String = null,
    Lifecycle: Lifecycle = null,
    RecoveryPointTags: Tags = null,
    StartWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
  ): StartBackupJobInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any], IamRoleArn = IamRoleArn.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    if (!js.isUndefined(CompleteWindowMinutes)) __obj.updateDynamic("CompleteWindowMinutes")(CompleteWindowMinutes.get.asInstanceOf[js.Any])
    if (IdempotencyToken != null) __obj.updateDynamic("IdempotencyToken")(IdempotencyToken.asInstanceOf[js.Any])
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle.asInstanceOf[js.Any])
    if (RecoveryPointTags != null) __obj.updateDynamic("RecoveryPointTags")(RecoveryPointTags.asInstanceOf[js.Any])
    if (!js.isUndefined(StartWindowMinutes)) __obj.updateDynamic("StartWindowMinutes")(StartWindowMinutes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBackupJobInput]
  }
}

