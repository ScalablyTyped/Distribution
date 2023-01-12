package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePackageResponse extends StObject {
  
  /**
    * Basic information about an OpenSearch Service package.
    */
  var PackageDetails: js.UndefOr[typings.awsSdk.clientsOpensearchMod.PackageDetails] = js.undefined
}
object CreatePackageResponse {
  
  inline def apply(): CreatePackageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePackageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePackageResponse] (val x: Self) extends AnyVal {
    
    inline def setPackageDetails(value: PackageDetails): Self = StObject.set(x, "PackageDetails", value.asInstanceOf[js.Any])
    
    inline def setPackageDetailsUndefined: Self = StObject.set(x, "PackageDetails", js.undefined)
  }
}
