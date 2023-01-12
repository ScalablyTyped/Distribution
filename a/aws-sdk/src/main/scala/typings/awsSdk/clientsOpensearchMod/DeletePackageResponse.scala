package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePackageResponse extends StObject {
  
  /**
    *  Information about the deleted package.
    */
  var PackageDetails: js.UndefOr[typings.awsSdk.clientsOpensearchMod.PackageDetails] = js.undefined
}
object DeletePackageResponse {
  
  inline def apply(): DeletePackageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePackageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePackageResponse] (val x: Self) extends AnyVal {
    
    inline def setPackageDetails(value: PackageDetails): Self = StObject.set(x, "PackageDetails", value.asInstanceOf[js.Any])
    
    inline def setPackageDetailsUndefined: Self = StObject.set(x, "PackageDetails", js.undefined)
  }
}
