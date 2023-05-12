package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataNetworkInterfaceSetPrivateIpAddressesDetails extends StObject {
  
  /**
    *  Indicates whether the private IPv4 address is the primary private IPv4 address. Only one IPv4 address can be designated as primary. 
    */
  var Primary: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The private IPv4 address. 
    */
  var PrivateIpAddress: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2LaunchTemplateDataNetworkInterfaceSetPrivateIpAddressesDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataNetworkInterfaceSetPrivateIpAddressesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataNetworkInterfaceSetPrivateIpAddressesDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataNetworkInterfaceSetPrivateIpAddressesDetails] (val x: Self) extends AnyVal {
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "Primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "Primary", js.undefined)
    
    inline def setPrivateIpAddress(value: NonEmptyString): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
  }
}
