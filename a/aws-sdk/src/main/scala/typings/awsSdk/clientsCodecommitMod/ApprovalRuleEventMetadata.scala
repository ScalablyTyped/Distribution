package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApprovalRuleEventMetadata extends StObject {
  
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
}
object ApprovalRuleEventMetadata {
  
  inline def apply(): ApprovalRuleEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalRuleEventMetadata]
  }
  
  extension [Self <: ApprovalRuleEventMetadata](x: Self) {
    
    inline def setApprovalRuleContent(value: ApprovalRuleContent): Self = StObject.set(x, "approvalRuleContent", value.asInstanceOf[js.Any])
    
    inline def setApprovalRuleContentUndefined: Self = StObject.set(x, "approvalRuleContent", js.undefined)
    
    inline def setApprovalRuleId(value: ApprovalRuleId): Self = StObject.set(x, "approvalRuleId", value.asInstanceOf[js.Any])
    
    inline def setApprovalRuleIdUndefined: Self = StObject.set(x, "approvalRuleId", js.undefined)
    
    inline def setApprovalRuleName(value: ApprovalRuleName): Self = StObject.set(x, "approvalRuleName", value.asInstanceOf[js.Any])
    
    inline def setApprovalRuleNameUndefined: Self = StObject.set(x, "approvalRuleName", js.undefined)
  }
}
