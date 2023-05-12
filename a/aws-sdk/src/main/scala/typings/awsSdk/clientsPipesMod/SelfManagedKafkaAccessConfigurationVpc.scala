package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelfManagedKafkaAccessConfigurationVpc extends StObject {
  
  /**
    * Specifies the security groups associated with the stream. These security groups must all be in the same VPC. You can specify as many as five security groups. If you do not specify a security group, the default security group for the VPC is used.
    */
  var SecurityGroup: js.UndefOr[SecurityGroupIds] = js.undefined
  
  /**
    * Specifies the subnets associated with the stream. These subnets must all be in the same VPC. You can specify as many as 16 subnets.
    */
  var Subnets: js.UndefOr[SubnetIds] = js.undefined
}
object SelfManagedKafkaAccessConfigurationVpc {
  
  inline def apply(): SelfManagedKafkaAccessConfigurationVpc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfManagedKafkaAccessConfigurationVpc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelfManagedKafkaAccessConfigurationVpc] (val x: Self) extends AnyVal {
    
    inline def setSecurityGroup(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupUndefined: Self = StObject.set(x, "SecurityGroup", js.undefined)
    
    inline def setSecurityGroupVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroup", js.Array(value*))
    
    inline def setSubnets(value: SubnetIds): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: SubnetId*): Self = StObject.set(x, "Subnets", js.Array(value*))
  }
}
