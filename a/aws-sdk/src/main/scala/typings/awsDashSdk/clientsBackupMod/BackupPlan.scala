package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupPlan extends js.Object {
  /**
    * The display name of a backup plan.
    */
  var BackupPlanName: typings.awsDashSdk.clientsBackupMod.BackupPlanName = js.native
  /**
    * An array of BackupRule objects, each of which specifies a scheduled task that is used to back up a selection of resources.
    */
  var Rules: BackupRules = js.native
}

object BackupPlan {
  @scala.inline
  def apply(BackupPlanName: BackupPlanName, Rules: BackupRules): BackupPlan = {
    val __obj = js.Dynamic.literal(BackupPlanName = BackupPlanName.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BackupPlan]
  }
}

