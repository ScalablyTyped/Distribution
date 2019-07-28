package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupPlanInput extends js.Object {
  /**
    * The display name of a backup plan.
    */
  var BackupPlanName: typings.awsDashSdk.clientsBackupMod.BackupPlanName
  /**
    * An array of BackupRule objects, each of which specifies a scheduled task that is used to back up a selection of resources.
    */
  var Rules: BackupRulesInput
}

object BackupPlanInput {
  @scala.inline
  def apply(BackupPlanName: BackupPlanName, Rules: BackupRulesInput): BackupPlanInput = {
    val __obj = js.Dynamic.literal(BackupPlanName = BackupPlanName, Rules = Rules)
  
    __obj.asInstanceOf[BackupPlanInput]
  }
}

