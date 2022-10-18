package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainNameRequest extends StObject {
  
  /**
    * The domain name.
    */
  var domainName: DomainName
}
object GetDomainNameRequest {
  
  inline def apply(domainName: DomainName): GetDomainNameRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainNameRequest]
  }
  
  extension [Self <: GetDomainNameRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
