package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackupPlanFromJSONOutput extends StObject {
  
  /**
    * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
    */
  var BackupPlan: js.UndefOr[typings.awsSdk.clientsBackupMod.BackupPlan] = js.undefined
}
object GetBackupPlanFromJSONOutput {
  
  inline def apply(): GetBackupPlanFromJSONOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackupPlanFromJSONOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBackupPlanFromJSONOutput] (val x: Self) extends AnyVal {
    
    inline def setBackupPlan(value: BackupPlan): Self = StObject.set(x, "BackupPlan", value.asInstanceOf[js.Any])
    
    inline def setBackupPlanUndefined: Self = StObject.set(x, "BackupPlan", js.undefined)
  }
}
