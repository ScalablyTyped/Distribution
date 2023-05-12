package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishPackageVersionRequest extends StObject {
  
  /**
    * The name of the package version to publish.
    */
  @JSName("package")
  var _package: PackageName
  
  /**
    * The content of the asset to publish.
    */
  var assetContent: Asset
  
  /**
    * The name of the asset to publish. Asset names can include Unicode letters and numbers, and the following special characters: ~ ! @ ^ &amp; ( ) - ` _ + [ ] { } ; , . ` 
    */
  var assetName: AssetName
  
  /**
    * The SHA256 hash of the assetContent to publish. This value must be calculated by the caller and provided with the request (see Publishing a generic package in the CodeArtifact User Guide). This value is used as an integrity check to verify that the assetContent has not changed after it was originally sent.
    */
  var assetSHA256: SHA256
  
  /**
    * The name of the domain that contains the repository that contains the package version to publish.
    */
  var domain: DomainName
  
  /**
    * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * A format that specifies the type of the package version with the requested asset file.
    */
  var format: PackageFormat
  
  /**
    * The namespace of the package version to publish.
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    * The package version to publish (for example, 3.5.2).
    */
  var packageVersion: PackageVersion
  
  /**
    * The name of the repository that the package version will be published to.
    */
  var repository: RepositoryName
  
  /**
    * Specifies whether the package version should remain in the unfinished state. If omitted, the package version status will be set to Published (see Package version status in the CodeArtifact User Guide). Valid values: unfinished 
    */
  var unfinished: js.UndefOr[BooleanOptional] = js.undefined
}
object PublishPackageVersionRequest {
  
  inline def apply(
    _package: PackageName,
    assetContent: Asset,
    assetName: AssetName,
    assetSHA256: SHA256,
    domain: DomainName,
    format: PackageFormat,
    packageVersion: PackageVersion,
    repository: RepositoryName
  ): PublishPackageVersionRequest = {
    val __obj = js.Dynamic.literal(assetContent = assetContent.asInstanceOf[js.Any], assetName = assetName.asInstanceOf[js.Any], assetSHA256 = assetSHA256.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], packageVersion = packageVersion.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishPackageVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishPackageVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setAssetContent(value: Asset): Self = StObject.set(x, "assetContent", value.asInstanceOf[js.Any])
    
    inline def setAssetName(value: AssetName): Self = StObject.set(x, "assetName", value.asInstanceOf[js.Any])
    
    inline def setAssetSHA256(value: SHA256): Self = StObject.set(x, "assetSHA256", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    inline def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    inline def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setPackageVersion(value: PackageVersion): Self = StObject.set(x, "packageVersion", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: RepositoryName): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setUnfinished(value: BooleanOptional): Self = StObject.set(x, "unfinished", value.asInstanceOf[js.Any])
    
    inline def setUnfinishedUndefined: Self = StObject.set(x, "unfinished", js.undefined)
    
    inline def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
