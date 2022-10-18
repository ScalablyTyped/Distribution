package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDomainNameRequest extends StObject {
  
  /**
    * The name of the DomainName resource to be deleted.
    */
  var domainName: String
}
object DeleteDomainNameRequest {
  
  inline def apply(domainName: String): DeleteDomainNameRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainNameRequest]
  }
  
  extension [Self <: DeleteDomainNameRequest](x: Self) {
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
