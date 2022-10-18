package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPackageVersionsRequest extends StObject {
  
  /**
    *  The name of the package for which you want to request package versions. 
    */
  @JSName("package")
  var _package: PackageName
  
  /**
    *  The name of the domain that contains the repository that contains the requested package versions. 
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The format of the returned package versions. 
    */
  var format: PackageFormat
  
  /**
    *  The maximum number of results to return per page. 
    */
  var maxResults: js.UndefOr[ListPackageVersionsMaxResults] = js.undefined
  
  /**
    * The namespace of the package that contains the requested package versions. The package component that specifies its namespace depends on its type. For example:    The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     Python and NuGet packages do not contain a corresponding component, packages of those formats do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    *  The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The originType used to filter package versions. Only package versions with the provided originType will be returned.
    */
  var originType: js.UndefOr[PackageVersionOriginType] = js.undefined
  
  /**
    *  The name of the repository that contains the requested package versions. 
    */
  var repository: RepositoryName
  
  /**
    *  How to sort the requested list of package versions. 
    */
  var sortBy: js.UndefOr[PackageVersionSortType] = js.undefined
  
  /**
    *  A string that filters the requested package versions by status. 
    */
  var status: js.UndefOr[PackageVersionStatus] = js.undefined
}
object ListPackageVersionsRequest {
  
  inline def apply(_package: PackageName, domain: DomainName, format: PackageFormat, repository: RepositoryName): ListPackageVersionsRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPackageVersionsRequest]
  }
  
  extension [Self <: ListPackageVersionsRequest](x: Self) {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    inline def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    inline def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ListPackageVersionsMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOriginType(value: PackageVersionOriginType): Self = StObject.set(x, "originType", value.asInstanceOf[js.Any])
    
    inline def setOriginTypeUndefined: Self = StObject.set(x, "originType", js.undefined)
    
    inline def setRepository(value: RepositoryName): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSortBy(value: PackageVersionSortType): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setStatus(value: PackageVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
