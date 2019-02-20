package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows containers to implement a vetoing mechanism for insertion, removal, and replacement of their elements. */
trait XContainerApproveBroadcaster extends js.Object {
  /** adds a listener which can veto changes in the container's content */
  def addContainerApproveListener(Listener: XContainerApproveListener): scala.Unit
  /** removes a previously added listener */
  def removeContainerApproveListener(Listener: XContainerApproveListener): scala.Unit
}

