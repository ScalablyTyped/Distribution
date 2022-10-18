package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRepositoryEndpointRequest extends StObject {
  
  /**
    *  The name of the domain that contains the repository. 
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the Amazon Web Services account that owns the domain that contains the repository. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  Returns which endpoint of a repository to return. A repository has one endpoint for each package format. 
    */
  var format: PackageFormat
  
  /**
    *  The name of the repository. 
    */
  var repository: RepositoryName
}
object GetRepositoryEndpointRequest {
  
  inline def apply(domain: DomainName, format: PackageFormat, repository: RepositoryName): GetRepositoryEndpointRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryEndpointRequest]
  }
  
  extension [Self <: GetRepositoryEndpointRequest](x: Self) {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    inline def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    inline def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: RepositoryName): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
