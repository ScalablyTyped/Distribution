package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyPackageVersionsResult extends StObject {
  
  /**
    *  A map of package versions that failed to copy and their error codes. The possible error codes are in the PackageVersionError data type. They are:     ALREADY_EXISTS     MISMATCHED_REVISION     MISMATCHED_STATUS     NOT_ALLOWED     NOT_FOUND     SKIPPED   
    */
  var failedVersions: js.UndefOr[PackageVersionErrorMap] = js.undefined
  
  /**
    *  A list of the package versions that were successfully copied to your repository. 
    */
  var successfulVersions: js.UndefOr[SuccessfulPackageVersionInfoMap] = js.undefined
}
object CopyPackageVersionsResult {
  
  inline def apply(): CopyPackageVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyPackageVersionsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopyPackageVersionsResult] (val x: Self) extends AnyVal {
    
    inline def setFailedVersions(value: PackageVersionErrorMap): Self = StObject.set(x, "failedVersions", value.asInstanceOf[js.Any])
    
    inline def setFailedVersionsUndefined: Self = StObject.set(x, "failedVersions", js.undefined)
    
    inline def setSuccessfulVersions(value: SuccessfulPackageVersionInfoMap): Self = StObject.set(x, "successfulVersions", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulVersionsUndefined: Self = StObject.set(x, "successfulVersions", js.undefined)
  }
}
