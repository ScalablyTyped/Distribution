package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is fired when a change becomes effective on the source of the event
  * @see XBackendChangesNotifier
  */
trait ComponentChangeEvent extends EventObject {
  /** The name of the Component that changed */
  var Component: String
}

object ComponentChangeEvent {
  @scala.inline
  def apply(Component: String, Source: XInterface): ComponentChangeEvent = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentChangeEvent]
  }
}

