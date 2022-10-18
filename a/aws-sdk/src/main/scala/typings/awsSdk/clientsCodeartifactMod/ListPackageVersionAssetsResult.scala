package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPackageVersionAssetsResult extends StObject {
  
  /**
    *  The name of the package that contains the requested package version assets. 
    */
  @JSName("package")
  var _package: js.UndefOr[PackageName] = js.undefined
  
  /**
    *  The returned list of AssetSummary objects. 
    */
  var assets: js.UndefOr[AssetSummaryList] = js.undefined
  
  /**
    *  The format of the package that contains the requested package version assets. 
    */
  var format: js.UndefOr[PackageFormat] = js.undefined
  
  /**
    * The namespace of the package version that contains the requested package version assets. The package version component that specifies its namespace depends on its type. For example:    The namespace of a Maven package version is its groupId.     The namespace of an npm package version is its scope.     Python and NuGet package versions do not contain a corresponding component, package versions of those formats do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.undefined
  
  /**
    *  If there are additional results, this is the token for the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  The version of the package associated with the requested assets. 
    */
  var version: js.UndefOr[PackageVersion] = js.undefined
  
  /**
    *  The current revision associated with the package version. 
    */
  var versionRevision: js.UndefOr[PackageVersionRevision] = js.undefined
}
object ListPackageVersionAssetsResult {
  
  inline def apply(): ListPackageVersionAssetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackageVersionAssetsResult]
  }
  
  extension [Self <: ListPackageVersionAssetsResult](x: Self) {
    
    inline def setAssets(value: AssetSummaryList): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: AssetSummary*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVersion(value: PackageVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionRevision(value: PackageVersionRevision): Self = StObject.set(x, "versionRevision", value.asInstanceOf[js.Any])
    
    inline def setVersionRevisionUndefined: Self = StObject.set(x, "versionRevision", js.undefined)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
