package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApprovalRuleTemplateNameOutput extends StObject {
  
  /**
    * The structure and content of the updated approval rule template.
    */
  var approvalRuleTemplate: ApprovalRuleTemplate
}
object UpdateApprovalRuleTemplateNameOutput {
  
  inline def apply(approvalRuleTemplate: ApprovalRuleTemplate): UpdateApprovalRuleTemplateNameOutput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplate = approvalRuleTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApprovalRuleTemplateNameOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApprovalRuleTemplateNameOutput] (val x: Self) extends AnyVal {
    
    inline def setApprovalRuleTemplate(value: ApprovalRuleTemplate): Self = StObject.set(x, "approvalRuleTemplate", value.asInstanceOf[js.Any])
  }
}
