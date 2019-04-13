package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupPlan extends js.Object {
  /**
    * The display name of a backup plan.
    */
  var BackupPlanName: awsDashSdkLib.clientsBackupMod.BackupPlanName
  /**
    * An array of BackupRule objects, each of which specifies a scheduled task that is used to back up a selection of resources.
    */
  var Rules: BackupRules
}

object BackupPlan {
  @scala.inline
  def apply(BackupPlanName: BackupPlanName, Rules: BackupRules): BackupPlan = {
    val __obj = js.Dynamic.literal(BackupPlanName = BackupPlanName, Rules = Rules)
  
    __obj.asInstanceOf[BackupPlan]
  }
}

