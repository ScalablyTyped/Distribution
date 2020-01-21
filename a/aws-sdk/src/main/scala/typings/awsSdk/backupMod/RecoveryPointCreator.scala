package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecoveryPointCreator extends js.Object {
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example, arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50.
    */
  var BackupPlanArn: js.UndefOr[ARN] = js.native
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[String] = js.native
  /**
    * Version IDs are unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. They cannot be edited.
    */
  var BackupPlanVersion: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies a rule used to schedule the backup of a selection of resources.
    */
  var BackupRuleId: js.UndefOr[String] = js.native
}

object RecoveryPointCreator {
  @scala.inline
  def apply(
    BackupPlanArn: ARN = null,
    BackupPlanId: String = null,
    BackupPlanVersion: String = null,
    BackupRuleId: String = null
  ): RecoveryPointCreator = {
    val __obj = js.Dynamic.literal()
    if (BackupPlanArn != null) __obj.updateDynamic("BackupPlanArn")(BackupPlanArn.asInstanceOf[js.Any])
    if (BackupPlanId != null) __obj.updateDynamic("BackupPlanId")(BackupPlanId.asInstanceOf[js.Any])
    if (BackupPlanVersion != null) __obj.updateDynamic("BackupPlanVersion")(BackupPlanVersion.asInstanceOf[js.Any])
    if (BackupRuleId != null) __obj.updateDynamic("BackupRuleId")(BackupRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecoveryPointCreator]
  }
}

