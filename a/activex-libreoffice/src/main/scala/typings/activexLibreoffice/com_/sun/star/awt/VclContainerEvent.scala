package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Child = Child.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VclContainerEvent]
  }
}

