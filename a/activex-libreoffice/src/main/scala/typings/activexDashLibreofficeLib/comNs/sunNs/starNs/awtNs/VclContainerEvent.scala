package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a container event.
  *
  * These events are provided **only** for notification purposes.
  * @see XVclContainerListener
  */
trait VclContainerEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** returns the child component that was added or removed. */
  var Child: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
}

object VclContainerEvent {
  @scala.inline
  def apply(
    Child: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): VclContainerEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Child")(Child)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[VclContainerEvent]
  }
}

