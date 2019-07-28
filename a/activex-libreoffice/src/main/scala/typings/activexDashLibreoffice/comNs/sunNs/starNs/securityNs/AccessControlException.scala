package typings.activexDashLibreoffice.comNs.sunNs.starNs.securityNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exception notifying a lacking permission to access data or execute code thus it is thrown if permission ought to be denied.
  * @since OOo 1.1.2
  */
trait AccessControlException extends Exception {
  /** lacking permission. */
  var LackingPermission: js.Any
}

object AccessControlException {
  @scala.inline
  def apply(Context: XInterface, LackingPermission: js.Any, Message: String): AccessControlException = {
    val __obj = js.Dynamic.literal(Context = Context, LackingPermission = LackingPermission, Message = Message)
  
    __obj.asInstanceOf[AccessControlException]
  }
}

