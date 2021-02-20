package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBackupPlanFromTemplateOutput extends StObject {
  
  /**
    * Returns the body of a backup plan based on the target template, including the name, rules, and backup vault of the plan.
    */
  var BackupPlanDocument: js.UndefOr[BackupPlan] = js.native
}
object GetBackupPlanFromTemplateOutput {
  
  @scala.inline
  def apply(): GetBackupPlanFromTemplateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackupPlanFromTemplateOutput]
  }
  
  @scala.inline
  implicit class GetBackupPlanFromTemplateOutputMutableBuilder[Self <: GetBackupPlanFromTemplateOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPlanDocument(value: BackupPlan): Self = StObject.set(x, "BackupPlanDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanDocumentUndefined: Self = StObject.set(x, "BackupPlanDocument", js.undefined)
  }
}
