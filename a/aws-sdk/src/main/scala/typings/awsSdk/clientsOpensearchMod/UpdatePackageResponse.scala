package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePackageResponse extends StObject {
  
  /**
    * Information about a package.
    */
  var PackageDetails: js.UndefOr[typings.awsSdk.clientsOpensearchMod.PackageDetails] = js.undefined
}
object UpdatePackageResponse {
  
  inline def apply(): UpdatePackageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePackageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePackageResponse] (val x: Self) extends AnyVal {
    
    inline def setPackageDetails(value: PackageDetails): Self = StObject.set(x, "PackageDetails", value.asInstanceOf[js.Any])
    
    inline def setPackageDetailsUndefined: Self = StObject.set(x, "PackageDetails", js.undefined)
  }
}
