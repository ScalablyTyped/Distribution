package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails extends StObject {
  
  /**
    * Whether the task's elastic network interface receives a public IP address. The default value is DISABLED. Valid values: ENABLED | DISABLED 
    */
  var AssignPublicIp: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The IDs of the security groups associated with the task or service. You can provide up to five security groups.
    */
  var SecurityGroups: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The IDs of the subnets associated with the task or service. You can provide up to 16 subnets.
    */
  var Subnets: js.UndefOr[NonEmptyStringList] = js.undefined
}
object AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails {
  
  inline def apply(): AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsServiceNetworkConfigurationAwsVpcConfigurationDetails] (val x: Self) extends AnyVal {
    
    inline def setAssignPublicIp(value: NonEmptyString): Self = StObject.set(x, "AssignPublicIp", value.asInstanceOf[js.Any])
    
    inline def setAssignPublicIpUndefined: Self = StObject.set(x, "AssignPublicIp", js.undefined)
    
    inline def setSecurityGroups(value: NonEmptyStringList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: NonEmptyString*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setSubnets(value: NonEmptyStringList): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Subnets", js.Array(value*))
  }
}
