package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupsToOverride extends StObject {
  
  var groupsToOverride: js.UndefOr[js.Array[String]] = js.undefined
  
  var iamRolesToOverride: js.UndefOr[js.Array[String]] = js.undefined
  
  var preferredRole: js.UndefOr[String] = js.undefined
}
object GroupsToOverride {
  
  @scala.inline
  def apply(): GroupsToOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupsToOverride]
  }
  
  @scala.inline
  implicit class GroupsToOverrideMutableBuilder[Self <: GroupsToOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupsToOverride(value: js.Array[String]): Self = StObject.set(x, "groupsToOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsToOverrideUndefined: Self = StObject.set(x, "groupsToOverride", js.undefined)
    
    @scala.inline
    def setGroupsToOverrideVarargs(value: String*): Self = StObject.set(x, "groupsToOverride", js.Array(value :_*))
    
    @scala.inline
    def setIamRolesToOverride(value: js.Array[String]): Self = StObject.set(x, "iamRolesToOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRolesToOverrideUndefined: Self = StObject.set(x, "iamRolesToOverride", js.undefined)
    
    @scala.inline
    def setIamRolesToOverrideVarargs(value: String*): Self = StObject.set(x, "iamRolesToOverride", js.Array(value :_*))
    
    @scala.inline
    def setPreferredRole(value: String): Self = StObject.set(x, "preferredRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredRoleUndefined: Self = StObject.set(x, "preferredRole", js.undefined)
  }
}
