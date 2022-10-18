package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApprovalRuleTemplateDescriptionOutput extends StObject {
  
  /**
    * The structure and content of the updated approval rule template.
    */
  var approvalRuleTemplate: ApprovalRuleTemplate
}
object UpdateApprovalRuleTemplateDescriptionOutput {
  
  inline def apply(approvalRuleTemplate: ApprovalRuleTemplate): UpdateApprovalRuleTemplateDescriptionOutput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplate = approvalRuleTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApprovalRuleTemplateDescriptionOutput]
  }
  
  extension [Self <: UpdateApprovalRuleTemplateDescriptionOutput](x: Self) {
    
    inline def setApprovalRuleTemplate(value: ApprovalRuleTemplate): Self = StObject.set(x, "approvalRuleTemplate", value.asInstanceOf[js.Any])
  }
}
