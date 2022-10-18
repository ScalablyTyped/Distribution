package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRepositoryRequest extends StObject {
  
  /**
    *  A description of the created repository. 
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    *  The name of the domain that contains the created repository. 
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The name of the repository to create. 
    */
  var repository: RepositoryName
  
  /**
    * One or more tag key-value pairs for the repository.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    *  A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when CodeArtifact looks for a requested package version. For more information, see Working with upstream repositories. 
    */
  var upstreams: js.UndefOr[UpstreamRepositoryList] = js.undefined
}
object CreateRepositoryRequest {
  
  inline def apply(domain: DomainName, repository: RepositoryName): CreateRepositoryRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRepositoryRequest]
  }
  
  extension [Self <: CreateRepositoryRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    inline def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    inline def setRepository(value: RepositoryName): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUpstreams(value: UpstreamRepositoryList): Self = StObject.set(x, "upstreams", value.asInstanceOf[js.Any])
    
    inline def setUpstreamsUndefined: Self = StObject.set(x, "upstreams", js.undefined)
    
    inline def setUpstreamsVarargs(value: UpstreamRepository*): Self = StObject.set(x, "upstreams", js.Array(value*))
  }
}
