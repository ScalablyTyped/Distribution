package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecoveryPointCreator extends js.Object {
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example, arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50.
    */
  var BackupPlanArn: js.UndefOr[ARN] = js.undefined
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Version IDs are unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. They cannot be edited.
    */
  var BackupPlanVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Uniquely identifies a rule used to schedule the backup of a selection of resources.
    */
  var BackupRuleId: js.UndefOr[java.lang.String] = js.undefined
}

object RecoveryPointCreator {
  @scala.inline
  def apply(
    BackupPlanArn: ARN = null,
    BackupPlanId: java.lang.String = null,
    BackupPlanVersion: java.lang.String = null,
    BackupRuleId: java.lang.String = null
  ): RecoveryPointCreator = {
    val __obj = js.Dynamic.literal()
    if (BackupPlanArn != null) __obj.updateDynamic("BackupPlanArn")(BackupPlanArn)
    if (BackupPlanId != null) __obj.updateDynamic("BackupPlanId")(BackupPlanId)
    if (BackupPlanVersion != null) __obj.updateDynamic("BackupPlanVersion")(BackupPlanVersion)
    if (BackupRuleId != null) __obj.updateDynamic("BackupRuleId")(BackupRuleId)
    __obj.asInstanceOf[RecoveryPointCreator]
  }
}

