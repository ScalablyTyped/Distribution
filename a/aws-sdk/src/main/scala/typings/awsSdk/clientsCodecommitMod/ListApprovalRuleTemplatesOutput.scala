package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApprovalRuleTemplatesOutput extends StObject {
  
  /**
    * The names of all the approval rule templates found in the AWS Region for your AWS account.
    */
  var approvalRuleTemplateNames: js.UndefOr[ApprovalRuleTemplateNameList] = js.undefined
  
  /**
    * An enumeration token that allows the operation to batch the next results of the operation.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListApprovalRuleTemplatesOutput {
  
  inline def apply(): ListApprovalRuleTemplatesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApprovalRuleTemplatesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListApprovalRuleTemplatesOutput] (val x: Self) extends AnyVal {
    
    inline def setApprovalRuleTemplateNames(value: ApprovalRuleTemplateNameList): Self = StObject.set(x, "approvalRuleTemplateNames", value.asInstanceOf[js.Any])
    
    inline def setApprovalRuleTemplateNamesUndefined: Self = StObject.set(x, "approvalRuleTemplateNames", js.undefined)
    
    inline def setApprovalRuleTemplateNamesVarargs(value: ApprovalRuleTemplateName*): Self = StObject.set(x, "approvalRuleTemplateNames", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
