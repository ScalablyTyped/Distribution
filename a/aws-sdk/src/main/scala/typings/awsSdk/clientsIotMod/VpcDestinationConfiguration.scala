package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcDestinationConfiguration extends StObject {
  
  /**
    * The ARN of a role that has permission to create and attach to elastic network interfaces (ENIs).
    */
  var roleArn: AwsArn
  
  /**
    * The security groups of the VPC destination.
    */
  var securityGroups: js.UndefOr[SecurityGroupList] = js.undefined
  
  /**
    * The subnet IDs of the VPC destination.
    */
  var subnetIds: SubnetIdList
  
  /**
    * The ID of the VPC.
    */
  var vpcId: VpcId
}
object VpcDestinationConfiguration {
  
  inline def apply(roleArn: AwsArn, subnetIds: SubnetIdList, vpcId: VpcId): VpcDestinationConfiguration = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcDestinationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcDestinationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroups(value: SecurityGroupList): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "securityGroups", js.Array(value*))
    
    inline def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "subnetIds", js.Array(value*))
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
  }
}
