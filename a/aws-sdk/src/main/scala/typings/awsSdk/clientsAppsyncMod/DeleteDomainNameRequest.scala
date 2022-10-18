package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDomainNameRequest extends StObject {
  
  /**
    * The domain name.
    */
  var domainName: DomainName
}
object DeleteDomainNameRequest {
  
  inline def apply(domainName: DomainName): DeleteDomainNameRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainNameRequest]
  }
  
  extension [Self <: DeleteDomainNameRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
