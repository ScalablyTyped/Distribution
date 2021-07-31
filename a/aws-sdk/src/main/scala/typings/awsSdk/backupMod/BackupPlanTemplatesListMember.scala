package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupPlanTemplatesListMember extends StObject {
  
  /**
    * Uniquely identifies a stored backup plan template.
    */
  var BackupPlanTemplateId: js.UndefOr[String] = js.undefined
  
  /**
    * The optional display name of a backup plan template.
    */
  var BackupPlanTemplateName: js.UndefOr[String] = js.undefined
}
object BackupPlanTemplatesListMember {
  
  @scala.inline
  def apply(): BackupPlanTemplatesListMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupPlanTemplatesListMember]
  }
  
  @scala.inline
  implicit class BackupPlanTemplatesListMemberMutableBuilder[Self <: BackupPlanTemplatesListMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPlanTemplateId(value: String): Self = StObject.set(x, "BackupPlanTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanTemplateIdUndefined: Self = StObject.set(x, "BackupPlanTemplateId", js.undefined)
    
    @scala.inline
    def setBackupPlanTemplateName(value: String): Self = StObject.set(x, "BackupPlanTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanTemplateNameUndefined: Self = StObject.set(x, "BackupPlanTemplateName", js.undefined)
  }
}
