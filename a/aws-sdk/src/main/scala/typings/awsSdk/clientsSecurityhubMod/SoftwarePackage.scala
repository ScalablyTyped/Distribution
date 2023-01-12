package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoftwarePackage extends StObject {
  
  /**
    * The architecture used for the software package.
    */
  var Architecture: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The epoch of the software package.
    */
  var Epoch: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The file system path to the package manager inventory file.
    */
  var FilePath: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The version of the software package in which the vulnerability has been resolved. 
    */
  var FixedInVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the software package.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The source of the package.
    */
  var PackageManager: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The release of the software package.
    */
  var Release: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Describes the actions a customer can take to resolve the vulnerability in the software package. 
    */
  var Remediation: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The version of the software package.
    */
  var Version: js.UndefOr[NonEmptyString] = js.undefined
}
object SoftwarePackage {
  
  inline def apply(): SoftwarePackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwarePackage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SoftwarePackage] (val x: Self) extends AnyVal {
    
    inline def setArchitecture(value: NonEmptyString): Self = StObject.set(x, "Architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "Architecture", js.undefined)
    
    inline def setEpoch(value: NonEmptyString): Self = StObject.set(x, "Epoch", value.asInstanceOf[js.Any])
    
    inline def setEpochUndefined: Self = StObject.set(x, "Epoch", js.undefined)
    
    inline def setFilePath(value: NonEmptyString): Self = StObject.set(x, "FilePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "FilePath", js.undefined)
    
    inline def setFixedInVersion(value: NonEmptyString): Self = StObject.set(x, "FixedInVersion", value.asInstanceOf[js.Any])
    
    inline def setFixedInVersionUndefined: Self = StObject.set(x, "FixedInVersion", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPackageManager(value: NonEmptyString): Self = StObject.set(x, "PackageManager", value.asInstanceOf[js.Any])
    
    inline def setPackageManagerUndefined: Self = StObject.set(x, "PackageManager", js.undefined)
    
    inline def setRelease(value: NonEmptyString): Self = StObject.set(x, "Release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "Release", js.undefined)
    
    inline def setRemediation(value: NonEmptyString): Self = StObject.set(x, "Remediation", value.asInstanceOf[js.Any])
    
    inline def setRemediationUndefined: Self = StObject.set(x, "Remediation", js.undefined)
    
    inline def setVersion(value: NonEmptyString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
