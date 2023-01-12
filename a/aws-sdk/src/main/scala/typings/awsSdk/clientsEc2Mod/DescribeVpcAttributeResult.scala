package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcAttributeResult extends StObject {
  
  /**
    * Indicates whether the instances launched in the VPC get DNS hostnames. If this attribute is true, instances in the VPC get DNS hostnames; otherwise, they do not.
    */
  var EnableDnsHostnames: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * Indicates whether DNS resolution is enabled for the VPC. If this attribute is true, the Amazon DNS server resolves DNS hostnames for your instances to their corresponding IP addresses; otherwise, it does not.
    */
  var EnableDnsSupport: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * Indicates whether Network Address Usage metrics are enabled for your VPC.
    */
  var EnableNetworkAddressUsageMetrics: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object DescribeVpcAttributeResult {
  
  inline def apply(): DescribeVpcAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcAttributeResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVpcAttributeResult] (val x: Self) extends AnyVal {
    
    inline def setEnableDnsHostnames(value: AttributeBooleanValue): Self = StObject.set(x, "EnableDnsHostnames", value.asInstanceOf[js.Any])
    
    inline def setEnableDnsHostnamesUndefined: Self = StObject.set(x, "EnableDnsHostnames", js.undefined)
    
    inline def setEnableDnsSupport(value: AttributeBooleanValue): Self = StObject.set(x, "EnableDnsSupport", value.asInstanceOf[js.Any])
    
    inline def setEnableDnsSupportUndefined: Self = StObject.set(x, "EnableDnsSupport", js.undefined)
    
    inline def setEnableNetworkAddressUsageMetrics(value: AttributeBooleanValue): Self = StObject.set(x, "EnableNetworkAddressUsageMetrics", value.asInstanceOf[js.Any])
    
    inline def setEnableNetworkAddressUsageMetricsUndefined: Self = StObject.set(x, "EnableNetworkAddressUsageMetrics", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
