package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAssociateApprovalRuleTemplateWithRepositoriesInput extends StObject {
  
  /**
    * The name of the template you want to associate with one or more repositories.
    */
  var approvalRuleTemplateName: ApprovalRuleTemplateName
  
  /**
    * The names of the repositories you want to associate with the template.  The length constraint limit is for each string in the array. The array itself can be empty. 
    */
  var repositoryNames: RepositoryNameList
}
object BatchAssociateApprovalRuleTemplateWithRepositoriesInput {
  
  inline def apply(approvalRuleTemplateName: ApprovalRuleTemplateName, repositoryNames: RepositoryNameList): BatchAssociateApprovalRuleTemplateWithRepositoriesInput = {
    val __obj = js.Dynamic.literal(approvalRuleTemplateName = approvalRuleTemplateName.asInstanceOf[js.Any], repositoryNames = repositoryNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateApprovalRuleTemplateWithRepositoriesInput]
  }
  
  extension [Self <: BatchAssociateApprovalRuleTemplateWithRepositoriesInput](x: Self) {
    
    inline def setApprovalRuleTemplateName(value: ApprovalRuleTemplateName): Self = StObject.set(x, "approvalRuleTemplateName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNames(value: RepositoryNameList): Self = StObject.set(x, "repositoryNames", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNamesVarargs(value: RepositoryName*): Self = StObject.set(x, "repositoryNames", js.Array(value*))
  }
}
