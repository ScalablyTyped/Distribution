package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePackageResult extends StObject {
  
  var deletedPackage: js.UndefOr[PackageSummary] = js.undefined
}
object DeletePackageResult {
  
  inline def apply(): DeletePackageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePackageResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePackageResult] (val x: Self) extends AnyVal {
    
    inline def setDeletedPackage(value: PackageSummary): Self = StObject.set(x, "deletedPackage", value.asInstanceOf[js.Any])
    
    inline def setDeletedPackageUndefined: Self = StObject.set(x, "deletedPackage", js.undefined)
  }
}
