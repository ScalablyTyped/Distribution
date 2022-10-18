package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePackageResponse extends StObject {
  
  /**
    * PackageDetails
    */
  var PackageDetails: js.UndefOr[typings.awsSdk.clientsEsMod.PackageDetails] = js.undefined
}
object DeletePackageResponse {
  
  inline def apply(): DeletePackageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePackageResponse]
  }
  
  extension [Self <: DeletePackageResponse](x: Self) {
    
    inline def setPackageDetails(value: PackageDetails): Self = StObject.set(x, "PackageDetails", value.asInstanceOf[js.Any])
    
    inline def setPackageDetailsUndefined: Self = StObject.set(x, "PackageDetails", js.undefined)
  }
}
