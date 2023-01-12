package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApprovalRuleTemplateNameInput extends StObject {
  
  /**
    * The new name you want to apply to the approval rule template.
    */
  var newApprovalRuleTemplateName: ApprovalRuleTemplateName
  
  /**
    * The current name of the approval rule template.
    */
  var oldApprovalRuleTemplateName: ApprovalRuleTemplateName
}
object UpdateApprovalRuleTemplateNameInput {
  
  inline def apply(
    newApprovalRuleTemplateName: ApprovalRuleTemplateName,
    oldApprovalRuleTemplateName: ApprovalRuleTemplateName
  ): UpdateApprovalRuleTemplateNameInput = {
    val __obj = js.Dynamic.literal(newApprovalRuleTemplateName = newApprovalRuleTemplateName.asInstanceOf[js.Any], oldApprovalRuleTemplateName = oldApprovalRuleTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApprovalRuleTemplateNameInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApprovalRuleTemplateNameInput] (val x: Self) extends AnyVal {
    
    inline def setNewApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = StObject.set(x, "newApprovalRuleTemplateName", value.asInstanceOf[js.Any])
    
    inline def setOldApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = StObject.set(x, "oldApprovalRuleTemplateName", value.asInstanceOf[js.Any])
  }
}
