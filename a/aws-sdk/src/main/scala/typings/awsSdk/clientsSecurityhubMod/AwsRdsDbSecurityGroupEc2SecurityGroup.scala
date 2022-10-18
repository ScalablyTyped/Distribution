package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbSecurityGroupEc2SecurityGroup extends StObject {
  
  /**
    * Specifies the ID for the EC2 security group.
    */
  var Ec2SecurityGroupId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the name of the EC2 security group.
    */
  var Ec2SecurityGroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Provides the Amazon Web Services ID of the owner of the EC2 security group.
    */
  var Ec2SecurityGroupOwnerId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Provides the status of the EC2 security group.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbSecurityGroupEc2SecurityGroup {
  
  inline def apply(): AwsRdsDbSecurityGroupEc2SecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbSecurityGroupEc2SecurityGroup]
  }
  
  extension [Self <: AwsRdsDbSecurityGroupEc2SecurityGroup](x: Self) {
    
    inline def setEc2SecurityGroupId(value: NonEmptyString): Self = StObject.set(x, "Ec2SecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setEc2SecurityGroupIdUndefined: Self = StObject.set(x, "Ec2SecurityGroupId", js.undefined)
    
    inline def setEc2SecurityGroupName(value: NonEmptyString): Self = StObject.set(x, "Ec2SecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setEc2SecurityGroupNameUndefined: Self = StObject.set(x, "Ec2SecurityGroupName", js.undefined)
    
    inline def setEc2SecurityGroupOwnerId(value: NonEmptyString): Self = StObject.set(x, "Ec2SecurityGroupOwnerId", value.asInstanceOf[js.Any])
    
    inline def setEc2SecurityGroupOwnerIdUndefined: Self = StObject.set(x, "Ec2SecurityGroupOwnerId", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
