package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DissociatePackageRequest extends StObject {
  
  /**
    * Name of the domain that you want to associate the package with.
    */
  var DomainName: typings.awsSdk.clientsEsMod.DomainName
  
  /**
    * Internal ID of the package that you want to associate with a domain. Use DescribePackages to find this value.
    */
  var PackageID: typings.awsSdk.clientsEsMod.PackageID
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
