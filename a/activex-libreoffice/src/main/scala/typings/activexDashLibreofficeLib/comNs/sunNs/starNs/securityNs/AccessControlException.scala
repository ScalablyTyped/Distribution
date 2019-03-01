package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exception notifying a lacking permission to access data or execute code thus it is thrown if permission ought to be denied.
  * @since OOo 1.1.2
  */
trait AccessControlException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** lacking permission. */
  var LackingPermission: js.Any
}

object AccessControlException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    LackingPermission: js.Any,
    Message: java.lang.String
  ): AccessControlException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("LackingPermission")(LackingPermission)
    __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[AccessControlException]
  }
}

