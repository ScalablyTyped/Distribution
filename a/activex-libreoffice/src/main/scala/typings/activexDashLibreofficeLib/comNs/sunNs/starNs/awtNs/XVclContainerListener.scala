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

object XVclContainerListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    windowAdded: js.Function1[VclContainerEvent, scala.Unit],
    windowRemoved: js.Function1[VclContainerEvent, scala.Unit]
  ): XVclContainerListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, queryInterface = queryInterface, release = release, windowAdded = windowAdded, windowRemoved = windowRemoved)
  
    __obj.asInstanceOf[XVclContainerListener]
  }
}

