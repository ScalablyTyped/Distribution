package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnConnectionOptionsSpecification extends StObject {
  
  /**
    * Indicate whether to enable acceleration for the VPN connection. Default: false 
    */
  var EnableAcceleration: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection. Default: 0.0.0.0/0 
    */
  var LocalIpv4NetworkCidr: js.UndefOr[String] = js.undefined
  
  /**
    * The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection. Default: ::/0 
    */
  var LocalIpv6NetworkCidr: js.UndefOr[String] = js.undefined
  
  /**
    * The type of IPv4 address assigned to the outside interface of the customer gateway device. Valid values: PrivateIpv4 | PublicIpv4  Default: PublicIpv4 
    */
  var OutsideIpAddressType: js.UndefOr[String] = js.undefined
  
  /**
    * The IPv4 CIDR on the Amazon Web Services side of the VPN connection. Default: 0.0.0.0/0 
    */
  var RemoteIpv4NetworkCidr: js.UndefOr[String] = js.undefined
  
  /**
    * The IPv6 CIDR on the Amazon Web Services side of the VPN connection. Default: ::/0 
    */
  var RemoteIpv6NetworkCidr: js.UndefOr[String] = js.undefined
  
  /**
    * Indicate whether the VPN connection uses static routes only. If you are creating a VPN connection for a device that does not support BGP, you must specify true. Use CreateVpnConnectionRoute to create a static route. Default: false 
    */
  var StaticRoutesOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The transit gateway attachment ID to use for the VPN tunnel. Required if OutsideIpAddressType is set to PrivateIpv4.
    */
  var TransportTransitGatewayAttachmentId: js.UndefOr[TransitGatewayAttachmentId] = js.undefined
  
  /**
    * Indicate whether the VPN tunnels process IPv4 or IPv6 traffic. Default: ipv4 
    */
  var TunnelInsideIpVersion: js.UndefOr[typings.awsSdk.clientsEc2Mod.TunnelInsideIpVersion] = js.undefined
  
  /**
    * The tunnel options for the VPN connection.
    */
  var TunnelOptions: js.UndefOr[VpnTunnelOptionsSpecificationsList] = js.undefined
}
object VpnConnectionOptionsSpecification {
  
  inline def apply(): VpnConnectionOptionsSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnConnectionOptionsSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpnConnectionOptionsSpecification] (val x: Self) extends AnyVal {
    
    inline def setEnableAcceleration(value: Boolean): Self = StObject.set(x, "EnableAcceleration", value.asInstanceOf[js.Any])
    
    inline def setEnableAccelerationUndefined: Self = StObject.set(x, "EnableAcceleration", js.undefined)
    
    inline def setLocalIpv4NetworkCidr(value: String): Self = StObject.set(x, "LocalIpv4NetworkCidr", value.asInstanceOf[js.Any])
    
    inline def setLocalIpv4NetworkCidrUndefined: Self = StObject.set(x, "LocalIpv4NetworkCidr", js.undefined)
    
    inline def setLocalIpv6NetworkCidr(value: String): Self = StObject.set(x, "LocalIpv6NetworkCidr", value.asInstanceOf[js.Any])
    
    inline def setLocalIpv6NetworkCidrUndefined: Self = StObject.set(x, "LocalIpv6NetworkCidr", js.undefined)
    
    inline def setOutsideIpAddressType(value: String): Self = StObject.set(x, "OutsideIpAddressType", value.asInstanceOf[js.Any])
    
    inline def setOutsideIpAddressTypeUndefined: Self = StObject.set(x, "OutsideIpAddressType", js.undefined)
    
    inline def setRemoteIpv4NetworkCidr(value: String): Self = StObject.set(x, "RemoteIpv4NetworkCidr", value.asInstanceOf[js.Any])
    
    inline def setRemoteIpv4NetworkCidrUndefined: Self = StObject.set(x, "RemoteIpv4NetworkCidr", js.undefined)
    
    inline def setRemoteIpv6NetworkCidr(value: String): Self = StObject.set(x, "RemoteIpv6NetworkCidr", value.asInstanceOf[js.Any])
    
    inline def setRemoteIpv6NetworkCidrUndefined: Self = StObject.set(x, "RemoteIpv6NetworkCidr", js.undefined)
    
    inline def setStaticRoutesOnly(value: Boolean): Self = StObject.set(x, "StaticRoutesOnly", value.asInstanceOf[js.Any])
    
    inline def setStaticRoutesOnlyUndefined: Self = StObject.set(x, "StaticRoutesOnly", js.undefined)
    
    inline def setTransportTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransportTransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setTransportTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransportTransitGatewayAttachmentId", js.undefined)
    
    inline def setTunnelInsideIpVersion(value: TunnelInsideIpVersion): Self = StObject.set(x, "TunnelInsideIpVersion", value.asInstanceOf[js.Any])
    
    inline def setTunnelInsideIpVersionUndefined: Self = StObject.set(x, "TunnelInsideIpVersion", js.undefined)
    
    inline def setTunnelOptions(value: VpnTunnelOptionsSpecificationsList): Self = StObject.set(x, "TunnelOptions", value.asInstanceOf[js.Any])
    
    inline def setTunnelOptionsUndefined: Self = StObject.set(x, "TunnelOptions", js.undefined)
    
    inline def setTunnelOptionsVarargs(value: VpnTunnelOptionsSpecification*): Self = StObject.set(x, "TunnelOptions", js.Array(value*))
  }
}
