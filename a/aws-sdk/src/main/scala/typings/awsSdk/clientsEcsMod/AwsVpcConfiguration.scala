package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsVpcConfiguration extends StObject {
  
  /**
    * Whether the task's elastic network interface receives a public IP address. The default value is DISABLED.
    */
  var assignPublicIp: js.UndefOr[AssignPublicIp] = js.undefined
  
  /**
    * The IDs of the security groups associated with the task or service. If you don't specify a security group, the default security group for the VPC is used. There's a limit of 5 security groups that can be specified per AwsVpcConfiguration.  All specified security groups must be from the same VPC. 
    */
  var securityGroups: js.UndefOr[StringList] = js.undefined
  
  /**
    * The IDs of the subnets associated with the task or service. There's a limit of 16 subnets that can be specified per AwsVpcConfiguration.  All specified subnets must be from the same VPC. 
    */
  var subnets: StringList
}
object AwsVpcConfiguration {
  
  inline def apply(subnets: StringList): AwsVpcConfiguration = {
    val __obj = js.Dynamic.literal(subnets = subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsVpcConfiguration]
  }
  
  extension [Self <: AwsVpcConfiguration](x: Self) {
    
    inline def setAssignPublicIp(value: AssignPublicIp): Self = StObject.set(x, "assignPublicIp", value.asInstanceOf[js.Any])
    
    inline def setAssignPublicIpUndefined: Self = StObject.set(x, "assignPublicIp", js.undefined)
    
    inline def setSecurityGroups(value: StringList): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "securityGroups", js.Array(value*))
    
    inline def setSubnets(value: StringList): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsVarargs(value: String*): Self = StObject.set(x, "subnets", js.Array(value*))
  }
}
