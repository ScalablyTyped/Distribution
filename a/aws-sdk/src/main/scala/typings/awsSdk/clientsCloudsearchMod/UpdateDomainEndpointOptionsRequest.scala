package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainEndpointOptionsRequest extends StObject {
  
  /**
    * Whether to require that all requests to the domain arrive over HTTPS. We recommend Policy-Min-TLS-1-2-2019-07 for TLSSecurityPolicy. For compatibility with older clients, the default is Policy-Min-TLS-1-0-2019-07. 
    */
  var DomainEndpointOptions: typings.awsSdk.clientsCloudsearchMod.DomainEndpointOptions
  
  /**
    * A string that represents the name of a domain.
    */
  var DomainName: typings.awsSdk.clientsCloudsearchMod.DomainName
}
object UpdateDomainEndpointOptionsRequest {
  
  inline def apply(DomainEndpointOptions: DomainEndpointOptions, DomainName: DomainName): UpdateDomainEndpointOptionsRequest = {
    val __obj = js.Dynamic.literal(DomainEndpointOptions = DomainEndpointOptions.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainEndpointOptionsRequest]
  }
  
  extension [Self <: UpdateDomainEndpointOptionsRequest](x: Self) {
    
    inline def setDomainEndpointOptions(value: DomainEndpointOptions): Self = StObject.set(x, "DomainEndpointOptions", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
