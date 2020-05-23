package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupRuleInput extends js.Object {
  /**
    * A value in minutes after a backup job is successfully started before it must be completed or it will be canceled by AWS Backup. This value is optional.
    */
  var CompletionWindowMinutes: js.UndefOr[WindowMinutes] = js.native
  /**
    * An array of CopyAction objects, which contains the details of the copy operation.
    */
  var CopyActions: js.UndefOr[typings.awsSdk.backupMod.CopyActions] = js.native
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup will transition and expire backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  var Lifecycle: js.UndefOr[typings.awsSdk.backupMod.Lifecycle] = js.native
  /**
    * To help organize your resources, you can assign your own metadata to the resources that you create. Each tag is a key-value pair.
    */
  var RecoveryPointTags: js.UndefOr[Tags] = js.native
  /**
    * An optional display name for a backup rule.
    */
  var RuleName: BackupRuleName = js.native
  /**
    * A CRON expression specifying when AWS Backup initiates a backup job.
    */
  var ScheduleExpression: js.UndefOr[CronExpression] = js.native
  /**
    * A value in minutes after a backup is scheduled before a job will be canceled if it doesn't start successfully. This value is optional.
    */
  var StartWindowMinutes: js.UndefOr[WindowMinutes] = js.native
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var TargetBackupVaultName: BackupVaultName = js.native
}

object BackupRuleInput {
  @scala.inline
  def apply(
    RuleName: BackupRuleName,
    TargetBackupVaultName: BackupVaultName,
    CompletionWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined,
    CopyActions: CopyActions = null,
    Lifecycle: Lifecycle = null,
    RecoveryPointTags: Tags = null,
    ScheduleExpression: CronExpression = null,
    StartWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
  ): BackupRuleInput = {
    val __obj = js.Dynamic.literal(RuleName = RuleName.asInstanceOf[js.Any], TargetBackupVaultName = TargetBackupVaultName.asInstanceOf[js.Any])
    if (!js.isUndefined(CompletionWindowMinutes)) __obj.updateDynamic("CompletionWindowMinutes")(CompletionWindowMinutes.get.asInstanceOf[js.Any])
    if (CopyActions != null) __obj.updateDynamic("CopyActions")(CopyActions.asInstanceOf[js.Any])
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle.asInstanceOf[js.Any])
    if (RecoveryPointTags != null) __obj.updateDynamic("RecoveryPointTags")(RecoveryPointTags.asInstanceOf[js.Any])
    if (ScheduleExpression != null) __obj.updateDynamic("ScheduleExpression")(ScheduleExpression.asInstanceOf[js.Any])
    if (!js.isUndefined(StartWindowMinutes)) __obj.updateDynamic("StartWindowMinutes")(StartWindowMinutes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupRuleInput]
  }
}

