package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBackupPlanInput extends StObject {
  
  /**
    * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
    */
  var BackupPlan: BackupPlanInput = js.native
  
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: String = js.native
}
object UpdateBackupPlanInput {
  
  @scala.inline
  def apply(BackupPlan: BackupPlanInput, BackupPlanId: String): UpdateBackupPlanInput = {
    val __obj = js.Dynamic.literal(BackupPlan = BackupPlan.asInstanceOf[js.Any], BackupPlanId = BackupPlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBackupPlanInput]
  }
  
  @scala.inline
  implicit class UpdateBackupPlanInputMutableBuilder[Self <: UpdateBackupPlanInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPlan(value: BackupPlanInput): Self = StObject.set(x, "BackupPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanId(value: String): Self = StObject.set(x, "BackupPlanId", value.asInstanceOf[js.Any])
  }
}
