package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VPCOptions extends StObject {
  
  /**
    * The list of security group IDs associated with the VPC endpoints for the domain. If you do not provide a security group ID, OpenSearch Service uses the default security group for the VPC.
    */
  var SecurityGroupIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * A list of subnet IDs associated with the VPC endpoints for the domain. If your domain uses multiple Availability Zones, you need to provide two subnet IDs, one per zone. Otherwise, provide only one.
    */
  var SubnetIds: js.UndefOr[StringList] = js.undefined
}
object VPCOptions {
  
  inline def apply(): VPCOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPCOptions]
  }
  
  extension [Self <: VPCOptions](x: Self) {
    
    inline def setSecurityGroupIds(value: StringList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: StringList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
  }
}
