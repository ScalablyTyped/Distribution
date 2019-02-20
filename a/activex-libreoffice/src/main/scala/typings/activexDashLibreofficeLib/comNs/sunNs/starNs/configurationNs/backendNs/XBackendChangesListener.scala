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

