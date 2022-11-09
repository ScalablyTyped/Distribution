package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePackageRequest extends StObject {
  
  /**
    * The internal ID of the package you want to delete. Use DescribePackages to find this value.
    */
  var PackageID: typings.awsSdk.clientsOpensearchMod.PackageID
}
object DeletePackageRequest {
  
  inline def apply(PackageID: PackageID): DeletePackageRequest = {
    val __obj = js.Dynamic.literal(PackageID = PackageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePackageRequest]
  }
  
  extension [Self <: DeletePackageRequest](x: Self) {
    
    inline def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
  }
}
