package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApprovalRuleTemplateDescriptionInput extends StObject {
  
  /**
    * The updated description of the approval rule template.
    */
  var approvalRuleTemplateDescription: ApprovalRuleTemplateDescription
  
  /**
    * The name of the template for which you want to update the description.
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName
}
object UpdateApprovalRuleTemplateDescriptionInput {
  
  inline def apply(
    approvalRuleTemplateDescription: ApprovalRuleTemplateDescription,
    approvalRuleTemplateName: ApprovalRuleTemplateName
  ): UpdateApprovalRuleTemplateDescriptionInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateDescription = approvalRuleTemplateDescription.asInstanceOf[js.Any], approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApprovalRuleTemplateDescriptionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApprovalRuleTemplateDescriptionInput] (val x: Self) extends AnyVal {
    
    inline def setApprovalRuleTemplateDescription(value: ApprovalRuleTemplateDescription): Self = StObject.set(x, "approvalRuleTemplateDescription", value.asInstanceOf[js.Any])
    
    inline def setApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = StObject.set(x, "approvalRuleTemplateName", value.asInstanceOf[js.Any])
  }
}
