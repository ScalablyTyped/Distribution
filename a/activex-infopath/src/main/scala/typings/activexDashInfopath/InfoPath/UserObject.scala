package typings.activexDashInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.UserObject")
@js.native
class UserObject protected () extends js.Object {
  @JSName("InfoPath.UserObject_typekey")
  var InfoPathDotUserObject_typekey: UserObject = js.native
  def IsCurrentUser(bstrUsername: String): Boolean = js.native
  def IsUserMemberOf(bstrGroupname: String): Boolean = js.native
}

