package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IamActionDefinition extends js.Object {
  
  /**
    *  A list of groups to be attached. There must be at least one group. 
    */
  var Groups: js.UndefOr[typings.awsSdk.budgetsMod.Groups] = js.native
  
  /**
    *  The Amazon Resource Name (ARN) of the policy to be attached. 
    */
  var PolicyArn: typings.awsSdk.budgetsMod.PolicyArn = js.native
  
  /**
    *  A list of roles to be attached. There must be at least one role. 
    */
  var Roles: js.UndefOr[typings.awsSdk.budgetsMod.Roles] = js.native
  
  /**
    *  A list of users to be attached. There must be at least one user. 
    */
  var Users: js.UndefOr[typings.awsSdk.budgetsMod.Users] = js.native
}
object IamActionDefinition {
  
  @scala.inline
  def apply(PolicyArn: PolicyArn): IamActionDefinition = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IamActionDefinition]
  }
  
  @scala.inline
  implicit class IamActionDefinitionOps[Self <: IamActionDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPolicyArn(value: PolicyArn): Self = this.set("PolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: Group*): Self = this.set("Groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: Groups): Self = this.set("Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    
    @scala.inline
    def setRolesVarargs(value: Role*): Self = this.set("Roles", js.Array(value :_*))
    
    @scala.inline
    def setRoles(value: Roles): Self = this.set("Roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoles: Self = this.set("Roles", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: User*): Self = this.set("Users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: Users): Self = this.set("Users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("Users", js.undefined)
  }
}
