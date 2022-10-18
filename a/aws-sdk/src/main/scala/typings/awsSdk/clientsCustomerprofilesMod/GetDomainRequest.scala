package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainRequest extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
}
object GetDomainRequest {
  
  inline def apply(DomainName: name): GetDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainRequest]
  }
  
  extension [Self <: GetDomainRequest](x: Self) {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
