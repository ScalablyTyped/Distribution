package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DissociatePackageRequest extends StObject {
  
  /**
    * Name of the domain to dissociate the package from.
    */
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
  
  /**
    * Internal ID of the package to dissociate from the domain. Use ListPackagesForDomain to find this value.
    */
  var PackageID: typings.awsSdk.clientsOpensearchMod.PackageID
}
object DissociatePackageRequest {
  
  inline def apply(DomainName: DomainName, PackageID: PackageID): DissociatePackageRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], PackageID = PackageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DissociatePackageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DissociatePackageRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
  }
}
