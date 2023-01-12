package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2VpcPeeringConnectionVpcInfoDetails extends StObject {
  
  /**
    * The IPv4 CIDR block for the VPC. 
    */
  var CidrBlock: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the IPv4 CIDR blocks for the VPC. 
    */
  var CidrBlockSet: js.UndefOr[VpcInfoCidrBlockSetList] = js.undefined
  
  /**
    * The IPv6 CIDR block for the VPC. 
    */
  var Ipv6CidrBlockSet: js.UndefOr[VpcInfoIpv6CidrBlockSetList] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the VPC. 
    */
  var OwnerId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the VPC peering connection options for the accepter or requester VPC. 
    */
  var PeeringOptions: js.UndefOr[VpcInfoPeeringOptionsDetails] = js.undefined
  
  /**
    * The Amazon Web Services Region in which the VPC is located. 
    */
  var Region: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of the VPC. 
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2VpcPeeringConnectionVpcInfoDetails {
  
  inline def apply(): AwsEc2VpcPeeringConnectionVpcInfoDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2VpcPeeringConnectionVpcInfoDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2VpcPeeringConnectionVpcInfoDetails] (val x: Self) extends AnyVal {
    
    inline def setCidrBlock(value: NonEmptyString): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockSet(value: VpcInfoCidrBlockSetList): Self = StObject.set(x, "CidrBlockSet", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockSetUndefined: Self = StObject.set(x, "CidrBlockSet", js.undefined)
    
    inline def setCidrBlockSetVarargs(value: VpcInfoCidrBlockSetDetails*): Self = StObject.set(x, "CidrBlockSet", js.Array(value*))
    
    inline def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
    
    inline def setIpv6CidrBlockSet(value: VpcInfoIpv6CidrBlockSetList): Self = StObject.set(x, "Ipv6CidrBlockSet", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockSetUndefined: Self = StObject.set(x, "Ipv6CidrBlockSet", js.undefined)
    
    inline def setIpv6CidrBlockSetVarargs(value: VpcInfoIpv6CidrBlockSetDetails*): Self = StObject.set(x, "Ipv6CidrBlockSet", js.Array(value*))
    
    inline def setOwnerId(value: NonEmptyString): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setPeeringOptions(value: VpcInfoPeeringOptionsDetails): Self = StObject.set(x, "PeeringOptions", value.asInstanceOf[js.Any])
    
    inline def setPeeringOptionsUndefined: Self = StObject.set(x, "PeeringOptions", js.undefined)
    
    inline def setRegion(value: NonEmptyString): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
