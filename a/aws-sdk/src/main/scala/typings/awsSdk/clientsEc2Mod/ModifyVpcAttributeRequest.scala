package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpcAttributeRequest extends StObject {
  
  /**
    * Indicates whether the instances launched in the VPC get DNS hostnames. If enabled, instances in the VPC get DNS hostnames; otherwise, they do not. You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate requests for each attribute. You can only enable DNS hostnames if you've enabled DNS support.
    */
  var EnableDnsHostnames: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * Indicates whether the DNS resolution is supported for the VPC. If enabled, queries to the Amazon provided DNS server at the 169.254.169.253 IP address, or the reserved IP address at the base of the VPC network range "plus two" succeed. If disabled, the Amazon provided DNS service in the VPC that resolves public DNS hostnames to IP addresses is not enabled. You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate requests for each attribute.
    */
  var EnableDnsSupport: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * Indicates whether Network Address Usage metrics are enabled for your VPC.
    */
  var EnableNetworkAddressUsageMetrics: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: typings.awsSdk.clientsEc2Mod.VpcId
}
object ModifyVpcAttributeRequest {
  
  inline def apply(VpcId: VpcId): ModifyVpcAttributeRequest = {
    val __obj = js.Dynamic.literal(VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcAttributeRequest]
  }
  
  extension [Self <: ModifyVpcAttributeRequest](x: Self) {
    
    inline def setEnableDnsHostnames(value: AttributeBooleanValue): Self = StObject.set(x, "EnableDnsHostnames", value.asInstanceOf[js.Any])
    
    inline def setEnableDnsHostnamesUndefined: Self = StObject.set(x, "EnableDnsHostnames", js.undefined)
    
    inline def setEnableDnsSupport(value: AttributeBooleanValue): Self = StObject.set(x, "EnableDnsSupport", value.asInstanceOf[js.Any])
    
    inline def setEnableDnsSupportUndefined: Self = StObject.set(x, "EnableDnsSupport", js.undefined)
    
    inline def setEnableNetworkAddressUsageMetrics(value: AttributeBooleanValue): Self = StObject.set(x, "EnableNetworkAddressUsageMetrics", value.asInstanceOf[js.Any])
    
    inline def setEnableNetworkAddressUsageMetricsUndefined: Self = StObject.set(x, "EnableNetworkAddressUsageMetrics", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
