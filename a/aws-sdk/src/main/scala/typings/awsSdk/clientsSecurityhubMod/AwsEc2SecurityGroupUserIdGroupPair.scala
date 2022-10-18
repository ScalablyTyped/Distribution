package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2SecurityGroupUserIdGroupPair extends StObject {
  
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of a VPC peering connection, if applicable.
    */
  var PeeringStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of an Amazon Web Services account. For a referenced security group in another VPC, the account ID of the referenced security group is returned in the response. If the referenced security group is deleted, this value is not returned. [EC2-Classic] Required when adding or removing rules that reference a security group in another VPC. 
    */
  var UserId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of the VPC for the referenced security group, if applicable.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of the VPC peering connection, if applicable.
    */
  var VpcPeeringConnectionId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2SecurityGroupUserIdGroupPair {
  
  inline def apply(): AwsEc2SecurityGroupUserIdGroupPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2SecurityGroupUserIdGroupPair]
  }
  
  extension [Self <: AwsEc2SecurityGroupUserIdGroupPair](x: Self) {
    
    inline def setGroupId(value: NonEmptyString): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setGroupName(value: NonEmptyString): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setPeeringStatus(value: NonEmptyString): Self = StObject.set(x, "PeeringStatus", value.asInstanceOf[js.Any])
    
    inline def setPeeringStatusUndefined: Self = StObject.set(x, "PeeringStatus", js.undefined)
    
    inline def setUserId(value: NonEmptyString): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
    
    inline def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    inline def setVpcPeeringConnectionId(value: NonEmptyString): Self = StObject.set(x, "VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "VpcPeeringConnectionId", js.undefined)
  }
}
