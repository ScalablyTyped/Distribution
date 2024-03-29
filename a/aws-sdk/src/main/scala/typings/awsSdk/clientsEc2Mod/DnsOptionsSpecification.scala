package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsOptionsSpecification extends StObject {
  
  /**
    * The DNS records created for the endpoint.
    */
  var DnsRecordIpType: js.UndefOr[typings.awsSdk.clientsEc2Mod.DnsRecordIpType] = js.undefined
  
  /**
    * Indicates whether to enable private DNS only for inbound endpoints. This option is available only for services that support both gateway and interface endpoints. It routes traffic that originates from the VPC to the gateway endpoint and traffic that originates from on-premises to the interface endpoint.
    */
  var PrivateDnsOnlyForInboundResolverEndpoint: js.UndefOr[Boolean] = js.undefined
}
object DnsOptionsSpecification {
  
  inline def apply(): DnsOptionsSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsOptionsSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DnsOptionsSpecification] (val x: Self) extends AnyVal {
    
    inline def setDnsRecordIpType(value: DnsRecordIpType): Self = StObject.set(x, "DnsRecordIpType", value.asInstanceOf[js.Any])
    
    inline def setDnsRecordIpTypeUndefined: Self = StObject.set(x, "DnsRecordIpType", js.undefined)
    
    inline def setPrivateDnsOnlyForInboundResolverEndpoint(value: Boolean): Self = StObject.set(x, "PrivateDnsOnlyForInboundResolverEndpoint", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsOnlyForInboundResolverEndpointUndefined: Self = StObject.set(x, "PrivateDnsOnlyForInboundResolverEndpoint", js.undefined)
  }
}
