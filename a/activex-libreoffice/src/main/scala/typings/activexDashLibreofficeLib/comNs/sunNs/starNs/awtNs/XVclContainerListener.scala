package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive container events.
  *
  * Container events are provided **only** for notification purposes. The VCL will automatically handle add and remove operations internally.
  * @deprecated Deprecated
  */
trait XVclContainerListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when a window has been added to the VCL container window. */
  def windowAdded(e: VclContainerEvent): scala.Unit
  /** is invoked when a window has been removed from the VCL container window. */
  def windowRemoved(e: VclContainerEvent): scala.Unit
}

