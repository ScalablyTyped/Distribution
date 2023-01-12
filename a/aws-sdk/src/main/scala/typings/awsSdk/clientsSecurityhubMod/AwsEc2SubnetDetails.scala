package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2SubnetDetails extends StObject {
  
  /**
    * Whether to assign an IPV6 address to a network interface that is created in this subnet.
    */
  var AssignIpv6AddressOnCreation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Availability Zone for the subnet.
    */
  var AvailabilityZone: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the Availability Zone for the subnet.
    */
  var AvailabilityZoneId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of available IPV4 addresses in the subnet. Does not include addresses for stopped instances.
    */
  var AvailableIpAddressCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The IPV4 CIDR block that is assigned to the subnet.
    */
  var CidrBlock: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether this subnet is the default subnet for the Availability Zone.
    */
  var DefaultForAz: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IPV6 CIDR blocks that are associated with the subnet.
    */
  var Ipv6CidrBlockAssociationSet: js.UndefOr[Ipv6CidrBlockAssociationList] = js.undefined
  
  /**
    * Whether instances in this subnet receive a public IP address.
    */
  var MapPublicIpOnLaunch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The identifier of the Amazon Web Services account that owns the subnet.
    */
  var OwnerId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The current state of the subnet. Valid values are available or pending.
    */
  var State: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the subnet.
    */
  var SubnetArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the subnet.
    */
  var SubnetId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the VPC that contains the subnet.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2SubnetDetails {
  
  inline def apply(): AwsEc2SubnetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2SubnetDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2SubnetDetails] (val x: Self) extends AnyVal {
    
    inline def setAssignIpv6AddressOnCreation(value: Boolean): Self = StObject.set(x, "AssignIpv6AddressOnCreation", value.asInstanceOf[js.Any])
    
    inline def setAssignIpv6AddressOnCreationUndefined: Self = StObject.set(x, "AssignIpv6AddressOnCreation", js.undefined)
    
    inline def setAvailabilityZone(value: NonEmptyString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneId(value: NonEmptyString): Self = StObject.set(x, "AvailabilityZoneId", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "AvailabilityZoneId", js.undefined)
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setAvailableIpAddressCount(value: Integer): Self = StObject.set(x, "AvailableIpAddressCount", value.asInstanceOf[js.Any])
    
    inline def setAvailableIpAddressCountUndefined: Self = StObject.set(x, "AvailableIpAddressCount", js.undefined)
    
    inline def setCidrBlock(value: NonEmptyString): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
    
    inline def setDefaultForAz(value: Boolean): Self = StObject.set(x, "DefaultForAz", value.asInstanceOf[js.Any])
    
    inline def setDefaultForAzUndefined: Self = StObject.set(x, "DefaultForAz", js.undefined)
    
    inline def setIpv6CidrBlockAssociationSet(value: Ipv6CidrBlockAssociationList): Self = StObject.set(x, "Ipv6CidrBlockAssociationSet", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockAssociationSetUndefined: Self = StObject.set(x, "Ipv6CidrBlockAssociationSet", js.undefined)
    
    inline def setIpv6CidrBlockAssociationSetVarargs(value: Ipv6CidrBlockAssociation*): Self = StObject.set(x, "Ipv6CidrBlockAssociationSet", js.Array(value*))
    
    inline def setMapPublicIpOnLaunch(value: Boolean): Self = StObject.set(x, "MapPublicIpOnLaunch", value.asInstanceOf[js.Any])
    
    inline def setMapPublicIpOnLaunchUndefined: Self = StObject.set(x, "MapPublicIpOnLaunch", js.undefined)
    
    inline def setOwnerId(value: NonEmptyString): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setState(value: NonEmptyString): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setSubnetArn(value: NonEmptyString): Self = StObject.set(x, "SubnetArn", value.asInstanceOf[js.Any])
    
    inline def setSubnetArnUndefined: Self = StObject.set(x, "SubnetArn", js.undefined)
    
    inline def setSubnetId(value: NonEmptyString): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
