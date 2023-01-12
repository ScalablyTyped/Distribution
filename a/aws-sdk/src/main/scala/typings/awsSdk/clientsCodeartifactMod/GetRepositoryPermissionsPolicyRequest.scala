package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRepositoryPermissionsPolicyRequest extends StObject {
  
  /**
    *  The name of the domain containing the repository whose associated resource policy is to be retrieved. 
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The name of the repository whose associated resource policy is to be retrieved. 
    */
  var repository: RepositoryName
}
object GetRepositoryPermissionsPolicyRequest {
  
  inline def apply(domain: DomainName, repository: RepositoryName): GetRepositoryPermissionsPolicyRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryPermissionsPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRepositoryPermissionsPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    inline def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    inline def setRepository(value: RepositoryName): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
