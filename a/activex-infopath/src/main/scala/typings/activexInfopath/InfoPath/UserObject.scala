package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserObject extends StObject {
  
  @JSName("InfoPath.UserObject_typekey")
  var InfoPathDotUserObject_typekey: UserObject
  
  def IsCurrentUser(bstrUsername: String): Boolean
  
  def IsUserMemberOf(bstrGroupname: String): Boolean
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
  implicit class UserObjectMutableBuilder[Self <: UserObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoPathDotUserObject_typekey(value: UserObject): Self = StObject.set(x, "InfoPath.UserObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCurrentUser(value: String => Boolean): Self = StObject.set(x, "IsCurrentUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsUserMemberOf(value: String => Boolean): Self = StObject.set(x, "IsUserMemberOf", js.Any.fromFunction1(value))
  }
}
