package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * broadcasts changes when data from backend sources has changed.
  * @see XBackendChangesListener
  */
trait XBackendChangesNotifier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds the specified listener to receive events when changes occurred.
    * @param aListener specifies the listener object.
    * @param component The name of the component the listener is monitoring changes for.
    */
  def addChangesListener(aListener: XBackendChangesListener, component: java.lang.String): scala.Unit
  /**
    * removes the specified listener.
    * @param aListener specifies the listener object.
    * @param component The name of the component the listener is monitoring changes for.
    */
  def removeChangesListener(aListener: XBackendChangesListener, component: java.lang.String): scala.Unit
}

object XBackendChangesNotifier {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addChangesListener: js.Function2[XBackendChangesListener, java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChangesListener: js.Function2[XBackendChangesListener, java.lang.String, scala.Unit]
  ): XBackendChangesNotifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addChangesListener")(addChangesListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeChangesListener")(removeChangesListener)
    __obj.asInstanceOf[XBackendChangesNotifier]
  }
}

