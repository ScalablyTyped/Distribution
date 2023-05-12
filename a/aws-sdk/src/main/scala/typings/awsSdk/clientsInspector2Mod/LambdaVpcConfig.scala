package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaVpcConfig extends StObject {
  
  /**
    * The VPC security groups and subnets that are attached to an AWS Lambda function. For more information, see VPC Settings.
    */
  var securityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined
  
  /**
    * A list of VPC subnet IDs.
    */
  var subnetIds: js.UndefOr[SubnetIdList] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var vpcId: js.UndefOr[VpcId] = js.undefined
}
object LambdaVpcConfig {
  
  inline def apply(): LambdaVpcConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaVpcConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaVpcConfig] (val x: Self) extends AnyVal {
    
    inline def setSecurityGroupIds(value: SecurityGroupIdList): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "subnetIds", js.Array(value*))
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
  }
}
