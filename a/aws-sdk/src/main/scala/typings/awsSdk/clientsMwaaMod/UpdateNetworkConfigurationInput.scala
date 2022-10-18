package typings.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNetworkConfigurationInput extends StObject {
  
  /**
    * A list of security group IDs. A security group must be attached to the same VPC as the subnets. To learn more, see Security in your VPC on Amazon MWAA.
    */
  var SecurityGroupIds: SecurityGroupList
}
object UpdateNetworkConfigurationInput {
  
  inline def apply(SecurityGroupIds: SecurityGroupList): UpdateNetworkConfigurationInput = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNetworkConfigurationInput]
  }
  
  extension [Self <: UpdateNetworkConfigurationInput](x: Self) {
    
    inline def setSecurityGroupIds(value: SecurityGroupList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
  }
}
