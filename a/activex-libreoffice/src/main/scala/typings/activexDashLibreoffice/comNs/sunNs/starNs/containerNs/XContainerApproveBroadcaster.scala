package typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows containers to implement a vetoing mechanism for insertion, removal, and replacement of their elements. */
trait XContainerApproveBroadcaster extends js.Object {
  /** adds a listener which can veto changes in the container's content */
  def addContainerApproveListener(Listener: XContainerApproveListener): Unit
  /** removes a previously added listener */
  def removeContainerApproveListener(Listener: XContainerApproveListener): Unit
}

object XContainerApproveBroadcaster {
  @scala.inline
  def apply(
    addContainerApproveListener: XContainerApproveListener => Unit,
    removeContainerApproveListener: XContainerApproveListener => Unit
  ): XContainerApproveBroadcaster = {
    val __obj = js.Dynamic.literal(addContainerApproveListener = js.Any.fromFunction1(addContainerApproveListener), removeContainerApproveListener = js.Any.fromFunction1(removeContainerApproveListener))
  
    __obj.asInstanceOf[XContainerApproveBroadcaster]
  }
}

