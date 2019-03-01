package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is supported by objects with data that can be refreshed from a data source. */
trait XRefreshable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** adds the specified listener to receive the event "refreshed." */
  def addRefreshListener(l: XRefreshListener): scala.Unit
  /** refreshes the data of the object from the connected data source. */
  def refresh(): scala.Unit
  /** removes the specified listener. */
  def removeRefreshListener(l: XRefreshListener): scala.Unit
}

object XRefreshable {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addRefreshListener: js.Function1[XRefreshListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    refresh: js.Function0[scala.Unit],
    release: js.Function0[scala.Unit],
    removeRefreshListener: js.Function1[XRefreshListener, scala.Unit]
  ): XRefreshable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addRefreshListener")(addRefreshListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("refresh")(refresh)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeRefreshListener")(removeRefreshListener)
    __obj.asInstanceOf[XRefreshable]
  }
}

