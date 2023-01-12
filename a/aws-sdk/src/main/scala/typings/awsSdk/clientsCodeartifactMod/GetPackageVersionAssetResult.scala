package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPackageVersionAssetResult extends StObject {
  
  /**
    *  The binary file, or asset, that is downloaded.
    */
  var asset: js.UndefOr[Asset] = js.undefined
  
  /**
    *  The name of the asset that is downloaded. 
    */
  var assetName: js.UndefOr[AssetName] = js.undefined
  
  /**
    *  A string that contains the package version (for example, 3.5.2). 
    */
  var packageVersion: js.UndefOr[PackageVersion] = js.undefined
  
  /**
    *  The name of the package version revision that contains the downloaded asset. 
    */
  var packageVersionRevision: js.UndefOr[PackageVersionRevision] = js.undefined
}
object GetPackageVersionAssetResult {
  
  inline def apply(): GetPackageVersionAssetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPackageVersionAssetResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPackageVersionAssetResult] (val x: Self) extends AnyVal {
    
    inline def setAsset(value: Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetName(value: AssetName): Self = StObject.set(x, "assetName", value.asInstanceOf[js.Any])
    
    inline def setAssetNameUndefined: Self = StObject.set(x, "assetName", js.undefined)
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    inline def setPackageVersion(value: PackageVersion): Self = StObject.set(x, "packageVersion", value.asInstanceOf[js.Any])
    
    inline def setPackageVersionRevision(value: PackageVersionRevision): Self = StObject.set(x, "packageVersionRevision", value.asInstanceOf[js.Any])
    
    inline def setPackageVersionRevisionUndefined: Self = StObject.set(x, "packageVersionRevision", js.undefined)
    
    inline def setPackageVersionUndefined: Self = StObject.set(x, "packageVersion", js.undefined)
  }
}
