package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishPackageVersionResult extends StObject {
  
  /**
    * The name of the package.
    */
  @JSName("package")
  var _package: js.UndefOr[PackageName] = js.undefined
  
  /**
    * An AssetSummary for the published asset.
    */
  var asset: js.UndefOr[AssetSummary] = js.undefined
  
  /**
    * The format of the package version.
    */
  var format: js.UndefOr[PackageFormat] = js.undefined
  
  /**
    * The namespace of the package version.
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    * A string that contains the status of the package version. For more information, see Package version status in the CodeArtifact User Guide.
    */
  var status: js.UndefOr[PackageVersionStatus] = js.undefined
  
  /**
    * The version of the package.
    */
  var version: js.UndefOr[PackageVersion] = js.undefined
  
  /**
    * The revision of the package version.
    */
  var versionRevision: js.UndefOr[PackageVersionRevision] = js.undefined
}
object PublishPackageVersionResult {
  
  inline def apply(): PublishPackageVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishPackageVersionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishPackageVersionResult] (val x: Self) extends AnyVal {
    
    inline def setAsset(value: AssetSummary): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    inline def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setStatus(value: PackageVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setVersion(value: PackageVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionRevision(value: PackageVersionRevision): Self = StObject.set(x, "versionRevision", value.asInstanceOf[js.Any])
    
    inline def setVersionRevisionUndefined: Self = StObject.set(x, "versionRevision", js.undefined)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
