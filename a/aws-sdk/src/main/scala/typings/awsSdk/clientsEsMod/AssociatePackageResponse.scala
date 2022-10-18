package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatePackageResponse extends StObject {
  
  /**
    * DomainPackageDetails
    */
  var DomainPackageDetails: js.UndefOr[typings.awsSdk.clientsEsMod.DomainPackageDetails] = js.undefined
}
object AssociatePackageResponse {
  
  inline def apply(): AssociatePackageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatePackageResponse]
  }
  
  extension [Self <: AssociatePackageResponse](x: Self) {
    
    inline def setDomainPackageDetails(value: DomainPackageDetails): Self = StObject.set(x, "DomainPackageDetails", value.asInstanceOf[js.Any])
    
    inline def setDomainPackageDetailsUndefined: Self = StObject.set(x, "DomainPackageDetails", js.undefined)
  }
}
