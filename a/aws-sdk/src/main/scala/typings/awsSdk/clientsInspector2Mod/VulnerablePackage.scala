package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VulnerablePackage extends StObject {
  
  /**
    * The architecture of the vulnerable package.
    */
  var arch: js.UndefOr[PackageArchitecture] = js.undefined
  
  /**
    * The epoch of the vulnerable package.
    */
  var epoch: js.UndefOr[PackageEpoch] = js.undefined
  
  /**
    * The file path of the vulnerable package.
    */
  var filePath: js.UndefOr[FilePath] = js.undefined
  
  /**
    * The version of the package that contains the vulnerability fix.
    */
  var fixedInVersion: js.UndefOr[PackageVersion] = js.undefined
  
  /**
    * The name of the vulnerable package.
    */
  var name: PackageName
  
  /**
    * The package manager of the vulnerable package.
    */
  var packageManager: js.UndefOr[PackageManager] = js.undefined
  
  /**
    * The release of the vulnerable package.
    */
  var release: js.UndefOr[PackageRelease] = js.undefined
  
  /**
    * The code to run in your environment to update packages with a fix available.
    */
  var remediation: js.UndefOr[VulnerablePackageRemediation] = js.undefined
  
  /**
    * The source layer hash of the vulnerable package.
    */
  var sourceLayerHash: js.UndefOr[SourceLayerHash] = js.undefined
  
  /**
    * The version of the vulnerable package.
    */
  var version: PackageVersion
}
object VulnerablePackage {
  
  inline def apply(name: PackageName, version: PackageVersion): VulnerablePackage = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VulnerablePackage]
  }
  
  extension [Self <: VulnerablePackage](x: Self) {
    
    inline def setArch(value: PackageArchitecture): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    inline def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
    
    inline def setEpoch(value: PackageEpoch): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
    
    inline def setEpochUndefined: Self = StObject.set(x, "epoch", js.undefined)
    
    inline def setFilePath(value: FilePath): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setFixedInVersion(value: PackageVersion): Self = StObject.set(x, "fixedInVersion", value.asInstanceOf[js.Any])
    
    inline def setFixedInVersionUndefined: Self = StObject.set(x, "fixedInVersion", js.undefined)
    
    inline def setName(value: PackageName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPackageManager(value: PackageManager): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
    
    inline def setPackageManagerUndefined: Self = StObject.set(x, "packageManager", js.undefined)
    
    inline def setRelease(value: PackageRelease): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setRemediation(value: VulnerablePackageRemediation): Self = StObject.set(x, "remediation", value.asInstanceOf[js.Any])
    
    inline def setRemediationUndefined: Self = StObject.set(x, "remediation", js.undefined)
    
    inline def setSourceLayerHash(value: SourceLayerHash): Self = StObject.set(x, "sourceLayerHash", value.asInstanceOf[js.Any])
    
    inline def setSourceLayerHashUndefined: Self = StObject.set(x, "sourceLayerHash", js.undefined)
    
    inline def setVersion(value: PackageVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
