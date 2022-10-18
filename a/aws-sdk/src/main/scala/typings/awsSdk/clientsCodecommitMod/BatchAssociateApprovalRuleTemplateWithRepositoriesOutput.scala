package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAssociateApprovalRuleTemplateWithRepositoriesOutput extends StObject {
  
  /**
    * A list of names of the repositories that have been associated with the template.
    */
  var associatedRepositoryNames: RepositoryNameList
  
  /**
    * A list of any errors that might have occurred while attempting to create the association between the template and the repositories.
    */
  var errors: BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList
}
object BatchAssociateApprovalRuleTemplateWithRepositoriesOutput {
  
  inline def apply(
    associatedRepositoryNames: RepositoryNameList,
    errors: BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList
  ): BatchAssociateApprovalRuleTemplateWithRepositoriesOutput = {
    val __obj = js.Dynamic.literal(associatedRepositoryNames = associatedRepositoryNames.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateApprovalRuleTemplateWithRepositoriesOutput]
  }
  
  extension [Self <: BatchAssociateApprovalRuleTemplateWithRepositoriesOutput](x: Self) {
    
    inline def setAssociatedRepositoryNames(value: RepositoryNameList): Self = StObject.set(x, "associatedRepositoryNames", value.asInstanceOf[js.Any])
    
    inline def setAssociatedRepositoryNamesVarargs(value: RepositoryName*): Self = StObject.set(x, "associatedRepositoryNames", js.Array(value*))
    
    inline def setErrors(value: BatchAssociateApprovalRuleTemplateWithRepositoriesErrorsList): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: BatchAssociateApprovalRuleTemplateWithRepositoriesError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
