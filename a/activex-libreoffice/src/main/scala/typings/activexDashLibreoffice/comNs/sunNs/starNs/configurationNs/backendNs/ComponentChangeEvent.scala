package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs.backendNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
    val __obj = js.Dynamic.literal(Component = Component, Source = Source)
  
    __obj.asInstanceOf[ComponentChangeEvent]
  }
}

