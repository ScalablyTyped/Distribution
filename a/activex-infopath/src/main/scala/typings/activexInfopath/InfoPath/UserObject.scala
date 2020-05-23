package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserObject extends js.Object {
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
}

