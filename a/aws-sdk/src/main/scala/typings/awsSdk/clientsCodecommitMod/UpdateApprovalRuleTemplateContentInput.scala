package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApprovalRuleTemplateContentInput extends StObject {
  
  /**
    * The name of the approval rule template where you want to update the content of the rule. 
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName
  
  /**
    * The SHA-256 hash signature for the content of the approval rule. You can retrieve this information by using GetPullRequest.
    */
  var existingRuleContentSha256: js.UndefOr[RuleContentSha256] = js.undefined
  
  /**
    * The content that replaces the existing content of the rule. Content statements must be complete. You cannot provide only the changes.
    */
  var newRuleContent: ApprovalRuleTemplateContent
}
object UpdateApprovalRuleTemplateContentInput {
  
  inline def apply(approvalRuleTemplateName: ApprovalRuleTemplateName, newRuleContent: ApprovalRuleTemplateContent): UpdateApprovalRuleTemplateContentInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any], newRuleContent = newRuleContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApprovalRuleTemplateContentInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApprovalRuleTemplateContentInput] (val x: Self) extends AnyVal {
    
    inline def setApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = StObject.set(x, "approvalRuleTemplateName", value.asInstanceOf[js.Any])
    
    inline def setExistingRuleContentSha256(value: RuleContentSha256): Self = StObject.set(x, "existingRuleContentSha256", value.asInstanceOf[js.Any])
    
    inline def setExistingRuleContentSha256Undefined: Self = StObject.set(x, "existingRuleContentSha256", js.undefined)
    
    inline def setNewRuleContent(value: ApprovalRuleTemplateContent): Self = StObject.set(x, "newRuleContent", value.asInstanceOf[js.Any])
  }
}
