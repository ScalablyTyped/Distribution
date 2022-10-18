package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisassociateApprovalRuleTemplateFromRepositoriesError extends StObject {
  
  /**
    * An error code that specifies whether the repository name was not valid or not found.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  
  /**
    * An error message that provides details about why the repository name was either not found or not valid.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The name of the repository where the association with the template was not able to be removed.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object BatchDisassociateApprovalRuleTemplateFromRepositoriesError {
  
  inline def apply(): BatchDisassociateApprovalRuleTemplateFromRepositoriesError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDisassociateApprovalRuleTemplateFromRepositoriesError]
  }
  
  extension [Self <: BatchDisassociateApprovalRuleTemplateFromRepositoriesError](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
