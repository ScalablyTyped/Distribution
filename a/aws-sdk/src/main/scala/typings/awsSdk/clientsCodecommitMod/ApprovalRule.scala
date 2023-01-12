package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApprovalRule extends StObject {
  
  /**
    * The content of the approval rule.
    */
  var approvalRuleContent: js.UndefOr[ApprovalRuleContent] = js.undefined
  
  /**
    * The system-generated ID of the approval rule.
    */
  var approvalRuleId: js.UndefOr[ApprovalRuleId] = js.undefined
  
  /**
    * The name of the approval rule.
    */
  var approvalRuleName: js.UndefOr[ApprovalRuleName] = js.undefined
  
  /**
    * The date the approval rule was created, in timestamp format.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date the approval rule was most recently changed, in timestamp format.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule.
    */
  var lastModifiedUser: js.UndefOr[Arn] = js.undefined
  
  /**
    * The approval rule template used to create the rule.
    */
  var originApprovalRuleTemplate: js.UndefOr[OriginApprovalRuleTemplate] = js.undefined
  
  /**
    * The SHA-256 hash signature for the content of the approval rule.
    */
  var ruleContentSha256: js.UndefOr[RuleContentSha256] = js.undefined
}
object ApprovalRule {
  
  inline def apply(): ApprovalRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApprovalRule] (val x: Self) extends AnyVal {
    
    inline def setApprovalRuleContent(value: ApprovalRuleContent): Self = StObject.set(x, "approvalRuleContent", value.asInstanceOf[js.Any])
    
    inline def setApprovalRuleContentUndefined: Self = StObject.set(x, "approvalRuleContent", js.undefined)
    
    inline def setApprovalRuleId(value: ApprovalRuleId): Self = StObject.set(x, "approvalRuleId", value.asInstanceOf[js.Any])
    
    inline def setApprovalRuleIdUndefined: Self = StObject.set(x, "approvalRuleId", js.undefined)
    
    inline def setApprovalRuleName(value: ApprovalRuleName): Self = StObject.set(x, "approvalRuleName", value.asInstanceOf[js.Any])
    
    inline def setApprovalRuleNameUndefined: Self = StObject.set(x, "approvalRuleName", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setLastModifiedUser(value: Arn): Self = StObject.set(x, "lastModifiedUser", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUserUndefined: Self = StObject.set(x, "lastModifiedUser", js.undefined)
    
    inline def setOriginApprovalRuleTemplate(value: OriginApprovalRuleTemplate): Self = StObject.set(x, "originApprovalRuleTemplate", value.asInstanceOf[js.Any])
    
    inline def setOriginApprovalRuleTemplateUndefined: Self = StObject.set(x, "originApprovalRuleTemplate", js.undefined)
    
    inline def setRuleContentSha256(value: RuleContentSha256): Self = StObject.set(x, "ruleContentSha256", value.asInstanceOf[js.Any])
    
    inline def setRuleContentSha256Undefined: Self = StObject.set(x, "ruleContentSha256", js.undefined)
  }
}
