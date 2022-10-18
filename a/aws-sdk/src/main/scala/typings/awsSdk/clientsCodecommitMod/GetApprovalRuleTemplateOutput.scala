package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApprovalRuleTemplateOutput extends StObject {
  
  /**
    * The content and structure of the approval rule template.
    */
  var approvalRuleTemplate: ApprovalRuleTemplate
}
object GetApprovalRuleTemplateOutput {
  
  inline def apply(approvalRuleTemplate: ApprovalRuleTemplate): GetApprovalRuleTemplateOutput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplate = approvalRuleTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApprovalRuleTemplateOutput]
  }
  
  extension [Self <: GetApprovalRuleTemplateOutput](x: Self) {
    
    inline def setApprovalRuleTemplate(value: ApprovalRuleTemplate): Self = StObject.set(x, "approvalRuleTemplate", value.asInstanceOf[js.Any])
  }
}
