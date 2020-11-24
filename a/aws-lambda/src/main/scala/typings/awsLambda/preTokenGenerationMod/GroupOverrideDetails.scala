package typings.awsLambda.preTokenGenerationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupOverrideDetails extends js.Object {
  
  var groupsToOverride: js.UndefOr[js.Array[String]] = js.native
  
  var iamRolesToOverride: js.UndefOr[js.Array[String]] = js.native
  
  var preferredRole: js.UndefOr[String] = js.native
}
object GroupOverrideDetails {
  
  @scala.inline
  def apply(): GroupOverrideDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOverrideDetails]
  }
  
  @scala.inline
  implicit class GroupOverrideDetailsOps[Self <: GroupOverrideDetails] (val x: Self) extends AnyVal {
    
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
    def setGroupsToOverrideVarargs(value: String*): Self = this.set("groupsToOverride", js.Array(value :_*))
    
    @scala.inline
    def setGroupsToOverride(value: js.Array[String]): Self = this.set("groupsToOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupsToOverride: Self = this.set("groupsToOverride", js.undefined)
    
    @scala.inline
    def setIamRolesToOverrideVarargs(value: String*): Self = this.set("iamRolesToOverride", js.Array(value :_*))
    
    @scala.inline
    def setIamRolesToOverride(value: js.Array[String]): Self = this.set("iamRolesToOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamRolesToOverride: Self = this.set("iamRolesToOverride", js.undefined)
    
    @scala.inline
    def setPreferredRole(value: String): Self = this.set("preferredRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredRole: Self = this.set("preferredRole", js.undefined)
  }
}
