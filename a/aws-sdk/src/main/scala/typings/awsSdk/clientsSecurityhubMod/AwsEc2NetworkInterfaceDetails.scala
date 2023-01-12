package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2NetworkInterfaceDetails extends StObject {
  
  /**
    * The network interface attachment.
    */
  var Attachment: js.UndefOr[AwsEc2NetworkInterfaceAttachment] = js.undefined
  
  /**
    * The IPv6 addresses associated with the network interface.
    */
  var IpV6Addresses: js.UndefOr[AwsEc2NetworkInterfaceIpV6AddressList] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The private IPv4 addresses associated with the network interface.
    */
  var PrivateIpAddresses: js.UndefOr[AwsEc2NetworkInterfacePrivateIpAddressList] = js.undefined
  
  /**
    * The public DNS name of the network interface.
    */
  var PublicDnsName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The address of the Elastic IP address bound to the network interface.
    */
  var PublicIp: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Security groups for the network interface.
    */
  var SecurityGroups: js.UndefOr[AwsEc2NetworkInterfaceSecurityGroupList] = js.undefined
  
  /**
    * Indicates whether traffic to or from the instance is validated.
    */
  var SourceDestCheck: js.UndefOr[Boolean] = js.undefined
}
object AwsEc2NetworkInterfaceDetails {
  
  inline def apply(): AwsEc2NetworkInterfaceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2NetworkInterfaceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2NetworkInterfaceDetails] (val x: Self) extends AnyVal {
    
    inline def setAttachment(value: AwsEc2NetworkInterfaceAttachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "Attachment", js.undefined)
    
    inline def setIpV6Addresses(value: AwsEc2NetworkInterfaceIpV6AddressList): Self = StObject.set(x, "IpV6Addresses", value.asInstanceOf[js.Any])
    
    inline def setIpV6AddressesUndefined: Self = StObject.set(x, "IpV6Addresses", js.undefined)
    
    inline def setIpV6AddressesVarargs(value: AwsEc2NetworkInterfaceIpV6AddressDetail*): Self = StObject.set(x, "IpV6Addresses", js.Array(value*))
    
    inline def setNetworkInterfaceId(value: NonEmptyString): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setPrivateIpAddresses(value: AwsEc2NetworkInterfacePrivateIpAddressList): Self = StObject.set(x, "PrivateIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressesUndefined: Self = StObject.set(x, "PrivateIpAddresses", js.undefined)
    
    inline def setPrivateIpAddressesVarargs(value: AwsEc2NetworkInterfacePrivateIpAddressDetail*): Self = StObject.set(x, "PrivateIpAddresses", js.Array(value*))
    
    inline def setPublicDnsName(value: NonEmptyString): Self = StObject.set(x, "PublicDnsName", value.asInstanceOf[js.Any])
    
    inline def setPublicDnsNameUndefined: Self = StObject.set(x, "PublicDnsName", js.undefined)
    
    inline def setPublicIp(value: NonEmptyString): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    inline def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
    
    inline def setSecurityGroups(value: AwsEc2NetworkInterfaceSecurityGroupList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: AwsEc2NetworkInterfaceSecurityGroup*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setSourceDestCheck(value: Boolean): Self = StObject.set(x, "SourceDestCheck", value.asInstanceOf[js.Any])
    
    inline def setSourceDestCheckUndefined: Self = StObject.set(x, "SourceDestCheck", js.undefined)
  }
}
