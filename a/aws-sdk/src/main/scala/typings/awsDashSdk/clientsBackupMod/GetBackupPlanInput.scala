package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBackupPlanInput extends js.Object {
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: String
  /**
    * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version IDs cannot be edited.
    */
  var VersionId: js.UndefOr[String] = js.undefined
}

object GetBackupPlanInput {
  @scala.inline
  def apply(BackupPlanId: String, VersionId: String = null): GetBackupPlanInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[GetBackupPlanInput]
  }
}

