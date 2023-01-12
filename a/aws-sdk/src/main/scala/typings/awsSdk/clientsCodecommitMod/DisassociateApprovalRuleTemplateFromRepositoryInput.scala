package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateApprovalRuleTemplateFromRepositoryInput extends StObject {
  
  /**
    * The name of the approval rule template to disassociate from a specified repository.
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName
  
  /**
    * The name of the repository you want to disassociate from the template.
    */
  var repositoryName: RepositoryName
}
object DisassociateApprovalRuleTemplateFromRepositoryInput {
  
  inline def apply(approvalRuleTemplateName: ApprovalRuleTemplateName, repositoryName: RepositoryName): DisassociateApprovalRuleTemplateFromRepositoryInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateApprovalRuleTemplateFromRepositoryInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateApprovalRuleTemplateFromRepositoryInput] (val x: Self) extends AnyVal {
    
    inline def setApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = StObject.set(x, "approvalRuleTemplateName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
