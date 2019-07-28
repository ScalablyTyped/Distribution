package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is fired when a set of changes becomes effective on the source of the event.
  * @see XChangesSet
  * @see XChangesBatch
  * @see XChangesListener
  * @see XChangesNotifier
  * @see com.sun.star.container.ContainerEvent
  * @see ElementChange
  */
trait ChangesEvent extends EventObject {
  /**
    * contains the accessor to the common root of the changed elements.
    *
    * Type and value of the accessor depend on the service.
    */
  var Base: js.Any
  /** contains the changes which occurred. */
  var Changes: ChangesSet
}

object ChangesEvent {
  @scala.inline
  def apply(Base: js.Any, Changes: ChangesSet, Source: XInterface): ChangesEvent = {
    val __obj = js.Dynamic.literal(Base = Base, Changes = Changes.asInstanceOf[js.Any], Source = Source)
  
    __obj.asInstanceOf[ChangesEvent]
  }
}

