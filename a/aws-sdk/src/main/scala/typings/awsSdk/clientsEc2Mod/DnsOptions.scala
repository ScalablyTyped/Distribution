package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsOptions extends StObject {
  
  /**
    * The DNS records created for the endpoint.
    */
  var DnsRecordIpType: js.UndefOr[typings.awsSdk.clientsEc2Mod.DnsRecordIpType] = js.undefined
  
  /**
    * Indicates whether to enable private DNS only for inbound endpoints.
    */
  var PrivateDnsOnlyForInboundResolverEndpoint: js.UndefOr[Boolean] = js.undefined
}
object DnsOptions {
  
  inline def apply(): DnsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DnsOptions] (val x: Self) extends AnyVal {
    
    inline def setDnsRecordIpType(value: DnsRecordIpType): Self = StObject.set(x, "DnsRecordIpType", value.asInstanceOf[js.Any])
    
    inline def setDnsRecordIpTypeUndefined: Self = StObject.set(x, "DnsRecordIpType", js.undefined)
    
    inline def setPrivateDnsOnlyForInboundResolverEndpoint(value: Boolean): Self = StObject.set(x, "PrivateDnsOnlyForInboundResolverEndpoint", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsOnlyForInboundResolverEndpointUndefined: Self = StObject.set(x, "PrivateDnsOnlyForInboundResolverEndpoint", js.undefined)
  }
}
