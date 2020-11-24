package typings.acl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AclSet extends js.Object {
  
  var allows: js.Array[AclAllow] = js.native
  
  var roles: strings = js.native
}
object AclSet {
  
  @scala.inline
  def apply(allows: js.Array[AclAllow], roles: strings): AclSet = {
    val __obj = js.Dynamic.literal(allows = allows.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AclSet]
  }
  
  @scala.inline
  implicit class AclSetOps[Self <: AclSet] (val x: Self) extends AnyVal {
    
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
    def setAllowsVarargs(value: AclAllow*): Self = this.set("allows", js.Array(value :_*))
    
    @scala.inline
    def setAllows(value: js.Array[AclAllow]): Self = this.set("allows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesVarargs(value: String*): Self = this.set("roles", js.Array(value :_*))
    
    @scala.inline
    def setRoles(value: strings): Self = this.set("roles", value.asInstanceOf[js.Any])
  }
}
