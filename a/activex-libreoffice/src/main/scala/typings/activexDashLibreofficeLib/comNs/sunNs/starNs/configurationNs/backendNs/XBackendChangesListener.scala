package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * receives notification from backend broadcaster objects.
  * @see XBackendChangesNotifier
  */
trait XBackendChangesListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is invoked when component data in backend source changes
    * @param Event Event indicating the component data change
    */
  def componentDataChanged(Event: ComponentChangeEvent): scala.Unit
}

object XBackendChangesListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    componentDataChanged: js.Function1[ComponentChangeEvent, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XBackendChangesListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, componentDataChanged = componentDataChanged, disposing = disposing, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XBackendChangesListener]
  }
}

