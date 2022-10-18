package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VulnerablePackage extends StObject {
  
  /**
    * The architecture of the vulnerable package.
    */
  var arch: js.UndefOr[Arch] = js.undefined
  
  /**
    * The epoch of the vulnerable package.
    */
  var epoch: js.UndefOr[Epoch] = js.undefined
  
  /**
    * The file path of the vulnerable package.
    */
  var filePath: js.UndefOr[FilePath] = js.undefined
  
  /**
    * The name of the vulnerable package.
    */
  var name: js.UndefOr[VulnerablePackageName] = js.undefined
  
  /**
    * The package manager of the vulnerable package.
    */
  var packageManager: js.UndefOr[PackageManager] = js.undefined
  
  /**
    * The release of the vulnerable package.
    */
  var release: js.UndefOr[Release] = js.undefined
  
  /**
    * The source layer hash of the vulnerable package.
    */
  var sourceLayerHash: js.UndefOr[SourceLayerHash] = js.undefined
  
  /**
    * The version of the vulnerable package.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object VulnerablePackage {
  
  inline def apply(): VulnerablePackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VulnerablePackage]
  }
  
  extension [Self <: VulnerablePackage](x: Self) {
    
    inline def setArch(value: Arch): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    inline def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
    
    inline def setEpoch(value: Epoch): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
    
    inline def setEpochUndefined: Self = StObject.set(x, "epoch", js.undefined)
    
    inline def setFilePath(value: FilePath): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setName(value: VulnerablePackageName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPackageManager(value: PackageManager): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
    
    inline def setPackageManagerUndefined: Self = StObject.set(x, "packageManager", js.undefined)
    
    inline def setRelease(value: Release): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setSourceLayerHash(value: SourceLayerHash): Self = StObject.set(x, "sourceLayerHash", value.asInstanceOf[js.Any])
    
    inline def setSourceLayerHashUndefined: Self = StObject.set(x, "sourceLayerHash", js.undefined)
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
