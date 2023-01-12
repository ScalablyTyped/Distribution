package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessfulPackageVersionInfo extends StObject {
  
  /**
    *  The revision of a package version. 
    */
  var revision: js.UndefOr[String] = js.undefined
  
  /**
    *  The status of a package version. 
    */
  var status: js.UndefOr[PackageVersionStatus] = js.undefined
}
object SuccessfulPackageVersionInfo {
  
  inline def apply(): SuccessfulPackageVersionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessfulPackageVersionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuccessfulPackageVersionInfo] (val x: Self) extends AnyVal {
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    inline def setStatus(value: PackageVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
