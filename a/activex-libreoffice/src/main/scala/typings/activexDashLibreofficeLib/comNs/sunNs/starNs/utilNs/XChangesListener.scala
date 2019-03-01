package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * receives events from batch change broadcaster objects.
  * @see ChangesEvent
  * @see XChangesNotifier
  * @see XChangesBatch
  */
trait XChangesListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when a batch of changes occurred. */
  def changesOccurred(Event: ChangesEvent): scala.Unit
}

object XChangesListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    changesOccurred: js.Function1[ChangesEvent, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XChangesListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("changesOccurred")(changesOccurred)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XChangesListener]
  }
}

