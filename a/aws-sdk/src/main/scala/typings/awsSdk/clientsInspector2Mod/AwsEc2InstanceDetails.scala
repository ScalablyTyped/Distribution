package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2InstanceDetails extends StObject {
  
  /**
    * The IAM instance profile ARN of the Amazon EC2 instance.
    */
  var iamInstanceProfileArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The image ID of the Amazon EC2 instance.
    */
  var imageId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The IPv4 addresses of the Amazon EC2 instance.
    */
  var ipV4Addresses: js.UndefOr[IpV4AddressList] = js.undefined
  
  /**
    * The IPv6 addresses of the Amazon EC2 instance.
    */
  var ipV6Addresses: js.UndefOr[IpV6AddressList] = js.undefined
  
  /**
    * The name of the key pair used to launch the Amazon EC2 instance.
    */
  var keyName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The date and time the Amazon EC2 instance was launched at.
    */
  var launchedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The platform of the Amazon EC2 instance.
    */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /**
    * The subnet ID of the Amazon EC2 instance.
    */
  var subnetId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of the Amazon EC2 instance.
    */
  var `type`: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The VPC ID of the Amazon EC2 instance.
    */
  var vpcId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2InstanceDetails {
  
  inline def apply(): AwsEc2InstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2InstanceDetails]
  }
  
  extension [Self <: AwsEc2InstanceDetails](x: Self) {
    
    inline def setIamInstanceProfileArn(value: NonEmptyString): Self = StObject.set(x, "iamInstanceProfileArn", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileArnUndefined: Self = StObject.set(x, "iamInstanceProfileArn", js.undefined)
    
    inline def setImageId(value: NonEmptyString): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
    
    inline def setIpV4Addresses(value: IpV4AddressList): Self = StObject.set(x, "ipV4Addresses", value.asInstanceOf[js.Any])
    
    inline def setIpV4AddressesUndefined: Self = StObject.set(x, "ipV4Addresses", js.undefined)
    
    inline def setIpV4AddressesVarargs(value: IpV4Address*): Self = StObject.set(x, "ipV4Addresses", js.Array(value*))
    
    inline def setIpV6Addresses(value: IpV6AddressList): Self = StObject.set(x, "ipV6Addresses", value.asInstanceOf[js.Any])
    
    inline def setIpV6AddressesUndefined: Self = StObject.set(x, "ipV6Addresses", js.undefined)
    
    inline def setIpV6AddressesVarargs(value: IpV6Address*): Self = StObject.set(x, "ipV6Addresses", js.Array(value*))
    
    inline def setKeyName(value: NonEmptyString): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
    
    inline def setLaunchedAt(value: js.Date): Self = StObject.set(x, "launchedAt", value.asInstanceOf[js.Any])
    
    inline def setLaunchedAtUndefined: Self = StObject.set(x, "launchedAt", js.undefined)
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setSubnetId(value: NonEmptyString): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVpcId(value: NonEmptyString): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
  }
}
