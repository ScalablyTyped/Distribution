package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplySecurityGroupsToLoadBalancerOutput extends StObject {
  
  /**
    * The IDs of the security groups associated with the load balancer.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.clientsElbMod.SecurityGroups] = js.undefined
}
object ApplySecurityGroupsToLoadBalancerOutput {
  
  inline def apply(): ApplySecurityGroupsToLoadBalancerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplySecurityGroupsToLoadBalancerOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplySecurityGroupsToLoadBalancerOutput] (val x: Self) extends AnyVal {
    
    inline def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
  }
}
