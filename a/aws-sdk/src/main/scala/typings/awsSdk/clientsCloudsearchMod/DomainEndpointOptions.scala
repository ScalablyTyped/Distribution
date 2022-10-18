package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainEndpointOptions extends StObject {
  
  /**
    * Whether the domain is HTTPS only enabled.
    */
  var EnforceHTTPS: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The minimum required TLS version
    */
  var TLSSecurityPolicy: js.UndefOr[typings.awsSdk.clientsCloudsearchMod.TLSSecurityPolicy] = js.undefined
}
object DomainEndpointOptions {
  
  inline def apply(): DomainEndpointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainEndpointOptions]
  }
  
  extension [Self <: DomainEndpointOptions](x: Self) {
    
    inline def setEnforceHTTPS(value: Boolean): Self = StObject.set(x, "EnforceHTTPS", value.asInstanceOf[js.Any])
    
    inline def setEnforceHTTPSUndefined: Self = StObject.set(x, "EnforceHTTPS", js.undefined)
    
    inline def setTLSSecurityPolicy(value: TLSSecurityPolicy): Self = StObject.set(x, "TLSSecurityPolicy", value.asInstanceOf[js.Any])
    
    inline def setTLSSecurityPolicyUndefined: Self = StObject.set(x, "TLSSecurityPolicy", js.undefined)
  }
}
