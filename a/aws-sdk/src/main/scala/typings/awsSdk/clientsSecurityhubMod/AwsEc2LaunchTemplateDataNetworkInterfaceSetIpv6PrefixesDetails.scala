package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv6PrefixesDetails extends StObject {
  
  /**
    *  The IPv6 prefix. 
    */
  var Ipv6Prefix: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv6PrefixesDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv6PrefixesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv6PrefixesDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv6PrefixesDetails] (val x: Self) extends AnyVal {
    
    inline def setIpv6Prefix(value: NonEmptyString): Self = StObject.set(x, "Ipv6Prefix", value.asInstanceOf[js.Any])
    
    inline def setIpv6PrefixUndefined: Self = StObject.set(x, "Ipv6Prefix", js.undefined)
  }
}
