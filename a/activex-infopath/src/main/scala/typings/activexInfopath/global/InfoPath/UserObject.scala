package typings.activexInfopath.global.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.UserObject")
@js.native
class UserObject protected ()
  extends typings.activexInfopath.InfoPath.UserObject {
  /* CompleteClass */
  @JSName("InfoPath.UserObject_typekey")
  override var InfoPathDotUserObject_typekey: typings.activexInfopath.InfoPath.UserObject = js.native
  /* CompleteClass */
  override def IsCurrentUser(bstrUsername: String): Boolean = js.native
  /* CompleteClass */
  override def IsUserMemberOf(bstrGroupname: String): Boolean = js.native
}

