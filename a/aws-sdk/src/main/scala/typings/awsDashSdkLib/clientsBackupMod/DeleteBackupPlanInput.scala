package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBackupPlanInput extends js.Object {
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: java.lang.String
}

object DeleteBackupPlanInput {
  @scala.inline
  def apply(BackupPlanId: java.lang.String): DeleteBackupPlanInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId)
  
    __obj.asInstanceOf[DeleteBackupPlanInput]
  }
}

