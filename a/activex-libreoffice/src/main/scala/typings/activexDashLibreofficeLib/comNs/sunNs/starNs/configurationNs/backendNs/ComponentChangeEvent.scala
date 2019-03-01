package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is fired when a change becomes effective on the source of the event
  * @see XBackendChangesNotifier
  */
trait ComponentChangeEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** The name of the Component that changed */
  var Component: java.lang.String
}

object ComponentChangeEvent {
  @scala.inline
  def apply(Component: java.lang.String, Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): ComponentChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Component")(Component)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[ComponentChangeEvent]
  }
}

