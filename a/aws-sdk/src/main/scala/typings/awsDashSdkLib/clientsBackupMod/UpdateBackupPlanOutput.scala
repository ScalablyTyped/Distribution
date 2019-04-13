package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBackupPlanOutput extends js.Object {
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example, arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50.
    */
  var BackupPlanArn: js.UndefOr[ARN] = js.undefined
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date and time a backup plan is updated, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.undefined
  /**
    * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version Ids cannot be edited.
    */
  var VersionId: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateBackupPlanOutput {
  @scala.inline
  def apply(
    BackupPlanArn: ARN = null,
    BackupPlanId: java.lang.String = null,
    CreationDate: timestamp = null,
    VersionId: java.lang.String = null
  ): UpdateBackupPlanOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupPlanArn != null) __obj.updateDynamic("BackupPlanArn")(BackupPlanArn)
    if (BackupPlanId != null) __obj.updateDynamic("BackupPlanId")(BackupPlanId)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[UpdateBackupPlanOutput]
  }
}

