package typings.acl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketsOption extends js.Object {
  
  var meta: js.UndefOr[String] = js.native
  
  var parents: js.UndefOr[String] = js.native
  
  var permissions: js.UndefOr[String] = js.native
  
  var resources: js.UndefOr[String] = js.native
  
  var roles: js.UndefOr[String] = js.native
  
  var users: js.UndefOr[String] = js.native
}
object BucketsOption {
  
  @scala.inline
  def apply(): BucketsOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketsOption]
  }
  
  @scala.inline
  implicit class BucketsOptionOps[Self <: BucketsOption] (val x: Self) extends AnyVal {
    
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
    def setMeta(value: String): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setParents(value: String): Self = this.set("parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParents: Self = this.set("parents", js.undefined)
    
    @scala.inline
    def setPermissions(value: String): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setResources(value: String): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setRoles(value: String): Self = this.set("roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoles: Self = this.set("roles", js.undefined)
    
    @scala.inline
    def setUsers(value: String): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
}
