package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatePackageRequest extends StObject {
  
  /**
    * The name of the domain to associate the package with.
    */
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
  
  /**
    * Internal ID of the package to associate with a domain. Use DescribePackages to find this value. 
    */
  var PackageID: typings.awsSdk.clientsOpensearchMod.PackageID
}
object AssociatePackageRequest {
  
  inline def apply(DomainName: DomainName, PackageID: PackageID): AssociatePackageRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], PackageID = PackageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatePackageRequest]
  }
  
  extension [Self <: AssociatePackageRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setPackageID(value: PackageID): Self = StObject.set(x, "PackageID", value.asInstanceOf[js.Any])
  }
}
