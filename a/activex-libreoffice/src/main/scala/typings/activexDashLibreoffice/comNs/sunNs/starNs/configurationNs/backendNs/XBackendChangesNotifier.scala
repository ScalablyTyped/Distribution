package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs.backendNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * broadcasts changes when data from backend sources has changed.
  * @see XBackendChangesListener
  */
trait XBackendChangesNotifier extends XInterface {
  /**
    * adds the specified listener to receive events when changes occurred.
    * @param aListener specifies the listener object.
    * @param component The name of the component the listener is monitoring changes for.
    */
  def addChangesListener(aListener: XBackendChangesListener, component: String): Unit
  /**
    * removes the specified listener.
    * @param aListener specifies the listener object.
    * @param component The name of the component the listener is monitoring changes for.
    */
  def removeChangesListener(aListener: XBackendChangesListener, component: String): Unit
}

object XBackendChangesNotifier {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addChangesListener: (XBackendChangesListener, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChangesListener: (XBackendChangesListener, String) => Unit
  ): XBackendChangesNotifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addChangesListener = js.Any.fromFunction2(addChangesListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChangesListener = js.Any.fromFunction2(removeChangesListener))
  
    __obj.asInstanceOf[XBackendChangesNotifier]
  }
}

