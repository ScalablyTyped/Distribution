package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DissociatePackageResponse extends StObject {
  
  /**
    * DomainPackageDetails
    */
  var DomainPackageDetails: js.UndefOr[typings.awsSdk.clientsEsMod.DomainPackageDetails] = js.undefined
}
object DissociatePackageResponse {
  
  inline def apply(): DissociatePackageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DissociatePackageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DissociatePackageResponse] (val x: Self) extends AnyVal {
    
    inline def setDomainPackageDetails(value: DomainPackageDetails): Self = StObject.set(x, "DomainPackageDetails", value.asInstanceOf[js.Any])
    
    inline def setDomainPackageDetailsUndefined: Self = StObject.set(x, "DomainPackageDetails", js.undefined)
  }
}
