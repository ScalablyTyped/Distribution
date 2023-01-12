package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPackagesRequest extends StObject {
  
  /**
    *  The name of the domain that contains the repository that contains the requested packages. 
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The format used to filter requested packages. Only packages from the provided format will be returned.
    */
  var format: js.UndefOr[PackageFormat] = js.undefined
  
  /**
    *  The maximum number of results to return per page. 
    */
  var maxResults: js.UndefOr[ListPackagesMaxResults] = js.undefined
  
  /**
    * The namespace used to filter requested packages. Only packages with the provided namespace will be returned. The package component that specifies its namespace depends on its type. For example:    The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     Python and NuGet packages do not contain a corresponding component, packages of those formats do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    *  The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  A prefix used to filter requested packages. Only packages with names that start with packagePrefix are returned. 
    */
  var packagePrefix: js.UndefOr[PackageName] = js.undefined
  
  /**
    * The value of the Publish package origin control restriction used to filter requested packages. Only packages with the provided restriction are returned. For more information, see PackageOriginRestrictions.
    */
  var publish: js.UndefOr[AllowPublish] = js.undefined
  
  /**
    *  The name of the repository that contains the requested packages. 
    */
  var repository: RepositoryName
  
  /**
    * The value of the Upstream package origin control restriction used to filter requested packages. Only packages with the provided restriction are returned. For more information, see PackageOriginRestrictions.
    */
  var upstream: js.UndefOr[AllowUpstream] = js.undefined
}
object ListPackagesRequest {
  
  inline def apply(domain: DomainName, repository: RepositoryName): ListPackagesRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPackagesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPackagesRequest] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    inline def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    inline def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMaxResults(value: ListPackagesMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPackagePrefix(value: PackageName): Self = StObject.set(x, "packagePrefix", value.asInstanceOf[js.Any])
    
    inline def setPackagePrefixUndefined: Self = StObject.set(x, "packagePrefix", js.undefined)
    
    inline def setPublish(value: AllowPublish): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
    
    inline def setPublishUndefined: Self = StObject.set(x, "publish", js.undefined)
    
    inline def setRepository(value: RepositoryName): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setUpstream(value: AllowUpstream): Self = StObject.set(x, "upstream", value.asInstanceOf[js.Any])
    
    inline def setUpstreamUndefined: Self = StObject.set(x, "upstream", js.undefined)
  }
}
