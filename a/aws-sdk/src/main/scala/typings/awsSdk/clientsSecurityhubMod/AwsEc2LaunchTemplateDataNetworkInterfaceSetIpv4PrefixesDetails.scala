package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv4PrefixesDetails extends StObject {
  
  /**
    *  The IPv4 prefix. For more information, see Assigning prefixes to Amazon EC2 network interfaces in the Amazon Elastic Compute Cloud User Guide. 
    */
  var Ipv4Prefix: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv4PrefixesDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv4PrefixesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv4PrefixesDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataNetworkInterfaceSetIpv4PrefixesDetails] (val x: Self) extends AnyVal {
    
    inline def setIpv4Prefix(value: NonEmptyString): Self = StObject.set(x, "Ipv4Prefix", value.asInstanceOf[js.Any])
    
    inline def setIpv4PrefixUndefined: Self = StObject.set(x, "Ipv4Prefix", js.undefined)
  }
}
