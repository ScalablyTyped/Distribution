package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackupPlanFromTemplateOutput extends StObject {
  
  /**
    * Returns the body of a backup plan based on the target template, including the name, rules, and backup vault of the plan.
    */
  var BackupPlanDocument: js.UndefOr[BackupPlan] = js.undefined
}
object GetBackupPlanFromTemplateOutput {
  
  inline def apply(): GetBackupPlanFromTemplateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackupPlanFromTemplateOutput]
  }
  
  extension [Self <: GetBackupPlanFromTemplateOutput](x: Self) {
    
    inline def setBackupPlanDocument(value: BackupPlan): Self = StObject.set(x, "BackupPlanDocument", value.asInstanceOf[js.Any])
    
    inline def setBackupPlanDocumentUndefined: Self = StObject.set(x, "BackupPlanDocument", js.undefined)
  }
}
