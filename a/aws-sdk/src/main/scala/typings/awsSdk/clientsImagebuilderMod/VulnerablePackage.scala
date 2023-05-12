package typings.awsSdk.clientsImagebuilderMod

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
  var filePath: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The version of the package that contains the vulnerability fix.
    */
  var fixedInVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the vulnerable package.
    */
  var name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The package manager of the vulnerable package.
    */
  var packageManager: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The release of the vulnerable package.
    */
  var release: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The code to run in your environment to update packages with a fix available.
    */
  var remediation: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The source layer hash of the vulnerable package.
    */
  var sourceLayerHash: js.UndefOr[SourceLayerHash] = js.undefined
  
  /**
    * The version of the vulnerable package.
    */
  var version: js.UndefOr[NonEmptyString] = js.undefined
}
object VulnerablePackage {
  
  inline def apply(): VulnerablePackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VulnerablePackage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VulnerablePackage] (val x: Self) extends AnyVal {
    
    inline def setArch(value: PackageArchitecture): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    inline def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
    
    inline def setEpoch(value: PackageEpoch): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
    
    inline def setEpochUndefined: Self = StObject.set(x, "epoch", js.undefined)
    
    inline def setFilePath(value: NonEmptyString): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setFixedInVersion(value: NonEmptyString): Self = StObject.set(x, "fixedInVersion", value.asInstanceOf[js.Any])
    
    inline def setFixedInVersionUndefined: Self = StObject.set(x, "fixedInVersion", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPackageManager(value: NonEmptyString): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
    
    inline def setPackageManagerUndefined: Self = StObject.set(x, "packageManager", js.undefined)
    
    inline def setRelease(value: NonEmptyString): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setRemediation(value: NonEmptyString): Self = StObject.set(x, "remediation", value.asInstanceOf[js.Any])
    
    inline def setRemediationUndefined: Self = StObject.set(x, "remediation", js.undefined)
    
    inline def setSourceLayerHash(value: SourceLayerHash): Self = StObject.set(x, "sourceLayerHash", value.asInstanceOf[js.Any])
    
    inline def setSourceLayerHashUndefined: Self = StObject.set(x, "sourceLayerHash", js.undefined)
    
    inline def setVersion(value: NonEmptyString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
