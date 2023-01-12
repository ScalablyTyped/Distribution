package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetSecurityGroupsOutput extends StObject {
  
  /**
    * The IDs of the security groups associated with the load balancer.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroups] = js.undefined
}
object SetSecurityGroupsOutput {
  
  inline def apply(): SetSecurityGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetSecurityGroupsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetSecurityGroupsOutput] (val x: Self) extends AnyVal {
    
    inline def setSecurityGroupIds(value: SecurityGroups): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
  }
}
