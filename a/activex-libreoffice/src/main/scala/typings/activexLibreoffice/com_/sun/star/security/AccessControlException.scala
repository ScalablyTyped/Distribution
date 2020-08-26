package typings.activexLibreoffice.com_.sun.star.security

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exception notifying a lacking permission to access data or execute code thus it is thrown if permission ought to be denied.
  * @since OOo 1.1.2
  */
@js.native
trait AccessControlException extends Exception {
  /** lacking permission. */
  var LackingPermission: js.Any = js.native
}

object AccessControlException {
  @scala.inline
  def apply(Context: XInterface, LackingPermission: js.Any, Message: String): AccessControlException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], LackingPermission = LackingPermission.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessControlException]
  }
  @scala.inline
  implicit class AccessControlExceptionOps[Self <: AccessControlException] (val x: Self) extends AnyVal {
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
    def setLackingPermission(value: js.Any): Self = this.set("LackingPermission", value.asInstanceOf[js.Any])
  }
  
}

