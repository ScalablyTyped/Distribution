package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartBackupJobInput extends js.Object {
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typings.awsDashSdk.clientsBackupMod.BackupVaultName
  /**
    * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
    */
  var CompleteWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
  /**
    * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: IAMRoleArn
  /**
    * A customer chosen string that can be used to distinguish between calls to StartBackupJob. Idempotency tokens time out after one hour. Therefore, if you call StartBackupJob multiple times with the same idempotency token within one hour, AWS Backup recognizes that you are requesting only one backup job and initiates only one. If you change the idempotency token for each call, AWS Backup recognizes that you are requesting to start multiple backups.
    */
  var IdempotencyToken: js.UndefOr[String] = js.undefined
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup will transition and expire backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  var Lifecycle: js.UndefOr[typings.awsDashSdk.clientsBackupMod.Lifecycle] = js.undefined
  /**
    * To help organize your resources, you can assign your own metadata to the resources that you create. Each tag is a key-value pair.
    */
  var RecoveryPointTags: js.UndefOr[Tags] = js.undefined
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var ResourceArn: ARN
  /**
    * The amount of time in minutes before beginning a backup.
    */
  var StartWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
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
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName, IamRoleArn = IamRoleArn, ResourceArn = ResourceArn)
    if (!js.isUndefined(CompleteWindowMinutes)) __obj.updateDynamic("CompleteWindowMinutes")(CompleteWindowMinutes)
    if (IdempotencyToken != null) __obj.updateDynamic("IdempotencyToken")(IdempotencyToken)
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle)
    if (RecoveryPointTags != null) __obj.updateDynamic("RecoveryPointTags")(RecoveryPointTags)
    if (!js.isUndefined(StartWindowMinutes)) __obj.updateDynamic("StartWindowMinutes")(StartWindowMinutes)
    __obj.asInstanceOf[StartBackupJobInput]
  }
}

