package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationJobVpcConfig extends StObject {
  
  /**
    * The VPC security group IDs. IDs have the form of sg-xxxxxxxx. Specify the security groups for the VPC that is specified in the Subnets field.
    */
  var SecurityGroupIds: RecommendationJobVpcSecurityGroupIds
  
  /**
    * The ID of the subnets in the VPC to which you want to connect your model.
    */
  var Subnets: RecommendationJobVpcSubnets
}
object RecommendationJobVpcConfig {
  
  inline def apply(SecurityGroupIds: RecommendationJobVpcSecurityGroupIds, Subnets: RecommendationJobVpcSubnets): RecommendationJobVpcConfig = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], Subnets = Subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationJobVpcConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommendationJobVpcConfig] (val x: Self) extends AnyVal {
    
    inline def setSecurityGroupIds(value: RecommendationJobVpcSecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: RecommendationJobVpcSecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnets(value: RecommendationJobVpcSubnets): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsVarargs(value: RecommendationJobVpcSubnetId*): Self = StObject.set(x, "Subnets", js.Array(value*))
  }
}
