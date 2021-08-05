package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IamActionDefinition extends StObject {
  
  /**
    *  A list of groups to be attached. There must be at least one group. 
    */
  var Groups: js.UndefOr[typings.awsSdk.budgetsMod.Groups] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the policy to be attached. 
    */
  var PolicyArn: typings.awsSdk.budgetsMod.PolicyArn
  
  /**
    *  A list of roles to be attached. There must be at least one role. 
    */
  var Roles: js.UndefOr[typings.awsSdk.budgetsMod.Roles] = js.undefined
  
  /**
    *  A list of users to be attached. There must be at least one user. 
    */
  var Users: js.UndefOr[typings.awsSdk.budgetsMod.Users] = js.undefined
}
object IamActionDefinition {
  
  inline def apply(PolicyArn: PolicyArn): IamActionDefinition = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IamActionDefinition]
  }
  
  extension [Self <: IamActionDefinition](x: Self) {
    
    inline def setGroups(value: Groups): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: Group*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    inline def setPolicyArn(value: PolicyArn): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: Roles): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "Roles", js.undefined)
    
    inline def setRolesVarargs(value: Role*): Self = StObject.set(x, "Roles", js.Array(value :_*))
    
    inline def setUsers(value: Users): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
    
    inline def setUsersVarargs(value: User*): Self = StObject.set(x, "Users", js.Array(value :_*))
  }
}
