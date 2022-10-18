package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConfig extends StObject {
  
  /**
    * An array of one or more security groups IDs in your Amazon VPC.
    */
  var securityGroupIds: VpcSecurityGroupIds
  
  /**
    * An array of one or more subnet IDs in your Amazon VPC.
    */
  var subnetIds: VpcSubnetIds
  
  /**
    * The ID of the Amazon VPC.
    */
  var vpcId: NonEmptyString
}
object VpcConfig {
  
  inline def apply(securityGroupIds: VpcSecurityGroupIds, subnetIds: VpcSubnetIds, vpcId: NonEmptyString): VpcConfig = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfig]
  }
  
  extension [Self <: VpcConfig](x: Self) {
    
    inline def setSecurityGroupIds(value: VpcSecurityGroupIds): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: VpcSubnetIds): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "subnetIds", js.Array(value*))
    
    inline def setVpcId(value: NonEmptyString): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
  }
}
