package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcDestinationSummary extends StObject {
  
  /**
    * The ARN of a role that has permission to create and attach to elastic network interfaces (ENIs).
    */
  var roleArn: js.UndefOr[AwsArn] = js.undefined
  
  /**
    * The security groups of the VPC destination.
    */
  var securityGroups: js.UndefOr[SecurityGroupList] = js.undefined
  
  /**
    * The subnet IDs of the VPC destination.
    */
  var subnetIds: js.UndefOr[SubnetIdList] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var vpcId: js.UndefOr[VpcId] = js.undefined
}
object VpcDestinationSummary {
  
  inline def apply(): VpcDestinationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcDestinationSummary]
  }
  
  extension [Self <: VpcDestinationSummary](x: Self) {
    
    inline def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setSecurityGroups(value: SecurityGroupList): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "securityGroups", js.Array(value*))
    
    inline def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "subnetIds", js.Array(value*))
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
  }
}
