package typings.activexOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPermission extends js.Object {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  var ExpirationDate: VarDate = js.native
  
  @JSName("Office.UserPermission_typekey")
  var OfficeDotUserPermission_typekey: UserPermission = js.native
  
  val Parent: js.Any = js.native
  
  var Permission: Double = js.native
  
  def Remove(): Unit = js.native
  
  val UserId: String = js.native
}
object UserPermission {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    ExpirationDate: VarDate,
    OfficeDotUserPermission_typekey: UserPermission,
    Parent: js.Any,
    Permission: Double,
    Remove: () => Unit,
    UserId: String
  ): UserPermission = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Permission = Permission.asInstanceOf[js.Any], Remove = js.Any.fromFunction0(Remove), UserId = UserId.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.UserPermission_typekey")(OfficeDotUserPermission_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPermission]
  }
  
  @scala.inline
  implicit class UserPermissionOps[Self <: UserPermission] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDate(value: VarDate): Self = this.set("ExpirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotUserPermission_typekey(value: UserPermission): Self = this.set("Office.UserPermission_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermission(value: Double): Self = this.set("Permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("Remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUserId(value: String): Self = this.set("UserId", value.asInstanceOf[js.Any])
  }
}
