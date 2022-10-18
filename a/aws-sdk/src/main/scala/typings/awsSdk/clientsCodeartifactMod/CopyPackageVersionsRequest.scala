package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyPackageVersionsRequest extends StObject {
  
  /**
    *  The name of the package that contains the versions to be copied. 
    */
  @JSName("package")
  var _package: PackageName
  
  /**
    *  Set to true to overwrite a package version that already exists in the destination repository. If set to false and the package version already exists in the destination repository, the package version is returned in the failedVersions field of the response with an ALREADY_EXISTS error code. 
    */
  var allowOverwrite: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    *  The name of the repository into which package versions are copied. 
    */
  var destinationRepository: RepositoryName
  
  /**
    *  The name of the domain that contains the source and destination repositories. 
    */
  var domain: DomainName
  
  /**
    *  The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The format of the package versions to be copied. 
    */
  var format: PackageFormat
  
  /**
    *  Set to true to copy packages from repositories that are upstream from the source repository to the destination repository. The default setting is false. For more information, see Working with upstream repositories. 
    */
  var includeFromUpstream: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The namespace of the package versions to be copied. The package version component that specifies its namespace depends on its type. For example:    The namespace of a Maven package version is its groupId. The namespace is required when copying Maven package versions.     The namespace of an npm package version is its scope.     Python and NuGet package versions do not contain a corresponding component, package versions of those formats do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    *  The name of the repository that contains the package versions to be copied. 
    */
  var sourceRepository: RepositoryName
  
  /**
    *  A list of key-value pairs. The keys are package versions and the values are package version revisions. A CopyPackageVersion operation succeeds if the specified versions in the source repository match the specified package version revision.    You must specify versions or versionRevisions. You cannot specify both.  
    */
  var versionRevisions: js.UndefOr[PackageVersionRevisionMap] = js.undefined
  
  /**
    *  The versions of the package to be copied.    You must specify versions or versionRevisions. You cannot specify both.  
    */
  var versions: js.UndefOr[PackageVersionList] = js.undefined
}
object CopyPackageVersionsRequest {
  
  inline def apply(
    _package: PackageName,
    destinationRepository: RepositoryName,
    domain: DomainName,
    format: PackageFormat,
    sourceRepository: RepositoryName
  ): CopyPackageVersionsRequest = {
    val __obj = js.Dynamic.literal(destinationRepository = destinationRepository.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], sourceRepository = sourceRepository.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyPackageVersionsRequest]
  }
  
  extension [Self <: CopyPackageVersionsRequest](x: Self) {
    
    inline def setAllowOverwrite(value: BooleanOptional): Self = StObject.set(x, "allowOverwrite", value.asInstanceOf[js.Any])
    
    inline def setAllowOverwriteUndefined: Self = StObject.set(x, "allowOverwrite", js.undefined)
    
    inline def setDestinationRepository(value: RepositoryName): Self = StObject.set(x, "destinationRepository", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    inline def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    inline def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setIncludeFromUpstream(value: BooleanOptional): Self = StObject.set(x, "includeFromUpstream", value.asInstanceOf[js.Any])
    
    inline def setIncludeFromUpstreamUndefined: Self = StObject.set(x, "includeFromUpstream", js.undefined)
    
    inline def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setSourceRepository(value: RepositoryName): Self = StObject.set(x, "sourceRepository", value.asInstanceOf[js.Any])
    
    inline def setVersionRevisions(value: PackageVersionRevisionMap): Self = StObject.set(x, "versionRevisions", value.asInstanceOf[js.Any])
    
    inline def setVersionRevisionsUndefined: Self = StObject.set(x, "versionRevisions", js.undefined)
    
    inline def setVersions(value: PackageVersionList): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: PackageVersion*): Self = StObject.set(x, "versions", js.Array(value*))
    
    inline def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
