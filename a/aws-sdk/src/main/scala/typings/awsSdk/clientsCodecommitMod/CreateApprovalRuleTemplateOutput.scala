package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApprovalRuleTemplateOutput extends StObject {
  
  /**
    * The content and structure of the created approval rule template.
    */
  var approvalRuleTemplate: ApprovalRuleTemplate
}
object CreateApprovalRuleTemplateOutput {
  
  inline def apply(approvalRuleTemplate: ApprovalRuleTemplate): CreateApprovalRuleTemplateOutput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplate = approvalRuleTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApprovalRuleTemplateOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateApprovalRuleTemplateOutput] (val x: Self) extends AnyVal {
    
    inline def setApprovalRuleTemplate(value: ApprovalRuleTemplate): Self = StObject.set(x, "approvalRuleTemplate", value.asInstanceOf[js.Any])
  }
}
