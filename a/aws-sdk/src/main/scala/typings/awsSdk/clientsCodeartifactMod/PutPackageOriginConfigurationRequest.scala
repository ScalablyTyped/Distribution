package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutPackageOriginConfigurationRequest extends StObject {
  
  /**
    * The name of the package to be updated.
    */
  @JSName("package")
  var _package: PackageName
  
  /**
    * The name of the domain that contains the repository that contains the package.
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * A format that specifies the type of the package to be updated.
    */
  var format: PackageFormat
  
  /**
    * The namespace of the package to be updated. The package component that specifies its namespace depends on its type. For example:    The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     Python and NuGet packages do not contain a corresponding component, packages of those formats do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    * The name of the repository that contains the package.
    */
  var repository: RepositoryName
  
  /**
    * A PackageOriginRestrictions object that contains information about the upstream and publish package origin restrictions. The upstream restriction determines if new package versions can be ingested or retained from external connections or upstream repositories. The publish restriction determines if new package versions can be published directly to the repository. You must include both the desired upstream and publish restrictions.
    */
  var restrictions: PackageOriginRestrictions
}
object PutPackageOriginConfigurationRequest {
  
  inline def apply(
    _package: PackageName,
    domain: DomainName,
    format: PackageFormat,
    repository: RepositoryName,
    restrictions: PackageOriginRestrictions
  ): PutPackageOriginConfigurationRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPackageOriginConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutPackageOriginConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    inline def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    inline def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setRepository(value: RepositoryName): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRestrictions(value: PackageOriginRestrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    inline def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
