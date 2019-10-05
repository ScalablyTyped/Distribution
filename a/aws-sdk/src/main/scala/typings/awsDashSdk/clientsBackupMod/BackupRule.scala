package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupRule extends js.Object {
  /**
    * A value in minutes after a backup job is successfully started before it must be completed or it is canceled by AWS Backup. This value is optional.
    */
  var CompletionWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  var Lifecycle: js.UndefOr[typings.awsDashSdk.clientsBackupMod.Lifecycle] = js.undefined
  /**
    * An array of key-value pair strings that are assigned to resources that are associated with this rule when restored from backup.
    */
  var RecoveryPointTags: js.UndefOr[Tags] = js.undefined
  /**
    * Uniquely identifies a rule that is used to schedule the backup of a selection of resources.
    */
  var RuleId: js.UndefOr[String] = js.undefined
  /**
    * An optional display name for a backup rule.
    */
  var RuleName: BackupRuleName
  /**
    * A CRON expression specifying when AWS Backup initiates a backup job.
    */
  var ScheduleExpression: js.UndefOr[CronExpression] = js.undefined
  /**
    * An optional value that specifies a period of time in minutes after a backup is scheduled before a job is canceled if it doesn't start successfully.
    */
  var StartWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var TargetBackupVaultName: BackupVaultName
}

object BackupRule {
  @scala.inline
  def apply(
    RuleName: BackupRuleName,
    TargetBackupVaultName: BackupVaultName,
    CompletionWindowMinutes: Int | Double = null,
    Lifecycle: Lifecycle = null,
    RecoveryPointTags: Tags = null,
    RuleId: String = null,
    ScheduleExpression: CronExpression = null,
    StartWindowMinutes: Int | Double = null
  ): BackupRule = {
    val __obj = js.Dynamic.literal(RuleName = RuleName, TargetBackupVaultName = TargetBackupVaultName)
    if (CompletionWindowMinutes != null) __obj.updateDynamic("CompletionWindowMinutes")(CompletionWindowMinutes.asInstanceOf[js.Any])
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle)
    if (RecoveryPointTags != null) __obj.updateDynamic("RecoveryPointTags")(RecoveryPointTags)
    if (RuleId != null) __obj.updateDynamic("RuleId")(RuleId)
    if (ScheduleExpression != null) __obj.updateDynamic("ScheduleExpression")(ScheduleExpression)
    if (StartWindowMinutes != null) __obj.updateDynamic("StartWindowMinutes")(StartWindowMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupRule]
  }
}

