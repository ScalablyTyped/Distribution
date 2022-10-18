package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRepositoryPermissionsPolicyRequest extends StObject {
  
  /**
    *  The name of the domain that contains the repository associated with the resource policy to be deleted. 
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The revision of the repository's resource policy to be deleted. This revision is used for optimistic locking, which prevents others from accidentally overwriting your changes to the repository's resource policy. 
    */
  var policyRevision: js.UndefOr[PolicyRevision] = js.undefined
  
  /**
    *  The name of the repository that is associated with the resource policy to be deleted 
    */
  var repository: RepositoryName
}
object DeleteRepositoryPermissionsPolicyRequest {
  
  inline def apply(domain: DomainName, repository: RepositoryName): DeleteRepositoryPermissionsPolicyRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRepositoryPermissionsPolicyRequest]
  }
  
  extension [Self <: DeleteRepositoryPermissionsPolicyRequest](x: Self) {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    inline def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    inline def setPolicyRevision(value: PolicyRevision): Self = StObject.set(x, "policyRevision", value.asInstanceOf[js.Any])
    
    inline def setPolicyRevisionUndefined: Self = StObject.set(x, "policyRevision", js.undefined)
    
    inline def setRepository(value: RepositoryName): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
