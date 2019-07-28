package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs.backendNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * receives notification from backend broadcaster objects.
  * @see XBackendChangesNotifier
  */
trait XBackendChangesListener extends XEventListener {
  /**
    * is invoked when component data in backend source changes
    * @param Event Event indicating the component data change
    */
  def componentDataChanged(Event: ComponentChangeEvent): Unit
}

object XBackendChangesListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    componentDataChanged: ComponentChangeEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBackendChangesListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), componentDataChanged = js.Any.fromFunction1(componentDataChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XBackendChangesListener]
  }
}

