package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBackupPlanFromJSONOutput extends StObject {
  
  /**
    * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
    */
  var BackupPlan: js.UndefOr[typings.awsSdk.backupMod.BackupPlan] = js.native
}
object GetBackupPlanFromJSONOutput {
  
  @scala.inline
  def apply(): GetBackupPlanFromJSONOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackupPlanFromJSONOutput]
  }
  
  @scala.inline
  implicit class GetBackupPlanFromJSONOutputMutableBuilder[Self <: GetBackupPlanFromJSONOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPlan(value: BackupPlan): Self = StObject.set(x, "BackupPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanUndefined: Self = StObject.set(x, "BackupPlan", js.undefined)
  }
}
