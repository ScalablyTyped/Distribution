package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsVpcConfiguration extends StObject {
  
  /**
    * Specifies whether the task's elastic network interface receives a public IP address. You can specify ENABLED only when LaunchType in EcsParameters is set to FARGATE.
    */
  var AssignPublicIp: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.AssignPublicIp] = js.undefined
  
  /**
    * Specifies the security groups associated with the task. These security groups must all be in the same VPC. You can specify as many as five security groups. If you do not specify a security group, the default security group for the VPC is used.
    */
  var SecurityGroups: js.UndefOr[StringList] = js.undefined
  
  /**
    * Specifies the subnets associated with the task. These subnets must all be in the same VPC. You can specify as many as 16 subnets.
    */
  var Subnets: StringList
}
object AwsVpcConfiguration {
  
  inline def apply(Subnets: StringList): AwsVpcConfiguration = {
    val __obj = js.Dynamic.literal(Subnets = Subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsVpcConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsVpcConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAssignPublicIp(value: AssignPublicIp): Self = StObject.set(x, "AssignPublicIp", value.asInstanceOf[js.Any])
    
    inline def setAssignPublicIpUndefined: Self = StObject.set(x, "AssignPublicIp", js.undefined)
    
    inline def setSecurityGroups(value: StringList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setSubnets(value: StringList): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsVarargs(value: String*): Self = StObject.set(x, "Subnets", js.Array(value*))
  }
}
