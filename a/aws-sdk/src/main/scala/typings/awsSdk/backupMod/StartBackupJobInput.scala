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
  def apply(BackupVaultName: BackupVaultName, IamRoleArn: IAMRoleArn, ResourceArn: ARN): StartBackupJobInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any], IamRoleArn = IamRoleArn.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBackupJobInput]
  }
  @scala.inline
  implicit class StartBackupJobInputOps[Self <: StartBackupJobInput] (val x: Self) extends AnyVal {
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
    def setBackupVaultName(value: BackupVaultName): Self = this.set("BackupVaultName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIamRoleArn(value: IAMRoleArn): Self = this.set("IamRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceArn(value: ARN): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompleteWindowMinutes(value: WindowMinutes): Self = this.set("CompleteWindowMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompleteWindowMinutes: Self = this.set("CompleteWindowMinutes", js.undefined)
    @scala.inline
    def setIdempotencyToken(value: String): Self = this.set("IdempotencyToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdempotencyToken: Self = this.set("IdempotencyToken", js.undefined)
    @scala.inline
    def setLifecycle(value: Lifecycle): Self = this.set("Lifecycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycle: Self = this.set("Lifecycle", js.undefined)
    @scala.inline
    def setRecoveryPointTags(value: Tags): Self = this.set("RecoveryPointTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecoveryPointTags: Self = this.set("RecoveryPointTags", js.undefined)
    @scala.inline
    def setStartWindowMinutes(value: WindowMinutes): Self = this.set("StartWindowMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartWindowMinutes: Self = this.set("StartWindowMinutes", js.undefined)
  }
  
}

