package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupPlanInput extends js.Object {
  /**
    * The display name of a backup plan.
    */
  var BackupPlanName: typings.awsSdk.backupMod.BackupPlanName = js.native
  /**
    * An array of BackupRule objects, each of which specifies a scheduled task that is used to back up a selection of resources.
    */
  var Rules: BackupRulesInput = js.native
}

object BackupPlanInput {
  @scala.inline
  def apply(BackupPlanName: BackupPlanName, Rules: BackupRulesInput): BackupPlanInput = {
    val __obj = js.Dynamic.literal(BackupPlanName = BackupPlanName.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupPlanInput]
  }
}

