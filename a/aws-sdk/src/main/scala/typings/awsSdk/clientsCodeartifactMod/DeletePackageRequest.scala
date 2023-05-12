package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePackageRequest extends StObject {
  
  /**
    * The name of the package to delete.
    */
  @JSName("package")
  var _package: PackageName
  
  /**
    * The name of the domain that contains the package to delete.
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The format of the requested package to delete.
    */
  var format: PackageFormat
  
  /**
    * The namespace of the package to delete. The package component that specifies its namespace depends on its type. For example:    The namespace of a Maven package is its groupId. The namespace is required when deleting Maven package versions.     The namespace of an npm package is its scope.    Python and NuGet packages do not contain corresponding components, packages of those formats do not have a namespace.     The namespace of a generic package is its namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    * The name of the repository that contains the package to delete.
    */
  var repository: RepositoryName
}
object DeletePackageRequest {
  
  inline def apply(_package: PackageName, domain: DomainName, format: PackageFormat, repository: RepositoryName): DeletePackageRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePackageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePackageRequest] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    inline def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    inline def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setRepository(value: RepositoryName): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
