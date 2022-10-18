package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDomainNameRequest extends StObject {
  
  /**
    * The domain name.
    */
  var DomainName: string
}
object DeleteDomainNameRequest {
  
  inline def apply(DomainName: string): DeleteDomainNameRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainNameRequest]
  }
  
  extension [Self <: DeleteDomainNameRequest](x: Self) {
    
    inline def setDomainName(value: string): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
