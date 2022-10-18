package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayVpcAttachmentOptions extends StObject {
  
  /**
    * Indicates whether appliance mode support is enabled.
    */
  var ApplianceModeSupport: js.UndefOr[ApplianceModeSupportValue] = js.undefined
  
  /**
    * Indicates whether DNS support is enabled.
    */
  var DnsSupport: js.UndefOr[DnsSupportValue] = js.undefined
  
  /**
    * Indicates whether IPv6 support is disabled.
    */
  var Ipv6Support: js.UndefOr[Ipv6SupportValue] = js.undefined
}
object TransitGatewayVpcAttachmentOptions {
  
  inline def apply(): TransitGatewayVpcAttachmentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayVpcAttachmentOptions]
  }
  
  extension [Self <: TransitGatewayVpcAttachmentOptions](x: Self) {
    
    inline def setApplianceModeSupport(value: ApplianceModeSupportValue): Self = StObject.set(x, "ApplianceModeSupport", value.asInstanceOf[js.Any])
    
    inline def setApplianceModeSupportUndefined: Self = StObject.set(x, "ApplianceModeSupport", js.undefined)
    
    inline def setDnsSupport(value: DnsSupportValue): Self = StObject.set(x, "DnsSupport", value.asInstanceOf[js.Any])
    
    inline def setDnsSupportUndefined: Self = StObject.set(x, "DnsSupport", js.undefined)
    
    inline def setIpv6Support(value: Ipv6SupportValue): Self = StObject.set(x, "Ipv6Support", value.asInstanceOf[js.Any])
    
    inline def setIpv6SupportUndefined: Self = StObject.set(x, "Ipv6Support", js.undefined)
  }
}
