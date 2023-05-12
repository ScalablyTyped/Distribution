package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv6AddressesDetails extends StObject {
  
  /**
    *  One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. 
    */
  var Ipv6Address: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv6AddressesDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv6AddressesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv6AddressesDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv6AddressesDetails] (val x: Self) extends AnyVal {
    
    inline def setIpv6Address(value: NonEmptyString): Self = StObject.set(x, "Ipv6Address", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressUndefined: Self = StObject.set(x, "Ipv6Address", js.undefined)
  }
}
