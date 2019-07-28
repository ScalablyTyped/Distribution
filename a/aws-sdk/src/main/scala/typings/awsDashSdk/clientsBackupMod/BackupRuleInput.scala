package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupRuleInput extends js.Object {
  /**
    * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
    */
  var CompletionWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup will transition and expire backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days”. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  var Lifecycle: js.UndefOr[typings.awsDashSdk.clientsBackupMod.Lifecycle] = js.undefined
  /**
    * To help organize your resources, you can assign your own metadata to the resources that you create. Each tag is a key-value pair.
    */
  var RecoveryPointTags: js.UndefOr[Tags] = js.undefined
  /**
    * &gt;An optional display name for a backup rule.
    */
  var RuleName: BackupRuleName
  /**
    * A CRON expression specifying when AWS Backup initiates a backup job.
    */
  var ScheduleExpression: js.UndefOr[CronExpression] = js.undefined
  /**
    * The amount of time in minutes before beginning a backup.
    */
  var StartWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var TargetBackupVaultName: BackupVaultName
}

object BackupRuleInput {
  @scala.inline
  def apply(
    RuleName: BackupRuleName,
    TargetBackupVaultName: BackupVaultName,
    CompletionWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined,
    Lifecycle: Lifecycle = null,
    RecoveryPointTags: Tags = null,
    ScheduleExpression: CronExpression = null,
    StartWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
  ): BackupRuleInput = {
    val __obj = js.Dynamic.literal(RuleName = RuleName, TargetBackupVaultName = TargetBackupVaultName)
    if (!js.isUndefined(CompletionWindowMinutes)) __obj.updateDynamic("CompletionWindowMinutes")(CompletionWindowMinutes)
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle)
    if (RecoveryPointTags != null) __obj.updateDynamic("RecoveryPointTags")(RecoveryPointTags)
    if (ScheduleExpression != null) __obj.updateDynamic("ScheduleExpression")(ScheduleExpression)
    if (!js.isUndefined(StartWindowMinutes)) __obj.updateDynamic("StartWindowMinutes")(StartWindowMinutes)
    __obj.asInstanceOf[BackupRuleInput]
  }
}

