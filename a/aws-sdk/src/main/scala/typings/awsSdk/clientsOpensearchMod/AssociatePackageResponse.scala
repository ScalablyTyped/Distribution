package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatePackageResponse extends StObject {
  
  /**
    * Information about a package that is associated with a domain.
    */
  var DomainPackageDetails: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DomainPackageDetails] = js.undefined
}
object AssociatePackageResponse {
  
  inline def apply(): AssociatePackageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatePackageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociatePackageResponse] (val x: Self) extends AnyVal {
    
    inline def setDomainPackageDetails(value: DomainPackageDetails): Self = StObject.set(x, "DomainPackageDetails", value.asInstanceOf[js.Any])
    
    inline def setDomainPackageDetailsUndefined: Self = StObject.set(x, "DomainPackageDetails", js.undefined)
  }
}
