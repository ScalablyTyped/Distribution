package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DissociatePackageRequest extends StObject {
  
  /**
    * The name of the domain to associate the package with.
    */
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
  
  /**
    * The internal ID of the package to associate with a domain. Use DescribePackages to find this value. 
    */
  var PackageID: typings.awsSdk.clientsOpensearchMod.PackageID
}
object DissociatePackageRequest {
  
  inline def apply(DomainName: DomainName, PackageID: PackageID): DissociatePackageRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], PackageID = PackageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DissociatePackageRequest]
  }
  
  extension [Self <: DissociatePackageRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
  }
}
