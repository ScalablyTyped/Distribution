package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserObject extends js.Object {
  
  @JSName("InfoPath.UserObject_typekey")
  var InfoPathDotUserObject_typekey: UserObject = js.native
  
  def IsCurrentUser(bstrUsername: String): Boolean = js.native
  
  def IsUserMemberOf(bstrGroupname: String): Boolean = js.native
}
object UserObject {
  
  @scala.inline
  def apply(
    InfoPathDotUserObject_typekey: UserObject,
    IsCurrentUser: String => Boolean,
    IsUserMemberOf: String => Boolean
  ): UserObject = {
    val __obj = js.Dynamic.literal(IsCurrentUser = js.Any.fromFunction1(IsCurrentUser), IsUserMemberOf = js.Any.fromFunction1(IsUserMemberOf))
    __obj.updateDynamic("InfoPath.UserObject_typekey")(InfoPathDotUserObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserObject]
  }
  
  @scala.inline
  implicit class UserObjectOps[Self <: UserObject] (val x: Self) extends AnyVal {
    
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
    def setInfoPathDotUserObject_typekey(value: UserObject): Self = this.set("InfoPath.UserObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCurrentUser(value: String => Boolean): Self = this.set("IsCurrentUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsUserMemberOf(value: String => Boolean): Self = this.set("IsUserMemberOf", js.Any.fromFunction1(value))
  }
}
