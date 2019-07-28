package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a container event.
  *
  * These events are provided **only** for notification purposes.
  * @see XVclContainerListener
  */
trait VclContainerEvent extends EventObject {
  /** returns the child component that was added or removed. */
  var Child: XInterface
}

object VclContainerEvent {
  @scala.inline
  def apply(Child: XInterface, Source: XInterface): VclContainerEvent = {
    val __obj = js.Dynamic.literal(Child = Child, Source = Source)
  
    __obj.asInstanceOf[VclContainerEvent]
  }
}

