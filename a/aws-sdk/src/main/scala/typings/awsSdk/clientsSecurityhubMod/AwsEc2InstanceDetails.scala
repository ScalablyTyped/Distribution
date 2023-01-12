package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2InstanceDetails extends StObject {
  
  /**
    * The IAM profile ARN of the instance.
    */
  var IamInstanceProfileArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon Machine Image (AMI) ID of the instance.
    */
  var ImageId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The IPv4 addresses associated with the instance.
    */
  var IpV4Addresses: js.UndefOr[StringList] = js.undefined
  
  /**
    * The IPv6 addresses associated with the instance.
    */
  var IpV6Addresses: js.UndefOr[StringList] = js.undefined
  
  /**
    * The key name associated with the instance.
    */
  var KeyName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when the instance was launched. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LaunchedAt: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Details about the metadata options for the Amazon EC2 instance. 
    */
  var MetadataOptions: js.UndefOr[AwsEc2InstanceMetadataOptions] = js.undefined
  
  /**
    * The identifiers of the network interfaces for the EC2 instance. The details for each network interface are in a corresponding AwsEc2NetworkInterfacesDetails object.
    */
  var NetworkInterfaces: js.UndefOr[AwsEc2InstanceNetworkInterfacesList] = js.undefined
  
  /**
    * The identifier of the subnet that the instance was launched in.
    */
  var SubnetId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The instance type of the instance. 
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The virtualization type of the Amazon Machine Image (AMI) required to launch the instance. 
    */
  var VirtualizationType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the VPC that the instance was launched in.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2InstanceDetails {
  
  inline def apply(): AwsEc2InstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2InstanceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2InstanceDetails] (val x: Self) extends AnyVal {
    
    inline def setIamInstanceProfileArn(value: NonEmptyString): Self = StObject.set(x, "IamInstanceProfileArn", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileArnUndefined: Self = StObject.set(x, "IamInstanceProfileArn", js.undefined)
    
    inline def setImageId(value: NonEmptyString): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setIpV4Addresses(value: StringList): Self = StObject.set(x, "IpV4Addresses", value.asInstanceOf[js.Any])
    
    inline def setIpV4AddressesUndefined: Self = StObject.set(x, "IpV4Addresses", js.undefined)
    
    inline def setIpV4AddressesVarargs(value: NonEmptyString*): Self = StObject.set(x, "IpV4Addresses", js.Array(value*))
    
    inline def setIpV6Addresses(value: StringList): Self = StObject.set(x, "IpV6Addresses", value.asInstanceOf[js.Any])
    
    inline def setIpV6AddressesUndefined: Self = StObject.set(x, "IpV6Addresses", js.undefined)
    
    inline def setIpV6AddressesVarargs(value: NonEmptyString*): Self = StObject.set(x, "IpV6Addresses", js.Array(value*))
    
    inline def setKeyName(value: NonEmptyString): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    inline def setLaunchedAt(value: NonEmptyString): Self = StObject.set(x, "LaunchedAt", value.asInstanceOf[js.Any])
    
    inline def setLaunchedAtUndefined: Self = StObject.set(x, "LaunchedAt", js.undefined)
    
    inline def setMetadataOptions(value: AwsEc2InstanceMetadataOptions): Self = StObject.set(x, "MetadataOptions", value.asInstanceOf[js.Any])
    
    inline def setMetadataOptionsUndefined: Self = StObject.set(x, "MetadataOptions", js.undefined)
    
    inline def setNetworkInterfaces(value: AwsEc2InstanceNetworkInterfacesList): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: AwsEc2InstanceNetworkInterfacesDetails*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value*))
    
    inline def setSubnetId(value: NonEmptyString): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVirtualizationType(value: NonEmptyString): Self = StObject.set(x, "VirtualizationType", value.asInstanceOf[js.Any])
    
    inline def setVirtualizationTypeUndefined: Self = StObject.set(x, "VirtualizationType", js.undefined)
    
    inline def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
