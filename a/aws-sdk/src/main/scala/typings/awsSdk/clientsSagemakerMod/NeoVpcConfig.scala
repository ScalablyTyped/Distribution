package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NeoVpcConfig extends StObject {
  
  /**
    * The VPC security group IDs. IDs have the form of sg-xxxxxxxx. Specify the security groups for the VPC that is specified in the Subnets field.
    */
  var SecurityGroupIds: NeoVpcSecurityGroupIds
  
  /**
    * The ID of the subnets in the VPC that you want to connect the compilation job to for accessing the model in Amazon S3.
    */
  var Subnets: NeoVpcSubnets
}
object NeoVpcConfig {
  
  inline def apply(SecurityGroupIds: NeoVpcSecurityGroupIds, Subnets: NeoVpcSubnets): NeoVpcConfig = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], Subnets = Subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeoVpcConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NeoVpcConfig] (val x: Self) extends AnyVal {
    
    inline def setSecurityGroupIds(value: NeoVpcSecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: NeoVpcSecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnets(value: NeoVpcSubnets): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsVarargs(value: NeoVpcSubnetId*): Self = StObject.set(x, "Subnets", js.Array(value*))
  }
}
