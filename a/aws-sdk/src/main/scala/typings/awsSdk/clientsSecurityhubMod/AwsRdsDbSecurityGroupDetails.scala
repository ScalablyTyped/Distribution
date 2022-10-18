package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbSecurityGroupDetails extends StObject {
  
  /**
    * The ARN for the DB security group.
    */
  var DbSecurityGroupArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Provides the description of the DB security group.
    */
  var DbSecurityGroupDescription: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the name of the DB security group.
    */
  var DbSecurityGroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Contains a list of EC2 security groups.
    */
  var Ec2SecurityGroups: js.UndefOr[AwsRdsDbSecurityGroupEc2SecurityGroups] = js.undefined
  
  /**
    * Contains a list of IP ranges.
    */
  var IpRanges: js.UndefOr[AwsRdsDbSecurityGroupIpRanges] = js.undefined
  
  /**
    * Provides the Amazon Web Services ID of the owner of a specific DB security group.
    */
  var OwnerId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Provides VPC ID associated with the DB security group. 
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbSecurityGroupDetails {
  
  inline def apply(): AwsRdsDbSecurityGroupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbSecurityGroupDetails]
  }
  
  extension [Self <: AwsRdsDbSecurityGroupDetails](x: Self) {
    
    inline def setDbSecurityGroupArn(value: NonEmptyString): Self = StObject.set(x, "DbSecurityGroupArn", value.asInstanceOf[js.Any])
    
    inline def setDbSecurityGroupArnUndefined: Self = StObject.set(x, "DbSecurityGroupArn", js.undefined)
    
    inline def setDbSecurityGroupDescription(value: NonEmptyString): Self = StObject.set(x, "DbSecurityGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setDbSecurityGroupDescriptionUndefined: Self = StObject.set(x, "DbSecurityGroupDescription", js.undefined)
    
    inline def setDbSecurityGroupName(value: NonEmptyString): Self = StObject.set(x, "DbSecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setDbSecurityGroupNameUndefined: Self = StObject.set(x, "DbSecurityGroupName", js.undefined)
    
    inline def setEc2SecurityGroups(value: AwsRdsDbSecurityGroupEc2SecurityGroups): Self = StObject.set(x, "Ec2SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setEc2SecurityGroupsUndefined: Self = StObject.set(x, "Ec2SecurityGroups", js.undefined)
    
    inline def setEc2SecurityGroupsVarargs(value: AwsRdsDbSecurityGroupEc2SecurityGroup*): Self = StObject.set(x, "Ec2SecurityGroups", js.Array(value*))
    
    inline def setIpRanges(value: AwsRdsDbSecurityGroupIpRanges): Self = StObject.set(x, "IpRanges", value.asInstanceOf[js.Any])
    
    inline def setIpRangesUndefined: Self = StObject.set(x, "IpRanges", js.undefined)
    
    inline def setIpRangesVarargs(value: AwsRdsDbSecurityGroupIpRange*): Self = StObject.set(x, "IpRanges", js.Array(value*))
    
    inline def setOwnerId(value: NonEmptyString): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
