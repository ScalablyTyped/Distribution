package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDomainRequest extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
}
object DeleteDomainRequest {
  
  inline def apply(DomainName: name): DeleteDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainRequest]
  }
  
  extension [Self <: DeleteDomainRequest](x: Self) {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
