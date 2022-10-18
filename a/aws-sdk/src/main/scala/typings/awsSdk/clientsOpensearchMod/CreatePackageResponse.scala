package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePackageResponse extends StObject {
  
  /**
    * Information about the package. 
    */
  var PackageDetails: js.UndefOr[typings.awsSdk.clientsOpensearchMod.PackageDetails] = js.undefined
}
object CreatePackageResponse {
  
  inline def apply(): CreatePackageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePackageResponse]
  }
  
  extension [Self <: CreatePackageResponse](x: Self) {
    
    inline def setPackageDetails(value: PackageDetails): Self = StObject.set(x, "PackageDetails", value.asInstanceOf[js.Any])
    
    inline def setPackageDetailsUndefined: Self = StObject.set(x, "PackageDetails", js.undefined)
  }
}
