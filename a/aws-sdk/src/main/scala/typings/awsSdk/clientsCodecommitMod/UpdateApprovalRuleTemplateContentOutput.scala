package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApprovalRuleTemplateContentOutput extends StObject {
  
  var approvalRuleTemplate: ApprovalRuleTemplate
}
object UpdateApprovalRuleTemplateContentOutput {
  
  inline def apply(approvalRuleTemplate: ApprovalRuleTemplate): UpdateApprovalRuleTemplateContentOutput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplate = approvalRuleTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApprovalRuleTemplateContentOutput]
  }
  
  extension [Self <: UpdateApprovalRuleTemplateContentOutput](x: Self) {
    
    inline def setApprovalRuleTemplate(value: ApprovalRuleTemplate): Self = StObject.set(x, "approvalRuleTemplate", value.asInstanceOf[js.Any])
  }
}
